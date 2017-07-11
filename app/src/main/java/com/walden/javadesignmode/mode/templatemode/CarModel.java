package com.walden.javadesignmode.mode.templatemode;

/**
 * Created by walden on 2017/7/5.
 */

public abstract class CarModel {
    protected abstract String start();

    protected abstract String alarm();

    protected abstract String engineBoom();

    protected abstract String stop();

    protected boolean isAlarm() {
        return true;
    }

    final public String run() {

        StringBuilder builder = new StringBuilder();

        builder.append(start() + "\n");
        if (isAlarm()) {
            builder.append(alarm() + "\n");
        }
        builder.append(engineBoom() + "\n");
        builder.append(stop() + "\n");
        return builder.toString();
    }
}
