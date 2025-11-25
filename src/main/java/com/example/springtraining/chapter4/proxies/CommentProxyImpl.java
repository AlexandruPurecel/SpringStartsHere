package com.example.springtraining.chapter4.proxies;

import com.example.springtraining.chapter4.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class CommentProxyImpl implements CommentProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment: " + comment.getText());
    }

}
