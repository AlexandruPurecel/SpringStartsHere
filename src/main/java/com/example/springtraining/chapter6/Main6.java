package com.example.springtraining.chapter6;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main6 {

    private static Logger logger = Logger.getLogger(Main6.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig6.class);
        var service = c.getBean(CommentService6.class);

        Comment6 comment = new Comment6();
        comment.setText("Abracadabra");
        comment.setAuthor("miau");

       service.toLog(comment);


    }
}
