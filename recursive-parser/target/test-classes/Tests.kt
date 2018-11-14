package test.resources

import main.LexicalAnalyzer
import main.Parser
import main.Token
import org.junit.Test

import java.util.Random

import java.text.ParseException

class Tests {
    private val symbols = mutableListOf(' ', '\n', '\t', 'r', '(', ')', '^', '|', '&', '!').apply { addAll('a'..'z') }
    private val rand = Random()
    private val str = StringBuilder()
    private val parser = Parser()

    @Test
    fun validSymbols() {
        str.clear()
        for (i in 0..10000) {
            str.append(symbols[rand.nextInt(symbols.size - 4) + 4])
        }

        val lexicalAnalyzer = LexicalAnalyzer(str.toString().byteInputStream())

        try {
            lexicalAnalyzer.nextToken()
            while (lexicalAnalyzer.curToken != Token.END) {
                lexicalAnalyzer.nextToken()
            }
            println("ValidSymbolsTest: OK")
        } catch (e: ParseException) {
            println("ValidSymbolsTest: FAILED")
        }
    }
}