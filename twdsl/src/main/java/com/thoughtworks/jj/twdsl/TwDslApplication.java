package com.thoughtworks.jj.twdsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@ComponentScan
@EnableAutoConfiguration
public class TwDslApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwDslApplication.class, args);
    }

}
