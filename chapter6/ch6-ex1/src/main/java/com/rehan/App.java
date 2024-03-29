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
        CommentService cs = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("RC");
        comment.setText("Tea is better than coffee");
        cs.publishComment(comment);
    }
}
