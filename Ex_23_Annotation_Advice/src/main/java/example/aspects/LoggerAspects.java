package example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspects {

    //private static final Log log = LogFactory.getLog(LoggerAspect.class);
    private Logger logger=Logger.getLogger(LoggerAspects.class.getName());

    @Around("execution(* com.example.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable
    {
        logger.info(joinPoint.getSignature().toString()+"Method Excecution Start");
        Instant start=Instant.now();
        Object result=joinPoint.proceed();
        Instant finish=Instant.now();
        long timeElapsed= Duration.between(start,finish).toMillis();
        logger.info("Time took for the completion of the method : "+timeElapsed);
        logger.info(joinPoint.getSignature().toString()+"Method Excecution Ends");
        return result;
    }

    @AfterThrowing(value="execution(* com.example.service.*.*(..))",throwing = "ex")
    public void afterException(JoinPoint jointPoint,Exception ex)
    {
        logger.log(Level.SEVERE,jointPoint.getSignature()+"An Exception Occured with Message"+ex.getMessage());
    }


    @AfterReturning(value = "execution(* com.example.service.*.*(..))",returning = "retval")
    public void afterReturning(JoinPoint jointPoint,Object retval)
    {
        logger.log(Level.INFO,jointPoint.getSignature()+"Method Execution successfully completed");
    }

   /* @Around("@annotation(example.interfaces.LogAspect)")
    public Object logAnnotation(ProceedingJoinPoint joinPoint) throws Throwable
    {
        logger.info(joinPoint.getSignature().toString()+"Method Execution Start");
        Instant start=Instant.now();
        Object result=joinPoint.proceed();
        Instant finish=Instant.now();
        long timeElapsed= Duration.between(start,finish).toMillis();
        logger.info("Time took for the completion of the method : "+timeElapsed);
        logger.info(joinPoint.getSignature().toString()+"Method Execution Ends");
        return result;
    }*/
}
