package com.xueguoxue.myaop.pattern;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject execute...");
    }

    @Override
    public void hello() {
        System.out.println("hello ...");
    }
}
