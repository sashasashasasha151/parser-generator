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

class PrefixGrammarLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "PrefixGrammar.g4"

    override val atn: ATN
		get() = PrefixGrammarLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'if'", "'while'", 
		                                                   "'('", "')'", "'print'", 
		                                                   "'def'", "'='", null, 
		                                                   null, "'!'", "'|'", 
		                                                   "'&'", "'true'", "'false'", 
		                                                   "'+'", "'-'", "'*'", 
		                                                   "'/'", "'=='", "'!='", 
		                                                   "'<'", "'<='", "'>'", 
		                                                   "'>='")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "IF", "WHILE", 
		                                                    "LPAREN", "RPAREN", 
		                                                    "PRINT", "DEFINE", 
		                                                    "REDEF", "VARS", "NUMBER", 
		                                                    "NOT", "OR", "AND", 
		                                                    "TRUE", "FALSE", "PLUS", 
		                                                    "MINUS", "MULL", "DIV", 
		                                                    "EQUAL", "NOT_EQUAL", 
		                                                    "LOWER", "LOWER_EQUAL", 
		                                                    "HIGHER", "HIGHER_EQUAL", 
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
			27, 146, 8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 
			9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 
			4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 
			4, 17, 9, 17, 4, 18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 
			4, 22, 9, 22, 4, 23, 9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 
			3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 4, 3, 
			5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 7, 3, 7, 
			3, 8, 3, 8, 3, 9, 3, 9, 7, 9, 81, 10, 9, 12, 9, 14, 9, 84, 11, 9, 3, 
			10, 5, 10, 87, 10, 10, 3, 10, 3, 10, 7, 10, 91, 10, 10, 12, 10, 14, 10, 
			94, 11, 10, 3, 10, 5, 10, 97, 10, 10, 3, 11, 3, 11, 3, 12, 3, 12, 3, 
			13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15, 3, 15, 3, 
			15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 17, 3, 17, 3, 18, 3, 18, 3, 19, 3, 
			19, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 23, 3, 
			23, 3, 23, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 26, 6, 26, 141, 10, 
			26, 13, 26, 14, 26, 142, 3, 26, 3, 26, 2, 2, 27, 3, 3, 5, 4, 7, 5, 9, 
			6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13, 25, 14, 27, 15, 
			29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41, 22, 43, 23, 45, 24, 
			47, 25, 49, 26, 51, 27, 3, 2, 5, 4, 2, 67, 92, 99, 124, 6, 2, 50, 59, 
			67, 92, 97, 97, 99, 124, 4, 2, 11, 11, 34, 34, 2, 150, 2, 3, 3, 2, 2, 
			2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 
			2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 
			3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 
			2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 
			2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41, 
			3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2, 2, 2, 
			2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 3, 53, 3, 2, 2, 2, 5, 56, 3, 2, 
			2, 2, 7, 62, 3, 2, 2, 2, 9, 64, 3, 2, 2, 2, 11, 66, 3, 2, 2, 2, 13, 72, 
			3, 2, 2, 2, 15, 76, 3, 2, 2, 2, 17, 78, 3, 2, 2, 2, 19, 96, 3, 2, 2, 
			2, 21, 98, 3, 2, 2, 2, 23, 100, 3, 2, 2, 2, 25, 102, 3, 2, 2, 2, 27, 
			104, 3, 2, 2, 2, 29, 109, 3, 2, 2, 2, 31, 115, 3, 2, 2, 2, 33, 117, 3, 
			2, 2, 2, 35, 119, 3, 2, 2, 2, 37, 121, 3, 2, 2, 2, 39, 123, 3, 2, 2, 
			2, 41, 126, 3, 2, 2, 2, 43, 129, 3, 2, 2, 2, 45, 131, 3, 2, 2, 2, 47, 
			134, 3, 2, 2, 2, 49, 136, 3, 2, 2, 2, 51, 140, 3, 2, 2, 2, 53, 54, 7, 
			107, 2, 2, 54, 55, 7, 104, 2, 2, 55, 4, 3, 2, 2, 2, 56, 57, 7, 121, 2, 
			2, 57, 58, 7, 106, 2, 2, 58, 59, 7, 107, 2, 2, 59, 60, 7, 110, 2, 2, 
			60, 61, 7, 103, 2, 2, 61, 6, 3, 2, 2, 2, 62, 63, 7, 42, 2, 2, 63, 8, 
			3, 2, 2, 2, 64, 65, 7, 43, 2, 2, 65, 10, 3, 2, 2, 2, 66, 67, 7, 114, 
			2, 2, 67, 68, 7, 116, 2, 2, 68, 69, 7, 107, 2, 2, 69, 70, 7, 112, 2, 
			2, 70, 71, 7, 118, 2, 2, 71, 12, 3, 2, 2, 2, 72, 73, 7, 102, 2, 2, 73, 
			74, 7, 103, 2, 2, 74, 75, 7, 104, 2, 2, 75, 14, 3, 2, 2, 2, 76, 77, 7, 
			63, 2, 2, 77, 16, 3, 2, 2, 2, 78, 82, 9, 2, 2, 2, 79, 81, 9, 3, 2, 2, 
			80, 79, 3, 2, 2, 2, 81, 84, 3, 2, 2, 2, 82, 80, 3, 2, 2, 2, 82, 83, 3, 
			2, 2, 2, 83, 18, 3, 2, 2, 2, 84, 82, 3, 2, 2, 2, 85, 87, 7, 47, 2, 2, 
			86, 85, 3, 2, 2, 2, 86, 87, 3, 2, 2, 2, 87, 88, 3, 2, 2, 2, 88, 92, 4, 
			51, 59, 2, 89, 91, 4, 50, 59, 2, 90, 89, 3, 2, 2, 2, 91, 94, 3, 2, 2, 
			2, 92, 90, 3, 2, 2, 2, 92, 93, 3, 2, 2, 2, 93, 97, 3, 2, 2, 2, 94, 92, 
			3, 2, 2, 2, 95, 97, 7, 50, 2, 2, 96, 86, 3, 2, 2, 2, 96, 95, 3, 2, 2, 
			2, 97, 20, 3, 2, 2, 2, 98, 99, 7, 35, 2, 2, 99, 22, 3, 2, 2, 2, 100, 
			101, 7, 126, 2, 2, 101, 24, 3, 2, 2, 2, 102, 103, 7, 40, 2, 2, 103, 26, 
			3, 2, 2, 2, 104, 105, 7, 118, 2, 2, 105, 106, 7, 116, 2, 2, 106, 107, 
			7, 119, 2, 2, 107, 108, 7, 103, 2, 2, 108, 28, 3, 2, 2, 2, 109, 110, 
			7, 104, 2, 2, 110, 111, 7, 99, 2, 2, 111, 112, 7, 110, 2, 2, 112, 113, 
			7, 117, 2, 2, 113, 114, 7, 103, 2, 2, 114, 30, 3, 2, 2, 2, 115, 116, 
			7, 45, 2, 2, 116, 32, 3, 2, 2, 2, 117, 118, 7, 47, 2, 2, 118, 34, 3, 
			2, 2, 2, 119, 120, 7, 44, 2, 2, 120, 36, 3, 2, 2, 2, 121, 122, 7, 49, 
			2, 2, 122, 38, 3, 2, 2, 2, 123, 124, 7, 63, 2, 2, 124, 125, 7, 63, 2, 
			2, 125, 40, 3, 2, 2, 2, 126, 127, 7, 35, 2, 2, 127, 128, 7, 63, 2, 2, 
			128, 42, 3, 2, 2, 2, 129, 130, 7, 62, 2, 2, 130, 44, 3, 2, 2, 2, 131, 
			132, 7, 62, 2, 2, 132, 133, 7, 63, 2, 2, 133, 46, 3, 2, 2, 2, 134, 135, 
			7, 64, 2, 2, 135, 48, 3, 2, 2, 2, 136, 137, 7, 64, 2, 2, 137, 138, 7, 
			63, 2, 2, 138, 50, 3, 2, 2, 2, 139, 141, 9, 4, 2, 2, 140, 139, 3, 2, 
			2, 2, 141, 142, 3, 2, 2, 2, 142, 140, 3, 2, 2, 2, 142, 143, 3, 2, 2, 
			2, 143, 144, 3, 2, 2, 2, 144, 145, 8, 26, 2, 2, 145, 52, 3, 2, 2, 2, 
			8, 2, 82, 86, 92, 96, 142, 3, 8, 2, 2)
		val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    IF(1),
	    WHILE(2),
	    LPAREN(3),
	    RPAREN(4),
	    PRINT(5),
	    DEFINE(6),
	    REDEF(7),
	    VARS(8),
	    NUMBER(9),
	    NOT(10),
	    OR(11),
	    AND(12),
	    TRUE(13),
	    FALSE(14),
	    PLUS(15),
	    MINUS(16),
	    MULL(17),
	    DIV(18),
	    EQUAL(19),
	    NOT_EQUAL(20),
	    LOWER(21),
	    LOWER_EQUAL(22),
	    HIGHER(23),
	    HIGHER_EQUAL(24),
	    WS(25)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    IF,
	    WHILE,
	    LPAREN,
	    RPAREN,
	    PRINT,
	    DEFINE,
	    REDEF,
	    VARS,
	    NUMBER,
	    NOT,
	    OR,
	    AND,
	    TRUE,
	    FALSE,
	    PLUS,
	    MINUS,
	    MULL,
	    DIV,
	    EQUAL,
	    NOT_EQUAL,
	    LOWER,
	    LOWER_EQUAL,
	    HIGHER,
	    HIGHER_EQUAL,
	    WS
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}