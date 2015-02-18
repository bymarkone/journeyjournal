package com.thoughtworks.twdsl.portal;

import com.thoughtworks.jj.jarvis.JarvisApplication;
import com.thoughtworks.jj.twdsl.TwDslApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan
@Import({ApplicationConfiguration.class, TwDslApplication.class, JarvisApplication.class})
public class Application {

    public static void main(String[] args)   {
        SpringApplication.run(Application.class, args);
    }

}
