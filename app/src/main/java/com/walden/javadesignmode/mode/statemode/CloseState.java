package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 */

public class CloseState extends LiftState {
    @Override
    public String open() {
        super.context.setLifeState(MyContext.openState);

        return super.context.getLiftState().open();
    }

    @Override
    public String close() {
        return "电梯门关闭~";
    }

    @Override
    public String run() {
        super.context.setLifeState(MyContext.runstate);
        return super.context.getLiftState().run();
    }

    @Override
    public String stop() {
        super.context.setLifeState(MyContext.stopState);

        return super.context.getLiftState().stop();
    }
}
