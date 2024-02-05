package com.rehan;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);
        System.out.println(cs1 == cs2);
    }
}
