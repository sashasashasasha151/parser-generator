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
	override val classesByName : List<KClass<*>> = listOf(PrefixGrammarParser.StartContext::class,
                                                       PrefixGrammarParser.ExpressionContext::class,
                                                       PrefixGrammarParser.Simple_expressionContext::class,
                                                       PrefixGrammarParser.If_expressionContext::class,
                                                       PrefixGrammarParser.Else_expressionContext::class,
                                                       PrefixGrammarParser.PrintContext::class,
                                                       PrefixGrammarParser.DefineContext::class,
                                                       PrefixGrammarParser.VariableContext::class,
                                                       PrefixGrammarParser.Logic_valueContext::class,
                                                       PrefixGrammarParser.Int_valueContext::class,
                                                       PrefixGrammarParser.Logic_operationContext::class,
                                                       PrefixGrammarParser.Int_operationsContext::class,
                                                       PrefixGrammarParser.Compare_opContext::class)
}

class PrefixGrammarParser(input: TokenStream) : Parser(input) {
	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "PrefixGrammar.g4"

    override val tokenNames: Array<String?>?
        get() = PrefixGrammarParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = PrefixGrammarParser.Companion.ruleNames
    override val atn: ATN
        get() = PrefixGrammarParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
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

    enum class Rules(val id: Int) {
        RULE_start(0),
        RULE_expression(1),
        RULE_simple_expression(2),
        RULE_if_expression(3),
        RULE_else_expression(4),
        RULE_print(5),
        RULE_define(6),
        RULE_variable(7),
        RULE_logic_value(8),
        RULE_int_value(9),
        RULE_logic_operation(10),
        RULE_int_operations(11),
        RULE_compare_op(12)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("start", "expression", "simple_expression", 
                                "if_expression", "else_expression", "print", 
                                "define", "variable", "logic_value", "int_value", 
                                "logic_operation", "int_operations", "compare_op")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'if'", 
                                                           "'('", "')'", 
                                                           "'print'", "'def'", 
                                                           "'='", null, 
                                                           null, "'not'", 
                                                           "'or'", "'and'", 
                                                           "'xor'", "'true'", 
                                                           "'false'", "'+'", 
                                                           "'-'", "'*'", 
                                                           "'/'", "'=='", 
                                                           "'!='", "'<'", 
                                                           "'<='", "'>'", 
                                                           "'>='")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "IF", 
                                                            "LPAREN", "RPAREN", 
                                                            "PRINT", "DEFINE", 
                                                            "REDEF", "VARS", 
                                                            "NUMBER", "NOT", 
                                                            "OR", "AND", 
                                                            "XOR", "TRUE", 
                                                            "FALSE", "PLUS", 
                                                            "MINUS", "MULL", 
                                                            "DIV", "EQUAL", 
                                                            "NOT_EQUAL", 
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
        	arrayOf(3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 
        	3, 27, 167, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 
        	6, 9, 6, 4, 7, 9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 
        	9, 11, 4, 12, 9, 12, 4, 13, 9, 13, 4, 14, 9, 14, 3, 2, 3, 2, 3, 
        	2, 3, 2, 5, 2, 33, 10, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 40, 
        	10, 3, 12, 3, 14, 3, 43, 11, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 
        	4, 3, 4, 3, 4, 3, 4, 5, 4, 54, 10, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 
        	5, 3, 5, 3, 5, 3, 5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 5, 6, 
        	70, 10, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 
        	3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 5, 8, 86, 10, 8, 3, 9, 3, 9, 3, 9, 
        	3, 9, 3, 9, 3, 9, 3, 9, 3, 9, 5, 9, 96, 10, 9, 3, 10, 3, 10, 3, 
        	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 
        	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 
        	10, 118, 10, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 
        	3, 11, 3, 11, 5, 11, 129, 10, 11, 3, 12, 3, 12, 3, 12, 3, 12, 3, 
        	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 141, 10, 12, 3, 13, 
        	3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 3, 13, 5, 13, 151, 10, 
        	13, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 
        	14, 3, 14, 3, 14, 3, 14, 5, 14, 165, 10, 14, 3, 14, 2, 2, 15, 2, 
        	4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 2, 2, 2, 180, 2, 32, 
        	3, 2, 2, 2, 4, 34, 3, 2, 2, 2, 6, 53, 3, 2, 2, 2, 8, 55, 3, 2, 
        	2, 2, 10, 69, 3, 2, 2, 2, 12, 71, 3, 2, 2, 2, 14, 85, 3, 2, 2, 
        	2, 16, 95, 3, 2, 2, 2, 18, 117, 3, 2, 2, 2, 20, 128, 3, 2, 2, 2, 
        	22, 140, 3, 2, 2, 2, 24, 150, 3, 2, 2, 2, 26, 164, 3, 2, 2, 2, 
        	28, 29, 5, 4, 3, 2, 29, 30, 8, 2, 1, 2, 30, 33, 3, 2, 2, 2, 31, 
        	33, 8, 2, 1, 2, 32, 28, 3, 2, 2, 2, 32, 31, 3, 2, 2, 2, 33, 3, 
        	3, 2, 2, 2, 34, 35, 5, 6, 4, 2, 35, 41, 8, 3, 1, 2, 36, 37, 5, 
        	6, 4, 2, 37, 38, 8, 3, 1, 2, 38, 40, 3, 2, 2, 2, 39, 36, 3, 2, 
        	2, 2, 40, 43, 3, 2, 2, 2, 41, 39, 3, 2, 2, 2, 41, 42, 3, 2, 2, 
        	2, 42, 5, 3, 2, 2, 2, 43, 41, 3, 2, 2, 2, 44, 45, 5, 8, 5, 2, 45, 
        	46, 8, 4, 1, 2, 46, 54, 3, 2, 2, 2, 47, 48, 5, 12, 7, 2, 48, 49, 
        	8, 4, 1, 2, 49, 54, 3, 2, 2, 2, 50, 51, 5, 14, 8, 2, 51, 52, 8, 
        	4, 1, 2, 52, 54, 3, 2, 2, 2, 53, 44, 3, 2, 2, 2, 53, 47, 3, 2, 
        	2, 2, 53, 50, 3, 2, 2, 2, 54, 7, 3, 2, 2, 2, 55, 56, 7, 3, 2, 2, 
        	56, 57, 5, 18, 10, 2, 57, 58, 7, 4, 2, 2, 58, 59, 5, 4, 3, 2, 59, 
        	60, 7, 5, 2, 2, 60, 61, 5, 10, 6, 2, 61, 62, 8, 5, 1, 2, 62, 9, 
        	3, 2, 2, 2, 63, 64, 7, 4, 2, 2, 64, 65, 5, 4, 3, 2, 65, 66, 7, 
        	5, 2, 2, 66, 67, 8, 6, 1, 2, 67, 70, 3, 2, 2, 2, 68, 70, 8, 6, 
        	1, 2, 69, 63, 3, 2, 2, 2, 69, 68, 3, 2, 2, 2, 70, 11, 3, 2, 2, 
        	2, 71, 72, 7, 6, 2, 2, 72, 73, 5, 16, 9, 2, 73, 74, 8, 7, 1, 2, 
        	74, 13, 3, 2, 2, 2, 75, 76, 7, 7, 2, 2, 76, 77, 7, 9, 2, 2, 77, 
        	78, 5, 16, 9, 2, 78, 79, 8, 8, 1, 2, 79, 86, 3, 2, 2, 2, 80, 81, 
        	7, 8, 2, 2, 81, 82, 7, 9, 2, 2, 82, 83, 5, 16, 9, 2, 83, 84, 8, 
        	8, 1, 2, 84, 86, 3, 2, 2, 2, 85, 75, 3, 2, 2, 2, 85, 80, 3, 2, 
        	2, 2, 86, 15, 3, 2, 2, 2, 87, 88, 5, 18, 10, 2, 88, 89, 8, 9, 1, 
        	2, 89, 96, 3, 2, 2, 2, 90, 91, 5, 20, 11, 2, 91, 92, 8, 9, 1, 2, 
        	92, 96, 3, 2, 2, 2, 93, 94, 7, 9, 2, 2, 94, 96, 8, 9, 1, 2, 95, 
        	87, 3, 2, 2, 2, 95, 90, 3, 2, 2, 2, 95, 93, 3, 2, 2, 2, 96, 17, 
        	3, 2, 2, 2, 97, 98, 5, 22, 12, 2, 98, 99, 5, 18, 10, 2, 99, 100, 
        	5, 18, 10, 2, 100, 101, 8, 10, 1, 2, 101, 118, 3, 2, 2, 2, 102, 
        	103, 7, 11, 2, 2, 103, 104, 5, 18, 10, 2, 104, 105, 8, 10, 1, 2, 
        	105, 118, 3, 2, 2, 2, 106, 107, 7, 9, 2, 2, 107, 118, 8, 10, 1, 
        	2, 108, 109, 7, 15, 2, 2, 109, 118, 8, 10, 1, 2, 110, 111, 7, 16, 
        	2, 2, 111, 118, 8, 10, 1, 2, 112, 113, 5, 26, 14, 2, 113, 114, 
        	5, 20, 11, 2, 114, 115, 5, 20, 11, 2, 115, 116, 8, 10, 1, 2, 116, 
        	118, 3, 2, 2, 2, 117, 97, 3, 2, 2, 2, 117, 102, 3, 2, 2, 2, 117, 
        	106, 3, 2, 2, 2, 117, 108, 3, 2, 2, 2, 117, 110, 3, 2, 2, 2, 117, 
        	112, 3, 2, 2, 2, 118, 19, 3, 2, 2, 2, 119, 120, 5, 24, 13, 2, 120, 
        	121, 5, 20, 11, 2, 121, 122, 5, 20, 11, 2, 122, 123, 8, 11, 1, 
        	2, 123, 129, 3, 2, 2, 2, 124, 125, 7, 9, 2, 2, 125, 129, 8, 11, 
        	1, 2, 126, 127, 7, 10, 2, 2, 127, 129, 8, 11, 1, 2, 128, 119, 3, 
        	2, 2, 2, 128, 124, 3, 2, 2, 2, 128, 126, 3, 2, 2, 2, 129, 21, 3, 
        	2, 2, 2, 130, 131, 7, 12, 2, 2, 131, 141, 8, 12, 1, 2, 132, 133, 
        	7, 13, 2, 2, 133, 141, 8, 12, 1, 2, 134, 135, 7, 14, 2, 2, 135, 
        	141, 8, 12, 1, 2, 136, 137, 7, 21, 2, 2, 137, 141, 8, 12, 1, 2, 
        	138, 139, 7, 22, 2, 2, 139, 141, 8, 12, 1, 2, 140, 130, 3, 2, 2, 
        	2, 140, 132, 3, 2, 2, 2, 140, 134, 3, 2, 2, 2, 140, 136, 3, 2, 
        	2, 2, 140, 138, 3, 2, 2, 2, 141, 23, 3, 2, 2, 2, 142, 143, 7, 17, 
        	2, 2, 143, 151, 8, 13, 1, 2, 144, 145, 7, 18, 2, 2, 145, 151, 8, 
        	13, 1, 2, 146, 147, 7, 19, 2, 2, 147, 151, 8, 13, 1, 2, 148, 149, 
        	7, 20, 2, 2, 149, 151, 8, 13, 1, 2, 150, 142, 3, 2, 2, 2, 150, 
        	144, 3, 2, 2, 2, 150, 146, 3, 2, 2, 2, 150, 148, 3, 2, 2, 2, 151, 
        	25, 3, 2, 2, 2, 152, 153, 7, 21, 2, 2, 153, 165, 8, 14, 1, 2, 154, 
        	155, 7, 22, 2, 2, 155, 165, 8, 14, 1, 2, 156, 157, 7, 23, 2, 2, 
        	157, 165, 8, 14, 1, 2, 158, 159, 7, 24, 2, 2, 159, 165, 8, 14, 
        	1, 2, 160, 161, 7, 25, 2, 2, 161, 165, 8, 14, 1, 2, 162, 163, 7, 
        	26, 2, 2, 163, 165, 8, 14, 1, 2, 164, 152, 3, 2, 2, 2, 164, 154, 
        	3, 2, 2, 2, 164, 156, 3, 2, 2, 2, 164, 158, 3, 2, 2, 2, 164, 160, 
        	3, 2, 2, 2, 164, 162, 3, 2, 2, 2, 165, 27, 3, 2, 2, 2, 13, 32, 
        	41, 53, 69, 85, 95, 117, 128, 140, 150, 164)
        val ATN = ATNDeserializer().deserializeIntegers(serializedIntegersATN)
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val IF = Tokens.IF.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val PRINT = Tokens.PRINT.id
    private val DEFINE = Tokens.DEFINE.id
    private val REDEF = Tokens.REDEF.id
    private val VARS = Tokens.VARS.id
    private val NUMBER = Tokens.NUMBER.id
    private val NOT = Tokens.NOT.id
    private val OR = Tokens.OR.id
    private val AND = Tokens.AND.id
    private val XOR = Tokens.XOR.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val MULL = Tokens.MULL.id
    private val DIV = Tokens.DIV.id
    private val EQUAL = Tokens.EQUAL.id
    private val NOT_EQUAL = Tokens.NOT_EQUAL.id
    private val LOWER = Tokens.LOWER.id
    private val LOWER_EQUAL = Tokens.LOWER_EQUAL.id
    private val HIGHER = Tokens.HIGHER.id
    private val HIGHER_EQUAL = Tokens.HIGHER_EQUAL.id
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
		var value : String by Delegates.notNull()
		var expression: ExpressionContext by Delegates.notNull()
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterStart(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitStart(this)
		}
	}

	fun  start() : StartContext {
		var _localctx : StartContext = StartContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_start.id)
		try {
			this.state = 30
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			IF , PRINT , DEFINE , REDEF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 26
			(_localctx as StartContext).expression = expression(1)
			_localctx.value = "fun main(args: Array<String>) {\n${(_localctx as StartContext).expression.value}}"
			}}
			EOF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			_localctx.value = "fun main(args: Array<String>) {\n}"
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

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var simple_expression: Simple_expressionContext by Delegates.notNull()
		fun findSimple_expression() : List<Simple_expressionContext> = getRuleContexts(solver.getType("Simple_expressionContext"))
		fun findSimple_expression(i: Int) : Simple_expressionContext? = getRuleContext(solver.getType("Simple_expressionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitExpression(this)
		}
	}

	fun  expression(indent : Int) : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state, indent)
		enterRule(_localctx, 2, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 32
			(_localctx as ExpressionContext).simple_expression = simple_expression(indent)
			_localctx.value = (_localctx as ExpressionContext).simple_expression.value + "\n"
			this.state = 39
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl IF) or (1L shl PRINT) or (1L shl DEFINE) or (1L shl REDEF))) != 0L)) {
				if (true){
				if (true){
				this.state = 34
				(_localctx as ExpressionContext).simple_expression = simple_expression(indent)
				_localctx.value += (_localctx as ExpressionContext).simple_expression.value + "\n"
				}
				}
				this.state = 41
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

	open class Simple_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simple_expression.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var if_expression: If_expressionContext by Delegates.notNull()
		var print: PrintContext by Delegates.notNull()
		var define: DefineContext by Delegates.notNull()
		fun findIf_expression() : If_expressionContext? = getRuleContext(solver.getType("If_expressionContext"),0)
		fun findPrint() : PrintContext? = getRuleContext(solver.getType("PrintContext"),0)
		fun findDefine() : DefineContext? = getRuleContext(solver.getType("DefineContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterSimple_expression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitSimple_expression(this)
		}
	}

	fun  simple_expression(indent : Int) : Simple_expressionContext {
		var _localctx : Simple_expressionContext = Simple_expressionContext(context, state, indent)
		enterRule(_localctx, 4, Rules.RULE_simple_expression.id)
		try {
			this.state = 51
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			IF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 42
			(_localctx as Simple_expressionContext).if_expression = if_expression(indent)
			_localctx.value = (_localctx as Simple_expressionContext).if_expression.value
			}}
			PRINT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 45
			(_localctx as Simple_expressionContext).print = print(indent)
			_localctx.value = (_localctx as Simple_expressionContext).print.value
			}}
			DEFINE , REDEF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 48
			(_localctx as Simple_expressionContext).define = define(indent)
			_localctx.value = (_localctx as Simple_expressionContext).define.value
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

	open class If_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_if_expression.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var l: Logic_valueContext by Delegates.notNull()
		var ex: ExpressionContext by Delegates.notNull()
		var el: Else_expressionContext by Delegates.notNull()
		fun IF() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.IF.id, 0)
		fun LPAREN() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.RPAREN.id, 0)
		fun findLogic_value() : Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findElse_expression() : Else_expressionContext? = getRuleContext(solver.getType("Else_expressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterIf_expression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitIf_expression(this)
		}
	}

	fun  if_expression(indent : Int) : If_expressionContext {
		var _localctx : If_expressionContext = If_expressionContext(context, state, indent)
		enterRule(_localctx, 6, Rules.RULE_if_expression.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 53
			match(IF) as Token
			this.state = 54
			(_localctx as If_expressionContext).l = logic_value()
			this.state = 55
			match(LPAREN) as Token
			this.state = 56
			(_localctx as If_expressionContext).ex = expression(indent+1)
			this.state = 57
			match(RPAREN) as Token
			this.state = 58
			(_localctx as If_expressionContext).el = else_expression(indent)
			_localctx.value = "${"\t".repeat(_localctx.indent)}if (${(_localctx as If_expressionContext).l.value}) {\n${(_localctx as If_expressionContext).ex.value}${"\t".repeat(_localctx.indent)}} ${(_localctx as If_expressionContext).el.value}"
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

	open class Else_expressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_else_expression.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var ex: ExpressionContext by Delegates.notNull()
		fun LPAREN() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.RPAREN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterElse_expression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitElse_expression(this)
		}
	}

	fun  else_expression(indent : Int) : Else_expressionContext {
		var _localctx : Else_expressionContext = Else_expressionContext(context, state, indent)
		enterRule(_localctx, 8, Rules.RULE_else_expression.id)
		try {
			this.state = 67
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 61
			match(LPAREN) as Token
			this.state = 62
			(_localctx as Else_expressionContext).ex = expression(indent+1)
			this.state = 63
			match(RPAREN) as Token
			_localctx.value = "else {\n${(_localctx as Else_expressionContext).ex.value}${"\t".repeat(_localctx.indent)}}"
			}}
			EOF , IF , RPAREN , PRINT , DEFINE , REDEF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			_localctx.value = ""
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

	open class PrintContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_print.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var variable: VariableContext by Delegates.notNull()
		fun PRINT() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.PRINT.id, 0)
		fun findVariable() : VariableContext? = getRuleContext(solver.getType("VariableContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterPrint(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitPrint(this)
		}
	}

	fun  print(indent : Int) : PrintContext {
		var _localctx : PrintContext = PrintContext(context, state, indent)
		enterRule(_localctx, 10, Rules.RULE_print.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 69
			match(PRINT) as Token
			this.state = 70
			(_localctx as PrintContext).variable = variable()
			_localctx.value = "${"\t".repeat(_localctx.indent)}println(${(_localctx as PrintContext).variable.value})"
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

	open class DefineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_define.id
	        set(value) { throw RuntimeException() }
		var indent : Int by Delegates.notNull()
		var value : String by Delegates.notNull()
		var VARS: Token by Delegates.notNull()
		var variable: VariableContext by Delegates.notNull()
		fun DEFINE() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.DEFINE.id, 0)
		fun VARS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
		fun findVariable() : VariableContext? = getRuleContext(solver.getType("VariableContext"),0)
		fun REDEF() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.REDEF.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, indent : Int) : super(parent, invokingState){
			this.indent = indent;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterDefine(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitDefine(this)
		}
	}

	fun  define(indent : Int) : DefineContext {
		var _localctx : DefineContext = DefineContext(context, state, indent)
		enterRule(_localctx, 12, Rules.RULE_define.id)
		try {
			this.state = 83
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DEFINE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 73
			match(DEFINE) as Token
			this.state = 74
			(_localctx as DefineContext).VARS = match(VARS) as Token
			this.state = 75
			(_localctx as DefineContext).variable = variable()
			_localctx.value = "${"\t".repeat(_localctx.indent)}var ${((_localctx as DefineContext).VARS?.text)} = ${(_localctx as DefineContext).variable.value}"
			}}
			REDEF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 78
			match(REDEF) as Token
			this.state = 79
			(_localctx as DefineContext).VARS = match(VARS) as Token
			this.state = 80
			(_localctx as DefineContext).variable = variable()
			_localctx.value = "${"\t".repeat(_localctx.indent)}${((_localctx as DefineContext).VARS?.text)} = ${(_localctx as DefineContext).variable.value}"
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

	open class VariableContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_variable.id
	        set(value) { throw RuntimeException() }
		var value : String by Delegates.notNull()
		var logic_value: Logic_valueContext by Delegates.notNull()
		var int_value: Int_valueContext by Delegates.notNull()
		var VARS: Token by Delegates.notNull()
		fun findLogic_value() : Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"),0)
		fun findInt_value() : Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"),0)
		fun VARS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterVariable(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitVariable(this)
		}
	}

	fun  variable() : VariableContext {
		var _localctx : VariableContext = VariableContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_variable.id)
		try {
			this.state = 93
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 85
			(_localctx as VariableContext).logic_value = logic_value()
			_localctx.value = (_localctx as VariableContext).logic_value.value
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 88
			(_localctx as VariableContext).int_value = int_value()
			_localctx.value = (_localctx as VariableContext).int_value.value
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 91
			(_localctx as VariableContext).VARS = match(VARS) as Token
			_localctx.value = ((_localctx as VariableContext).VARS?.text)!!
			}}
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

	open class Logic_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logic_value.id
	        set(value) { throw RuntimeException() }
		var value : String by Delegates.notNull()
		var op: Logic_operationContext by Delegates.notNull()
		var lv: Logic_valueContext by Delegates.notNull()
		var rv: Logic_valueContext by Delegates.notNull()
		var VARS: Token by Delegates.notNull()
		var c_op: Compare_opContext by Delegates.notNull()
		var c_lv: Int_valueContext by Delegates.notNull()
		var c_rv: Int_valueContext by Delegates.notNull()
		fun findLogic_operation() : Logic_operationContext? = getRuleContext(solver.getType("Logic_operationContext"),0)
		fun findLogic_value() : List<Logic_valueContext> = getRuleContexts(solver.getType("Logic_valueContext"))
		fun findLogic_value(i: Int) : Logic_valueContext? = getRuleContext(solver.getType("Logic_valueContext"),i)
		fun NOT() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT.id, 0)
		fun VARS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
		fun TRUE() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.TRUE.id, 0)
		fun FALSE() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.FALSE.id, 0)
		fun findCompare_op() : Compare_opContext? = getRuleContext(solver.getType("Compare_opContext"),0)
		fun findInt_value() : List<Int_valueContext> = getRuleContexts(solver.getType("Int_valueContext"))
		fun findInt_value(i: Int) : Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterLogic_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitLogic_value(this)
		}
	}

	fun  logic_value() : Logic_valueContext {
		var _localctx : Logic_valueContext = Logic_valueContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_logic_value.id)
		try {
			this.state = 115
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 95
			(_localctx as Logic_valueContext).op = logic_operation()
			this.state = 96
			(_localctx as Logic_valueContext).lv = logic_value()
			this.state = 97
			(_localctx as Logic_valueContext).rv = logic_value()
			_localctx.value = "(${(_localctx as Logic_valueContext).lv.value} ${(_localctx as Logic_valueContext).op.op} ${(_localctx as Logic_valueContext).rv.value})"
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 100
			match(NOT) as Token
			this.state = 101
			(_localctx as Logic_valueContext).lv = logic_value()
			_localctx.value = "!(${(_localctx as Logic_valueContext).lv.value})"
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 104
			(_localctx as Logic_valueContext).VARS = match(VARS) as Token
			_localctx.value = ((_localctx as Logic_valueContext).VARS?.text)!!
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 106
			match(TRUE) as Token
			_localctx.value = "true"
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 108
			match(FALSE) as Token
			_localctx.value = "false"
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 110
			(_localctx as Logic_valueContext).c_op = compare_op()
			this.state = 111
			(_localctx as Logic_valueContext).c_lv = int_value()
			this.state = 112
			(_localctx as Logic_valueContext).c_rv = int_value()
			_localctx.value = "(${(_localctx as Logic_valueContext).c_lv.value} ${(_localctx as Logic_valueContext).c_op.op} ${(_localctx as Logic_valueContext).c_rv.value})"
			}}
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

	open class Int_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_int_value.id
	        set(value) { throw RuntimeException() }
		var value : String by Delegates.notNull()
		var op: Int_operationsContext by Delegates.notNull()
		var lv: Int_valueContext by Delegates.notNull()
		var rv: Int_valueContext by Delegates.notNull()
		var VARS: Token by Delegates.notNull()
		var NUMBER: Token by Delegates.notNull()
		fun findInt_operations() : Int_operationsContext? = getRuleContext(solver.getType("Int_operationsContext"),0)
		fun findInt_value() : List<Int_valueContext> = getRuleContexts(solver.getType("Int_valueContext"))
		fun findInt_value(i: Int) : Int_valueContext? = getRuleContext(solver.getType("Int_valueContext"),i)
		fun VARS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.VARS.id, 0)
		fun NUMBER() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterInt_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitInt_value(this)
		}
	}

	fun  int_value() : Int_valueContext {
		var _localctx : Int_valueContext = Int_valueContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_int_value.id)
		try {
			this.state = 126
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			PLUS , MINUS , MULL , DIV  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 117
			(_localctx as Int_valueContext).op = int_operations()
			this.state = 118
			(_localctx as Int_valueContext).lv = int_value()
			this.state = 119
			(_localctx as Int_valueContext).rv = int_value()
			_localctx.value = "(${(_localctx as Int_valueContext).lv.value} ${(_localctx as Int_valueContext).op.op} ${(_localctx as Int_valueContext).rv.value})"
			}}
			VARS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 122
			(_localctx as Int_valueContext).VARS = match(VARS) as Token
			_localctx.value = ((_localctx as Int_valueContext).VARS?.text)!!
			}}
			NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 124
			(_localctx as Int_valueContext).NUMBER = match(NUMBER) as Token
			_localctx.value = ((_localctx as Int_valueContext).NUMBER?.text)!!
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

	open class Logic_operationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_logic_operation.id
	        set(value) { throw RuntimeException() }
		var op : String by Delegates.notNull()
		fun OR() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.OR.id, 0)
		fun AND() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.AND.id, 0)
		fun XOR() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.XOR.id, 0)
		fun EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.EQUAL.id, 0)
		fun NOT_EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT_EQUAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterLogic_operation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitLogic_operation(this)
		}
	}

	fun  logic_operation() : Logic_operationContext {
		var _localctx : Logic_operationContext = Logic_operationContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_logic_operation.id)
		try {
			this.state = 138
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 128
			match(OR) as Token
			_localctx.op = " || "
			}}
			AND  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 130
			match(AND) as Token
			_localctx.op = " && "
			}}
			XOR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 132
			match(XOR) as Token
			_localctx.op = " ^ "
			}}
			EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 134
			match(EQUAL) as Token
			_localctx.op = " == "
			}}
			NOT_EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 136
			match(NOT_EQUAL) as Token
			_localctx.op = " != "
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

	open class Int_operationsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_int_operations.id
	        set(value) { throw RuntimeException() }
		var op : String by Delegates.notNull()
		fun PLUS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.MINUS.id, 0)
		fun MULL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.MULL.id, 0)
		fun DIV() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.DIV.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterInt_operations(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitInt_operations(this)
		}
	}

	fun  int_operations() : Int_operationsContext {
		var _localctx : Int_operationsContext = Int_operationsContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_int_operations.id)
		try {
			this.state = 148
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			PLUS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 140
			match(PLUS) as Token
			_localctx.op = " + "
			}}
			MINUS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 142
			match(MINUS) as Token
			_localctx.op = " - "
			}}
			MULL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 144
			match(MULL) as Token
			_localctx.op = " * "
			}}
			DIV  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 146
			match(DIV) as Token
			_localctx.op = " / "
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

	open class Compare_opContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compare_op.id
	        set(value) { throw RuntimeException() }
		var op : String by Delegates.notNull()
		fun EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.EQUAL.id, 0)
		fun NOT_EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.NOT_EQUAL.id, 0)
		fun LOWER() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.LOWER.id, 0)
		fun LOWER_EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.LOWER_EQUAL.id, 0)
		fun HIGHER() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.HIGHER.id, 0)
		fun HIGHER_EQUAL() : TerminalNode? = getToken(PrefixGrammarParser.Tokens.HIGHER_EQUAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).enterCompare_op(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is PrefixGrammarListener ) (listener as PrefixGrammarListener).exitCompare_op(this)
		}
	}

	fun  compare_op() : Compare_opContext {
		var _localctx : Compare_opContext = Compare_opContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_compare_op.id)
		try {
			this.state = 162
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 150
			match(EQUAL) as Token
			_localctx.op = " == "
			}}
			NOT_EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 152
			match(NOT_EQUAL) as Token
			_localctx.op = " != "
			}}
			LOWER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 154
			match(LOWER) as Token
			_localctx.op = " < "
			}}
			LOWER_EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 156
			match(LOWER_EQUAL) as Token
			_localctx.op = " <= "
			}}
			HIGHER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 158
			match(HIGHER) as Token
			_localctx.op = " > "
			}}
			HIGHER_EQUAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 160
			match(HIGHER_EQUAL) as Token
			_localctx.op = " >= "
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

}