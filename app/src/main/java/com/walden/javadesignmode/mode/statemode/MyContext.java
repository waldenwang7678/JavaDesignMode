package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 */

public class MyContext {
    public static final OpenState openState = new OpenState();
    public static final CloseState closeState = new CloseState();
    public static final RunState runstate = new RunState();
    public static final StopState stopState = new StopState();
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLifeState(LiftState lifeState) {
        this.liftState = lifeState;
        this.liftState.setContext(this);
    }

    public String open() {
        return this.liftState.open();
    }

    public String close() {
        return this.liftState.close();
    }

    public String run() {
        return this.liftState.run();
    }

    public String stop() {
        return this.liftState.stop();
    }
}
