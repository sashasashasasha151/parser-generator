
package test_grammars.generated

import test_grammars.generated.ThirdHWGrammarLexer.Token.*

class ThirdHWGrammarParser(private val lex: ThirdHWGrammarLexer) {

    init {
        lex.nextToken()
    }

    open class Tree(val nodeName: String) {
        val children = mutableListOf<Tree>()
    }

    open class TerminalNode(nodeName: String, val text: String) : Tree(nodeName) {
    }
fun parse(): StartContext {
val res = start()
if (lex.curToken == END) {
return res
} else {
throw AssertionError("${lex.curToken} not expected in the end")
}
}
open class StartContext(name:String): Tree(name) {
var value: String? = null
var expression: ExpressionContext? = null
}
fun start(): StartContext {
val _localctx = StartContext("start"
    )
        when(lex.curToken) {
            PRINT, REDEF, WHILE, IF, DEFINE -> {
val expression = expression(1)
_localctx.expression = expression
_localctx.children.add(expression)
_localctx.value = "fun main(args: Array<String>){\n${_localctx.expression!!.value}}"
return _localctx}
END -> {
_localctx.value = "fun main(args: Array<String>){\n}"
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in start()")
        }
    }

open class ExpressionContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var simple_expression: Simple_expressionContext? = null
var expression: ExpressionContext? = null
}
fun expression(indent: Int): ExpressionContext {
val _localctx = ExpressionContext("expression", indent
    )
        when(lex.curToken) {
            PRINT, REDEF, WHILE, IF, DEFINE -> {
val simple_expression = simple_expression(indent)
_localctx.simple_expression = simple_expression
_localctx.children.add(simple_expression)
_localctx.value = _localctx.simple_expression!!.value + "\n"
val expression = expression(indent)
_localctx.expression = expression
_localctx.children.add(expression)
_localctx.value += _localctx.expression!!.value + "\n"
return _localctx}
END, RPAREN -> {
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in expression()")
        }
    }

open class Simple_expressionContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var if_expression: If_expressionContext? = null
var print_it: Print_itContext? = null
var define: DefineContext? = null
var while_expression: While_expressionContext? = null
}
fun simple_expression(indent: Int): Simple_expressionContext {
val _localctx = Simple_expressionContext("simple_expression", indent
    )
        when(lex.curToken) {
            IF -> {
val if_expression = if_expression(indent)
_localctx.if_expression = if_expression
_localctx.children.add(if_expression)
_localctx.value = _localctx.if_expression!!.value
return _localctx}
PRINT -> {
val print_it = print_it(indent)
_localctx.print_it = print_it
_localctx.children.add(print_it)
_localctx.value = _localctx.print_it!!.value
return _localctx}
REDEF, DEFINE -> {
val define = define(indent)
_localctx.define = define
_localctx.children.add(define)
_localctx.value = _localctx.define!!.value
return _localctx}
WHILE -> {
val while_expression = while_expression(indent)
_localctx.while_expression = while_expression
_localctx.children.add(while_expression)
_localctx.value = _localctx.while_expression!!.value
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in simple_expression()")
        }
    }

open class While_expressionContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var WHILE: TerminalNode? = null
var logic_value: Logic_valueContext? = null
var LPAREN: TerminalNode? = null
var expression: ExpressionContext? = null
var RPAREN: TerminalNode? = null
}
fun while_expression(indent: Int): While_expressionContext {
val _localctx = While_expressionContext("while_expression", indent
    )
        when(lex.curToken) {
            WHILE -> {
if (lex.curToken != WHILE) {
        throw AssertionError("${lex.curToken} not expected in while_expression()")
}
val WHILE = TerminalNode("WHILE", lex.curTokenText)
_localctx.WHILE = WHILE
_localctx.children.add(WHILE)
lex.nextToken()
val logic_value = logic_value()
_localctx.logic_value = logic_value
_localctx.children.add(logic_value)
if (lex.curToken != LPAREN) {
        throw AssertionError("${lex.curToken} not expected in while_expression()")
}
val LPAREN = TerminalNode("LPAREN", lex.curTokenText)
_localctx.LPAREN = LPAREN
_localctx.children.add(LPAREN)
lex.nextToken()
val expression = expression(indent+1)
_localctx.expression = expression
_localctx.children.add(expression)
if (lex.curToken != RPAREN) {
        throw AssertionError("${lex.curToken} not expected in while_expression()")
}
val RPAREN = TerminalNode("RPAREN", lex.curTokenText)
_localctx.RPAREN = RPAREN
_localctx.children.add(RPAREN)
_localctx.value = "${"\t".repeat(_localctx.indent!!)}while (${_localctx.logic_value!!.value}) {\n${_localctx.expression!!.value}${"\t".repeat(_localctx.indent!!)}}"
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in while_expression()")
        }
    }

open class If_expressionContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var IF: TerminalNode? = null
var logic_value: Logic_valueContext? = null
var LPAREN: TerminalNode? = null
var expression: ExpressionContext? = null
var RPAREN: TerminalNode? = null
var else_expression: Else_expressionContext? = null
}
fun if_expression(indent: Int): If_expressionContext {
val _localctx = If_expressionContext("if_expression", indent
    )
        when(lex.curToken) {
            IF -> {
if (lex.curToken != IF) {
        throw AssertionError("${lex.curToken} not expected in if_expression()")
}
val IF = TerminalNode("IF", lex.curTokenText)
_localctx.IF = IF
_localctx.children.add(IF)
lex.nextToken()
val logic_value = logic_value()
_localctx.logic_value = logic_value
_localctx.children.add(logic_value)
if (lex.curToken != LPAREN) {
        throw AssertionError("${lex.curToken} not expected in if_expression()")
}
val LPAREN = TerminalNode("LPAREN", lex.curTokenText)
_localctx.LPAREN = LPAREN
_localctx.children.add(LPAREN)
lex.nextToken()
val expression = expression(indent+1)
_localctx.expression = expression
_localctx.children.add(expression)
if (lex.curToken != RPAREN) {
        throw AssertionError("${lex.curToken} not expected in if_expression()")
}
val RPAREN = TerminalNode("RPAREN", lex.curTokenText)
_localctx.RPAREN = RPAREN
_localctx.children.add(RPAREN)
lex.nextToken()
val else_expression = else_expression(indent)
_localctx.else_expression = else_expression
_localctx.children.add(else_expression)
_localctx.value = "${"\t".repeat(_localctx.indent!!)}if (${_localctx.logic_value!!.value}) {\n${_localctx.expression!!.value}${"\t".repeat(_localctx.indent!!)}} ${_localctx.else_expression!!.value}"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in if_expression()")
        }
    }

open class Else_expressionContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var LPAREN: TerminalNode? = null
var expression: ExpressionContext? = null
var RPAREN: TerminalNode? = null
}
fun else_expression(indent: Int): Else_expressionContext {
val _localctx = Else_expressionContext("else_expression", indent
    )
        when(lex.curToken) {
            LPAREN -> {
if (lex.curToken != LPAREN) {
        throw AssertionError("${lex.curToken} not expected in else_expression()")
}
val LPAREN = TerminalNode("LPAREN", lex.curTokenText)
_localctx.LPAREN = LPAREN
_localctx.children.add(LPAREN)
lex.nextToken()
val expression = expression(indent+1)
_localctx.expression = expression
_localctx.children.add(expression)
if (lex.curToken != RPAREN) {
        throw AssertionError("${lex.curToken} not expected in else_expression()")
}
val RPAREN = TerminalNode("RPAREN", lex.curTokenText)
_localctx.RPAREN = RPAREN
_localctx.children.add(RPAREN)
_localctx.value = "else {\n${_localctx.expression!!.value}${"\t".repeat(_localctx.indent!!)}}"
lex.nextToken()
return _localctx}
PRINT, REDEF, END, WHILE, RPAREN, IF, DEFINE -> {
_localctx.value = ""
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in else_expression()")
        }
    }

open class Print_itContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var PRINT: TerminalNode? = null
var variable: VariableContext? = null
}
fun print_it(indent: Int): Print_itContext {
val _localctx = Print_itContext("print_it", indent
    )
        when(lex.curToken) {
            PRINT -> {
if (lex.curToken != PRINT) {
        throw AssertionError("${lex.curToken} not expected in print_it()")
}
val PRINT = TerminalNode("PRINT", lex.curTokenText)
_localctx.PRINT = PRINT
_localctx.children.add(PRINT)
lex.nextToken()
val variable = variable()
_localctx.variable = variable
_localctx.children.add(variable)
_localctx.value = "${"\t".repeat(_localctx.indent!!)}println(${_localctx.variable!!.value})"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in print_it()")
        }
    }

open class DefineContext(name:String, val indent: Int): Tree(name) {
var value: String? = null
var vars_var: Vars_varContext? = null
var VARS: TerminalNode? = null
var variable: VariableContext? = null
}
fun define(indent: Int): DefineContext {
val _localctx = DefineContext("define", indent
    )
        when(lex.curToken) {
            REDEF, DEFINE -> {
val vars_var = vars_var()
_localctx.vars_var = vars_var
_localctx.children.add(vars_var)
if (lex.curToken != VARS) {
        throw AssertionError("${lex.curToken} not expected in define()")
}
val VARS = TerminalNode("VARS", lex.curTokenText)
_localctx.VARS = VARS
_localctx.children.add(VARS)
lex.nextToken()
val variable = variable()
_localctx.variable = variable
_localctx.children.add(variable)
_localctx.value = "${"\t".repeat(_localctx.indent!!)}${_localctx.vars_var!!.value}${_localctx.VARS!!.text} = ${_localctx.variable!!.value}"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in define()")
        }
    }

open class Vars_varContext(name:String): Tree(name) {
var value: String? = null
var DEFINE: TerminalNode? = null
var REDEF: TerminalNode? = null
}
fun vars_var(): Vars_varContext {
val _localctx = Vars_varContext("vars_var"
    )
        when(lex.curToken) {
            DEFINE -> {
if (lex.curToken != DEFINE) {
        throw AssertionError("${lex.curToken} not expected in vars_var()")
}
val DEFINE = TerminalNode("DEFINE", lex.curTokenText)
_localctx.DEFINE = DEFINE
_localctx.children.add(DEFINE)
_localctx.value = "var "
lex.nextToken()
return _localctx}
REDEF -> {
if (lex.curToken != REDEF) {
        throw AssertionError("${lex.curToken} not expected in vars_var()")
}
val REDEF = TerminalNode("REDEF", lex.curTokenText)
_localctx.REDEF = REDEF
_localctx.children.add(REDEF)
_localctx.value = ""
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in vars_var()")
        }
    }

open class VariableContext(name:String): Tree(name) {
var value: String? = null
var logic_value: Logic_valueContext? = null
var int_value: Int_valueContext? = null
}
fun variable(): VariableContext {
val _localctx = VariableContext("variable"
    )
        when(lex.curToken) {
            OR, L_NOT_EQUAL, VARS, L_EQUAL, TRUE, I_EQUAL, HIGHER, HIGHER_EQUAL, NOT, LOWER, AND, LOWER_EQUAL, FALSE, I_NOT_EQUAL -> {
val logic_value = logic_value()
_localctx.logic_value = logic_value
_localctx.children.add(logic_value)
_localctx.value = _localctx.logic_value!!.value
return _localctx}
DIV, NUMBER, VARS, MULL, PLUS, MINUS -> {
val int_value = int_value()
_localctx.int_value = int_value
_localctx.children.add(int_value)
_localctx.value = _localctx.int_value!!.value
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in variable()")
        }
    }

open class Logic_valueContext(name:String): Tree(name) {
var value: String? = null
var logic_logic: Logic_logicContext? = null
var logic_value: Logic_valueContext? = null
var VARS: TerminalNode? = null
var TRUE: TerminalNode? = null
var FALSE: TerminalNode? = null
var op_int: Op_intContext? = null
var int_value: Int_valueContext? = null
}
fun logic_value(): Logic_valueContext {
val _localctx = Logic_valueContext("logic_value"
    )
        when(lex.curToken) {
            NOT, OR, L_NOT_EQUAL, AND, L_EQUAL -> {
val logic_logic = logic_logic()
_localctx.logic_logic = logic_logic
_localctx.children.add(logic_logic)
val logic_value = logic_value()
_localctx.logic_value = logic_value
_localctx.children.add(logic_value)
_localctx.value = logic_logic.value + "${_localctx.logic_value!!.value})"
return _localctx}
VARS -> {
if (lex.curToken != VARS) {
        throw AssertionError("${lex.curToken} not expected in logic_value()")
}
val VARS = TerminalNode("VARS", lex.curTokenText)
_localctx.VARS = VARS
_localctx.children.add(VARS)
_localctx.value = _localctx.VARS!!.text
lex.nextToken()
return _localctx}
TRUE -> {
if (lex.curToken != TRUE) {
        throw AssertionError("${lex.curToken} not expected in logic_value()")
}
val TRUE = TerminalNode("TRUE", lex.curTokenText)
_localctx.TRUE = TRUE
_localctx.children.add(TRUE)
_localctx.value = "true"
lex.nextToken()
return _localctx}
FALSE -> {
if (lex.curToken != FALSE) {
        throw AssertionError("${lex.curToken} not expected in logic_value()")
}
val FALSE = TerminalNode("FALSE", lex.curTokenText)
_localctx.FALSE = FALSE
_localctx.children.add(FALSE)
_localctx.value = "false"
lex.nextToken()
return _localctx}
LOWER, LOWER_EQUAL, I_NOT_EQUAL, I_EQUAL, HIGHER, HIGHER_EQUAL -> {
val op_int = op_int()
_localctx.op_int = op_int
_localctx.children.add(op_int)
val int_value = int_value()
_localctx.int_value = int_value
_localctx.children.add(int_value)
_localctx.value = "${_localctx.op_int!!.value} ${_localctx.int_value!!.value})"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in logic_value()")
        }
    }

open class Op_intContext(name:String): Tree(name) {
var value: String? = null
var compare_op: Compare_opContext? = null
var int_value: Int_valueContext? = null
}
fun op_int(): Op_intContext {
val _localctx = Op_intContext("op_int"
    )
        when(lex.curToken) {
            LOWER, LOWER_EQUAL, I_NOT_EQUAL, I_EQUAL, HIGHER, HIGHER_EQUAL -> {
val compare_op = compare_op()
_localctx.compare_op = compare_op
_localctx.children.add(compare_op)
val int_value = int_value()
_localctx.int_value = int_value
_localctx.children.add(int_value)
_localctx.value = "(${_localctx.int_value!!.value} ${_localctx.compare_op!!.op}"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in op_int()")
        }
    }

open class Logic_logicContext(name:String): Tree(name) {
var value: String? = null
var logic_operation: Logic_operationContext? = null
var logic_value: Logic_valueContext? = null
var NOT: TerminalNode? = null
}
fun logic_logic(): Logic_logicContext {
val _localctx = Logic_logicContext("logic_logic"
    )
        when(lex.curToken) {
            OR, L_NOT_EQUAL, AND, L_EQUAL -> {
val logic_operation = logic_operation()
_localctx.logic_operation = logic_operation
_localctx.children.add(logic_operation)
val logic_value = logic_value()
_localctx.logic_value = logic_value
_localctx.children.add(logic_value)
_localctx.value = "(${_localctx.logic_value!!.value} ${_localctx.logic_operation!!.op}"
return _localctx}
NOT -> {
if (lex.curToken != NOT) {
        throw AssertionError("${lex.curToken} not expected in logic_logic()")
}
val NOT = TerminalNode("NOT", lex.curTokenText)
_localctx.NOT = NOT
_localctx.children.add(NOT)
_localctx.value = "!("
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in logic_logic()")
        }
    }

open class Int_valueContext(name:String): Tree(name) {
var value: String? = null
var int_int: Int_intContext? = null
var int_value: Int_valueContext? = null
var VARS: TerminalNode? = null
var NUMBER: TerminalNode? = null
}
fun int_value(): Int_valueContext {
val _localctx = Int_valueContext("int_value"
    )
        when(lex.curToken) {
            DIV, MULL, PLUS, MINUS -> {
val int_int = int_int()
_localctx.int_int = int_int
_localctx.children.add(int_int)
val int_value = int_value()
_localctx.int_value = int_value
_localctx.children.add(int_value)
_localctx.value = "${_localctx.int_int!!.value} ${_localctx.int_value!!.value})"
return _localctx}
VARS -> {
if (lex.curToken != VARS) {
        throw AssertionError("${lex.curToken} not expected in int_value()")
}
val VARS = TerminalNode("VARS", lex.curTokenText)
_localctx.VARS = VARS
_localctx.children.add(VARS)
_localctx.value = _localctx.VARS!!.text
lex.nextToken()
return _localctx}
NUMBER -> {
if (lex.curToken != NUMBER) {
        throw AssertionError("${lex.curToken} not expected in int_value()")
}
val NUMBER = TerminalNode("NUMBER", lex.curTokenText)
_localctx.NUMBER = NUMBER
_localctx.children.add(NUMBER)
_localctx.value = _localctx.NUMBER!!.text
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in int_value()")
        }
    }

open class Int_intContext(name:String): Tree(name) {
var value: String? = null
var int_operations: Int_operationsContext? = null
var int_value: Int_valueContext? = null
}
fun int_int(): Int_intContext {
val _localctx = Int_intContext("int_int"
    )
        when(lex.curToken) {
            DIV, MULL, PLUS, MINUS -> {
val int_operations = int_operations()
_localctx.int_operations = int_operations
_localctx.children.add(int_operations)
val int_value = int_value()
_localctx.int_value = int_value
_localctx.children.add(int_value)
_localctx.value = "(${_localctx.int_value!!.value} ${_localctx.int_operations!!.op}"
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in int_int()")
        }
    }

open class Logic_operationContext(name:String): Tree(name) {
var op: String? = null
var OR: TerminalNode? = null
var AND: TerminalNode? = null
var L_EQUAL: TerminalNode? = null
var L_NOT_EQUAL: TerminalNode? = null
}
fun logic_operation(): Logic_operationContext {
val _localctx = Logic_operationContext("logic_operation"
    )
        when(lex.curToken) {
            OR -> {
if (lex.curToken != OR) {
        throw AssertionError("${lex.curToken} not expected in logic_operation()")
}
val OR = TerminalNode("OR", lex.curTokenText)
_localctx.OR = OR
_localctx.children.add(OR)
_localctx.op = " || "
lex.nextToken()
return _localctx}
AND -> {
if (lex.curToken != AND) {
        throw AssertionError("${lex.curToken} not expected in logic_operation()")
}
val AND = TerminalNode("AND", lex.curTokenText)
_localctx.AND = AND
_localctx.children.add(AND)
_localctx.op = " && "
lex.nextToken()
return _localctx}
L_EQUAL -> {
if (lex.curToken != L_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in logic_operation()")
}
val L_EQUAL = TerminalNode("L_EQUAL", lex.curTokenText)
_localctx.L_EQUAL = L_EQUAL
_localctx.children.add(L_EQUAL)
_localctx.op = " == "
lex.nextToken()
return _localctx}
L_NOT_EQUAL -> {
if (lex.curToken != L_NOT_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in logic_operation()")
}
val L_NOT_EQUAL = TerminalNode("L_NOT_EQUAL", lex.curTokenText)
_localctx.L_NOT_EQUAL = L_NOT_EQUAL
_localctx.children.add(L_NOT_EQUAL)
_localctx.op = " != "
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in logic_operation()")
        }
    }

open class Int_operationsContext(name:String): Tree(name) {
var op: String? = null
var PLUS: TerminalNode? = null
var MINUS: TerminalNode? = null
var MULL: TerminalNode? = null
var DIV: TerminalNode? = null
}
fun int_operations(): Int_operationsContext {
val _localctx = Int_operationsContext("int_operations"
    )
        when(lex.curToken) {
            PLUS -> {
if (lex.curToken != PLUS) {
        throw AssertionError("${lex.curToken} not expected in int_operations()")
}
val PLUS = TerminalNode("PLUS", lex.curTokenText)
_localctx.PLUS = PLUS
_localctx.children.add(PLUS)
_localctx.op = " + "
lex.nextToken()
return _localctx}
MINUS -> {
if (lex.curToken != MINUS) {
        throw AssertionError("${lex.curToken} not expected in int_operations()")
}
val MINUS = TerminalNode("MINUS", lex.curTokenText)
_localctx.MINUS = MINUS
_localctx.children.add(MINUS)
_localctx.op = " - "
lex.nextToken()
return _localctx}
MULL -> {
if (lex.curToken != MULL) {
        throw AssertionError("${lex.curToken} not expected in int_operations()")
}
val MULL = TerminalNode("MULL", lex.curTokenText)
_localctx.MULL = MULL
_localctx.children.add(MULL)
_localctx.op = " * "
lex.nextToken()
return _localctx}
DIV -> {
if (lex.curToken != DIV) {
        throw AssertionError("${lex.curToken} not expected in int_operations()")
}
val DIV = TerminalNode("DIV", lex.curTokenText)
_localctx.DIV = DIV
_localctx.children.add(DIV)
_localctx.op = " / "
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in int_operations()")
        }
    }

open class Compare_opContext(name:String): Tree(name) {
var op: String? = null
var I_EQUAL: TerminalNode? = null
var I_NOT_EQUAL: TerminalNode? = null
var LOWER: TerminalNode? = null
var LOWER_EQUAL: TerminalNode? = null
var HIGHER: TerminalNode? = null
var HIGHER_EQUAL: TerminalNode? = null
}
fun compare_op(): Compare_opContext {
val _localctx = Compare_opContext("compare_op"
    )
        when(lex.curToken) {
            I_EQUAL -> {
if (lex.curToken != I_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val I_EQUAL = TerminalNode("I_EQUAL", lex.curTokenText)
_localctx.I_EQUAL = I_EQUAL
_localctx.children.add(I_EQUAL)
_localctx.op = " == "
lex.nextToken()
return _localctx}
I_NOT_EQUAL -> {
if (lex.curToken != I_NOT_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val I_NOT_EQUAL = TerminalNode("I_NOT_EQUAL", lex.curTokenText)
_localctx.I_NOT_EQUAL = I_NOT_EQUAL
_localctx.children.add(I_NOT_EQUAL)
_localctx.op = " != "
lex.nextToken()
return _localctx}
LOWER -> {
if (lex.curToken != LOWER) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val LOWER = TerminalNode("LOWER", lex.curTokenText)
_localctx.LOWER = LOWER
_localctx.children.add(LOWER)
_localctx.op = " < "
lex.nextToken()
return _localctx}
LOWER_EQUAL -> {
if (lex.curToken != LOWER_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val LOWER_EQUAL = TerminalNode("LOWER_EQUAL", lex.curTokenText)
_localctx.LOWER_EQUAL = LOWER_EQUAL
_localctx.children.add(LOWER_EQUAL)
_localctx.op = " <= "
lex.nextToken()
return _localctx}
HIGHER -> {
if (lex.curToken != HIGHER) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val HIGHER = TerminalNode("HIGHER", lex.curTokenText)
_localctx.HIGHER = HIGHER
_localctx.children.add(HIGHER)
_localctx.op = " > "
lex.nextToken()
return _localctx}
HIGHER_EQUAL -> {
if (lex.curToken != HIGHER_EQUAL) {
        throw AssertionError("${lex.curToken} not expected in compare_op()")
}
val HIGHER_EQUAL = TerminalNode("HIGHER_EQUAL", lex.curTokenText)
_localctx.HIGHER_EQUAL = HIGHER_EQUAL
_localctx.children.add(HIGHER_EQUAL)
_localctx.op = " >= "
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in compare_op()")
        }
    }

}
