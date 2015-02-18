package com.thoughtworks.jj.jarvis.compiler;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JarvisCompilerTest {

    @Test
    public void shouldCompileFullFile() throws IOException, URISyntaxException {

        List<String> strings = Files.readAllLines(Paths.get("/Users/msilveir/Documents/script.jy"));
        String script = strings.stream().reduce("", (accumulator, item) -> accumulator.concat(item.concat("\n")));
        String result = new JarvisCompiler().compileAndRun(script);
        System.out.println("result = " + result);

    }

}
