package com.mizuho.mockup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class MockupMizuhoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockupMizuhoApplication.class, args);
    }


}
