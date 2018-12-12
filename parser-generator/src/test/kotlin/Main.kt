fun main(args: Array<String>) {
    val generator = ParserGenerator()

    generator.generate(
        "/home/sasha/Code/MT/parser-generator/src/test/kotlin/test_grammars/SimpleGrammar.txt",
        "/home/sasha/Code/MT/parser-generator/src/test/kotlin/test_grammars/gen_simple/"
    )
//    generator.generate(
//        "/home/sasha/Code/MT/parser-generator/src/test/test_grammars/GrammarWithAttrs.txt",
//        "/home/sasha/Code/MT/parser-generator/src/test/test_grammars/gen_attrs/"
//    )
}