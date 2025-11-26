package com.example.springtraining.chapter6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.example.springtraining.chapter6")
@EnableAspectJAutoProxy
public class ProjectConfig6 {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
