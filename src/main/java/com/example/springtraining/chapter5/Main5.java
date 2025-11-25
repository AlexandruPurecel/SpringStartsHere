package com.example.springtraining.chapter5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {

    public static void main(String[] args) {


        var c = new AnnotationConfigApplicationContext(ProjectConfig5.class);

        var cs1 = c.getBean(CommentServ.class);
        var cs2 = c.getBean(CommentServ.class);
        boolean b1 = cs1 == cs2;

        System.out.println(b1);
    }
}
