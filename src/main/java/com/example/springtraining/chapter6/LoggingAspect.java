package com.example.springtraining.chapter6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
//    @Around("execution(* com.example.springtraining.chapter6.CommentService6*.*(..))")
//    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
//            logger.info("Method will execute");
//            joinPoint.proceed();
//            logger.info("Method will end");
//    }

    @Around("@annotation(toLog)")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {

        String methodName = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();

        logger.info("Method " + methodName + " executed with args: " + Arrays.toString(args));

        Object result = pjp.proceed(args);

        logger.info("Method " + methodName + " executed with result: " + result);

        return result;
    }


}


