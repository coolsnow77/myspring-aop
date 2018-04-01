package com.xueguoxue.myaop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  //表明注解
@Component //采用spring 托管
public class PkgTypeAspectConfig {

//    @Pointcut("within(com.xueguoxue.myaop.service.ProductService)")
    @Pointcut("within(com.xueguoxue.myaop.service.sub.*)")
    public void matchType(){}

    @Before("matchType()")
    public void before(){
        System.out.println("");
        System.out.println("#### before ######");
    }
}
