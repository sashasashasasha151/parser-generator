// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.properties.Delegates
import kotlin.reflect.KClass

object solver : TypeDeclarator {
    override val classesByName: List<KClass<*>> = listOf(
        PrefixGrammarParser.StartContext::class,
        PrefixGrammarParser.ExpressionContext::class,
        PrefixGrammarParser.Simple_expressionContext::class,
        PrefixGrammarParser.While_expressionContext::class,
        PrefixGrammarParser.If_expressionContext::class,
        PrefixGrammarParser.Else_expressionContext::class,
        PrefixGrammarParser.PrintContext::class,
        PrefixGrammarParser.DefineContext::class,
        PrefixGrammarParser.VariableContext::class,
        PrefixGrammarParser.Logic_valueContext::class,
        PrefixGrammarParser.Int_valueContext::class,
        PrefixGrammarParser.Logic_operationContext::class,
        PrefixGrammarParser.Int_operationsContext::class,
        PrefixGrammarParser.Compare_opContext::class
    )
}

class PrefixGrammarParser(input: TokenStream) : Parser(input) {
    // TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "PrefixGrammar.g4"

    override val tokenNames: Array<String?>?
        get() = PrefixGrammarParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = PrefixGrammarParser.Companion.ruleNames
    override val atn: ATN
        get() = PrefixGrammarParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        IF(1),
        WHILE(2),
        LPAREN(3),
        RPAREN(4),
        PRINT(5),
        DEFINE(6),
        REDEF(7),
        VARS(8),
        NUMBER(9),
        NOT(10),
        OR(11),
        AND(12),
        TRUE(13),
        FALSE(14),
        PLUS(15),
        MINUS(16),
        MULL(17),
        DIV(18),
        EQUAL(19),
        NOT_EQUAL(20),
        LOWER(21),
        LOWER_EQUAL(22),
        HIGHER(23),
        HIGHER_EQUAL(24),
        WS(25)
    }

    enum class Rules(val id: Int) {
        RULE_start(0),
        RULE_expression(1),
        RULE_simple_expression(2),
        RULE_while_expression(3),
        RULE_if_expression(4),
        RULE_else_expression(5),
        RULE_print(6),
        RULE_define(7),
        RULE_variable(8),
        RULE_logic_value(9),
        RULE_int_value(10),
        RULE_logic_operation(11),
        RULE_int_operations(12),
        RULE_compare_op(13)
    }

    companion object {
        protected val decisionToDFA: Array<DFA>
        protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf(
            "start", "expression", "simple_expression",
            "while_expression", "if_expression", "else_expression",
            "print", "define", "variable", "logic_value",
            "int_value", "logic_operation", "int_operations",
            "compare_op"
        )

        private val LITERAL_NAMES = Arrays.asList<String?>(
            null, "'if'",
            "'while'", "'('",
            "')'", "'print'",
            "'def'", "'='",
            null, null, "'!'",
            "'|'", "'&'",
            "'true'", "'false'",
            "'+'", "'-'",
            "'*'", "'/'",
            "'=='", "'!='",
            "'<'", "'<='",
            "'>'", "'>='"
        )
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(
            null, "IF",
            "WHILE", "LPAREN",
            "RPAREN", "PRINT",
            "DEFINE", "REDEF",
            "VARS", "NUMBER",
            "NOT", "OR",
            "AND", "TRUE",
            "FALSE", "PLUS",
            "MINUS", "MULL",
            "DIV", "EQUAL",
            "NOT_EQUAL",
            "LOWER", "LOWER_EQUAL",
            "HIGHER", "HIGHER_EQUAL",
            "WS"
        )

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private val serializedIntegersATN =
            arrayOf(
                3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884,
                3, 27, 177, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4,
                6, 9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11,
                9, 11, 4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15,
                3, 2, 3, 2, 3, 2, 3, 2, 5, 2, 35, 10, 2, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 3, 7, 3, 42, 10, 3, 12, 3, 14, 3, 45, 11, 3, 3, 4, 3, 4, 3,
                4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 5, 4,
                59, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6,
                3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3,
                7, 3, 7, 5, 7, 82, 10, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 9, 3, 9, 3,
                9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 98, 10, 9, 3,
                10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 108,
                10, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
                3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
                3, 11, 3, 11, 3, 11, 5, 11, 130, 10, 11, 3, 12, 3, 12, 3, 12, 3,
                12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 141, 10, 12, 3, 13,
                3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13, 151, 10,
                13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 5,
                14, 161, 10, 14, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15,
                3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 5, 15, 175, 10, 15, 3, 15, 2,
                2, 16, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 2, 2,
                2, 189, 2, 34, 3, 2, 2, 2, 4, 36, 3, 2, 2, 2, 6, 58, 3, 2, 2, 2,
                8, 60, 3, 2, 2, 2, 10, 67, 3, 2, 2, 2, 12, 81, 3, 2, 2, 2, 14,
                83, 3, 2, 2, 2, 16, 97, 3, 2, 2, 2, 18, 107, 3, 2, 2, 2, 20, 129,
                3, 2, 2, 2, 22, 140, 3, 2, 2, 2, 24, 150, 3, 2, 2, 2, 26, 160,
                3, 2, 2, 2, 28, 174, 3, 2, 2, 2, 30, 31, 5, 4, 3, 2, 31, 32, 8,
                2, 1, 2, 32, 35, 3, 2, 2, 2, 33, 35, 8, 2, 1, 2, 34, 30, 3, 2,
                2, 2, 34, 33, 3, 2, 2, 2, 35, 3, 3, 2, 2, 2, 36, 37, 5, 6, 4, 2,
                37, 43, 8, 3, 1, 2, 38, 39, 5, 6, 4, 2, 39, 40, 8, 3, 1, 2, 40,
                42, 3, 2, 2, 2, 41, 38, 3, 2, 2, 2, 42, 45, 3, 2, 2, 2, 43, 41,
                3, 2, 2, 2, 43, 44, 3, 2, 2, 2, 44, 5, 3, 2, 2, 2, 45, 43, 3, 2,
                2, 2, 46, 47, 5, 10, 6, 2, 47, 48, 8, 4, 1, 2, 48, 59, 3, 2, 2,
                2, 49, 50, 5, 14, 8, 2, 50, 51, 8, 4, 1, 2, 51, 59, 3, 2, 2, 2,
                52, 53, 5, 16, 9, 2, 53, 54, 8, 4, 1, 2, 54, 59, 3, 2, 2, 2, 55,
                56, 5, 8, 5, 2, 56, 57, 8, 4, 1, 2, 57, 59, 3, 2, 2, 2, 58, 46,
                3, 2, 2, 2, 58, 49, 3, 2, 2, 2, 58, 52, 3, 2, 2, 2, 58, 55, 3,
                2, 2, 2, 59, 7, 3, 2, 2, 2, 60, 61, 7, 4, 2, 2, 61, 62, 5, 20,
                11, 2, 62, 63, 7, 5, 2, 2, 63, 64, 5, 4, 3, 2, 64, 65, 7, 6, 2,
                2, 65, 66, 8, 5, 1, 2, 66, 9, 3, 2, 2, 2, 67, 68, 7, 3, 2, 2, 68,
                69, 5, 20, 11, 2, 69, 70, 7, 5, 2, 2, 70, 71, 5, 4, 3, 2, 71, 72,
                7, 6, 2, 2, 72, 73, 5, 12, 7, 2, 73, 74, 8, 6, 1, 2, 74, 11, 3,
                2, 2, 2, 75, 76, 7, 5, 2, 2, 76, 77, 5, 4, 3, 2, 77, 78, 7, 6,
                2, 2, 78, 79, 8, 7, 1, 2, 79, 82, 3, 2, 2, 2, 80, 82, 8, 7, 1,
                2, 81, 75, 3, 2, 2, 2, 81, 80, 3, 2, 2, 2, 82, 13, 3, 2, 2, 2,
                83, 84, 7, 7, 2, 2, 84, 85, 5, 18, 10, 2, 85, 86, 8, 8, 1, 2, 86,
                15, 3, 2, 2, 2, 87, 88, 7, 8, 2, 2, 88, 89, 7, 10, 2, 2, 89, 90,
                5, 18, 10, 2, 90, 91, 8, 9, 1, 2, 91, 98, 3, 2, 2, 2, 92, 93, 7,
                9, 2, 2, 93, 94, 7, 10, 2, 2, 94, 95, 5, 18, 10, 2, 95, 96, 8,
                9, 1, 2, 96, 98, 3, 2, 2, 2, 97, 87, 3, 2, 2, 2, 97, 92, 3, 2,
                2, 2, 98, 17, 3, 2, 2, 2, 99, 100, 5, 20, 11, 2, 100, 101, 8, 10,
                1, 2, 101, 108, 3, 2, 2, 2, 102, 103, 5, 22, 12, 2, 103, 104, 8,
                10, 1, 2, 104, 108, 3, 2, 2, 2, 105, 106, 7, 10, 2, 2, 106, 108,
                8, 10, 1, 2, 107, 99, 3, 2, 2, 2, 107, 102, 3, 2, 2, 2, 107, 105,
                3, 2, 2, 2, 108, 19, 3, 2, 2, 2, 109, 110, 5, 24, 13, 2, 110, 111,
                5, 20, 11, 2, 111, 112, 5, 20, 11, 2, 112, 113, 8, 11, 1, 2, 113,
                130, 3, 2, 2, 2, 114, 115, 7, 12, 2, 2, 115, 116, 5, 20, 11, 2,
                116, 117, 8, 11, 1, 2, 117, 130, 3, 2, 2, 2, 118, 119, 7, 10, 2,
                2, 119, 130, 8, 11, 1, 2, 120, 121, 7, 15, 2, 2, 121, 130, 8, 11,
                1, 2, 122, 123, 7, 16, 2, 2, 123, 130, 8, 11, 1, 2, 124, 125, 5,
                28, 15, 2, 125, 126, 5, 22, 12, 2, 126, 127, 5, 22, 12, 2, 127,
                128, 8, 11, 1, 2, 128, 130, 3, 2, 2, 2, 129, 109, 3, 2, 2, 2, 129,
                114, 3, 2, 2, 2, 129, 118, 3, 2, 2, 2, 129, 120, 3, 2, 2, 2, 129,
                122, 3, 2, 2, 2, 129, 124, 3, 2, 2, 2, 130, 21, 3, 2, 2, 2, 131,
                132, 5, 26, 14, 2, 132, 133, 5, 22, 12, 2, 133, 134, 5, 22, 12,
                2, 134, 135, 8, 12, 1, 2, 135, 141, 3, 2, 2, 2, 136, 137, 7, 10,
                2, 2, 137, 141, 8, 12, 1, 2, 138, 139, 7, 11, 2, 2, 139, 141, 8,
                12, 1, 2, 140, 131, 3, 2, 2, 2, 140, 136, 3, 2, 2, 2, 140, 138,
                3, 2, 2, 2, 141, 23, 3, 2, 2, 2, 142, 143, 7, 13, 2, 2, 143, 151,
                8, 13, 1, 2, 144, 145, 7, 14, 2, 2, 145, 151, 8, 13, 1, 2, 146,
                147, 7, 21, 2, 2, 147, 151, 8, 13, 1, 2, 148, 149, 7, 22, 2, 2,
                149, 151, 8, 13, 1, 2, 150, 142, 3, 2, 2, 2, 150, 144, 3, 2, 2,
                2, 150, 146, 3, 2, 2, 2, 150, 148, 3, 2, 2, 2, 151, 25, 3, 2, 2,
                2, 152, 153, 7, 17, 2, 2, 153, 161, 8, 14, 1, 2, 154, 155, 7, 18,
                2, 2, 155, 161, 8, 14, 1, 2, 156, 157, 7, 19, 2, 2, 157, 161, 8,
                14, 1, 2, 158, 159, 7, 20, 2, 2, 159, 161, 8, 14, 1, 2, 160, 152,
                3, 2, 2, 2, 160, 154, 3, 2, 2, 2, 160, 156, 3, 2, 2, 2, 160, 158,
                3, 2, 2, 2, 161, 27, 3, 2, 2, 2, 162, 163, 7, 21, 2, 2, 163, 175,
                8, 15, 1, 2, 164, 165, 7, 22, 2, 2, 165, 175, 8, 15, 1, 2, 166,
                167, 7, 23, 2, 2, 167, 175, 8, 15, 1, 2, 168, 169, 7, 24, 2, 2,
                169, 175, 8, 15, 1, 2, 170, 171, 7, 25, 2, 2, 171, 175, 8, 15,
                1, 2, 172, 173, 7, 26, 2, 2, 173, 175, 8, 15, 1, 2, 174, 162, 3,
                2, 2, 2, 174, 164, 3, 2, 2, 2, 174, 166, 3, 2, 2, 2, 174, 168,
                3, 2, 2, 2, 174, 170, 3, 2, 2, 2, 174, 172, 3, 2, 2, 2, 175, 29,
                3, 2, 2, 2, 13, 34, 43, 58, 81, 97, 107, 129, 140, 150, 160, 174
            )
        val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)

        init {
            decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
                DFA(ATN.getDecisionState(it)!!, it)
            })


        }
    }

    private val IF = Tokens.IF.id
    private val WHILE = Tokens.WHILE.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val PRINT = Tokens.PRINT.id
    private val DEFINE = Tokens.DEFINE.id
    private val REDEF = Tokens.REDEF.id
    private val VARS = Tokens.VARS.id
    private val NUMBER = Tokens.NUMBER.id
    private val NOT = Tokens.NOT.id
    private val OR = Tokens.OR.id
    private val AND = Tokens.AND.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val MULL = Tokens.MULL.id
    private val DIV = Tokens.DIV.id
    private val EQUAL = Tokens.EQUAL.id
    private val NOT_EQUAL = Tokens.NOT_EQUAL.id
    private val LOWER = Tokens.LOWER.id
    private val LOWER_EQUAL = Tokens.LOWER_EQUAL.id
    private val HIGHER = Tokens.HIGHER.id
    private val HIGHER_EQUAL = Tokens.HIGHER_EQUAL.id
    private val WS = Tokens.WS.id

    /* Named actions */
    init {
        interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
    }

    /* Funcs */
    open class StartContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_start.id
            set(value) {
                throw RuntimeException()
            }
        var value: String by Delegates.notNull()
        var expression: ExpressionContext by Delegates.notNull()
        fun findExpression(): ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun start(): StartContext {
        var _localctx: StartContext = StartContext(context, state)
        enterRule(_localctx, 0, Rules.RULE_start.id)
        try {
            this.state = 32
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                IF, WHILE, PRINT, DEFINE, REDEF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 28
                        (_localctx as StartContext).expression = expression(1)
                        _localctx.value =
                                "fun main(args: Array<String>) {\n${(_localctx as StartContext).expression.value}}"
                    }
                }
                EOF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        _localctx.value = "fun main(args: Array<String>) {\n}"
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class ExpressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_expression.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var simple_expression: Simple_expressionContext by Delegates.notNull()
        fun findSimple_expression(): List<Simple_expressionContext> =
            getRuleContexts(solver.getType("Simple_expressionContext"))

        fun findSimple_expression(i: Int): Simple_expressionContext? =
            getRuleContext(solver.getType("Simple_expressionContext"), i)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun expression(indent: Int): ExpressionContext {
        var _localctx: ExpressionContext = ExpressionContext(context, state, indent)
        enterRule(_localctx, 2, Rules.RULE_expression.id)
        var _la: Int
        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 34
                (_localctx as ExpressionContext).simple_expression = simple_expression(indent)
                _localctx.value = (_localctx as ExpressionContext).simple_expression.value + "\n"
                this.state = 41
                errorHandler.sync(this);
                _la = _input!!.LA(1)
                while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl IF) or (1L shl WHILE) or (1L shl PRINT) or (1L shl DEFINE) or (1L shl REDEF))) != 0L)) {
                    if (true) {
                        if (true) {
                            this.state = 36
                            (_localctx as ExpressionContext).simple_expression = simple_expression(indent)
                            _localctx.value += (_localctx as ExpressionContext).simple_expression.value + "\n"
                        }
                    }
                    this.state = 43
                    errorHandler.sync(this)
                    _la = _input!!.LA(1)
                }
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Simple_expressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_simple_expression.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var if_expression: If_expressionContext by Delegates.notNull()
        var print: PrintContext by Delegates.notNull()
        var define: DefineContext by Delegates.notNull()
        var while_expression: While_expressionContext by Delegates.notNull()
        fun findIf_expression(): If_expressionContext? = getRuleContext(solver.getType("If_expressionContext"), 0)
        fun findPrint(): PrintContext? = getRuleContext(solver.getType("PrintContext"), 0)
        fun findDefine(): DefineContext? = getRuleContext(solver.getType("DefineContext"), 0)
        fun findWhile_expression(): While_expressionContext? =
            getRuleContext(solver.getType("While_expressionContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun simple_expression(indent: Int): Simple_expressionContext {
        var _localctx: Simple_expressionContext = Simple_expressionContext(context, state, indent)
        enterRule(_localctx, 4, Rules.RULE_simple_expression.id)
        try {
            this.state = 56
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                IF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 44
                        (_localctx as Simple_expressionContext).if_expression = if_expression(indent)
                        _localctx.value = (_localctx as Simple_expressionContext).if_expression.value
                    }
                }
                PRINT ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 47
                        (_localctx as Simple_expressionContext).print = print(indent)
                        _localctx.value = (_localctx as Simple_expressionContext).print.value
                    }
                }
                DEFINE, REDEF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 50
                        (_localctx as Simple_expressionContext).define = define(indent)
                        _localctx.value = (_localctx as Simple_expressionContext).define.value
                    }
                }
                WHILE ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 53
                        (_localctx as Simple_expressionContext).while_expression = while_expression(indent)
                        _localctx.value = (_localctx as Simple_expressionContext).while_expression.value
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class While_expressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_while_expression.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var l: Logic_valueContext by Delegates.notNull()
        var ex: ExpressionContext by Delegates.notNull()
        fun WHILE(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.WHILE.id, 0)
        fun LPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.LPAREN.id, 0)
        fun RPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.RPAREN.id, 0)
        fun findLogic_value(): Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"), 0)
        fun findExpression(): ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun while_expression(indent: Int): While_expressionContext {
        var _localctx: While_expressionContext = While_expressionContext(context, state, indent)
        enterRule(_localctx, 6, Rules.RULE_while_expression.id)
        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 58
                match(WHILE) as Token
                this.state = 59
                (_localctx as While_expressionContext).l = logic_value()
                this.state = 60
                match(LPAREN) as Token
                this.state = 61
                (_localctx as While_expressionContext).ex = expression(indent + 1)
                this.state = 62
                match(RPAREN) as Token
                _localctx.value =
                        "${"\t".repeat(_localctx.indent)}while (${(_localctx as While_expressionContext).l.value}) {\n${(_localctx as While_expressionContext).ex.value}${"\t".repeat(
                            _localctx.indent
                        )}}"
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class If_expressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_if_expression.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var l: Logic_valueContext by Delegates.notNull()
        var ex: ExpressionContext by Delegates.notNull()
        var el: Else_expressionContext by Delegates.notNull()
        fun IF(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.IF.id, 0)
        fun LPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.LPAREN.id, 0)
        fun RPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.RPAREN.id, 0)
        fun findLogic_value(): Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"), 0)
        fun findExpression(): ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"), 0)
        fun findElse_expression(): Else_expressionContext? = getRuleContext(solver.getType("Else_expressionContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun if_expression(indent: Int): If_expressionContext {
        var _localctx: If_expressionContext = If_expressionContext(context, state, indent)
        enterRule(_localctx, 8, Rules.RULE_if_expression.id)
        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 65
                match(IF) as Token
                this.state = 66
                (_localctx as If_expressionContext).l = logic_value()
                this.state = 67
                match(LPAREN) as Token
                this.state = 68
                (_localctx as If_expressionContext).ex = expression(indent + 1)
                this.state = 69
                match(RPAREN) as Token
                this.state = 70
                (_localctx as If_expressionContext).el = else_expression(indent)
                _localctx.value =
                        "${"\t".repeat(_localctx.indent)}if (${(_localctx as If_expressionContext).l.value}) {\n${(_localctx as If_expressionContext).ex.value}${"\t".repeat(
                            _localctx.indent
                        )}} ${(_localctx as If_expressionContext).el.value}"
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Else_expressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_else_expression.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var ex: ExpressionContext by Delegates.notNull()
        fun LPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.LPAREN.id, 0)
        fun RPAREN(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.RPAREN.id, 0)
        fun findExpression(): ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun else_expression(indent: Int): Else_expressionContext {
        var _localctx: Else_expressionContext = Else_expressionContext(context, state, indent)
        enterRule(_localctx, 10, Rules.RULE_else_expression.id)
        try {
            this.state = 79
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                LPAREN ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 73
                        match(LPAREN) as Token
                        this.state = 74
                        (_localctx as Else_expressionContext).ex = expression(indent + 1)
                        this.state = 75
                        match(RPAREN) as Token
                        _localctx.value =
                                "else {\n${(_localctx as Else_expressionContext).ex.value}${"\t".repeat(_localctx.indent)}}"
                    }
                }
                EOF, IF, WHILE, RPAREN, PRINT, DEFINE, REDEF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        _localctx.value = ""
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class PrintContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_print.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var variable: VariableContext by Delegates.notNull()
        fun PRINT(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.PRINT.id, 0)
        fun findVariable(): VariableContext? = getRuleContext(solver.getType("VariableContext"), 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun print(indent: Int): PrintContext {
        var _localctx: PrintContext = PrintContext(context, state, indent)
        enterRule(_localctx, 12, Rules.RULE_print.id)
        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 81
                match(PRINT) as Token
                this.state = 82
                (_localctx as PrintContext).variable = variable()
                _localctx.value =
                        "${"\t".repeat(_localctx.indent)}println(${(_localctx as PrintContext).variable.value})"
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class DefineContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_define.id
            set(value) {
                throw RuntimeException()
            }
        var indent: Int by Delegates.notNull()
        var value: String by Delegates.notNull()
        var VARS: Token by Delegates.notNull()
        var variable: VariableContext by Delegates.notNull()
        fun DEFINE(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.DEFINE.id, 0)
        fun VARS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
        fun findVariable(): VariableContext? = getRuleContext(solver.getType("VariableContext"), 0)
        fun REDEF(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.REDEF.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {; }
        constructor(parent: ParserRuleContext?, invokingState: Int, indent: Int) : super(parent, invokingState) {
            this.indent = indent;
        }
    }

    fun define(indent: Int): DefineContext {
        var _localctx: DefineContext = DefineContext(context, state, indent)
        enterRule(_localctx, 14, Rules.RULE_define.id)
        try {
            this.state = 95
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                DEFINE ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 85
                        match(DEFINE) as Token
                        this.state = 86
                        (_localctx as DefineContext).VARS = match(VARS) as Token
                        this.state = 87
                        (_localctx as DefineContext).variable = variable()
                        _localctx.value =
                                "${"\t".repeat(_localctx.indent)}var ${((_localctx as DefineContext).VARS?.text)} = ${(_localctx as DefineContext).variable.value}"
                    }
                }
                REDEF ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 90
                        match(REDEF) as Token
                        this.state = 91
                        (_localctx as DefineContext).VARS = match(VARS) as Token
                        this.state = 92
                        (_localctx as DefineContext).variable = variable()
                        _localctx.value =
                                "${"\t".repeat(_localctx.indent)}${((_localctx as DefineContext).VARS?.text)} = ${(_localctx as DefineContext).variable.value}"
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class VariableContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_variable.id
            set(value) {
                throw RuntimeException()
            }
        var value: String by Delegates.notNull()
        var logic_value: Logic_valueContext by Delegates.notNull()
        var int_value: Int_valueContext by Delegates.notNull()
        var VARS: Token by Delegates.notNull()
        fun findLogic_value(): Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"), 0)
        fun findInt_value(): Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"), 0)
        fun VARS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun variable(): VariableContext {
        var _localctx: VariableContext = VariableContext(context, state)
        enterRule(_localctx, 16, Rules.RULE_variable.id)
        try {
            this.state = 105
            errorHandler.sync(this)
            when (interpreter!!.adaptivePredict(_input!!, 5, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 97
                        (_localctx as VariableContext).logic_value = logic_value()
                        _localctx.value = (_localctx as VariableContext).logic_value.value
                    }
                }
                2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 100
                        (_localctx as VariableContext).int_value = int_value()
                        _localctx.value = (_localctx as VariableContext).int_value.value
                    }
                }
                3 -> {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 103
                        (_localctx as VariableContext).VARS = match(VARS) as Token
                        _localctx.value = ((_localctx as VariableContext).VARS?.text)!!
                    }
                }
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Logic_valueContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_logic_value.id
            set(value) {
                throw RuntimeException()
            }
        var value: String by Delegates.notNull()
        var op: Logic_operationContext by Delegates.notNull()
        var lv: Logic_valueContext by Delegates.notNull()
        var rv: Logic_valueContext by Delegates.notNull()
        var VARS: Token by Delegates.notNull()
        var c_op: Compare_opContext by Delegates.notNull()
        var c_lv: Int_valueContext by Delegates.notNull()
        var c_rv: Int_valueContext by Delegates.notNull()
        fun findLogic_operation(): Logic_operationContext? = getRuleContext(solver.getType("Logic_operationContext"), 0)
        fun findLogic_value(): List<Logic_valueContext> = getRuleContexts(solver.getType("Logic_valueContext"))
        fun findLogic_value(i: Int): Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"), i)
        fun NOT(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT.id, 0)
        fun VARS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
        fun TRUE(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.TRUE.id, 0)
        fun FALSE(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.FALSE.id, 0)
        fun findCompare_op(): Compare_opContext? = getRuleContext(solver.getType("Compare_opContext"), 0)
        fun findInt_value(): List<Int_valueContext> = getRuleContexts(solver.getType("Int_valueContext"))
        fun findInt_value(i: Int): Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"), i)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun logic_value(): Logic_valueContext {
        var _localctx: Logic_valueContext = Logic_valueContext(context, state)
        enterRule(_localctx, 18, Rules.RULE_logic_value.id)
        try {
            this.state = 127
            errorHandler.sync(this)
            when (interpreter!!.adaptivePredict(_input!!, 6, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 107
                        (_localctx as Logic_valueContext).op = logic_operation()
                        this.state = 108
                        (_localctx as Logic_valueContext).lv = logic_value()
                        this.state = 109
                        (_localctx as Logic_valueContext).rv = logic_value()
                        _localctx.value =
                                "(${(_localctx as Logic_valueContext).lv.value} ${(_localctx as Logic_valueContext).op.op} ${(_localctx as Logic_valueContext).rv.value})"
                    }
                }
                2 -> {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 112
                        match(NOT) as Token
                        this.state = 113
                        (_localctx as Logic_valueContext).lv = logic_value()
                        _localctx.value = "!(${(_localctx as Logic_valueContext).lv.value})"
                    }
                }
                3 -> {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 116
                        (_localctx as Logic_valueContext).VARS = match(VARS) as Token
                        _localctx.value = ((_localctx as Logic_valueContext).VARS?.text)!!
                    }
                }
                4 -> {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 118
                        match(TRUE) as Token
                        _localctx.value = "true"
                    }
                }
                5 -> {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 120
                        match(FALSE) as Token
                        _localctx.value = "false"
                    }
                }
                6 -> {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 122
                        (_localctx as Logic_valueContext).c_op = compare_op()
                        this.state = 123
                        (_localctx as Logic_valueContext).c_lv = int_value()
                        this.state = 124
                        (_localctx as Logic_valueContext).c_rv = int_value()
                        _localctx.value =
                                "(${(_localctx as Logic_valueContext).c_lv.value} ${(_localctx as Logic_valueContext).c_op.op} ${(_localctx as Logic_valueContext).c_rv.value})"
                    }
                }
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Int_valueContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_int_value.id
            set(value) {
                throw RuntimeException()
            }
        var value: String by Delegates.notNull()
        var op: Int_operationsContext by Delegates.notNull()
        var lv: Int_valueContext by Delegates.notNull()
        var rv: Int_valueContext by Delegates.notNull()
        var VARS: Token by Delegates.notNull()
        var NUMBER: Token by Delegates.notNull()
        fun findInt_operations(): Int_operationsContext? = getRuleContext(solver.getType("Int_operationsContext"), 0)
        fun findInt_value(): List<Int_valueContext> = getRuleContexts(solver.getType("Int_valueContext"))
        fun findInt_value(i: Int): Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"), i)
        fun VARS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
        fun NUMBER(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.NUMBER.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun int_value(): Int_valueContext {
        var _localctx: Int_valueContext = Int_valueContext(context, state)
        enterRule(_localctx, 20, Rules.RULE_int_value.id)
        try {
            this.state = 138
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                PLUS, MINUS, MULL, DIV ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 129
                        (_localctx as Int_valueContext).op = int_operations()
                        this.state = 130
                        (_localctx as Int_valueContext).lv = int_value()
                        this.state = 131
                        (_localctx as Int_valueContext).rv = int_value()
                        _localctx.value =
                                "(${(_localctx as Int_valueContext).lv.value} ${(_localctx as Int_valueContext).op.op} ${(_localctx as Int_valueContext).rv.value})"
                    }
                }
                VARS ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 134
                        (_localctx as Int_valueContext).VARS = match(VARS) as Token
                        _localctx.value = ((_localctx as Int_valueContext).VARS?.text)!!
                    }
                }
                NUMBER ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 136
                        (_localctx as Int_valueContext).NUMBER = match(NUMBER) as Token
                        _localctx.value = ((_localctx as Int_valueContext).NUMBER?.text)!!
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Logic_operationContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_logic_operation.id
            set(value) {
                throw RuntimeException()
            }
        var op: String by Delegates.notNull()
        fun OR(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.OR.id, 0)
        fun AND(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.AND.id, 0)
        fun EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.EQUAL.id, 0)
        fun NOT_EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT_EQUAL.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun logic_operation(): Logic_operationContext {
        var _localctx: Logic_operationContext = Logic_operationContext(context, state)
        enterRule(_localctx, 22, Rules.RULE_logic_operation.id)
        try {
            this.state = 148
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                OR ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 140
                        match(OR) as Token
                        _localctx.op = " || "
                    }
                }
                AND ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 142
                        match(AND) as Token
                        _localctx.op = " && "
                    }
                }
                EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 144
                        match(EQUAL) as Token
                        _localctx.op = " == "
                    }
                }
                NOT_EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 146
                        match(NOT_EQUAL) as Token
                        _localctx.op = " != "
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Int_operationsContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_int_operations.id
            set(value) {
                throw RuntimeException()
            }
        var op: String by Delegates.notNull()
        fun PLUS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.PLUS.id, 0)
        fun MINUS(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.MINUS.id, 0)
        fun MULL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.MULL.id, 0)
        fun DIV(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.DIV.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun int_operations(): Int_operationsContext {
        var _localctx: Int_operationsContext = Int_operationsContext(context, state)
        enterRule(_localctx, 24, Rules.RULE_int_operations.id)
        try {
            this.state = 158
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                PLUS ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 150
                        match(PLUS) as Token
                        _localctx.op = " + "
                    }
                }
                MINUS ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 152
                        match(MINUS) as Token
                        _localctx.op = " - "
                    }
                }
                MULL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 154
                        match(MULL) as Token
                        _localctx.op = " * "
                    }
                }
                DIV ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 156
                        match(DIV) as Token
                        _localctx.op = " / "
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

    open class Compare_opContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.RULE_compare_op.id
            set(value) {
                throw RuntimeException()
            }
        var op: String by Delegates.notNull()
        fun EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.EQUAL.id, 0)
        fun NOT_EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT_EQUAL.id, 0)
        fun LOWER(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.LOWER.id, 0)
        fun LOWER_EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.LOWER_EQUAL.id, 0)
        fun HIGHER(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.HIGHER.id, 0)
        fun HIGHER_EQUAL(): TerminalNode? = getToken(PrefixGrammarParser.Tokens.HIGHER_EQUAL.id, 0)

        constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }
    }

    fun compare_op(): Compare_opContext {
        var _localctx: Compare_opContext = Compare_opContext(context, state)
        enterRule(_localctx, 26, Rules.RULE_compare_op.id)
        try {
            this.state = 172
            errorHandler.sync(this)
            when (_input!!.LA(1)) {
                EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 160
                        match(EQUAL) as Token
                        _localctx.op = " == "
                    }
                }
                NOT_EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 162
                        match(NOT_EQUAL) as Token
                        _localctx.op = " != "
                    }
                }
                LOWER ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 164
                        match(LOWER) as Token
                        _localctx.op = " < "
                    }
                }
                LOWER_EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 166
                        match(LOWER_EQUAL) as Token
                        _localctx.op = " <= "
                    }
                }
                HIGHER ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 5)
                    if (true) {
                        this.state = 168
                        match(HIGHER) as Token
                        _localctx.op = " > "
                    }
                }
                HIGHER_EQUAL ->  /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 6)
                    if (true) {
                        this.state = 170
                        match(HIGHER_EQUAL) as Token
                        _localctx.op = " >= "
                    }
                }
                else -> throw NoViableAltException(this)
            }
        } catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        } finally {
            exitRule()
        }
        return _localctx
    }

}