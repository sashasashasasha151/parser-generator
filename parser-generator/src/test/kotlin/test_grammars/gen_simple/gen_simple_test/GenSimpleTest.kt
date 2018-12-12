package test_grammars.gen_simple.gen_simple_test

import test_grammars.gen_simple.SimpleGrammarLexer

fun main(args: Array<String>) {
    val lexer = SimpleGrammarLexer(("| : ; [ ] , ~ returns grammar" +
            "eifweofwo EIFEOFWEFO EefE_4 {rkjgf eirei gneri gnerig nerign} 'ree rge' " +
            "`erfr eger  gerg` (erf e re)").byteInputStream())
    lexer.nextToken()
    while (lexer.curToken!=SimpleGrammarLexer.Token.END) {
        println(lexer.curToken)
        lexer.nextToken()
    }
}