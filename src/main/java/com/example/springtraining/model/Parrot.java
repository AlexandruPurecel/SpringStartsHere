package com.example.springtraining.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }

    @Override
    public String toString() {
        return "Parrot [name=" + name + "]";
    }
}
