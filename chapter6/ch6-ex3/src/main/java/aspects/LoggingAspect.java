package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    String methodName = joinPoint.getSignature().getName();
    Object[] arguments = joinPoint.getArgs();
    logger.info("Method " + methodName + "with arguments " + Arrays.asList(arguments) + "should execute");
    Comment comment = new Comment();
    comment.setAuthor("Aspect");
    comment.setText("LOL BITCH I AM ASPECT");
    Object[] newArgs = {comment};
    Object returnedByMethod = joinPoint.proceed(newArgs);
    logger.info("Method executed and returned:" + returnedByMethod);
    return "FAILED";
    }
}
