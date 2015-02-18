package com.thoughtworks.jj.twdsl.rest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class TwDslEditorResourceTest {

    @Mock
    private com.thoughtworks.jj.twdsl.compiler.TwDslCompiler twDslCompiler;

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void compileText() throws Exception {
        String text = "Some text to be compiled.";
        new TwDslEditorResource(twDslCompiler).process(text);
        verify(twDslCompiler).compileAndRun(text);
    }
}