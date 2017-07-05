package com.walden.javadesignmode.mode.templatemode;

/**
 * Created by walden on 2017/7/5.
 */

public class CarH1Model extends CarModel {

    private boolean isAlarm = true; //默认 true

    @Override
    protected String start() {
        return "start";
    }

    @Override
    protected String alarm() {
        return "alarm";
    }

    @Override
    protected String engineBoom() {
        return "engineBoom";
    }

    @Override
    protected String stop() {
        return "stop";
    }

    @Override
    protected boolean isAlarm() {
        return isAlarm;
    }

    public void setAlarm(boolean b) {
        isAlarm = b;
    }
}
