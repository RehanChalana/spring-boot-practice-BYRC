package com.rehan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import model.Comment;
import services.CommentService;


public class Main {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       CommentService CommentService = context.getBean(CommentService.class);
       Comment comment = new Comment();
       comment.setAuthor("Rehan Chalana");
       comment.setText("see you at the moon");
       CommentService.publishComment(comment);

    }
}