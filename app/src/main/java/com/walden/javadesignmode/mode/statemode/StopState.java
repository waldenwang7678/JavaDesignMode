package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 */

public class StopState extends LiftState {
    @Override
    public String open() {
        super.context.setLifeState(MyContext.openState);
        return super.context.getLiftState().open();
    }

    @Override
    public String close() {
        return null;
    }

    @Override
    public String run() {
        super.context.setLifeState(MyContext.runstate);
        return super.context.getLiftState().run();
    }

    @Override
    public String stop() {
        return "电梯停止了~";
    }
}
