package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 * 具体实现的状态类 ，处理了状态切换时候应该有的动作
 */

public class OpenState extends LiftState {
    @Override
    public String open() {
        return "电梯门开启";
    }

    @Override
    public String close() {
        super.context.setLifeState(MyContext.closeState);
        return super.context.getLiftState().close();
    }

    @Override
    public String run() {
        return "";
    }

    @Override
    public String stop() {
        return "";
    }
}
