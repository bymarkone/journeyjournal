package com.thoughtworks.jj.twdsl.compiler;

import com.thoughtworks.jj.twdsl.domain.Repository;
import com.thoughtworks.jj.twdsl.runtime.RuntimeCommandsConfiguration;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TwDslCompilerTest {

    @Test
    public void shouldCompileFullFile() throws IOException, URISyntaxException {

        List<String> strings = Files.readAllLines(Paths.get("/Users/msilveir/Documents/script2.jy"));
        String script = strings.stream().reduce("", (accumulator, item) -> accumulator.concat(item.concat("\n")));
        new TwDslCompiler(new TwDslRunner(new RuntimeCommandsConfiguration().runtimeCommandObserver())).compileAndRun(script);

        System.out.println("result = " + Repository.capabilities);

    }

}
