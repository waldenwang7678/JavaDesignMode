package com.walden.javadesignmode.mode.mediatormode;

/**
 * Created by wangjt on 2017/7/17.
 * 同事类1
 */

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自己的方法
     */
    public void selfMethod2() {

    }

    /**
     * 要依赖colleague类才能处理的方法
     */
    public void depMethod2() {
        super.mediator.dosomething2();
    }
}
