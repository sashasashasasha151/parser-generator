package test_grammars.generated.generated_tests

import test_grammars.generated.SecondHWAndAttrsLexer
import test_grammars.generated.SecondHWAndAttrsParser

fun main(args: Array<String>) {
    val lexer = SecondHWAndAttrsLexer("1 - 2 - 3".byteInputStream())
    val parser = SecondHWAndAttrsParser(lexer)
    print(parser.parse().vall)
}