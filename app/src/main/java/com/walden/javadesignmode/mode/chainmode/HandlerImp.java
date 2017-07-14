package com.walden.javadesignmode.mode.chainmode;

/**
 * Created by walden on 2017/7/14.
 */

public abstract class HandlerImp implements IHandler {

    private int level = 0;
    private HandlerImp nextHandler;

    public HandlerImp(int level) {
        this.level = level;
    }

    @Override
    public String handMessage(IWoman woman) {
        if (woman.getType() == this.level) {
            return this.response(woman);
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.handMessage(woman);
            } else {
                return woman.getRequest() + "不用问了， 您自便吧";
            }
        }
    }

    public void setNext(HandlerImp imp) {
        this.nextHandler = imp;
    }

    public abstract String response(IWoman woman);
}
