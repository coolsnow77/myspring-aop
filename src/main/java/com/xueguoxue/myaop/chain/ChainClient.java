package com.xueguoxue.myaop.chain;

import java.util.Arrays;
import java.util.List;

public class ChainClient {
    static class ChainHandlerA extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by chain A");
        }
    }

    static class ChainHandlerB extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handler by B");
        }
    }

    static class ChainHandlerC extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handler by C");
        }
    }

    public static void main(String[] args){
        List<ChainHandler> chainHandlerList = Arrays.asList(
                new ChainHandlerA(), new ChainHandlerB(), new ChainHandlerC()
                );
        Chain chain = new Chain(chainHandlerList);
        chain.proceed();
    }
}
