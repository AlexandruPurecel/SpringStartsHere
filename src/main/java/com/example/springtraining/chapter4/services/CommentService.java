package com.example.springtraining.chapter4.services;

import com.example.springtraining.chapter4.Comment;
import com.example.springtraining.chapter4.proxies.CommentProxy;
import com.example.springtraining.chapter4.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentProxy commentProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentProxy commentProxy) {
        this.commentRepository = commentRepository;
        this.commentProxy = commentProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentProxy.sendComment(comment);
    }
}
