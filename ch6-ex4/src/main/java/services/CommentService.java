package services;

import aspects.ToLog;
import model.Comment;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing Comment : "+comment.getText());
        return "SUCCESS";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("deleting comment :"+comment.getText());
        return "SUCCESS";
    }

    public String editComment(Comment comment) {
        logger.info("editing comment :" + comment.getText());
        return "SUCCESS";
    }
}
