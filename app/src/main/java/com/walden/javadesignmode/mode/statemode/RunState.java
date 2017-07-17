package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 */

public class RunState extends LiftState {
    @Override
    public String open() {
        return "";
    }

    @Override
    public String close() {
        return "";
    }

    @Override
    public String run() {
        return "电梯上下运行";
    }

    @Override
    public String stop() {
        super.context.setLifeState(MyContext.stopState);
        return super.context.getLiftState().stop();
    }
}
