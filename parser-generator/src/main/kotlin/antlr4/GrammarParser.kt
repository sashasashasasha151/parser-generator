// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.properties.Delegates
import kotlin.reflect.KClass

object solver : TypeDeclarator {
	override val classesByName : List<KClass<*>> = listOf(GrammarParser.StartContext::class,
                                                       GrammarParser.WordsContext::class,
                                                       GrammarParser.RrulessContext::class,
                                                       GrammarParser.One_ruleContext::class,
                                                       GrammarParser.Rule_definitionContext::class,
                                                       GrammarParser.DefinitionContext::class,
                                                       GrammarParser.Input_attrsContext::class,
                                                       GrammarParser.Return_expressionContext::class,
                                                       GrammarParser.AttrContext::class,
                                                       GrammarParser.Rule_bodyContext::class,
                                                       GrammarParser.Rule_expressionContext::class,
                                                       GrammarParser.Expression_nameContext::class,
                                                       GrammarParser.Expression_attrsContext::class,
                                                       GrammarParser.Expression_codeContext::class,
                                                       GrammarParser.TtokenssContext::class,
                                                       GrammarParser.TokenContext::class,
                                                       GrammarParser.Token_expressionContext::class)
}

class GrammarParser(input: TokenStream) : Parser(input) {
	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Grammar.g4"

    override val tokenNames: Array<String?>?
        get() = GrammarParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = GrammarParser.Companion.ruleNames
    override val atn: ATN
        get() = GrammarParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
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

