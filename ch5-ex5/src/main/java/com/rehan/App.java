package com.rehan;

import config.ProjectConfig;
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
        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);
        System.out.println(cs1==cs2);
    }
}
