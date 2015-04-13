package com.thoughtworks.techdashboard.compiler;

import com.thoughtworks.techdashboard.antlr.DashboardLexer;
import com.thoughtworks.techdashboard.antlr.DashboardParser;
import com.thoughtworks.techdashboard.domain.Dashboard;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DashboardCompiler {

    public Dashboard compileAndRun(String content) {
        DashboardParser.LinesContext linesContext = parse(content);
        return interpret(linesContext);
    }

    private DashboardParser.LinesContext parse(String content) {
        ANTLRInputStream antlrStringStream = new ANTLRInputStream(content);
        DashboardLexer dashboardLexer = new DashboardLexer(antlrStringStream);
        CommonTokenStream tokenStream = new CommonTokenStream(dashboardLexer);

        DashboardParser dashboardParser = new DashboardParser(tokenStream);
        return dashboardParser.lines();
    }

    private Dashboard interpret(DashboardParser.LinesContext linesContext) {
        DashboardInterpreter dashboardInterpreter = new DashboardInterpreter();
        dashboardInterpreter.visit(linesContext);
        return dashboardInterpreter.getDashboard();
    }
}