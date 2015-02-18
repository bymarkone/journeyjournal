package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.antlr.TwDslLexer;
import com.thoughtworks.jj.twdsl.antlr.TwDslParser;
import com.thoughtworks.jj.twdsl.tokens.PhrasesToken;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TwDslCompiler {

    private TwDslRunner twDslRunner;

    @Autowired
    public TwDslCompiler(TwDslRunner twDslRunner) {
        this.twDslRunner = twDslRunner;
    }

    public void compileAndRun(String content) {
        TwDslParser.PhrasesContext phrasesContext = parse(content);
        PhrasesToken phrasesToken = interpret(phrasesContext);
        twDslRunner.run(phrasesToken);
    }

    private TwDslParser.PhrasesContext parse(String content) {
        ANTLRInputStream antlrStringStream = new ANTLRInputStream(content);
        TwDslLexer twDslLexer = new TwDslLexer(antlrStringStream);
        CommonTokenStream tokenStream = new CommonTokenStream(twDslLexer);

        TwDslParser twDslParser = new TwDslParser(tokenStream);
        return twDslParser.phrases();
    }

    private PhrasesToken interpret(TwDslParser.PhrasesContext phrasesContext) {
        TwDslInterpreter twDslInterpreter = new TwDslInterpreter();
        twDslInterpreter.visit(phrasesContext);
        return twDslInterpreter.getPhrasesToken();
    }

}
