package com.sds.vuestarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties({ LiquibaseProperties.class })
public class Application extends SpringBootServletInitializer {
    static final Logger L = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        // 1. run spring application
        SpringApplication.run(Application.class, args);
        // x. Logging
        L.info("-----------------------------------------------------------");
        L.info("      Welcome to Vue Starter.");
        L.info("      Application start successfully.");
        //L.info("      [[IP]]/[[port]].");
        L.info("-----------------------------------------------------------");
    }
}
