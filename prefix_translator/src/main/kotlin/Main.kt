import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(args: Array<String>) {
    val streams = CharStreams.fromString("def a 2 def a 4 def a + b 6 if < 2 3 (print 3) if >= 4 - 7 2 (print + 3 4)")
    val lexer = PrefixGrammarLexer(streams)
    val tokens = CommonTokenStream(lexer)
    val parser = PrefixGrammarParser(tokens)
    System.out.println(parser.start().value)
}