
package test_grammars.generated

import java.io.IOException
import java.io.InputStream
import java.lang.StringBuilder
import java.text.ParseException

class LeftRecursionLexer(private val input: InputStream) {
    enum class Token {
DEF,
END
}

private val tokenDefs = listOf(
"def"
)

private val regexDefs = hashMapOf<Int,Regex>(
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
            0 -> Token.DEF

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
