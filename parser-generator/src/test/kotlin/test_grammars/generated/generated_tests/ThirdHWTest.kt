package test_grammars.generated.generated_tests

import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import test_grammars.generated.ThirdHWGrammarLexer
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import test_grammars.generated.ThirdHWGrammarLexer.Token.*
import test_grammars.generated.ThirdHWGrammarParser

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ThirdHWTest {

    @Test
    fun lexerTest() {
        val lex = RandomSymbols()

        for (i in 0..1000) {
            val streams = lex.getValidSymbols().byteInputStream()

            val lexer = ThirdHWGrammarLexer(streams)

            lexer.nextToken()

            while (lexer.curToken != END) {
                lexer.nextToken()
            }
        }
    }

    @Test
    fun parserTest() {
        val program = ValidPrefixProgram()

        for (i in 0..100) {
            val str = program.getProgram().first
            val streams = str.byteInputStream()

            val lexer = ThirdHWGrammarLexer(streams)
            val parser = ThirdHWGrammarParser(lexer)
            parser.start()
        }
    }

    @Test
    fun parserTestCompile() {
        val program = ValidPrefixProgram()

        for (i in 1..10) {
            println("Test$i")
            val pair = program.getProgram(20)
            println("ProgramGenerated")
            val streams = pair.first.byteInputStream()

            val lexer = ThirdHWGrammarLexer(streams)
            val parser = ThirdHWGrammarParser(lexer)
            val str = parser.start().value

            val path = "/home/sasha/Code/MT/parser-generator/src/test/kotlin/test_grammars/generated/generated_tests/ktProgs/"

            val fileName = "${path}Hello$i.kt"
            val file = File(fileName)
            file.writeText(str!!)
            println("Wrote")

            val rt = Runtime.getRuntime()

            var pr = rt.exec("kotlinc $fileName -include-runtime -d $path/compiled/hello$i.jar")
            pr.waitFor()
            println("Compiled")
            assertEquals(pr.exitValue(), 0)

            pr = rt.exec("java -jar $path/compiled/hello$i.jar")
            println("Run")
            pr.waitFor()
            if(pr.exitValue() != 0) {
                print(pr.errorStream.bufferedReader().use { it.readText() })
            }
//            println("Run")
//            println(pr.inputStream.bufferedReader().use { it.readText() })
//            println(pair.second)
//            assertEquals(pr.inputStream.bufferedReader().use { it.readText() }.replace("\\s+".toRegex(), ""), pair.second)
        }
    }
}