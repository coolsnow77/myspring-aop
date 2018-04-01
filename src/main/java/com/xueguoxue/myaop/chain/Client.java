package com.xueguoxue.myaop.chain;

public class Client {
    static class HandlerA extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by A");
        }
    }

    static class HandlerB extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by B");
        }
    }

    static class HandlerC extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by C");
        }
    }

    public static void main(String[] args){
        HandlerA a = new HandlerA();
        HandlerB b = new HandlerB();
        HandlerC c = new HandlerC();
        a.setSuccessor(b);
        b.setSuccessor(c);
        a.execute();
    }
}
