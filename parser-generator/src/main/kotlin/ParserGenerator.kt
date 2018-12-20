import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

class ParserGenerator {
    fun generate(grammaPath: String, toFolderPath: String, packageName: String) {
        val streams = CharStreams.fromFileName(grammaPath)
        val lexer = GrammarLexer(streams)
        val tokens = CommonTokenStream(lexer)
        val parser = GrammarParser(tokens)
        val tree = parser.start()

        val lexer_gen = LexerGenerator(tree.findWords()!!.text, tree.findTtokenss(), toFolderPath, packageName)
        lexer_gen.generate()

        val parser_gen = ParserBuilder(tree.findWords()!!.text, tree.findRruless(), toFolderPath, packageName)
        parser_gen.generate()
    }
}