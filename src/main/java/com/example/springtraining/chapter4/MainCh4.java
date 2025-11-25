package com.example.springtraining.chapter4;

import com.example.springtraining.chapter4.proxies.CommentProxyImpl;
import com.example.springtraining.chapter4.repo.CommentRepositoryImpl;
import com.example.springtraining.chapter4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainCh4 {

    public static void main(String[] args) {

//        var commentRepo = new CommentRepositoryImpl();
//        var commentProxy = new CommentProxyImpl();
//
//        var commentService = new CommentService(commentRepo, commentProxy);
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        var comment = new Comment();
        var commentService = context.getBean(CommentService.class);
        comment.setAuthor("Daniel");
        comment.setText("Bafta Dani");

        commentService.publishComment(comment);
    }
}
