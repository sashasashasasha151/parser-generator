
package test_grammars.generated

import test_grammars.generated.SecondHWGrammarLexer.Token.*

class SecondHWGrammarParser(private val lex: SecondHWGrammarLexer) {

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
var a: AContext? = null
var t: TContext? = null
}
fun start(): StartContext {
val _localctx = StartContext("start"
    )
        when(lex.curToken) {
            NOT, LP, VAR -> {
val a = a()
_localctx.a = a
_localctx.children.add(a)
val t = t()
_localctx.t = t
_localctx.children.add(t)
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in start()")
        }
    }

open class TContext(name:String): Tree(name) {
var OR: TerminalNode? = null
var a: AContext? = null
var t: TContext? = null
}
fun t(): TContext {
val _localctx = TContext("t"
    )
        when(lex.curToken) {
            OR -> {
if (lex.curToken != OR) {
        throw AssertionError("${lex.curToken} not expected in t()")
}
val OR = TerminalNode("OR", lex.curTokenText)
_localctx.OR = OR
_localctx.children.add(OR)
lex.nextToken()
val a = a()
_localctx.a = a
_localctx.children.add(a)
val t = t()
_localctx.t = t
_localctx.children.add(t)
return _localctx}
END, RP -> {
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in t()")
        }
    }

open class AContext(name:String): Tree(name) {
var b: BContext? = null
var u: UContext? = null
}
fun a(): AContext {
val _localctx = AContext("a"
    )
        when(lex.curToken) {
            NOT, LP, VAR -> {
val b = b()
_localctx.b = b
_localctx.children.add(b)
val u = u()
_localctx.u = u
_localctx.children.add(u)
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in a()")
        }
    }

open class UContext(name:String): Tree(name) {
var XOR: TerminalNode? = null
var b: BContext? = null
var u: UContext? = null
}
fun u(): UContext {
val _localctx = UContext("u"
    )
        when(lex.curToken) {
            XOR -> {
if (lex.curToken != XOR) {
        throw AssertionError("${lex.curToken} not expected in u()")
}
val XOR = TerminalNode("XOR", lex.curTokenText)
_localctx.XOR = XOR
_localctx.children.add(XOR)
lex.nextToken()
val b = b()
_localctx.b = b
_localctx.children.add(b)
val u = u()
_localctx.u = u
_localctx.children.add(u)
return _localctx}
OR, END, RP -> {
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in u()")
        }
    }

open class BContext(name:String): Tree(name) {
var c: CContext? = null
var v: VContext? = null
}
fun b(): BContext {
val _localctx = BContext("b"
    )
        when(lex.curToken) {
            NOT, LP, VAR -> {
val c = c()
_localctx.c = c
_localctx.children.add(c)
val v = v()
_localctx.v = v
_localctx.children.add(v)
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in b()")
        }
    }

open class VContext(name:String): Tree(name) {
var AND: TerminalNode? = null
var c: CContext? = null
var v: VContext? = null
}
fun v(): VContext {
val _localctx = VContext("v"
    )
        when(lex.curToken) {
            AND -> {
if (lex.curToken != AND) {
        throw AssertionError("${lex.curToken} not expected in v()")
}
val AND = TerminalNode("AND", lex.curTokenText)
_localctx.AND = AND
_localctx.children.add(AND)
lex.nextToken()
val c = c()
_localctx.c = c
_localctx.children.add(c)
val v = v()
_localctx.v = v
_localctx.children.add(v)
return _localctx}
OR, END, XOR, RP -> {
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in v()")
        }
    }

open class CContext(name:String): Tree(name) {
var NOT: TerminalNode? = null
var d: DContext? = null
}
fun c(): CContext {
val _localctx = CContext("c"
    )
        when(lex.curToken) {
            NOT -> {
if (lex.curToken != NOT) {
        throw AssertionError("${lex.curToken} not expected in c()")
}
val NOT = TerminalNode("NOT", lex.curTokenText)
_localctx.NOT = NOT
_localctx.children.add(NOT)
lex.nextToken()
val d = d()
_localctx.d = d
_localctx.children.add(d)
return _localctx}
LP, VAR -> {
val d = d()
_localctx.d = d
_localctx.children.add(d)
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in c()")
        }
    }

open class DContext(name:String): Tree(name) {
var LP: TerminalNode? = null
var start: StartContext? = null
var RP: TerminalNode? = null
var VAR: TerminalNode? = null
}
fun d(): DContext {
val _localctx = DContext("d"
    )
        when(lex.curToken) {
            LP -> {
if (lex.curToken != LP) {
        throw AssertionError("${lex.curToken} not expected in d()")
}
val LP = TerminalNode("LP", lex.curTokenText)
_localctx.LP = LP
_localctx.children.add(LP)
lex.nextToken()
val start = start()
_localctx.start = start
_localctx.children.add(start)
if (lex.curToken != RP) {
        throw AssertionError("${lex.curToken} not expected in d()")
}
val RP = TerminalNode("RP", lex.curTokenText)
_localctx.RP = RP
_localctx.children.add(RP)
lex.nextToken()
return _localctx}
VAR -> {
if (lex.curToken != VAR) {
        throw AssertionError("${lex.curToken} not expected in d()")
}
val VAR = TerminalNode("VAR", lex.curTokenText)
_localctx.VAR = VAR
_localctx.children.add(VAR)
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in d()")
        }
    }

}