    enum class Rules(val id: Int) {
        RULE_start(0),
        RULE_words(1),
        RULE_rruless(2),
        RULE_one_rule(3),
        RULE_rule_definition(4),
        RULE_definition(5),
        RULE_input_attrs(6),
        RULE_return_expression(7),
        RULE_attr(8),
        RULE_rule_body(9),
        RULE_rule_expression(10),
        RULE_expression_name(11),
        RULE_expression_attrs(12),
        RULE_expression_code(13),
        RULE_ttokenss(14),
        RULE_token(15),
        RULE_token_expression(16)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("start", "words", "rruless", "one_rule", 
                                "rule_definition", "definition", "input_attrs", 
                                "return_expression", "attr", "rule_body", 
                                "rule_expression", "expression_name", "expression_attrs", 
                                "expression_code", "ttokenss", "token", 
                                "token_expression")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "':'", 
                                                           "';'", "'['", 
                                                           "']'", "','", 
                                                           "'|'", "'~'", 
                                                           "'returns'", 
                                                           "'grammar'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "COLON", 
                                                            "SEMICOLON", 
                                                            "SQUARE_P_L", 
                                                            "SQUARE_P_R", 
                                                            "COMMA", "DELIM", 
                                                            "NO_RULE", "RETURNS", 
                                                            "GRAMMAR", "RULE_NAME", 
                                                            "TOKEN_NAME", 
                                                            "TYPE_OR_NAME", 
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
        	arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 
        	3, 19, 132, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 
        	6, 9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 
        	9, 11, 4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 
        	4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9, 18, 3, 2, 3, 2, 3, 2, 3, 
        	2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 4, 3, 4, 7, 4, 47, 10, 4, 12, 4, 
        	14, 4, 50, 11, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 
        	6, 3, 7, 3, 7, 3, 7, 3, 7, 5, 7, 64, 10, 7, 3, 8, 3, 8, 3, 8, 3, 
        	8, 7, 8, 70, 10, 8, 12, 8, 14, 8, 73, 11, 8, 3, 8, 3, 8, 3, 9, 
        	3, 9, 3, 9, 5, 9, 80, 10, 9, 3, 10, 3, 10, 3, 10, 3, 11, 3, 11, 
        	3, 11, 7, 11, 88, 10, 11, 12, 11, 14, 11, 91, 11, 11, 3, 12, 3, 
        	12, 7, 12, 95, 10, 12, 12, 12, 14, 12, 98, 11, 12, 3, 13, 3, 13, 
        	3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13, 108, 10, 13, 3, 
        	14, 3, 14, 5, 14, 112, 10, 14, 3, 15, 3, 15, 5, 15, 116, 10, 15, 
        	3, 16, 3, 16, 7, 16, 120, 10, 16, 12, 16, 14, 16, 123, 11, 16, 
        	3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 2, 2, 19, 
        	2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 
        	2, 4, 3, 2, 12, 14, 3, 2, 16, 17, 2, 125, 2, 36, 3, 2, 2, 2, 4, 
        	42, 3, 2, 2, 2, 6, 44, 3, 2, 2, 2, 8, 51, 3, 2, 2, 2, 10, 56, 3, 
        	2, 2, 2, 12, 63, 3, 2, 2, 2, 14, 65, 3, 2, 2, 2, 16, 79, 3, 2, 
        	2, 2, 18, 81, 3, 2, 2, 2, 20, 84, 3, 2, 2, 2, 22, 92, 3, 2, 2, 
        	2, 24, 107, 3, 2, 2, 2, 26, 111, 3, 2, 2, 2, 28, 115, 3, 2, 2, 
        	2, 30, 117, 3, 2, 2, 2, 32, 124, 3, 2, 2, 2, 34, 129, 3, 2, 2, 
        	2, 36, 37, 7, 11, 2, 2, 37, 38, 5, 4, 3, 2, 38, 39, 7, 4, 2, 2, 
        	39, 40, 5, 6, 4, 2, 40, 41, 5, 30, 16, 2, 41, 3, 3, 2, 2, 2, 42, 
        	43, 9, 2, 2, 2, 43, 5, 3, 2, 2, 2, 44, 48, 5, 8, 5, 2, 45, 47, 
        	5, 8, 5, 2, 46, 45, 3, 2, 2, 2, 47, 50, 3, 2, 2, 2, 48, 46, 3, 
        	2, 2, 2, 48, 49, 3, 2, 2, 2, 49, 7, 3, 2, 2, 2, 50, 48, 3, 2, 2, 
        	2, 51, 52, 5, 10, 6, 2, 52, 53, 7, 3, 2, 2, 53, 54, 5, 20, 11, 
        	2, 54, 55, 7, 4, 2, 2, 55, 9, 3, 2, 2, 2, 56, 57, 7, 12, 2, 2, 
        	57, 58, 5, 12, 7, 2, 58, 11, 3, 2, 2, 2, 59, 60, 5, 14, 8, 2, 60, 
        	61, 5, 16, 9, 2, 61, 64, 3, 2, 2, 2, 62, 64, 5, 16, 9, 2, 63, 59, 
        	3, 2, 2, 2, 63, 62, 3, 2, 2, 2, 64, 13, 3, 2, 2, 2, 65, 66, 7, 
        	5, 2, 2, 66, 71, 5, 18, 10, 2, 67, 68, 7, 7, 2, 2, 68, 70, 5, 18, 
        	10, 2, 69, 67, 3, 2, 2, 2, 70, 73, 3, 2, 2, 2, 71, 69, 3, 2, 2, 
        	2, 71, 72, 3, 2, 2, 2, 72, 74, 3, 2, 2, 2, 73, 71, 3, 2, 2, 2, 
        	74, 75, 7, 6, 2, 2, 75, 15, 3, 2, 2, 2, 76, 77, 7, 10, 2, 2, 77, 
        	80, 5, 14, 8, 2, 78, 80, 3, 2, 2, 2, 79, 76, 3, 2, 2, 2, 79, 78, 
        	3, 2, 2, 2, 80, 17, 3, 2, 2, 2, 81, 82, 5, 4, 3, 2, 82, 83, 5, 
        	4, 3, 2, 83, 19, 3, 2, 2, 2, 84, 89, 5, 22, 12, 2, 85, 86, 7, 8, 
        	2, 2, 86, 88, 5, 22, 12, 2, 87, 85, 3, 2, 2, 2, 88, 91, 3, 2, 2, 
        	2, 89, 87, 3, 2, 2, 2, 89, 90, 3, 2, 2, 2, 90, 21, 3, 2, 2, 2, 
        	91, 89, 3, 2, 2, 2, 92, 96, 5, 24, 13, 2, 93, 95, 5, 24, 13, 2, 
        	94, 93, 3, 2, 2, 2, 95, 98, 3, 2, 2, 2, 96, 94, 3, 2, 2, 2, 96, 
        	97, 3, 2, 2, 2, 97, 23, 3, 2, 2, 2, 98, 96, 3, 2, 2, 2, 99, 100, 
        	7, 12, 2, 2, 100, 101, 5, 26, 14, 2, 101, 102, 5, 28, 15, 2, 102, 
        	108, 3, 2, 2, 2, 103, 104, 7, 13, 2, 2, 104, 108, 5, 28, 15, 2, 
        	105, 106, 7, 9, 2, 2, 106, 108, 5, 28, 15, 2, 107, 99, 3, 2, 2, 
        	2, 107, 103, 3, 2, 2, 2, 107, 105, 3, 2, 2, 2, 108, 25, 3, 2, 2, 
        	2, 109, 112, 7, 18, 2, 2, 110, 112, 3, 2, 2, 2, 111, 109, 3, 2, 
        	2, 2, 111, 110, 3, 2, 2, 2, 112, 27, 3, 2, 2, 2, 113, 116, 7, 15, 
        	2, 2, 114, 116, 3, 2, 2, 2, 115, 113, 3, 2, 2, 2, 115, 114, 3, 
        	2, 2, 2, 116, 29, 3, 2, 2, 2, 117, 121, 5, 32, 17, 2, 118, 120, 
        	5, 32, 17, 2, 119, 118, 3, 2, 2, 2, 120, 123, 3, 2, 2, 2, 121, 
        	119, 3, 2, 2, 2, 121, 122, 3, 2, 2, 2, 122, 31, 3, 2, 2, 2, 123, 
        	121, 3, 2, 2, 2, 124, 125, 7, 13, 2, 2, 125, 126, 7, 3, 2, 2, 126, 
        	127, 5, 34, 18, 2, 127, 128, 7, 4, 2, 2, 128, 33, 3, 2, 2, 2, 129, 
        	130, 9, 3, 2, 2, 130, 35, 3, 2, 2, 2, 12, 48, 63, 71, 79, 89, 96, 
        	107, 111, 115, 121)
        val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val COLON = Tokens.COLON.id
    private val SEMICOLON = Tokens.SEMICOLON.id
    private val SQUARE_P_L = Tokens.SQUARE_P_L.id
    private val SQUARE_P_R = Tokens.SQUARE_P_R.id
    private val COMMA = Tokens.COMMA.id
    private val DELIM = Tokens.DELIM.id
    private val NO_RULE = Tokens.NO_RULE.id
    private val RETURNS = Tokens.RETURNS.id
    private val GRAMMAR = Tokens.GRAMMAR.id
    private val RULE_NAME = Tokens.RULE_NAME.id
    private val TOKEN_NAME = Tokens.TOKEN_NAME.id
    private val TYPE_OR_NAME = Tokens.TYPE_OR_NAME.id
    private val CODE = Tokens.CODE.id
    private val TOKEN_DEF = Tokens.TOKEN_DEF.id
    private val REGEX = Tokens.REGEX.id
    private val EX_ATTR = Tokens.EX_ATTR.id
    private val WS = Tokens.WS.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class StartContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_start.id
	        set(value) { throw RuntimeException() }
		fun GRAMMAR() : TerminalNode? = getToken(GrammarParser.Tokens.GRAMMAR.id, 0)
		fun findWords() : WordsContext? = getRuleContext(solver.getType("WordsContext"),0)
		fun SEMICOLON() : TerminalNode? = getToken(GrammarParser.Tokens.SEMICOLON.id, 0)
		fun findRruless() : RrulessContext? = getRuleContext(solver.getType("RrulessContext"),0)
		fun findTtokenss() : TtokenssContext? = getRuleContext(solver.getType("TtokenssContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  start() : StartContext {
		var _localctx : StartContext = StartContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_start.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			match(GRAMMAR) as Token
			this.state = 35
			words()
			this.state = 36
			match(SEMICOLON) as Token
			this.state = 37
			rruless()
			this.state = 38
			ttokenss()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class WordsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_words.id
	        set(value) { throw RuntimeException() }
		fun TYPE_OR_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.TYPE_OR_NAME.id, 0)
		fun RULE_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.RULE_NAME.id, 0)
		fun TOKEN_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.TOKEN_NAME.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  words() : WordsContext {
		var _localctx : WordsContext = WordsContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_words.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 40
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl RULE_NAME) or (1L shl TOKEN_NAME) or (1L shl TYPE_OR_NAME))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RrulessContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rruless.id
	        set(value) { throw RuntimeException() }
		fun findOne_rule() : List<One_ruleContext> = getRuleContexts(solver.getType("One_ruleContext"))
		fun findOne_rule(i: Int) : One_ruleContext? = getRuleContext(solver.getType("One_ruleContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  rruless() : RrulessContext {
		var _localctx : RrulessContext = RrulessContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_rruless.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 42
			one_rule()
			this.state = 46
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==RULE_NAME) {
				if (true){
				if (true){
				this.state = 43
				one_rule()
				}
				}
				this.state = 48
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class One_ruleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_one_rule.id
	        set(value) { throw RuntimeException() }
		fun findRule_definition() : Rule_definitionContext? = getRuleContext(solver.getType("Rule_definitionContext"),0)
		fun COLON() : TerminalNode? = getToken(GrammarParser.Tokens.COLON.id, 0)
		fun findRule_body() : Rule_bodyContext? = getRuleContext(solver.getType("Rule_bodyContext"),0)
		fun SEMICOLON() : TerminalNode? = getToken(GrammarParser.Tokens.SEMICOLON.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  one_rule() : One_ruleContext {
		var _localctx : One_ruleContext = One_ruleContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_one_rule.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 49
			rule_definition()
			this.state = 50
			match(COLON) as Token
			this.state = 51
			rule_body()
			this.state = 52
			match(SEMICOLON) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Rule_definitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rule_definition.id
	        set(value) { throw RuntimeException() }
		fun RULE_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.RULE_NAME.id, 0)
		fun findDefinition() : DefinitionContext? = getRuleContext(solver.getType("DefinitionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  rule_definition() : Rule_definitionContext {
		var _localctx : Rule_definitionContext = Rule_definitionContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_rule_definition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 54
			match(RULE_NAME) as Token
			this.state = 55
			definition()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definition.id
	        set(value) { throw RuntimeException() }
		fun findInput_attrs() : Input_attrsContext? = getRuleContext(solver.getType("Input_attrsContext"),0)
		fun findReturn_expression() : Return_expressionContext? = getRuleContext(solver.getType("Return_expressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definition() : DefinitionContext {
		var _localctx : DefinitionContext = DefinitionContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_definition.id)
		try {
			this.state = 61
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			SQUARE_P_L  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 57
			input_attrs()
			this.state = 58
			return_expression()
			}}
			COLON , RETURNS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 60
			return_expression()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Input_attrsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_input_attrs.id
	        set(value) { throw RuntimeException() }
		fun SQUARE_P_L() : TerminalNode? = getToken(GrammarParser.Tokens.SQUARE_P_L.id, 0)
		fun findAttr() : List<AttrContext> = getRuleContexts(solver.getType("AttrContext"))
		fun findAttr(i: Int) : AttrContext? = getRuleContext(solver.getType("AttrContext"),i)
		fun SQUARE_P_R() : TerminalNode? = getToken(GrammarParser.Tokens.SQUARE_P_R.id, 0)
		fun COMMA() : List<TerminalNode> = getTokens(GrammarParser.Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(GrammarParser.Tokens.COMMA.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  input_attrs() : Input_attrsContext {
		var _localctx : Input_attrsContext = Input_attrsContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_input_attrs.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 63
			match(SQUARE_P_L) as Token
			this.state = 64
			attr()
			this.state = 69
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 65
				match(COMMA) as Token
				this.state = 66
				attr()
				}
				}
				this.state = 71
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 72
			match(SQUARE_P_R) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Return_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_return_expression.id
	        set(value) { throw RuntimeException() }
		fun RETURNS() : TerminalNode? = getToken(GrammarParser.Tokens.RETURNS.id, 0)
		fun findInput_attrs() : Input_attrsContext? = getRuleContext(solver.getType("Input_attrsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  return_expression() : Return_expressionContext {
		var _localctx : Return_expressionContext = Return_expressionContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_return_expression.id)
		try {
			this.state = 77
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RETURNS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 74
			match(RETURNS) as Token
			this.state = 75
			input_attrs()
			}}
			COLON  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AttrContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attr.id
	        set(value) { throw RuntimeException() }
		fun findWords() : List<WordsContext> = getRuleContexts(solver.getType("WordsContext"))
		fun findWords(i: Int) : WordsContext? = getRuleContext(solver.getType("WordsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  attr() : AttrContext {
		var _localctx : AttrContext = AttrContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_attr.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 79
			words()
			this.state = 80
			words()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Rule_bodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rule_body.id
	        set(value) { throw RuntimeException() }
		fun findRule_expression() : List<Rule_expressionContext> = getRuleContexts(solver.getType("Rule_expressionContext"))
		fun findRule_expression(i: Int) : Rule_expressionContext? = getRuleContext(solver.getType("Rule_expressionContext"),i)
		fun DELIM() : List<TerminalNode> = getTokens(GrammarParser.Tokens.DELIM.id)
		fun DELIM(i: Int) : TerminalNode = getToken(GrammarParser.Tokens.DELIM.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  rule_body() : Rule_bodyContext {
		var _localctx : Rule_bodyContext = Rule_bodyContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_rule_body.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 82
			rule_expression()
			this.state = 87
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==DELIM) {
				if (true){
				if (true){
				this.state = 83
				match(DELIM) as Token
				this.state = 84
				rule_expression()
				}
				}
				this.state = 89
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Rule_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rule_expression.id
	        set(value) { throw RuntimeException() }
		fun findExpression_name() : List<Expression_nameContext> = getRuleContexts(solver.getType("Expression_nameContext"))
		fun findExpression_name(i: Int) : Expression_nameContext? = getRuleContext(solver.getType("Expression_nameContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  rule_expression() : Rule_expressionContext {
		var _localctx : Rule_expressionContext = Rule_expressionContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_rule_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 90
			expression_name()
			this.state = 94
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NO_RULE) or (1L shl RULE_NAME) or (1L shl TOKEN_NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 91
				expression_name()
				}
				}
				this.state = 96
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Expression_nameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression_name.id
	        set(value) { throw RuntimeException() }
		fun RULE_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.RULE_NAME.id, 0)
		fun findExpression_attrs() : Expression_attrsContext? = getRuleContext(solver.getType("Expression_attrsContext"),0)
		fun findExpression_code() : Expression_codeContext? = getRuleContext(solver.getType("Expression_codeContext"),0)
		fun TOKEN_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.TOKEN_NAME.id, 0)
		fun NO_RULE() : TerminalNode? = getToken(GrammarParser.Tokens.NO_RULE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  expression_name() : Expression_nameContext {
		var _localctx : Expression_nameContext = Expression_nameContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_expression_name.id)
		try {
			this.state = 105
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			RULE_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 97
			match(RULE_NAME) as Token
			this.state = 98
			expression_attrs()
			this.state = 99
			expression_code()
			}}
			TOKEN_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 101
			match(TOKEN_NAME) as Token
			this.state = 102
			expression_code()
			}}
			NO_RULE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 103
			match(NO_RULE) as Token
			this.state = 104
			expression_code()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Expression_attrsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression_attrs.id
	        set(value) { throw RuntimeException() }
		fun EX_ATTR() : TerminalNode? = getToken(GrammarParser.Tokens.EX_ATTR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  expression_attrs() : Expression_attrsContext {
		var _localctx : Expression_attrsContext = Expression_attrsContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_expression_attrs.id)
		try {
			this.state = 109
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EX_ATTR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 107
			match(EX_ATTR) as Token
			}}
			SEMICOLON , DELIM , NO_RULE , RULE_NAME , TOKEN_NAME , CODE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Expression_codeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression_code.id
	        set(value) { throw RuntimeException() }
		fun CODE() : TerminalNode? = getToken(GrammarParser.Tokens.CODE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  expression_code() : Expression_codeContext {
		var _localctx : Expression_codeContext = Expression_codeContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_expression_code.id)
		try {
			this.state = 113
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CODE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 111
			match(CODE) as Token
			}}
			SEMICOLON , DELIM , NO_RULE , RULE_NAME , TOKEN_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TtokenssContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ttokenss.id
	        set(value) { throw RuntimeException() }
		fun findToken() : List<TokenContext> = getRuleContexts(solver.getType("TokenContext"))
		fun findToken(i: Int) : TokenContext? = getRuleContext(solver.getType("TokenContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  ttokenss() : TtokenssContext {
		var _localctx : TtokenssContext = TtokenssContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_ttokenss.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 115
			token()
			this.state = 119
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TOKEN_NAME) {
				if (true){
				if (true){
				this.state = 116
				token()
				}
				}
				this.state = 121
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TokenContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_token.id
	        set(value) { throw RuntimeException() }
		fun TOKEN_NAME() : TerminalNode? = getToken(GrammarParser.Tokens.TOKEN_NAME.id, 0)
		fun COLON() : TerminalNode? = getToken(GrammarParser.Tokens.COLON.id, 0)
		fun findToken_expression() : Token_expressionContext? = getRuleContext(solver.getType("Token_expressionContext"),0)
		fun SEMICOLON() : TerminalNode? = getToken(GrammarParser.Tokens.SEMICOLON.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  token() : TokenContext {
		var _localctx : TokenContext = TokenContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_token.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 122
			match(TOKEN_NAME) as Token
			this.state = 123
			match(COLON) as Token
			this.state = 124
			token_expression()
			this.state = 125
			match(SEMICOLON) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Token_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_token_expression.id
	        set(value) { throw RuntimeException() }
		fun TOKEN_DEF() : TerminalNode? = getToken(GrammarParser.Tokens.TOKEN_DEF.id, 0)
		fun REGEX() : TerminalNode? = getToken(GrammarParser.Tokens.REGEX.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  token_expression() : Token_expressionContext {
		var _localctx : Token_expressionContext = Token_expressionContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_token_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 127
			_la = _input!!.LA(1)
			if ( !(_la==TOKEN_DEF || _la==REGEX) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}