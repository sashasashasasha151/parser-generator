// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr/PrefixGrammar.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefixGrammarParser}.
 */
public interface PrefixGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PrefixGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PrefixGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PrefixGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PrefixGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(PrefixGrammarParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(PrefixGrammarParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(PrefixGrammarParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(PrefixGrammarParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void enterElse_expression(PrefixGrammarParser.Else_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void exitElse_expression(PrefixGrammarParser.Else_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PrefixGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PrefixGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(PrefixGrammarParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(PrefixGrammarParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PrefixGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PrefixGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#logic_value}.
	 * @param ctx the parse tree
	 */
	void enterLogic_value(PrefixGrammarParser.Logic_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#logic_value}.
	 * @param ctx the parse tree
	 */
	void exitLogic_value(PrefixGrammarParser.Logic_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operation(PrefixGrammarParser.Logic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operation(PrefixGrammarParser.Logic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#int_value}.
	 * @param ctx the parse tree
	 */
	void enterInt_value(PrefixGrammarParser.Int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#int_value}.
	 * @param ctx the parse tree
	 */
	void exitInt_value(PrefixGrammarParser.Int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#int_operations}.
	 * @param ctx the parse tree
	 */
	void enterInt_operations(PrefixGrammarParser.Int_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#int_operations}.
	 * @param ctx the parse tree
	 */
	void exitInt_operations(PrefixGrammarParser.Int_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefixGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(PrefixGrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefixGrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(PrefixGrammarParser.CompareContext ctx);
}