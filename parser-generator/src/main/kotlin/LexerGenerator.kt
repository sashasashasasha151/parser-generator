import GrammarParser.*
import java.io.File
import java.lang.StringBuilder

class LexerGenerator(val grammarName: String, val ttokenssContext: TtokenssContext?, val toFolderPath: String) {
    val tokenNames = mutableListOf<String>()
    val tokenValue = mutableListOf<String?>()

    fun generate() {
        if (ttokenssContext == null) {
            return
        }

        getTokensFromTree()

        val lexerString = buildLexer()


        val fileName = "${toFolderPath}${grammarName}Lexer.kt"
        val file = File(fileName)
        file.writeText(lexerString)
    }

    private fun getTokensFromTree() {
        for (token in ttokenssContext!!.findToken()) {
            tokenNames.add(token.TOKEN_NAME()!!.text)

            tokenValue.add(token.findToken_expression()!!.text)
        }
    }

    private fun buildLexer(): String {
        val TokensAndRegexs = buildTokensAndRegexs()
        val TokensInWhen = buildTokensInWhen()
        return """
import java.io.IOException
import java.io.InputStream
import java.lang.StringBuilder
import java.text.ParseException

class ${grammarName}Lexer(private val input: InputStream) {
    $TokensAndRegexs

    private var curChar: Int = -1

    private var curPos = 0

    lateinit var curToken: Token
        private set

    init {
        nextChar()
    }

    fun nextToken() {
        if (curChar == -1) {
            curToken = Token.END
            return
        }

        while (curChar.toChar().isWhitespace()) {
            nextChar()
        }

        val sb = StringBuilder(curChar.toChar().toString())

        var id = idToken(sb.toString())
        while (true) {
            if (curChar == -1 || id != -1) {
                break
            }
            sb.append(nextChar())
            id = idToken(sb.toString())
        }

        curToken = when (id) {
            $TokensInWhen
            else -> throw ParseException("Illegal character '${'$'}{curChar.toChar()}'", curPos)
        }

        nextChar()
    }

    fun idToken(s: String): Int {
        for (i in 0 until tokenDefs.size) {
            if (tokenDefs[i] != null) {
                if (tokenDefs[i] == s) {
                    return i
                }
            } else {
                for (p in regexDefs) {
                    if (p.value.toRegex().matches(s)) {
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
"""
    }

    private fun buildTokensAndRegexs(): String {
        val sb = StringBuilder()

        sb.append("enum class Token {\n")
        for (i in 0 until tokenNames.size) {
            sb.append("${tokenNames[i]},\n")
        }
        sb.append("END\n}\n\n")

        sb.append("private val tokenDefs = listOf(\n")
        if (tokenValue[0]!![0] == '`') {
            sb.append("null")
        } else {
            sb.append("\"${tokenValue[0]!!.substring(1, tokenValue[0]!!.length - 1)}\"")
        }
        for (i in 1 until tokenValue.size) {
            if (tokenValue[i]!![0] != '`') {
                sb.append(",\n\"${tokenValue[i]!!.substring(1, tokenValue[i]!!.length - 1)}\"")
            } else {
                sb.append(",\nnull")
            }
        }
        sb.append("\n)\n\n")

        sb.append("private val regexDefs = hashMapOf(")
        var isFirst = true
        for (i in 0 until tokenValue.size) {
            if (tokenValue[i]!![0] == '`') {
                if (isFirst) {
                    sb.append("Pair($i, \"${tokenValue[i]!!.substring(1, tokenValue[i]!!.length - 1)}\")")
                    isFirst = false
                } else {
                    sb.append(",\nPair($i, \"${tokenValue[i]!!.substring(1, tokenValue[i]!!.length - 1)}\")")
                }
            }
        }
        sb.append("\n)\n\n")
        return sb.toString()
    }

    private fun buildTokensInWhen(): String {
        val sb = StringBuilder()
        for (i in 0 until tokenNames.size) {
            sb.append("$i -> Token.${tokenNames[i]}\n")
        }
        return sb.toString()
    }
}