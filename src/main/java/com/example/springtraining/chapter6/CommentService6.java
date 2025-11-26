package com.example.springtraining.chapter6;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService6 {

    private Logger logger = Logger.getLogger(CommentService6.class.getName());

    public void publishComment(Comment6 comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

    @toLog
    public void toLog(Comment6 comment) {
        logger.info("Deleting comment:" + comment.getText());
    }

    public String returnValue(Comment6 comment) {
        logger.info("Returning comment:" + comment.getText());
        return "SUCCESS";
    }

    public void editComment(Comment6 comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
