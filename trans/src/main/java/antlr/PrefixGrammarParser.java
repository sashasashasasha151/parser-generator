// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr/PrefixGrammar.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, LPAREN=2, RPAREN=3, PRINT=4, DEFINE=5, VAR=6, NUMBER=7, NOT=8, OR=9, 
		AND=10, XOR=11, TRUE=12, FALSE=13, PLUS=14, MINUS=15, MULL=16, DIV=17, 
		EQUAL=18, NOT_EQUAL=19, LOWER=20, LOWER_EQUAL=21, HIGHER=22, HIGHER_EQUAL=23, 
		WS=24;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_simple_expression = 2, RULE_if_expression = 3, 
		RULE_else_expression = 4, RULE_print = 5, RULE_define = 6, RULE_var = 7, 
		RULE_logic_value = 8, RULE_logic_operation = 9, RULE_int_value = 10, RULE_int_operations = 11, 
		RULE_compare = 12;
	public static final String[] ruleNames = {
		"start", "expression", "simple_expression", "if_expression", "else_expression", 
		"print", "define", "var", "logic_value", "logic_operation", "int_value", 
		"int_operations", "compare"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'('", "')'", "'print'", "'def'", null, null, "'!'", "'|'", 
		"'&'", "'^'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'=='", 
		"'!='", "'<'", null, "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "LPAREN", "RPAREN", "PRINT", "DEFINE", "VAR", "NUMBER", "NOT", 
		"OR", "AND", "XOR", "TRUE", "FALSE", "PLUS", "MINUS", "MULL", "DIV", "EQUAL", 
		"NOT_EQUAL", "LOWER", "LOWER_EQUAL", "HIGHER", "HIGHER_EQUAL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PrefixGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrefixGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StringBuilder sb;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StartContext)_localctx).sb =  new StringBuilder();
			setState(27);
			expression(_localctx.sb);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(StringBuilder sb) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), sb);
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			simple_expression(sb);
			sb.append(System.lineSeparator());
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DEFINE))) != 0)) {
				{
				{
				setState(31);
				simple_expression(sb);
				sb.append(System.lineSeparator());
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression(StringBuilder sb) throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState(), sb);
		enterRule(_localctx, 4, RULE_simple_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				if_expression(sb);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				print(sb);
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				define(sb);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode IF() { return getToken(PrefixGrammarParser.IF, 0); }
		public Logic_valueContext logic_value() {
			return getRuleContext(Logic_valueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PrefixGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PrefixGrammarParser.RPAREN, 0); }
		public Else_expressionContext else_expression() {
			return getRuleContext(Else_expressionContext.class,0);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_expressionContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression(StringBuilder sb) throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState(), sb);
		enterRule(_localctx, 6, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IF);
			sb.append("if (");
			setState(46);
			logic_value(sb);
			sb.append(")");
			setState(48);
			match(LPAREN);
			sb.append(" {").append(System.lineSeparator());
			setState(50);
			expression(sb);
			setState(51);
			match(RPAREN);
			sb.append("}");
			setState(53);
			else_expression(sb);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_expressionContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode LPAREN() { return getToken(PrefixGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PrefixGrammarParser.RPAREN, 0); }
		public Else_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_expressionContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_else_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterElse_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitElse_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitElse_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_expressionContext else_expression(StringBuilder sb) throws RecognitionException {
		Else_expressionContext _localctx = new Else_expressionContext(_ctx, getState(), sb);
		enterRule(_localctx, 8, RULE_else_expression);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				sb.append(" else");
				setState(56);
				match(LPAREN);
				sb.append(" {").append(System.lineSeparator());
				setState(58);
				expression(sb);
				setState(59);
				match(RPAREN);
				sb.append("}");
				}
				break;
			case EOF:
			case IF:
			case RPAREN:
			case PRINT:
			case DEFINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode PRINT() { return getToken(PrefixGrammarParser.PRINT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrintContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print(StringBuilder sb) throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState(), sb);
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(PRINT);
			sb.append("print(");
			setState(67);
			var(sb);
			sb.append(");");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token VAR;
		public TerminalNode DEFINE() { return getToken(PrefixGrammarParser.DEFINE, 0); }
		public TerminalNode VAR() { return getToken(PrefixGrammarParser.VAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefineContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define(StringBuilder sb) throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState(), sb);
		enterRule(_localctx, 12, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(DEFINE);
			setState(71);
			((DefineContext)_localctx).VAR = match(VAR);
			sb.append((((DefineContext)_localctx).VAR!=null?((DefineContext)_localctx).VAR.getText():null)).append(" = ");
			setState(73);
			var(sb);
			sb.append(";");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public StringBuilder sb;
		public Logic_valueContext logic_value() {
			return getRuleContext(Logic_valueContext.class,0);
		}
		public Int_valueContext int_value() {
			return getRuleContext(Int_valueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PrefixGrammarParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var(StringBuilder sb) throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState(), sb);
		enterRule(_localctx, 14, RULE_var);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				logic_value(sb);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				int_value(sb);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(VAR);
				sb.append("VAR");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_valueContext extends ParserRuleContext {
		public StringBuilder sb;
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public List<Logic_valueContext> logic_value() {
			return getRuleContexts(Logic_valueContext.class);
		}
		public Logic_valueContext logic_value(int i) {
			return getRuleContext(Logic_valueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PrefixGrammarParser.NOT, 0); }
		public TerminalNode VAR() { return getToken(PrefixGrammarParser.VAR, 0); }
		public TerminalNode TRUE() { return getToken(PrefixGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PrefixGrammarParser.FALSE, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<Int_valueContext> int_value() {
			return getRuleContexts(Int_valueContext.class);
		}
		public Int_valueContext int_value(int i) {
			return getRuleContext(Int_valueContext.class,i);
		}
		public Logic_valueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Logic_valueContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_logic_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterLogic_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitLogic_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitLogic_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_valueContext logic_value(StringBuilder sb) throws RecognitionException {
		Logic_valueContext _localctx = new Logic_valueContext(_ctx, getState(), sb);
		enterRule(_localctx, 16, RULE_logic_value);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				logic_operation(sb);
				setState(83);
				logic_value(sb);
				setState(84);
				logic_value(sb);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(NOT);
				sb.append("!");
				setState(88);
				logic_value(sb);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(VAR);
				sb.append("VAR");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(TRUE);
				sb.append("true");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(FALSE);
				sb.append("false");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				compare(sb);
				setState(96);
				int_value(sb);
				setState(97);
				int_value(sb);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_operationContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode OR() { return getToken(PrefixGrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(PrefixGrammarParser.AND, 0); }
		public TerminalNode XOR() { return getToken(PrefixGrammarParser.XOR, 0); }
		public TerminalNode EQUAL() { return getToken(PrefixGrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PrefixGrammarParser.NOT_EQUAL, 0); }
		public Logic_operationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Logic_operationContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_logic_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterLogic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitLogic_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitLogic_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operationContext logic_operation(StringBuilder sb) throws RecognitionException {
		Logic_operationContext _localctx = new Logic_operationContext(_ctx, getState(), sb);
		enterRule(_localctx, 18, RULE_logic_operation);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(OR);
				sb.append("|");
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(AND);
				sb.append("&");
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(XOR);
				sb.append("^");
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(EQUAL);
				sb.append("==");
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(NOT_EQUAL);
				sb.append("!=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_valueContext extends ParserRuleContext {
		public StringBuilder sb;
		public Int_operationsContext int_operations() {
			return getRuleContext(Int_operationsContext.class,0);
		}
		public List<Int_valueContext> int_value() {
			return getRuleContexts(Int_valueContext.class);
		}
		public Int_valueContext int_value(int i) {
			return getRuleContext(Int_valueContext.class,i);
		}
		public TerminalNode VAR() { return getToken(PrefixGrammarParser.VAR, 0); }
		public TerminalNode NUMBER() { return getToken(PrefixGrammarParser.NUMBER, 0); }
		public Int_valueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Int_valueContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_int_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterInt_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitInt_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitInt_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_valueContext int_value(StringBuilder sb) throws RecognitionException {
		Int_valueContext _localctx = new Int_valueContext(_ctx, getState(), sb);
		enterRule(_localctx, 20, RULE_int_value);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				int_operations(sb);
				setState(114);
				int_value(sb);
				setState(115);
				int_value(sb);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(VAR);
				sb.append("VAR");
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(NUMBER);
				sb.append("NUMBER");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_operationsContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode PLUS() { return getToken(PrefixGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PrefixGrammarParser.MINUS, 0); }
		public TerminalNode MULL() { return getToken(PrefixGrammarParser.MULL, 0); }
		public TerminalNode DIV() { return getToken(PrefixGrammarParser.DIV, 0); }
		public Int_operationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Int_operationsContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_int_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterInt_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitInt_operations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitInt_operations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_operationsContext int_operations(StringBuilder sb) throws RecognitionException {
		Int_operationsContext _localctx = new Int_operationsContext(_ctx, getState(), sb);
		enterRule(_localctx, 22, RULE_int_operations);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(PLUS);
				sb.append("+");
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(MINUS);
				sb.append("-");
				}
				break;
			case MULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(MULL);
				sb.append("*");
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(DIV);
				sb.append("/");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public StringBuilder sb;
		public TerminalNode EQUAL() { return getToken(PrefixGrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PrefixGrammarParser.NOT_EQUAL, 0); }
		public TerminalNode LOWER() { return getToken(PrefixGrammarParser.LOWER, 0); }
		public TerminalNode LOWER_EQUAL() { return getToken(PrefixGrammarParser.LOWER_EQUAL, 0); }
		public TerminalNode HIGHER() { return getToken(PrefixGrammarParser.HIGHER, 0); }
		public TerminalNode HIGHER_EQUAL() { return getToken(PrefixGrammarParser.HIGHER_EQUAL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompareContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixGrammarListener ) ((PrefixGrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrefixGrammarVisitor ) return ((PrefixGrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare(StringBuilder sb) throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState(), sb);
		enterRule(_localctx, 24, RULE_compare);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(EQUAL);
				sb.append("==");
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(NOT_EQUAL);
				sb.append("!=");
				}
				break;
			case LOWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(LOWER);
				sb.append("<");
				}
				break;
			case LOWER_EQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(LOWER_EQUAL);
				sb.append("<=");
				}
				break;
			case HIGHER:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(HIGHER);
				sb.append(">");
				}
				break;
			case HIGHER_EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(HIGHER_EQUAL);
				sb.append(">=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3%\n"+
		"\3\f\3\16\3(\13\3\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0086\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0094"+
		"\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00a1\2\34\3"+
		"\2\2\2\4\37\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16H\3"+
		"\2\2\2\20R\3\2\2\2\22e\3\2\2\2\24q\3\2\2\2\26{\3\2\2\2\30\u0085\3\2\2"+
		"\2\32\u0093\3\2\2\2\34\35\b\2\1\2\35\36\5\4\3\2\36\3\3\2\2\2\37 \5\6\4"+
		"\2 &\b\3\1\2!\"\5\6\4\2\"#\b\3\1\2#%\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)-\5\b\5\2*-\5\f\7\2+-\5\16\b\2,"+
		")\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7\3\2\2/\60\b\5\1\2\60\61\5"+
		"\22\n\2\61\62\b\5\1\2\62\63\7\4\2\2\63\64\b\5\1\2\64\65\5\4\3\2\65\66"+
		"\7\5\2\2\66\67\b\5\1\2\678\5\n\6\28\t\3\2\2\29:\b\6\1\2:;\7\4\2\2;<\b"+
		"\6\1\2<=\5\4\3\2=>\7\5\2\2>?\b\6\1\2?B\3\2\2\2@B\3\2\2\2A9\3\2\2\2A@\3"+
		"\2\2\2B\13\3\2\2\2CD\7\6\2\2DE\b\7\1\2EF\5\20\t\2FG\b\7\1\2G\r\3\2\2\2"+
		"HI\7\7\2\2IJ\7\b\2\2JK\b\b\1\2KL\5\20\t\2LM\b\b\1\2M\17\3\2\2\2NS\5\22"+
		"\n\2OS\5\26\f\2PQ\7\b\2\2QS\b\t\1\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2S\21"+
		"\3\2\2\2TU\5\24\13\2UV\5\22\n\2VW\5\22\n\2Wf\3\2\2\2XY\7\n\2\2YZ\b\n\1"+
		"\2Zf\5\22\n\2[\\\7\b\2\2\\f\b\n\1\2]^\7\16\2\2^f\b\n\1\2_`\7\17\2\2`f"+
		"\b\n\1\2ab\5\32\16\2bc\5\26\f\2cd\5\26\f\2df\3\2\2\2eT\3\2\2\2eX\3\2\2"+
		"\2e[\3\2\2\2e]\3\2\2\2e_\3\2\2\2ea\3\2\2\2f\23\3\2\2\2gh\7\13\2\2hr\b"+
		"\13\1\2ij\7\f\2\2jr\b\13\1\2kl\7\r\2\2lr\b\13\1\2mn\7\24\2\2nr\b\13\1"+
		"\2op\7\25\2\2pr\b\13\1\2qg\3\2\2\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2"+
		"\2\2r\25\3\2\2\2st\5\30\r\2tu\5\26\f\2uv\5\26\f\2v|\3\2\2\2wx\7\b\2\2"+
		"x|\b\f\1\2yz\7\t\2\2z|\b\f\1\2{s\3\2\2\2{w\3\2\2\2{y\3\2\2\2|\27\3\2\2"+
		"\2}~\7\20\2\2~\u0086\b\r\1\2\177\u0080\7\21\2\2\u0080\u0086\b\r\1\2\u0081"+
		"\u0082\7\22\2\2\u0082\u0086\b\r\1\2\u0083\u0084\7\23\2\2\u0084\u0086\b"+
		"\r\1\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\31\3\2\2\2\u0087\u0088\7\24\2\2\u0088\u0094\b\16\1\2\u0089"+
		"\u008a\7\25\2\2\u008a\u0094\b\16\1\2\u008b\u008c\7\26\2\2\u008c\u0094"+
		"\b\16\1\2\u008d\u008e\7\27\2\2\u008e\u0094\b\16\1\2\u008f\u0090\7\30\2"+
		"\2\u0090\u0094\b\16\1\2\u0091\u0092\7\31\2\2\u0092\u0094\b\16\1\2\u0093"+
		"\u0087\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008d\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094\33\3\2\2\2\13&,ARe"+
		"q{\u0085\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}