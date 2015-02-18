package com.thoughtworks.jj.jarvis.rest;

import com.thoughtworks.jj.jarvis.compiler.JarvisCompiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/jarvis/editor")
public class JarvisEditorResource {

    private JarvisCompiler jarvisCompiler;

    @Autowired
    public JarvisEditorResource(JarvisCompiler jarvisCompiler) {
        this.jarvisCompiler = jarvisCompiler;
    }

    @RequestMapping(method = POST)
    public ResponseEntity<String> process(@RequestBody String content){
        String machineCode = jarvisCompiler.compileAndRun(content);
        System.out.println(machineCode);
        return new ResponseEntity<>(machineCode, OK);
    }

}
