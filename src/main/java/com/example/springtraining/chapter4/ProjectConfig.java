package com.example.springtraining.chapter4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.example.springtraining.chapter4.proxies",
                "com.example.springtraining.chapter4.services",
                "com.example.springtraining.chapter4.repo"}
)
public class ProjectConfig {
}
