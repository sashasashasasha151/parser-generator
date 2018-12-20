
package test_grammars.generated

import java.io.IOException
import java.io.InputStream
import java.lang.StringBuilder
import java.text.ParseException

class ThirdHWGrammarLexer(private val input: InputStream) {
    enum class Token {
IF,
WHILE,
LPAREN,
RPAREN,
PRINT,
DEFINE,
REDEF,
TRUE,
FALSE,
NOT,
OR,
AND,
PLUS,
MINUS,
MULL,
DIV,
L_EQUAL,
I_EQUAL,
L_NOT_EQUAL,
I_NOT_EQUAL,
LOWER,
LOWER_EQUAL,
HIGHER,
HIGHER_EQUAL,
VARS,
NUMBER,
END
}

private val tokenDefs = listOf(
"if",
"while",
"(",
")",
"print",
"def",
"=",
"true",
"false",
"!",
"|",
"&",
"+",
"-",
"*",
"/",
"==",
"===",
"!=",
"!==",
"<",
"<=",
">",
">=",
null,
null
)

private val regexDefs = hashMapOf<Int,Regex>(Pair(24, "([a-z]|[A-Z])([a-z]|[A-Z]|[0-9]|_)*".toRegex()),
Pair(25, "((-)?[1-9][0-9]*)|0".toRegex())
)



    private var curChar: Int = -1

    private var curPos = 0

    lateinit var curTokenText: String
        private set

    lateinit var curToken: Token
        private set

    init {
        nextChar()
    }

    fun nextToken() {
        while (curChar != -1 && curChar.toChar().isWhitespace()) {
            nextChar()
        }

        if (curChar == -1) {
            curToken = Token.END
            return
        }

        val sb = StringBuilder()

        while (curChar != -1 && !curChar.toChar().isWhitespace()) {
            sb.append(curChar.toChar())
            nextChar()
        }

        var id = idToken(sb.toString())

        while (true) {
            if (curChar == -1 || id != -1) {
                break
            }

            while (curChar != -1 && curChar.toChar().isWhitespace()) {
                sb.append(curChar.toChar())
                nextChar()
            }

            while (curChar != -1 && !curChar.toChar().isWhitespace()) {
                sb.append(curChar.toChar())
                nextChar()
            }

            id = idToken(sb.toString())
        }

        curToken = when (id) {
            0 -> Token.IF
1 -> Token.WHILE
2 -> Token.LPAREN
3 -> Token.RPAREN
4 -> Token.PRINT
5 -> Token.DEFINE
6 -> Token.REDEF
7 -> Token.TRUE
8 -> Token.FALSE
9 -> Token.NOT
10 -> Token.OR
11 -> Token.AND
12 -> Token.PLUS
13 -> Token.MINUS
14 -> Token.MULL
15 -> Token.DIV
16 -> Token.L_EQUAL
17 -> Token.I_EQUAL
18 -> Token.L_NOT_EQUAL
19 -> Token.I_NOT_EQUAL
20 -> Token.LOWER
21 -> Token.LOWER_EQUAL
22 -> Token.HIGHER
23 -> Token.HIGHER_EQUAL
24 -> Token.VARS
25 -> Token.NUMBER

            else -> throw ParseException("Illegal character '${curChar.toChar()}'", curPos)
        }

        curTokenText = sb.toString()
    }

    fun idToken(s: String): Int {
        for (i in 0 until tokenDefs.size) {
            if (tokenDefs[i] != null) {
                if (tokenDefs[i] == s) {
                    return i
                }
            } else {
                for (p in regexDefs) {
                    if (p.value.matches(s)) {
                        return p.key
                    }
                }
            }
        }
        return -1
    }

    private fun nextChar() {
        try {
            curChar = input.read()
            curPos++
        } catch (e: IOException) {
            throw ParseException(e.message, curPos);
        }
    }
}
