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

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'if'", "'('", 
		                                                   "')'", "'print'", "'def'", 
		                                                   "'='", null, null, 
		                                                   "'not'", "'or'", "'and'", 
		                                                   "'xor'", "'true'", 
		                                                   "'false'", "'+'", "'-'", 
		                                                   "'*'", "'/'", "'=='", 
		                                                   "'!='", "'<'", "'<='", 
		                                                   "'>'", "'>='")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "IF", "LPAREN", 
		                                                    "RPAREN", "PRINT", 
		                                                    "DEFINE", "REDEF", 
		                                                    "VARS", "NUMBER", 
		                                                    "NOT", "OR", "AND", 
		                                                    "XOR", "TRUE", "FALSE", 
		                                                    "PLUS", "MINUS", "MULL", 
		                                                    "DIV", "EQUAL", "NOT_EQUAL", 
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
			27, 149, 8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 
			9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 
			4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 
			4, 17, 9, 17, 4, 18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 
			4, 22, 9, 22, 4, 23, 9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 
			3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 
			5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 7, 3, 7, 3, 8, 3, 8, 7, 8, 75, 10, 
			8, 12, 8, 14, 8, 78, 11, 8, 3, 9, 5, 9, 81, 10, 9, 3, 9, 3, 9, 7, 9, 
			85, 10, 9, 12, 9, 14, 9, 88, 11, 9, 3, 9, 5, 9, 91, 10, 9, 3, 10, 3, 
			10, 3, 10, 3, 10, 3, 11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 
			13, 3, 13, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 
			15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 17, 3, 17, 3, 18, 3, 
			18, 3, 19, 3, 19, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 22, 3, 
			22, 3, 23, 3, 23, 3, 23, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 26, 6, 
			26, 144, 10, 26, 13, 26, 14, 26, 145, 3, 26, 3, 26, 2, 2, 27, 3, 3, 5, 
			4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10, 19, 11, 21, 12, 23, 13, 25, 
			14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19, 37, 20, 39, 21, 41, 22, 43, 
			23, 45, 24, 47, 25, 49, 26, 51, 27, 3, 2, 5, 4, 2, 67, 92, 99, 124, 6, 
			2, 50, 59, 67, 92, 97, 97, 99, 124, 4, 2, 11, 11, 34, 34, 2, 153, 2, 
			3, 3, 2, 2, 2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 
			2, 11, 3, 2, 2, 2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 
			2, 2, 2, 19, 3, 2, 2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 
			3, 2, 2, 2, 2, 27, 3, 2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 
			2, 33, 3, 2, 2, 2, 2, 35, 3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 
			2, 2, 2, 41, 3, 2, 2, 2, 2, 43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 
			3, 2, 2, 2, 2, 49, 3, 2, 2, 2, 2, 51, 3, 2, 2, 2, 3, 53, 3, 2, 2, 2, 
			5, 56, 3, 2, 2, 2, 7, 58, 3, 2, 2, 2, 9, 60, 3, 2, 2, 2, 11, 66, 3, 2, 
			2, 2, 13, 70, 3, 2, 2, 2, 15, 72, 3, 2, 2, 2, 17, 90, 3, 2, 2, 2, 19, 
			92, 3, 2, 2, 2, 21, 96, 3, 2, 2, 2, 23, 99, 3, 2, 2, 2, 25, 103, 3, 2, 
			2, 2, 27, 107, 3, 2, 2, 2, 29, 112, 3, 2, 2, 2, 31, 118, 3, 2, 2, 2, 
			33, 120, 3, 2, 2, 2, 35, 122, 3, 2, 2, 2, 37, 124, 3, 2, 2, 2, 39, 126, 
			3, 2, 2, 2, 41, 129, 3, 2, 2, 2, 43, 132, 3, 2, 2, 2, 45, 134, 3, 2, 
			2, 2, 47, 137, 3, 2, 2, 2, 49, 139, 3, 2, 2, 2, 51, 143, 3, 2, 2, 2, 
			53, 54, 7, 107, 2, 2, 54, 55, 7, 104, 2, 2, 55, 4, 3, 2, 2, 2, 56, 57, 
			7, 42, 2, 2, 57, 6, 3, 2, 2, 2, 58, 59, 7, 43, 2, 2, 59, 8, 3, 2, 2, 
			2, 60, 61, 7, 114, 2, 2, 61, 62, 7, 116, 2, 2, 62, 63, 7, 107, 2, 2, 
			63, 64, 7, 112, 2, 2, 64, 65, 7, 118, 2, 2, 65, 10, 3, 2, 2, 2, 66, 67, 
			7, 102, 2, 2, 67, 68, 7, 103, 2, 2, 68, 69, 7, 104, 2, 2, 69, 12, 3, 
			2, 2, 2, 70, 71, 7, 63, 2, 2, 71, 14, 3, 2, 2, 2, 72, 76, 9, 2, 2, 2, 
			73, 75, 9, 3, 2, 2, 74, 73, 3, 2, 2, 2, 75, 78, 3, 2, 2, 2, 76, 74, 3, 
			2, 2, 2, 76, 77, 3, 2, 2, 2, 77, 16, 3, 2, 2, 2, 78, 76, 3, 2, 2, 2, 
			79, 81, 7, 47, 2, 2, 80, 79, 3, 2, 2, 2, 80, 81, 3, 2, 2, 2, 81, 82, 
			3, 2, 2, 2, 82, 86, 4, 51, 59, 2, 83, 85, 4, 50, 59, 2, 84, 83, 3, 2, 
			2, 2, 85, 88, 3, 2, 2, 2, 86, 84, 3, 2, 2, 2, 86, 87, 3, 2, 2, 2, 87, 
			91, 3, 2, 2, 2, 88, 86, 3, 2, 2, 2, 89, 91, 7, 50, 2, 2, 90, 80, 3, 2, 
			2, 2, 90, 89, 3, 2, 2, 2, 91, 18, 3, 2, 2, 2, 92, 93, 7, 112, 2, 2, 93, 
			94, 7, 113, 2, 2, 94, 95, 7, 118, 2, 2, 95, 20, 3, 2, 2, 2, 96, 97, 7, 
			113, 2, 2, 97, 98, 7, 116, 2, 2, 98, 22, 3, 2, 2, 2, 99, 100, 7, 99, 
			2, 2, 100, 101, 7, 112, 2, 2, 101, 102, 7, 102, 2, 2, 102, 24, 3, 2, 
			2, 2, 103, 104, 7, 122, 2, 2, 104, 105, 7, 113, 2, 2, 105, 106, 7, 116, 
			2, 2, 106, 26, 3, 2, 2, 2, 107, 108, 7, 118, 2, 2, 108, 109, 7, 116, 
			2, 2, 109, 110, 7, 119, 2, 2, 110, 111, 7, 103, 2, 2, 111, 28, 3, 2, 
			2, 2, 112, 113, 7, 104, 2, 2, 113, 114, 7, 99, 2, 2, 114, 115, 7, 110, 
			2, 2, 115, 116, 7, 117, 2, 2, 116, 117, 7, 103, 2, 2, 117, 30, 3, 2, 
			2, 2, 118, 119, 7, 45, 2, 2, 119, 32, 3, 2, 2, 2, 120, 121, 7, 47, 2, 
			2, 121, 34, 3, 2, 2, 2, 122, 123, 7, 44, 2, 2, 123, 36, 3, 2, 2, 2, 124, 
			125, 7, 49, 2, 2, 125, 38, 3, 2, 2, 2, 126, 127, 7, 63, 2, 2, 127, 128, 
			7, 63, 2, 2, 128, 40, 3, 2, 2, 2, 129, 130, 7, 35, 2, 2, 130, 131, 7, 
			63, 2, 2, 131, 42, 3, 2, 2, 2, 132, 133, 7, 62, 2, 2, 133, 44, 3, 2, 
			2, 2, 134, 135, 7, 62, 2, 2, 135, 136, 7, 63, 2, 2, 136, 46, 3, 2, 2, 
			2, 137, 138, 7, 64, 2, 2, 138, 48, 3, 2, 2, 2, 139, 140, 7, 64, 2, 2, 
			140, 141, 7, 63, 2, 2, 141, 50, 3, 2, 2, 2, 142, 144, 9, 4, 2, 2, 143, 
			142, 3, 2, 2, 2, 144, 145, 3, 2, 2, 2, 145, 143, 3, 2, 2, 2, 145, 146, 
			3, 2, 2, 2, 146, 147, 3, 2, 2, 2, 147, 148, 8, 26, 2, 2, 148, 52, 3, 
			2, 2, 2, 8, 2, 76, 80, 86, 90, 145, 3, 8, 2, 2)
		val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    IF(1),
	    LPAREN(2),
	    RPAREN(3),
	    PRINT(4),
	    DEFINE(5),
	    REDEF(6),
	    VARS(7),
	    NUMBER(8),
	    NOT(9),
	    OR(10),
	    AND(11),
	    XOR(12),
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
	    XOR,
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