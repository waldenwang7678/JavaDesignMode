package com.walden.javadesignmode.mode.mediatormode;

/**
 * Created by wangjt on 2017/7/17.
 */

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
