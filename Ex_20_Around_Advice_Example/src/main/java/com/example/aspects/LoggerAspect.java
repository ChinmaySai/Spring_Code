package com.example.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {

    //private static final Log log = LogFactory.getLog(LoggerAspect.class);
    private Logger logger=Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
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

}
