package com.xueguoxue.myaop.chain;

import java.util.List;

public class Chain {
    private List<ChainHandler> handlers;

    public Chain(List<ChainHandler> handlers) {
        this.handlers = handlers;
    }

    private int index = 0;

    public void proceed()
    {
       if(index >= handlers.size()) {
           return;
       }
       handlers.get(index++).execute(this);
    }
}
