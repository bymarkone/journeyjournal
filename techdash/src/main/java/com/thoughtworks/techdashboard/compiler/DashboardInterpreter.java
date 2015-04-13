package com.thoughtworks.techdashboard.compiler;

import com.thoughtworks.techdashboard.antlr.DashboardBaseVisitor;
import com.thoughtworks.techdashboard.antlr.DashboardParser;
import com.thoughtworks.techdashboard.domain.Account;
import com.thoughtworks.techdashboard.domain.City;
import com.thoughtworks.techdashboard.domain.Dashboard;
import org.antlr.v4.runtime.misc.NotNull;

public class DashboardInterpreter extends DashboardBaseVisitor<Void> {
  private Dashboard dashboard;
  private City lastCity;

  public DashboardInterpreter() {
    dashboard = new Dashboard();
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  @Override
  public Void visitCity(@NotNull DashboardParser.CityContext ctx) {
    City city = new City(ctx.ID().getText());
    dashboard.getCities().add(city);
    lastCity = city;
    return super.visitCity(ctx);
  }

  @Override
  public Void visitAccount(@NotNull DashboardParser.AccountContext ctx) {
    Account account = new Account(ctx.ID().getText());
    lastCity.getAccounts().add(account);
    return super.visitAccount(ctx);
  }

  @Override
  public Void visitProject(@NotNull DashboardParser.ProjectContext ctx) {
    return super.visitProject(ctx);
  }

  @Override
  public Void visitTechLead(@NotNull DashboardParser.TechLeadContext ctx) {
    return super.visitTechLead(ctx);
  }

  @Override
  public Void visitTechnology(@NotNull DashboardParser.TechnologyContext ctx) {
    return super.visitTechnology(ctx);
  }

  @Override
  public Void visitBusinessDomain(@NotNull DashboardParser.BusinessDomainContext ctx) {
    return super.visitBusinessDomain(ctx);
  }

}
