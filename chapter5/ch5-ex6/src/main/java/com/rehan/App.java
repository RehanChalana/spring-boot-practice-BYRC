package com.rehan;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

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
        UserService cs2 = context.getBean(UserService.class);
        System.out.println(cs1.getCommentRepository()==cs2.getCommentRepository());
    }
}
