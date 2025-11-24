package com.example.springtraining.chapter2;

import com.example.springtraining.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Parrot parrot = context.getBean("parrot", Parrot.class);
        System.out.println(parrot.getName());

        Parrot parrot2 = context.getBean("parrot2", Parrot.class);
        System.out.println(parrot2.getName());

        Parrot parrot3 = context.getBean("parrot3", Parrot.class);
        System.out.println(parrot3.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());

        Parrot pa= new Parrot();
        pa.setName("Kiki");

        Supplier<Parrot> supplier = () -> p;
        context.registerBean("parrot1", Parrot.class, supplier);

        Parrot parrot1 = context.getBean(Parrot.class);
        System.out.println(parrot1.getName());

        context.registerBean("parrot1", Parrot.class, supplier, bc -> bc.setPrimary(true));


    }
}
