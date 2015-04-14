// Generated from /Users/msilveir/personal/Dropbox/marcos/source/journeyjournal/techdash/src/main/antlr/Dashboard.g4 by ANTLR 4.2.2
package com.thoughtworks.techdashboard.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DashboardParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DashboardVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DashboardParser#city}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCity(@NotNull DashboardParser.CityContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull DashboardParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(@NotNull DashboardParser.ProjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#techLead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTechLead(@NotNull DashboardParser.TechLeadContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#businessDomain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBusinessDomain(@NotNull DashboardParser.BusinessDomainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#technology}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTechnology(@NotNull DashboardParser.TechnologyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#lines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLines(@NotNull DashboardParser.LinesContext ctx);

	/**
	 * Visit a parse tree produced by {@link DashboardParser#account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount(@NotNull DashboardParser.AccountContext ctx);
}