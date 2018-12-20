
package test_grammars.generated

import test_grammars.generated.SecondHWAndAttrsLexer.Token.*

class SecondHWAndAttrsParser(private val lex: SecondHWAndAttrsLexer) {

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
var vall: Int? = null
var b: BContext? = null
var u: UContext? = null
}
fun start(): StartContext {
val _localctx = StartContext("start"
    )
        when(lex.curToken) {
            LP, VAR, UN -> {
val b = b()
_localctx.b = b
_localctx.children.add(b)
val u = u(b.vall!!)
_localctx.u = u
_localctx.children.add(u)
_localctx.vall = _localctx.u!!.vallue
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in start()")
        }
    }

open class UContext(name:String, val vall: Int): Tree(name) {
var vallue: Int? = null
var op: OpContext? = null
var b: BContext? = null
var u: UContext? = null
}
fun u(vall: Int): UContext {
val _localctx = UContext("u", vall
    )
        when(lex.curToken) {
            ADD, UN -> {
val op = op()
_localctx.op = op
_localctx.children.add(op)
val b = b()
_localctx.b = b
_localctx.children.add(b)
_localctx.vallue = if(_localctx.op!!.UN != null) _localctx.vall - _localctx.b!!.vall!! else _localctx.vall + _localctx.b!!.vall!!
val u = u(_localctx.vallue!!)
_localctx.u = u
_localctx.children.add(u)
_localctx.vallue = _localctx.u!!.vallue
return _localctx}
END, RP -> {
_localctx.vallue = _localctx.vall
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in u()")
        }
    }

open class OpContext(name:String): Tree(name) {
var ADD: TerminalNode? = null
var UN: TerminalNode? = null
}
fun op(): OpContext {
val _localctx = OpContext("op"
    )
        when(lex.curToken) {
            ADD -> {
if (lex.curToken != ADD) {
        throw AssertionError("${lex.curToken} not expected in op()")
}
val ADD = TerminalNode("ADD", lex.curTokenText)
_localctx.ADD = ADD
_localctx.children.add(ADD)
lex.nextToken()
return _localctx}
UN -> {
if (lex.curToken != UN) {
        throw AssertionError("${lex.curToken} not expected in op()")
}
val UN = TerminalNode("UN", lex.curTokenText)
_localctx.UN = UN
_localctx.children.add(UN)
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in op()")
        }
    }

open class BContext(name:String): Tree(name) {
var vall: Int? = null
var c: CContext? = null
var v: VContext? = null
}
fun b(): BContext {
val _localctx = BContext("b"
    )
        when(lex.curToken) {
            LP, VAR, UN -> {
val c = c()
_localctx.c = c
_localctx.children.add(c)
val v = v(c.vall!!)
_localctx.v = v
_localctx.children.add(v)
_localctx.vall = _localctx.v!!.vallue
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in b()")
        }
    }

open class VContext(name:String, val vall: Int): Tree(name) {
var vallue: Int? = null
var MUL: TerminalNode? = null
var c: CContext? = null
var v: VContext? = null
}
fun v(vall: Int): VContext {
val _localctx = VContext("v", vall
    )
        when(lex.curToken) {
            MUL -> {
if (lex.curToken != MUL) {
        throw AssertionError("${lex.curToken} not expected in v()")
}
val MUL = TerminalNode("MUL", lex.curTokenText)
_localctx.MUL = MUL
_localctx.children.add(MUL)
lex.nextToken()
val c = c()
_localctx.c = c
_localctx.children.add(c)
_localctx.vallue = _localctx.vall * _localctx.c!!.vall!!
val v = v(_localctx.vallue!!)
_localctx.v = v
_localctx.children.add(v)
_localctx.vallue = _localctx.v!!.vallue
return _localctx}
ADD, UN, END, RP -> {
_localctx.vallue = _localctx.vall
return _localctx
}
else ->
                throw AssertionError("${lex.curToken} not expected in v()")
        }
    }

open class CContext(name:String): Tree(name) {
var vall: Int? = null
var UN: TerminalNode? = null
var d: DContext? = null
}
fun c(): CContext {
val _localctx = CContext("c"
    )
        when(lex.curToken) {
            UN -> {
if (lex.curToken != UN) {
        throw AssertionError("${lex.curToken} not expected in c()")
}
val UN = TerminalNode("UN", lex.curTokenText)
_localctx.UN = UN
_localctx.children.add(UN)
lex.nextToken()
val d = d()
_localctx.d = d
_localctx.children.add(d)
_localctx.vall = _localctx.d!!.vall!! *-1
return _localctx}
LP, VAR -> {
val d = d()
_localctx.d = d
_localctx.children.add(d)
_localctx.vall = _localctx.d!!.vall
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in c()")
        }
    }

open class DContext(name:String): Tree(name) {
var vall: Int? = null
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
_localctx.vall = _localctx.start!!.vall
lex.nextToken()
return _localctx}
VAR -> {
if (lex.curToken != VAR) {
        throw AssertionError("${lex.curToken} not expected in d()")
}
val VAR = TerminalNode("VAR", lex.curTokenText)
_localctx.VAR = VAR
_localctx.children.add(VAR)
_localctx.vall = _localctx.VAR!!.text.toInt()
lex.nextToken()
return _localctx}
else ->
                throw AssertionError("${lex.curToken} not expected in d()")
        }
    }

}
