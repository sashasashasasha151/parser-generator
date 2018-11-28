// Generated from /home/sasha/Code/MT/trans/src/main/java/antlr/PrefixGrammar.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrefixGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrefixGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PrefixGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PrefixGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(PrefixGrammarParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(PrefixGrammarParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#else_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_expression(PrefixGrammarParser.Else_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PrefixGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(PrefixGrammarParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PrefixGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#logic_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_value(PrefixGrammarParser.Logic_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#logic_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operation(PrefixGrammarParser.Logic_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_value(PrefixGrammarParser.Int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#int_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_operations(PrefixGrammarParser.Int_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefixGrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(PrefixGrammarParser.CompareContext ctx);
}