package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 * 抽象状态类
 */

public abstract class LiftState {
    protected MyContext context;
    public int liftState;

    public void setContext(MyContext context) {
        this.context = context;
    }

    public int getListState() {
        return liftState;
    }

    public void setListState(int liftState) {
        this.liftState = liftState;
    }

    public abstract String open();

    public abstract String close();

    public abstract String run();

    public abstract String stop();
}

