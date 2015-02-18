package com.thoughtworks.jj.twdsl.rest;

import com.thoughtworks.jj.twdsl.compiler.TwDslCompiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/twdsl/editor")
public class TwDslEditorResource {

    private com.thoughtworks.jj.twdsl.compiler.TwDslCompiler twDslCompiler;

    @Autowired
    public TwDslEditorResource(TwDslCompiler twDslCompiler) {
        this.twDslCompiler = twDslCompiler;
    }

    @RequestMapping(method = POST)
    public HttpEntity<String> process(@RequestBody String content){
        try {
            twDslCompiler.compileAndRun(content);
            return new ResponseEntity<>(OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
    }

}
