package com.xueguoxue.myaop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ObjectAspsctConfig {

//    @Pointcut("this(com.xueguoxue.myaop.log.Loggable)")
//    @Pointcut("target(com.xueguoxue.myaop.log.Loggable)")
    @Pointcut("bean(LogService)")
    public void matchCondition(){}

    @Before("matchCondition()")
    public void before(){
        System.out.println("");
        System.out.println("### before ###");
    }
}
