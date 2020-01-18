package com.ted.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class TedApplication {
    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(TedApplication.class);
//        application.run(args);
        SpringApplication.run(TedApplication.class, args);
    }
}

