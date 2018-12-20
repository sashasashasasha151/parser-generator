fun main(args: Array<String>) {
    val generator = ParserGenerator()

    try {
        generator.generate(
            "src/test/kotlin/test_grammars/LeftRecursion.txt",
            "src/test/kotlin/test_grammars/generated/",
            "test_grammars.generated"
        )
    } catch (e:Exception) {
        println(e.message)
    }

    try {
        generator.generate(
            "src/test/kotlin/test_grammars/RightBranching.txt",
            "src/test/kotlin/test_grammars/generated/",
            "test_grammars.generated"
        )
    } catch (e:Exception) {
        println(e.message)
    }

    generator.generate(
        "src/test/kotlin/test_grammars/SecondHWGrammar.txt",
        "src/test/kotlin/test_grammars/generated/",
        "test_grammars.generated"
    )

    generator.generate(
        "src/test/kotlin/test_grammars/SecondHWAndAttrs.txt",
        "src/test/kotlin/test_grammars/generated/",
        "test_grammars.generated"
    )

    generator.generate(
        "src/test/kotlin/test_grammars/ThirdHWGrammar.txt",
        "src/test/kotlin/test_grammars/generated/",
        "test_grammars.generated"
    )
}