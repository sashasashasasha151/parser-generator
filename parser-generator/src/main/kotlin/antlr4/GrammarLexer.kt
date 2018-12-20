// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class GrammarLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "Grammar.g4"

    override val atn: ATN
		get() = GrammarLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "':'", "';'", 
		                                                   "'['", "']'", "','", 
		                                                   "'|'", "'~'", "'returns'", 
		                                                   "'grammar'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "COLON", "SEMICOLON", 
		                                                    "SQUARE_P_L", "SQUARE_P_R", 
		                                                    "COMMA", "DELIM", 
		                                                    "NO_RULE", "RETURNS", 
		                                                    "GRAMMAR", "RULE_NAME", 
		                                                    "TOKEN_NAME", "TYPE_OR_NAME", 
		                                                    "CODE", "TOKEN_DEF", 
		                                                    "REGEX", "EX_ATTR", 
		                                                    "WS")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private val serializedIntegersATN =
			arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 
			19, 131, 8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 
			9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 
			4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 
			4, 17, 9, 17, 4, 18, 9, 18, 3, 2, 3, 2, 3, 3, 3, 3, 3, 4, 3, 4, 3, 5, 
			3, 5, 3, 6, 3, 6, 3, 7, 3, 7, 3, 8, 3, 8, 3, 9, 3, 9, 3, 9, 3, 9, 3, 
			9, 3, 9, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 
			3, 10, 3, 11, 3, 11, 7, 11, 70, 10, 11, 12, 11, 14, 11, 73, 11, 11, 3, 
			12, 3, 12, 7, 12, 77, 10, 12, 12, 12, 14, 12, 80, 11, 12, 3, 13, 3, 13, 
			7, 13, 84, 10, 13, 12, 13, 14, 13, 87, 11, 13, 3, 14, 3, 14, 7, 14, 91, 
			10, 14, 12, 14, 14, 14, 94, 11, 14, 3, 14, 3, 14, 3, 15, 3, 15, 7, 15, 
			100, 10, 15, 12, 15, 14, 15, 103, 11, 15, 3, 15, 3, 15, 3, 16, 3, 16, 
			7, 16, 109, 10, 16, 12, 16, 14, 16, 112, 11, 16, 3, 16, 3, 16, 3, 17, 
			3, 17, 7, 17, 118, 10, 17, 12, 17, 14, 17, 121, 11, 17, 3, 17, 3, 17, 
			3, 18, 6, 18, 126, 10, 18, 13, 18, 14, 18, 127, 3, 18, 3, 18, 3, 119, 
			2, 19, 3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 
			12, 23, 13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19, 3, 2, 8, 
			5, 2, 50, 59, 97, 97, 99, 124, 5, 2, 50, 59, 67, 92, 97, 97, 4, 2, 67, 
			92, 99, 124, 6, 2, 50, 59, 67, 92, 97, 97, 99, 124, 4, 2, 12, 12, 15, 
			15, 5, 2, 11, 12, 15, 15, 34, 34, 2, 138, 2, 3, 3, 2, 2, 2, 2, 5, 3, 
			2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2, 2, 2, 13, 
			3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2, 2, 2, 
			2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3, 2, 
			2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 2, 2, 35, 
			3, 2, 2, 2, 3, 37, 3, 2, 2, 2, 5, 39, 3, 2, 2, 2, 7, 41, 3, 2, 2, 2, 
			9, 43, 3, 2, 2, 2, 11, 45, 3, 2, 2, 2, 13, 47, 3, 2, 2, 2, 15, 49, 3, 
			2, 2, 2, 17, 51, 3, 2, 2, 2, 19, 59, 3, 2, 2, 2, 21, 67, 3, 2, 2, 2, 
			23, 74, 3, 2, 2, 2, 25, 81, 3, 2, 2, 2, 27, 88, 3, 2, 2, 2, 29, 97, 3, 
			2, 2, 2, 31, 106, 3, 2, 2, 2, 33, 115, 3, 2, 2, 2, 35, 125, 3, 2, 2, 
			2, 37, 38, 7, 60, 2, 2, 38, 4, 3, 2, 2, 2, 39, 40, 7, 61, 2, 2, 40, 6, 
			3, 2, 2, 2, 41, 42, 7, 93, 2, 2, 42, 8, 3, 2, 2, 2, 43, 44, 7, 95, 2, 
			2, 44, 10, 3, 2, 2, 2, 45, 46, 7, 46, 2, 2, 46, 12, 3, 2, 2, 2, 47, 48, 
			7, 126, 2, 2, 48, 14, 3, 2, 2, 2, 49, 50, 7, 128, 2, 2, 50, 16, 3, 2, 
			2, 2, 51, 52, 7, 116, 2, 2, 52, 53, 7, 103, 2, 2, 53, 54, 7, 118, 2, 
			2, 54, 55, 7, 119, 2, 2, 55, 56, 7, 116, 2, 2, 56, 57, 7, 112, 2, 2, 
			57, 58, 7, 117, 2, 2, 58, 18, 3, 2, 2, 2, 59, 60, 7, 105, 2, 2, 60, 61, 
			7, 116, 2, 2, 61, 62, 7, 99, 2, 2, 62, 63, 7, 111, 2, 2, 63, 64, 7, 111, 
			2, 2, 64, 65, 7, 99, 2, 2, 65, 66, 7, 116, 2, 2, 66, 20, 3, 2, 2, 2, 
			67, 71, 4, 99, 124, 2, 68, 70, 9, 2, 2, 2, 69, 68, 3, 2, 2, 2, 70, 73, 
			3, 2, 2, 2, 71, 69, 3, 2, 2, 2, 71, 72, 3, 2, 2, 2, 72, 22, 3, 2, 2, 
			2, 73, 71, 3, 2, 2, 2, 74, 78, 4, 67, 92, 2, 75, 77, 9, 3, 2, 2, 76, 
			75, 3, 2, 2, 2, 77, 80, 3, 2, 2, 2, 78, 76, 3, 2, 2, 2, 78, 79, 3, 2, 
			2, 2, 79, 24, 3, 2, 2, 2, 80, 78, 3, 2, 2, 2, 81, 85, 9, 4, 2, 2, 82, 
			84, 9, 5, 2, 2, 83, 82, 3, 2, 2, 2, 84, 87, 3, 2, 2, 2, 85, 83, 3, 2, 
			2, 2, 85, 86, 3, 2, 2, 2, 86, 26, 3, 2, 2, 2, 87, 85, 3, 2, 2, 2, 88, 
			92, 7, 125, 2, 2, 89, 91, 10, 6, 2, 2, 90, 89, 3, 2, 2, 2, 91, 94, 3, 
			2, 2, 2, 92, 90, 3, 2, 2, 2, 92, 93, 3, 2, 2, 2, 93, 95, 3, 2, 2, 2, 
			94, 92, 3, 2, 2, 2, 95, 96, 7, 127, 2, 2, 96, 28, 3, 2, 2, 2, 97, 101, 
			7, 41, 2, 2, 98, 100, 10, 6, 2, 2, 99, 98, 3, 2, 2, 2, 100, 103, 3, 2, 
			2, 2, 101, 99, 3, 2, 2, 2, 101, 102, 3, 2, 2, 2, 102, 104, 3, 2, 2, 2, 
			103, 101, 3, 2, 2, 2, 104, 105, 7, 41, 2, 2, 105, 30, 3, 2, 2, 2, 106, 
			110, 7, 98, 2, 2, 107, 109, 10, 6, 2, 2, 108, 107, 3, 2, 2, 2, 109, 112, 
			3, 2, 2, 2, 110, 108, 3, 2, 2, 2, 110, 111, 3, 2, 2, 2, 111, 113, 3, 
			2, 2, 2, 112, 110, 3, 2, 2, 2, 113, 114, 7, 98, 2, 2, 114, 32, 3, 2, 
			2, 2, 115, 119, 7, 42, 2, 2, 116, 118, 10, 6, 2, 2, 117, 116, 3, 2, 2, 
			2, 118, 121, 3, 2, 2, 2, 119, 120, 3, 2, 2, 2, 119, 117, 3, 2, 2, 2, 
			120, 122, 3, 2, 2, 2, 121, 119, 3, 2, 2, 2, 122, 123, 7, 43, 2, 2, 123, 
			34, 3, 2, 2, 2, 124, 126, 9, 7, 2, 2, 125, 124, 3, 2, 2, 2, 126, 127, 
			3, 2, 2, 2, 127, 125, 3, 2, 2, 2, 127, 128, 3, 2, 2, 2, 128, 129, 3, 
			2, 2, 2, 129, 130, 8, 18, 2, 2, 130, 36, 3, 2, 2, 2, 11, 2, 71, 78, 85, 
			92, 101, 110, 119, 127, 3, 8, 2, 2)
		val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    COLON(1),
	    SEMICOLON(2),
	    SQUARE_P_L(3),
	    SQUARE_P_R(4),
	    COMMA(5),
	    DELIM(6),
	    NO_RULE(7),
	    RETURNS(8),
	    GRAMMAR(9),
	    RULE_NAME(10),
	    TOKEN_NAME(11),
	    TYPE_OR_NAME(12),
	    CODE(13),
	    TOKEN_DEF(14),
	    REGEX(15),
	    EX_ATTR(16),
	    WS(17)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    COLON,
	    SEMICOLON,
	    SQUARE_P_L,
	    SQUARE_P_R,
	    COMMA,
	    DELIM,
	    NO_RULE,
	    RETURNS,
	    GRAMMAR,
	    RULE_NAME,
	    TOKEN_NAME,
	    TYPE_OR_NAME,
	    CODE,
	    TOKEN_DEF,
	    REGEX,
	    EX_ATTR,
	    WS
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}