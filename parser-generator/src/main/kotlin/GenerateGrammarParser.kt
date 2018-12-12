import org.antlr.v4.Tool

fun main(args: Array<String>) {
    Tool.main(
        arrayOf(
            "-Dlanguage=Kotlin",
            "-no-listener",
            "-no-visitor",
            "/home/sasha/Code/MT/parser-generator/src/main/kotlin/antlr4/Grammar.g4"
        )
    )
}