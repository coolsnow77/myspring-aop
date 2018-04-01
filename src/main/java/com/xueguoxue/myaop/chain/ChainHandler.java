package com.xueguoxue.myaop.chain;

public abstract class ChainHandler {
    protected abstract void handleProcess();

    public void execute(Chain chain)
    {
        handleProcess();
        chain.proceed();
    }

}
