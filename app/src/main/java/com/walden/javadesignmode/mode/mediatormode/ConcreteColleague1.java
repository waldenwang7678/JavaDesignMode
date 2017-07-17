package com.walden.javadesignmode.mode.mediatormode;

/**
 * Created by wangjt on 2017/7/17.
 * 同事类1
 */

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自己的方法
     */
    public void selfMethod1() {

    }

    /**
     * 要依赖的方法 ， 依赖其他coleague类
     */
    public void depMethod1() {
        super.mediator.dosomething1();
    }
}
