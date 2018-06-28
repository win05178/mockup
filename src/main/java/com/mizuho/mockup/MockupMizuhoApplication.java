package com.mizuho.mockup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;


@Configuration
@SpringBootApplication
public class MockupMizuhoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockupMizuhoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean  filterRegistration(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new testFilter());
        bean.addUrlPatterns("*");
        return bean;

    }

}
