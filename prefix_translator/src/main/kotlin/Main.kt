import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import java.io.File
import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
//    val streams = CharStreams.fromString("def a 2 def b 4 def c + b 6 if < a b (print c = b 55) (if | true false (print > b c))")
    val streams = CharStreams.fromString("def a 0 def b 5 while > b 0 (print b = b - b 1)")
    val lexer = PrefixGrammarLexer(streams)

//    lexer.removeErrorListeners()
//    lexer.addErrorListener(ThrowingErrorListener.INSTANCE)

    val tokens = CommonTokenStream(lexer)
    val parser = PrefixGrammarParser(tokens)

//    parser.removeErrorListeners()
//    parser.addErrorListener(ThrowingErrorListener.INSTANCE)

    val str = parser.start().value

    System.out.println(str)
    val fileName = "src/test/kotlin/ktProgs/Hello.kt"

    var file = File(fileName)

    // create a new file
    file.writeText(str)

    val rt = Runtime.getRuntime()
    try {
        var pr = rt.exec("kotlinc /home/sasha/Code/MT/prefix_translator/src/test/kotlin/ktProgs/Hello.kt -include-runtime -d /home/sasha/Code/MT/prefix_translator/src/test/kotlin/ktProgs/hello.jar")
        pr.waitFor()
        print(pr.exitValue())
        print(pr.errorStream.bufferedReader().use { it.readText() })

        pr = rt.exec("java -jar /home/sasha/Code/MT/prefix_translator/src/test/kotlin/ktProgs/hello.jar")
        pr.waitFor()
        print(pr.inputStream.bufferedReader().use { it.readText() } == "10${10.toChar()}true${10.toChar()}")
    } catch (e1: IOException) {
        e1.printStackTrace();
    }
}