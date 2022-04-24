package com.soumyadeep.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

    @Before("execution(* com.soumyadeep.spring.springaop.ProductServiceImpl.multiply(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before calling the method!!");
    }

    @After("execution(* com.soumyadeep.spring.springaop.ProductServiceImpl.multiply(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After the method invocation!!");
    }
}