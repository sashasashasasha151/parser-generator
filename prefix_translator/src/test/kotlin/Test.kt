import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Tester {

    @Test
    fun lexerTest() {
        val lex = RandomSymbols()

        for (i in 0..1000) {
            val streams = CharStreams.fromString(lex.getValidSymbols())

            val lexer = PrefixGrammarLexer(streams)

            while (lexer.nextToken().type != -1) {
            }
        }

        assertFailsWith(RuntimeException::class) {
            for (i in 0..1000) {
                val streams = CharStreams.fromString(lex.getNotValidSymbols())

                val lexer = PrefixGrammarLexer(streams)
                lexer.removeErrorListeners()
                lexer.addErrorListener(ThrowingErrorListener.INSTANCE)

                while (lexer.nextToken().type != -1) {
                }
            }
        }
    }

    @Test
    fun parserTest() {
        val program = ValidPrefixProgram()

        for (i in 0..1000) {
            val streams = CharStreams.fromString(program.getProgram().first)

            val lexer = PrefixGrammarLexer(streams)
            val tokens = CommonTokenStream(lexer)
            val parser = PrefixGrammarParser(tokens)
            parser.start().value
        }
    }

    @Test
    fun parserTestCompile() {
        val program = ValidPrefixProgram()

        for (i in 1..10) {
            val pair = program.getProgram()
            val streams = CharStreams.fromString(pair.first)

            val lexer = PrefixGrammarLexer(streams)
            val tokens = CommonTokenStream(lexer)
            val parser = PrefixGrammarParser(tokens)
            val str = parser.start().value

            val path = "/home/sasha/Code/MT/prefix_translator/src/test/kotlin/ktProgs/"

            val fileName = "${path}Hello$i.kt"
            val file = File(fileName)
            file.writeText(str)

            val rt = Runtime.getRuntime()

            var pr = rt.exec("kotlinc $fileName -include-runtime -d $path/compiled/hello$i.jar")
            pr.waitFor()
            assertEquals(pr.exitValue(), 0)

            pr = rt.exec("java -jar $path/compiled/hello$i.jar")
            pr.waitFor()
            assertEquals(pr.inputStream.bufferedReader().use { it.readText() }, pair.second)
        }
    }
}