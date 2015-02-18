package com.thoughtworks.jj.twdsl.rest;

import com.thoughtworks.jj.twdsl.domain.Fact;
import com.thoughtworks.jj.twdsl.domain.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/api/jj/fact")
@Controller
public class FactResource {

    @RequestMapping(method = GET)
    public ResponseEntity<List<Fact>> list() {
        return new ResponseEntity<>(Repository.facts, HttpStatus.OK);
    }

}
