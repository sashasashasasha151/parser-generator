import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import test_grammars.generated.SecondHWGrammarParser
import test_grammars.generated.generated_tests.SecondHWTests
import test_grammars.generated.generated_tests.ThirdHWTest
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Tester {

    @Test
    fun secondHWTest() {
        val test = SecondHWTests()
        test.testAll()
    }

    @Test
    fun thirdHWTest() {
        val test = ThirdHWTest()
        test.lexerTest()
        test.parserTest()
        test.parserTestCompile()
    }
}