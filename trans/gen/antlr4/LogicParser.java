// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr4/Logic.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, XOR=2, AND=3, NOT=4, LPAREN=5, RPAREN=6, VAR=7, WHITESPACE=8;
	public static final int
		RULE_expression = 0, RULE_add_or = 1, RULE_n_expression = 2, RULE_add_xor = 3, 
		RULE_n_n_expression = 4, RULE_add_and = 5, RULE_l_expression = 6;
	public static final String[] ruleNames = {
		"expression", "add_or", "n_expression", "add_xor", "n_n_expression", "add_and", 
		"l_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", "'^'", "'&'", "'!'", "'('", "')'", null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "XOR", "AND", "NOT", "LPAREN", "RPAREN", "VAR", "WHITESPACE"
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
	public String getGrammarFileName() { return "Logic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public N_expressionContext n_expression() {
			return getRuleContext(N_expressionContext.class,0);
		}
		public Add_orContext add_or() {
			return getRuleContext(Add_orContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			n_expression();
			setState(15);
			add_or();
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

	public static class Add_orContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LogicParser.OR, 0); }
		public N_expressionContext n_expression() {
			return getRuleContext(N_expressionContext.class,0);
		}
		public Add_orContext add_or() {
			return getRuleContext(Add_orContext.class,0);
		}
		public Add_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAdd_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAdd_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAdd_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_orContext add_or() throws RecognitionException {
		Add_orContext _localctx = new Add_orContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_add_or);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(OR);
				setState(18);
				n_expression();
				setState(19);
				add_or();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class N_expressionContext extends ParserRuleContext {
		public N_n_expressionContext n_n_expression() {
			return getRuleContext(N_n_expressionContext.class,0);
		}
		public Add_xorContext add_xor() {
			return getRuleContext(Add_xorContext.class,0);
		}
		public N_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterN_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitN_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitN_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N_expressionContext n_expression() throws RecognitionException {
		N_expressionContext _localctx = new N_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_n_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			n_n_expression();
			setState(25);
			add_xor();
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

	public static class Add_xorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(LogicParser.XOR, 0); }
		public N_n_expressionContext n_n_expression() {
			return getRuleContext(N_n_expressionContext.class,0);
		}
		public Add_xorContext add_xor() {
			return getRuleContext(Add_xorContext.class,0);
		}
		public Add_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAdd_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAdd_xor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAdd_xor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_xorContext add_xor() throws RecognitionException {
		Add_xorContext _localctx = new Add_xorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_add_xor);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(XOR);
				setState(28);
				n_n_expression();
				setState(29);
				add_xor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class N_n_expressionContext extends ParserRuleContext {
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public Add_andContext add_and() {
			return getRuleContext(Add_andContext.class,0);
		}
		public N_n_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_n_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterN_n_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitN_n_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitN_n_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N_n_expressionContext n_n_expression() throws RecognitionException {
		N_n_expressionContext _localctx = new N_n_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_n_n_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			l_expression();
			setState(35);
			add_and();
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

	public static class Add_andContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LogicParser.AND, 0); }
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public Add_andContext add_and() {
			return getRuleContext(Add_andContext.class,0);
		}
		public Add_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterAdd_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitAdd_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitAdd_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_andContext add_and() throws RecognitionException {
		Add_andContext _localctx = new Add_andContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add_and);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(AND);
				setState(38);
				l_expression();
				setState(39);
				add_and();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class L_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LogicParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LogicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LogicParser.RPAREN, 0); }
		public TerminalNode VAR() { return getToken(LogicParser.VAR, 0); }
		public L_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).enterL_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicListener ) ((LogicListener)listener).exitL_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicVisitor ) return ((LogicVisitor<? extends T>)visitor).visitL_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_expressionContext l_expression() throws RecognitionException {
		L_expressionContext _localctx = new L_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_l_expression);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(NOT);
				setState(45);
				expression();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(LPAREN);
				setState(47);
				expression();
				setState(48);
				match(RPAREN);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(VAR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n8\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7-\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\66\n\b\3\b"+
		"\2\2\t\2\4\6\b\n\f\16\2\2\2\65\2\20\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2"+
		"\b\"\3\2\2\2\n$\3\2\2\2\f,\3\2\2\2\16\65\3\2\2\2\20\21\5\6\4\2\21\22\5"+
		"\4\3\2\22\3\3\2\2\2\23\24\7\3\2\2\24\25\5\6\4\2\25\26\5\4\3\2\26\31\3"+
		"\2\2\2\27\31\3\2\2\2\30\23\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\5"+
		"\n\6\2\33\34\5\b\5\2\34\7\3\2\2\2\35\36\7\4\2\2\36\37\5\n\6\2\37 \5\b"+
		"\5\2 #\3\2\2\2!#\3\2\2\2\"\35\3\2\2\2\"!\3\2\2\2#\t\3\2\2\2$%\5\16\b\2"+
		"%&\5\f\7\2&\13\3\2\2\2\'(\7\5\2\2()\5\16\b\2)*\5\f\7\2*-\3\2\2\2+-\3\2"+
		"\2\2,\'\3\2\2\2,+\3\2\2\2-\r\3\2\2\2./\7\6\2\2/\66\5\2\2\2\60\61\7\7\2"+
		"\2\61\62\5\2\2\2\62\63\7\b\2\2\63\66\3\2\2\2\64\66\7\t\2\2\65.\3\2\2\2"+
		"\65\60\3\2\2\2\65\64\3\2\2\2\66\17\3\2\2\2\6\30\",\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}