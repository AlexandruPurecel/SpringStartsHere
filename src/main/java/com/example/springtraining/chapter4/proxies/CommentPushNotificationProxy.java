package com.example.springtraining.chapter4.proxies;

import com.example.springtraining.chapter4.Comment;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.getText());
    }
}
