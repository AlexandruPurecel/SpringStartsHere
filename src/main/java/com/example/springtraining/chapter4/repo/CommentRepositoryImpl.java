package com.example.springtraining.chapter4.repo;

import com.example.springtraining.chapter4.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentRepositoryImpl implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing comment: " + comment.getText());
    }
}
