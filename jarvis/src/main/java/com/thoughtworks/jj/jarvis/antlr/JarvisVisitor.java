// Generated from /Users/aarni/Documents/tw/journeyjournal/jarvis/src/main/antlr/Jarvis.g4 by ANTLR 4.2.2
package com.thoughtworks.jj.jarvis.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JarvisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JarvisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JarvisParser#greatFeedbackPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreatFeedbackPhrase(@NotNull JarvisParser.GreatFeedbackPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#topicPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopicPhrase(@NotNull JarvisParser.TopicPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#goalsStartPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoalsStartPhrase(@NotNull JarvisParser.GoalsStartPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#missionDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissionDescription(@NotNull JarvisParser.MissionDescriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#highlightPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighlightPhrase(@NotNull JarvisParser.HighlightPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#goalPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoalPhrase(@NotNull JarvisParser.GoalPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#capabilityPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapabilityPhrase(@NotNull JarvisParser.CapabilityPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(@NotNull JarvisParser.PhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#feedbackPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeedbackPhrase(@NotNull JarvisParser.FeedbackPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#fromPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromPhrase(@NotNull JarvisParser.FromPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#phrases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrases(@NotNull JarvisParser.PhrasesContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#howToPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHowToPhrase(@NotNull JarvisParser.HowToPhraseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#constructiveFeedbackPhase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructiveFeedbackPhase(@NotNull JarvisParser.ConstructiveFeedbackPhaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link JarvisParser#itemPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemPhrase(@NotNull JarvisParser.ItemPhraseContext ctx);
}