package com.example.springtraining.chapter2;

import com.example.springtraining.model.Parrot;
import com.example.springtraining.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.springtraining")
public class ProjectConfig2 {

    @Bean
    Parrot parrot1(){
        var p  =  new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Primary
    @Bean
    Parrot parrot2(){
        var p2 =  new Parrot();
        p2.setName("Miki");
        return p2;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }


}
