package com.xueguoxue.myaop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAspectConfig {

    @Pointcut("execution(public void com.xueguoxue.myaop.service.*Service.*(..))")
    public void matchCondition(){}

    @Before("matchCondition()")
    public void before(){
        System.out.println("");
        System.out.println("before execution aspect ...");
    }
}
