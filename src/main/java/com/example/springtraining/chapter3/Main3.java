package com.example.springtraining.chapter3;

import com.example.springtraining.model.Parrot;
import com.example.springtraining.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {

    public static void main(String[] args) {

        //Creating variable in Bean function parameter
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(
                "Person's name: " + person.getName());

        System.out.println(
                "Parrot's name: " + parrot.getName());

        System.out.println(
                "Person's parrot: " + person.getParrot());

        //Using autowired over field
        var context1 = new AnnotationConfigApplicationContext(ProjectConfigAutowired.class);
        Person person1 = context1.getBean(Person.class);
        System.out.println("Person's name: " + person1.getName());
        System.out.println("Person's parrot: " + person1.getParrot());
        System.out.println(person1.getParrot().getName());
    }

}
