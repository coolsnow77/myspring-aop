package com.xueguoxue.myaop.chain;

public abstract class Handler {

    protected abstract void handleProcess();

    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void execute()
    {
        handleProcess();
        if(successor != null){
            successor.execute();
        }
    }
}
