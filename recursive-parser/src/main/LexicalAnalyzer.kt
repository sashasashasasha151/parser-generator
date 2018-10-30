package main

import java.io.IOException
import java.io.InputStream
import java.text.ParseException
import main.Token.*

class LexicalAnalyzer(private val input: InputStream) {
    private var curChar: Int = -1

    private var curPos = 0

    lateinit var curToken: Token
        private set

    init {
        nextChar()
    }

    fun nextToken() {
        if (curChar == -1) {
            curToken = END
            return
        }

        while (isBlank(curChar.toChar())) {
            nextChar()
        }

        curToken = when (curChar.toChar()) {
            in 'a'..'z' -> VAR
            '(' -> LPAREN
            ')' -> RPAREN
            '&' -> AND
            '|' -> OR
            '^' -> XOR
            '!' -> NOT
            else -> {
                throw ParseException("Illegal character '$curChar'", curPos)
            }
        }

        nextChar()
    }

    private fun nextChar() {
        try {
            curChar = input.read()
            curPos++
        } catch (e: IOException) {
            throw ParseException(e.message, curPos);
        }
    }

    private fun isBlank(char: Char) = char.isWhitespace()
}