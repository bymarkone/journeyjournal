package com.thoughtworks.jj.jarvis.compiler;

import com.thoughtworks.jj.jarvis.antlr.JarvisLexer;
import com.thoughtworks.jj.jarvis.antlr.JarvisParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.stereotype.Component;

@Component
public class JarvisCompiler {

    public String compileAndRun(String content) {
        JarvisParser.PhrasesContext phrasesContext = parse(content);
        StringBuilder script = interpret(phrasesContext);
        return script.toString();
    }

    public JarvisParser.PhrasesContext parse(String content) {
        ANTLRInputStream antlrStringStream = new ANTLRInputStream(content);
        JarvisLexer twDslLexer = new JarvisLexer(antlrStringStream);
        CommonTokenStream tokenStream = new CommonTokenStream(twDslLexer);

        JarvisParser twDslParser = new JarvisParser(tokenStream);
        return twDslParser.phrases();
    }

    private StringBuilder interpret(JarvisParser.PhrasesContext phrasesContext) {
        JarvisInterpreter jarvisInterpreter = new JarvisInterpreter();
        jarvisInterpreter.visit(phrasesContext);
        return jarvisInterpreter.getContent();
    }

}
