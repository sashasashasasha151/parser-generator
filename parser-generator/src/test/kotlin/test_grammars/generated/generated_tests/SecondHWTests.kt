package test_grammars.generated.generated_tests

import test_grammars.generated.SecondHWGrammarLexer
import test_grammars.generated.SecondHWGrammarParser
import java.text.ParseException
import java.util.*
import test_grammars.generated.SecondHWGrammarLexer.Token.*

class SecondHWTests {
    private val symbols = mutableListOf(' ', '\n', '\t', 'r', '(', ')', '^', '|', '&', '!').apply { addAll('a'..'z') }
    private val xorTestsList = listOf(
        "a",
        "a ^ a",
        "a ^ b",
        "a ^ a ^ b"
    )
    private val andTestsList = listOf(
        "a & a",
        "a & b",
        "a & a & b"
    )
    private val orTestsList = listOf(
        "a | a",
        "a | b",
        "a | a | b"
    )
    private val notTestsList = listOf(
//        "! a",
        "! ( ! a )",
        "!   ( ! ( ! a ) )"
    )
    private val parenthesesTestsList = listOf(
        "( a )",
        "! ( a )",
        "( a ) | ( a )",
        "( a | a ) & a",
        "( ( ( a ) | ( a ) ) ^ ( ( b ) & ( b ) ) & ( a ) )",
        "( ( ( ( a ) ) ) )"
    )
    private val validTestsList = listOf(
        "a | a | b",
        "( ! a   |   b )   &   a   &   ( a   |   ! ( b   ^   c ) )   ^   g",
        " ( ( ! a | b & h ) | ( r ^ f ^ ( t | i ) & ( t   ^ v  ) ) ) & g ",
        "( a | s ) ^ ( ( a ^ b ) ^ ( c | c | c | c ) )",
        "! ( ! a )",
        "a & ! a"
    )
    private val notValidTestsList = listOf(
        "( )",
        "! a )",
        "! ( a",
        "( a ) | ^ a",
        "a ( | ) a & a",
        "( ( a ) | ( a ) ) ^ ( ( b ) & ( b ) ) & ( a ) )",
        "( ( ( a ) ) ) )",
        "( ( ( ( ",
        ") ) )",
        "! ^ a ",
        "^ a b"
    )

    private fun getRandomExpression(depth: Int): String {
        if (depth == 0) {
            return "a"
        }

        val s = StringBuilder()

        val randomState = rand.nextInt(3)

        when (randomState) {
            0 -> {
                s.append(" ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) | ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) ")
            }
            1 -> {
                s.append(" ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) ^ ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) ")
            }
            2 -> {
                s.append(" ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) & ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) ")
            }
            else -> {
                s.append(" ! ( ")
                s.append(getRandomExpression(depth - 1))
                s.append(" ) ")
            }
        }

        return s.toString()
    }

    private val rand = Random()
    private val str = StringBuilder()

    fun validSymbols() {
        str.clear()
        for (i in 0..10000) {
            str.append(symbols[rand.nextInt(symbols.size - 4) + 4]).append(" ")
        }

        val lexicalAnalyzer = SecondHWGrammarLexer(str.toString().byteInputStream())

        try {
            lexicalAnalyzer.nextToken()
            while (lexicalAnalyzer.curToken != SecondHWGrammarLexer.Token.END) {
                lexicalAnalyzer.nextToken()
            }
            println("ValidSymbolsTest: OK")
        } catch (e: ParseException) {
            println("ValidSymbolsTest: FAILED")
        }
    }

    fun whiteSpaces() {
        str.clear()
        for (j in 0..1000) {
            str.append(symbols[rand.nextInt(symbols.size)])
        }

        val lexicalAnalyzer = SecondHWGrammarLexer(str.toString().byteInputStream())

        try {
            lexicalAnalyzer.nextToken()
            while (lexicalAnalyzer.curToken != END) {
                lexicalAnalyzer.nextToken()
            }
            println("WhiteSpacesTest: OK")
        } catch (e: ParseException) {
            println("WhiteSpacesTest: OK")
        }
    }

    fun notValidSymbols() {
        for (i in 0..1000) {
            str.clear()
            for (j in 0..1000) {
                str.append(symbols[rand.nextInt(symbols.size)]).append(" ")
            }
            str.setCharAt(3, '=')

            val lexicalAnalyzer = SecondHWGrammarLexer(str.toString().byteInputStream())
            try {
                lexicalAnalyzer.nextToken()
                while (lexicalAnalyzer.curToken != END) {
                    lexicalAnalyzer.nextToken()
                }
                println("NotValidSymbolsTest: FAILED")
                return
            } catch (e: ParseException) {
            }
        }
        println("NotValidSymbolsTest: OK")
    }

    fun xor() {
        try {
            for (l in xorTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("XorTest: OK")
        } catch (e: AssertionError) {
            println("XorTest: FAILED")
        }
    }

    fun and() {
        try {
            for (l in andTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("AndTest: OK")
        } catch (e: AssertionError) {
            println("AndTest: FAILED")
        }
    }

    fun or() {
        try {
            for (l in orTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("OrTest: OK")
        } catch (e: AssertionError) {
            println("OrTest: FAILED")
        }
    }

    fun not() {
        try {
            for (l in notTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("NotTest: OK")
        } catch (e: AssertionError) {
            println("NotTest: FAILED")
        }
    }

    fun parentheses() {
        try {
            for (l in parenthesesTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("ParenthesesTest: OK")
        } catch (e: AssertionError) {
            println("ParenthesesTest: FAILED")
        }
    }

    fun validExpressions() {
        try {
            for (l in validTestsList) {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
            }
            println("ValidTest: OK")
        } catch (e: AssertionError) {
            println("ValidTest: FAILED")
        }
    }

    fun notValidExpressions() {
        for (l in notValidTestsList) {
            try {
                val lexicalAnalyzer = SecondHWGrammarLexer(l.byteInputStream())
                val parser = SecondHWGrammarParser(lexicalAnalyzer)
                parser.parse()
                println("NotValidTest: FAILED")
                return
            } catch (e: AssertionError) {
            }
        }
        println("NotValidTest: OK")
    }

    fun randomValidTests() {
        try {
            for (i in 1..10) {
                for (it in 0..100) {
                    val lexicalAnalyzer = SecondHWGrammarLexer(getRandomExpression(i).byteInputStream())
                    val parser = SecondHWGrammarParser(lexicalAnalyzer)
                    parser.parse()
                }
            }
            println("RandomValidTests: OK")
        } catch (e: AssertionError) {
            println("RandomValidTests: FAILED")
        }
    }

//    fun visualizationTest() =
//        TreeVisualizer()
//            .showTree(
//                Parser().parse(FileInputStream(File("src/test/VisualizationTest.txt"))),
//                "src/test/VisualizationTest.png")

    fun testAll() {
        validSymbols()
        whiteSpaces()
        notValidSymbols()
        xor()
        and()
        or()
        not()
        parentheses()
        validExpressions()
        notValidExpressions()
        randomValidTests()
//        visualizationTest()
    }
}