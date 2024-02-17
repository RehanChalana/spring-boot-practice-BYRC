package com.rehan;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService cs = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setAuthor("RC");
        comment.setText("Tea is better than coffee");
        String value = cs.publishComment(comment);
        logger.info(value);
    }
}
