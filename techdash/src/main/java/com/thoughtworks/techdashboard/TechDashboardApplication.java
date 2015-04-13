package com.thoughtworks.techdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TechDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechDashboardApplication.class, args);
    }

}
