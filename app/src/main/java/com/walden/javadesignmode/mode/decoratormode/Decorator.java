package com.walden.javadesignmode.mode.decoratormode;

/**
 * Created by walden on 2017/7/12.
 * 装饰模式 ,抽象装饰类
 */

public abstract class Decorator implements SchoolReport {

    private SchoolReport sr;

    Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public String report() {
        return this.sr.report();
    }

    @Override
    public String sign(String name) {
        return this.sr.sign(name);
    }
}
