package org.example;

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
        CommentService cs = context.getBean(CommentService.class);
        comment.setText("TEA > COFFEE");
        comment.setAuthor("RC");
        cs.publishComment(comment);
        cs.deleteComment(comment);
    }
}
