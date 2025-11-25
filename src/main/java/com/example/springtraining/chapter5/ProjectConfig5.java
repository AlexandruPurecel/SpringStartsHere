package com.example.springtraining.chapter5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig5 {

    @Bean
    public CommentServ commentServ() {
        return new CommentServ();
    }
}
