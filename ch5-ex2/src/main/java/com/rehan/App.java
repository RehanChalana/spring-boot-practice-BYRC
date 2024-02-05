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
        CommentService s1 = context.getBean(CommentService.class);
        UserService s2 = context.getBean(UserService.class);
        System.out.println(s1.getCommentRepository()==s2.getCommentRepository());
    }
}
