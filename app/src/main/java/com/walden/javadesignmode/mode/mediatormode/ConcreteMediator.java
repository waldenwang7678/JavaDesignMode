package com.walden.javadesignmode.mode.mediatormode;

/**
 * Created by wangjt on 2017/7/17.
 * 具体抽象类
 */

public class ConcreteMediator extends Mediator {
    @Override
    public void dosomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void dosomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
