import GrammarParser.*
import java.io.File
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList


class ParserBuilder(
    val grammarName: String,
    val rrulessContext: RrulessContext?,
    val toFolderPath: String,
    val packageName: String
) {
    val rules = mutableListOf<Rule>()
    val mapedRules = hashMapOf<String, Rule>()
    var used = arrayListOf<Boolean>()

    fun generate() {
        getRulesFromTree()

        setEPS()

        if (checkLeftRecursion()) {
            throw IllegalArgumentException("Not LL1 grammar: left recursion")
        }

        if (checkRightBranching()) {
            throw IllegalArgumentException("Not LL1 grammar: right branching")
        }

        buildFirst()

        buildFollow()

        val parserString = buildParser()

        val fileName = "${toFolderPath}${grammarName}Parser.kt"
        val file = File(fileName)
        file.writeText(parserString)

        println("generated")
    }

    private fun getRulesFromTree() {
        var id = 0
        for (rule in rrulessContext!!.findOne_rule()) {
            val ruleDefinition = rule.findRule_definition()
            val ruleBody = rule.findRule_body()

            val ruleName = ruleDefinition!!.RULE_NAME()!!.text
            val ruleAttrs = getRuleAttrs(ruleDefinition.findDefinition()?.findInput_attrs())
            val ruleReturn = getRuleAttrs(ruleDefinition.findDefinition()?.findReturn_expression()?.findInput_attrs())
            val ruleBodies = getBodies(ruleBody)

            rules.add(Rule(ruleName, ruleAttrs, ruleReturn, ruleBodies, id++))
            mapedRules[ruleName] = rules.last()
        }
    }

    private fun getRuleAttrs(attrs: Input_attrsContext?): MutableList<Attribute>? {
        if (attrs == null) {
            return null
        }

        val attributes = mutableListOf<Attribute>()

        for (attr in attrs.findAttr()) {
            attributes.add(getAttr(attr)!!)
        }

        return if (attributes.isEmpty()) null else attributes
    }

    private fun getAttr(attr: AttrContext?): Attribute? {
        return if (attr == null) {
            null
        } else {
            Attribute(attr.findWords(0)!!.text, attr.findWords(1)!!.text)
        }
    }

    private fun getBodies(ruleBody: Rule_bodyContext?): MutableList<Body> {
        val bodies = mutableListOf<Body>()
        for (body in ruleBody!!.findRule_expression()) {
            bodies.add(Body(getExpressions(body)))
        }
        return bodies
    }

    private fun getExpressions(rule_expression: Rule_expressionContext): MutableList<Expr> {
        val exprs = mutableListOf<Expr>()
        for (expr in rule_expression.findExpression_name()) {
            exprs.add(getExpression(expr))
        }
        return exprs
    }

    private fun getExpression(expression: Expression_nameContext): Expr {
        val name: String
        val id: Int
        if (expression.RULE_NAME() == null && expression.TOKEN_NAME() == null) {
            name = expression.NO_RULE()!!.text
            id = 3
        } else {
            if (expression.RULE_NAME() == null) {
                name = expression.TOKEN_NAME()!!.text
                id = 2
            } else {
                name = expression.RULE_NAME()!!.text
                id = 1
            }
        }

        val attrs = expression.findExpression_attrs()?.text

        val code = expression.findExpression_code()?.text
        return Expr(
            name,
            id,
            if (attrs == null || attrs.isEmpty()) null else attrs,
            if (code == null || code.isEmpty()) null else code
        )
    }

    private fun setEPS() {
        var changed = true
        while (changed) {
            changed = false
            for (rule in rules) {
                for (body in rule.bodies) {
                    if ((body.expressions[0].type == 3 || (body.expressions[0].type == 1 && mapedRules[body.expressions[0].name]!!.first.contains(
                            "~"
                        ))) && !rule.first.contains("~")
                    ) {
                        rule.first.add("~")
                        changed = true
                    }
                }
            }
        }
    }

    private fun checkLeftRecursion(): Boolean {
        for (rule in rules) {
            used = ArrayList(Collections.nCopies(rules.size, false))
            if (dfsRecursion(rule)) {
                return true
            }
        }
        return false
    }

    private fun dfsRecursion(r: Rule): Boolean {
        if (used[r.id]) {
            return true
        }

        used[r.id] = true

        for (body in mapedRules[r.name]!!.bodies) {
            for (expr in body.expressions) {
                if (expr.type == 2) {
                    break
                }

                if (expr.type == 3) {
                    break
                }

                if (mapedRules[expr.name] == null) {
                    throw IllegalArgumentException("Expr '${expr.name}' in '${r.name}' rule is not defined")
                }

                if (dfsRecursion(mapedRules[expr.name]!!)) {
                    return true
                }

                if (!mapedRules[expr.name]!!.first.contains("~")) {
                    break
                }
            }
        }

        return false
    }

    private fun checkRightBranching(): Boolean {
        for (rule in rules) {
            val lst = mutableListOf<String>()
            for (body in rule.bodies) {
                if (body.expressions.size > 1) {
                    lst.add(body.expressions.last().name)
                }
            }

            for (i in 0 until lst.size) {
                for (j in i + 1 until lst.size) {
                    if (lst[i] == lst[j]) {
//                        print(lst[i])
                        return true
                    }
                }
            }
        }
        return false
    }

    private fun buildFirst() {
        used = ArrayList(Collections.nCopies(rules.size, false))
        for (i in 0 until rules.size) {
            if (!used[i]) {
                dfsFirst(rules[i])
            }
        }
    }

    private fun dfsFirst(r: Rule) {
        used[r.id] = true

        for (body in r.bodies) {
            for (expr in body.expressions) {
                if (expr.type == 3) {
                    break
                }
                if (expr.type == 2) {
                    r.first.add(expr.name)
                    break
                }

                if (!used[mapedRules[expr.name]!!.id]) {
                    dfsFirst(mapedRules[expr.name]!!)
                }

                r.first.addAll(mapedRules[expr.name]!!.first)

                if (!mapedRules[expr.name]!!.first.contains("~")) {
                    break
                }
            }
        }
    }

    private fun getFirst(exprs: MutableList<Expr>): HashSet<String> {
        val set = hashSetOf<String>()
        for (expr in exprs) {
            if (expr.type == 3) {
                set.add("~")
                break
            }

            if (expr.type == 2) {
                set.add(expr.name)
                break
            }

            set.addAll(mapedRules[expr.name]!!.first)

            if (!set.contains("~")) {
                break
            }
        }
        return set
    }

    private fun buildFollow() {
        mapedRules["start"]!!.follow.add("END")
        var changed = true
        while (changed) {
            changed = false
            for (rule in rules) {
                for (body in rule.bodies) {
                    for (i in 0 until body.expressions.size) {
                        if (body.expressions[i].type != 1) {
                            continue
                        }

                        val sz = mapedRules[body.expressions[i].name]!!.follow.size

                        if (i == body.expressions.size - 1) {
                            mapedRules[body.expressions[i].name]!!.follow.addAll(mapedRules[rule.name]!!.follow)
                        } else {
                            val orFollow = getFirst(body.expressions.subList(i + 1, body.expressions.size))
                            if (orFollow.contains("~")) {
                                mapedRules[body.expressions[i].name]!!.follow.addAll(mapedRules[rule.name]!!.follow)
                            }
                            orFollow.remove("~")
                            mapedRules[body.expressions[i].name]!!.follow.addAll(orFollow)
                        }

                        if (sz != mapedRules[body.expressions[i].name]!!.follow.size) {
                            changed = true
                        }
                    }
                }
            }
        }
    }

    private fun buildParser(): String {
// TODO start inattrs
        val sb = StringBuilder()
        sb.append(
            """
package $packageName

import ${packageName}.${grammarName}Lexer.Token.*

class ${grammarName}Parser(private val lex: ${grammarName}Lexer) {

    init {
        lex.nextToken()
    }

    open class Tree(val nodeName: String) {
        val children = mutableListOf<Tree>()
    }

    open class TerminalNode(nodeName: String, val text: String) : Tree(nodeName) {
    }
"""
        )

        sb.append("fun parse(")
        if (mapedRules["start"]!!.attrs != null) {
            sb.append("${mapedRules["start"]!!.attrs!![0].name}: ${mapedRules["start"]!!.attrs!![0].type}")
            for (i in 1 until mapedRules["start"]!!.attrs!!.size) {
                sb.append(", ${mapedRules["start"]!!.attrs!![i].name}: ${mapedRules["start"]!!.attrs!![i].type}")
            }
        }
        sb.append(
            "): StartContext {\n" +
                    "val res = start("
        )
        if (mapedRules["start"]!!.attrs != null) {
            sb.append(mapedRules["start"]!!.attrs!![0].name)
            for (i in 1 until mapedRules["start"]!!.attrs!!.size) {
                sb.append(", ${mapedRules["start"]!!.attrs!![i].name}")
            }
        }
        sb.append(")\n")
        sb.append(
            "if (lex.curToken == END) {\n" +
                    "return res\n" +
                    "} else {" +
                    "\n" +
                    "throw AssertionError(\"${'$'}{lex.curToken} not expected in the end\")\n" +
                    "}\n" +
                    "}\n" +
                    buildRuleFuncs() +
                    "}\n"
        )
        return sb.toString()
    }

    private fun buildRuleFuncs(): String {
        val sb = StringBuilder()

        for (rule in rules) {
            sb.append(buildRuleClass(rule))

            sb.append("fun ${rule.name}(")
            if (rule.attrs != null) {
                sb.append("${rule.attrs[0].name}: ${rule.attrs[0].type}")
                for (i in 1 until rule.attrs.size) {
                    sb.append(", ${rule.attrs[i].name}: ${rule.attrs[i].type}")
                }
            }

            sb.append("): ${rule.name.capitalize()}Context {\nval _localctx = ${rule.name.capitalize()}Context(\"${rule.name}\"")
            if (rule.attrs != null) {
                for (attr in rule.attrs) {
                    sb.append(", ${attr.name}")
                }
            }

            sb.append(
                """
    )
        when(lex.curToken) {
            ${buildWhen(rule)}
        }
    }

"""
            )
        }
        return sb.toString()
    }

    private fun buildRuleClass(rule: Rule): String {
        val sb = StringBuilder()
        sb.append("open class ${rule.name.capitalize()}Context(name:String")
        if (rule.attrs != null) {
            for (attr in rule.attrs) {
                sb.append(", val ${attr.name}: ${attr.type}")
            }
        }
        sb.append("): Tree(name) {\n")

        if (rule.returnAttr != null) {
            for (attr in rule.returnAttr) {
                sb.append("var ${attr.name}: ${attr.type}? = null\n")
            }
        }

        val termsAndNonTermsSet = mutableSetOf<String>()

        for (body in rule.bodies) {
            for (expr in body.expressions) {
                if (expr.type == 1) {
                    termsAndNonTermsSet.add("${expr.name}: ${expr.name.capitalize()}Context?")
                    continue
                }
                if (expr.type == 2) {
                    termsAndNonTermsSet.add("${expr.name}: TerminalNode?")
                    continue
                }
            }
        }

        for (t in termsAndNonTermsSet) {
            sb.append("var $t = null\n")
        }

        sb.append("}\n")
        return sb.toString()
    }

    private fun buildWhen(rule: Rule): String {
        val sb = StringBuilder()
        var codde: String? = null
        var hasEPS = false
        for (body in rule.bodies) {
            val bodyFirst = getFirst(body.expressions)
            hasEPS = bodyFirst.remove("~")
            val arrFirst = bodyFirst.toArray()
            if (arrFirst.isEmpty()) {
                if (body.expressions[0].code != null) {
                    codde = body.expressions[0].code
                }
                continue
            }
            sb.append(arrFirst[0])
            for (i in 1 until arrFirst.size) {
                sb.append(", ").append(arrFirst[i])
            }
            sb.append(" -> {\n")
            for (expr in body.expressions) {

                if (expr.type == 2) {
                    sb.append(
                        "if (lex.curToken != ${expr.name}) {\n" +
                                "        throw AssertionError(\"${'$'}{lex.curToken} not expected in ${rule.name}()\")\n}\n"
                    )
                    sb.append("val ${expr.name} = TerminalNode(\"${expr.name}\", lex.curTokenText)\n")
                    sb.append("_localctx.${expr.name} = ${expr.name}\n")
                    sb.append(
                        "_localctx.children.add(${expr.name})\n"
                    )
                    if (expr.code != null) {
                        sb.append(expr.code.substring(1, expr.code.length - 1).replace("@", "_localctx.")).append("\n")
                    }
                    sb.append("lex.nextToken()\n")
                } else {
                    sb.append("val ${expr.name} = ${expr.name}(")
                    if (expr.attrs != null) {
                        sb.append(expr.attrs.substring(1, expr.attrs.length - 1).replace("@", "_localctx."))
                    }
                    sb.append(")\n")
                    sb.append("_localctx.${expr.name} = ${expr.name}\n")
                    sb.append(
                        "_localctx.children.add(${expr.name})\n"
                    )
                    if (expr.code != null) {
                        sb.append(expr.code.substring(1, expr.code.length - 1).replace("@", "_localctx.")).append("\n")
                    }
                }
            }
            sb.append("return _localctx")
            sb.append("}\n")
        }

        if (hasEPS) {
            val ruleFollow = rule.follow.toArray()
            sb.append(ruleFollow[0])
            for (i in 1 until ruleFollow.size) {
                sb.append(", ").append(ruleFollow[i])
            }
            sb.append(" -> {\n")
            if (codde != null) {
                sb.append(codde.substring(1, codde.length - 1).replace("@", "_localctx.")).append("\n")
            }
            sb.append("return _localctx\n")
            sb.append("}\n")
        }
        sb.append(
            "else ->\n" +
                    "                throw AssertionError(\"${'$'}{lex.curToken} not expected in ${rule.name}()\")"
        )
        return sb.toString()
    }
}