package com.xueguoxue.myaop.pattern;

public class Proxy implements Subject {

    private  RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy start...");
        try{
            this.realSubject.request();
        }catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
            throw e;

        } finally {
            System.out.println("### after .####");
        }
    }

    @Override
    public void hello() {
        realSubject.hello();
    }
}
