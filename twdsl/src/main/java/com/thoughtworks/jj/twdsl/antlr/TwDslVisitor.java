// Generated from /Users/msilveir/personal/Dropbox/marcos/source/journeyjournal/twdsl/src/main/antlr/TwDsl.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.twdsl.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TwDslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TwDslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TwDslParser#factTopic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactTopic(@NotNull TwDslParser.FactTopicContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull TwDslParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(@NotNull TwDslParser.Property_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#genericPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericPhrase(@NotNull TwDslParser.GenericPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#end_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_line(@NotNull TwDslParser.End_lineContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#factPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactPhrase(@NotNull TwDslParser.FactPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(@NotNull TwDslParser.Property_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(@NotNull TwDslParser.NamesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(@NotNull TwDslParser.ConjunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(@NotNull TwDslParser.PhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#feedbackPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedbackPhrase(@NotNull TwDslParser.FeedbackPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#factTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactTime(@NotNull TwDslParser.FactTimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull TwDslParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull TwDslParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#phrases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrases(@NotNull TwDslParser.PhrasesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(@NotNull TwDslParser.PropertiesContext ctx);

	/**
	 * Visit a parse tree produced by {@link TwDslParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull TwDslParser.ObjectContext ctx);
}