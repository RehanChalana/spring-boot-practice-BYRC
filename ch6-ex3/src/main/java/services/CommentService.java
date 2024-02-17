package services;

import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public String publishComment(Comment comment) {
        logger.info(comment.getAuthor()+":"+comment.getText() + " got published ");
        return "SUCCESS";

    }
}
