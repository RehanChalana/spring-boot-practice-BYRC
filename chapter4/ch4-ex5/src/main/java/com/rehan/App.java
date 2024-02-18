package com.rehan;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Comment comment = new Comment();
        comment.setAuthor("Rehan");
        comment.setText("where there is will there is chaa");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
