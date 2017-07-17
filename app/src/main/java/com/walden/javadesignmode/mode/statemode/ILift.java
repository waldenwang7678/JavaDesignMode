package com.walden.javadesignmode.mode.statemode;

/**
 * Created by wangjt on 2017/7/17.
 * 抽象状态
 */

public interface ILift {
    public final static int OPEN_STATE = 0;
    public final static int CLOSE_STATE = 1;
    public final static int RUN_STATE = 2;
    public final static int STOP_STATE = 3;

    public void setState(int state);

    public String open();

    public String close();

    public String run();

    public String stop();

}
