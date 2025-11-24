package com.example.springtraining.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter

public class PersonCh3 {

    private String name = "Ella";
    private final Parrot parrot;

    public PersonCh3(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }


}

