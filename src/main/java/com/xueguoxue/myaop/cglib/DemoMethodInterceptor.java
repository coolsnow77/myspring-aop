package com.xueguoxue.myaop.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DemoMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("## begin in cglib ##");
        Object result = null;
        try{
            result = proxy.invokeSuper(obj, args);
        }catch (Exception e){
            System.out.println("get ex:" + e.getMessage());
            throw  e;
        }finally {
            System.out.println("## after cglib..");
        }
        return result;
    }
}
