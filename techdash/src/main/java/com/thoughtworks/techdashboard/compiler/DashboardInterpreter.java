package com.thoughtworks.techdashboard.compiler;

import com.thoughtworks.techdashboard.antlr.DashboardBaseVisitor;
import com.thoughtworks.techdashboard.antlr.DashboardParser;
import com.thoughtworks.techdashboard.domain.Account;
import com.thoughtworks.techdashboard.domain.City;
import com.thoughtworks.techdashboard.domain.Dashboard;
import com.thoughtworks.techdashboard.domain.Project;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.stream.Collectors;

public class DashboardInterpreter extends DashboardBaseVisitor<Void> {
  private Dashboard dashboard;
  private City lastCity;
  private Account lastAccount;
  private Project lastProject;

  public DashboardInterpreter() {
    dashboard = new Dashboard();
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  @Override
  public Void visitCity(@NotNull DashboardParser.CityContext ctx) {
    City city = new City(ctx.ID().getText().trim());
    dashboard.getCities().add(city);
    lastCity = city;
    return super.visitCity(ctx);
  }

  @Override
  public Void visitAccount(@NotNull DashboardParser.AccountContext ctx) {
    Account account = new Account(ctx.ID().getText());
    lastCity.getAccounts().add(account);
    lastAccount = account;
    return super.visitAccount(ctx);
  }

  @Override
  public Void visitProject(@NotNull DashboardParser.ProjectContext ctx) {
    Project project = new Project(ctx.ID().getText());
    lastAccount.getProjects().add(project);
    lastProject = project;
    return super.visitProject(ctx);
  }

  @Override
  public Void visitTechLead(@NotNull DashboardParser.TechLeadContext ctx) {
    List<String> techLeads = ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList());
    lastProject.getTechLeads().addAll(techLeads);
    return super.visitTechLead(ctx);
  }

  @Override
  public Void visitTechnology(@NotNull DashboardParser.TechnologyContext ctx) {
    List<String> technologies = ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList());
    lastProject.getTechnologies().addAll(technologies);
    return super.visitTechnology(ctx);
  }

  @Override
  public Void visitBusinessDomain(@NotNull DashboardParser.BusinessDomainContext ctx) {
    List<String> businessDomains = ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList());
    lastProject.getBusinessDomains().addAll(businessDomains);
    return super.visitBusinessDomain(ctx);
  }

}
