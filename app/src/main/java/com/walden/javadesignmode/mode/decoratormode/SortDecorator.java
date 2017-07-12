package com.walden.javadesignmode.mode.decoratormode;

/**
 * Created by walden on 2017/7/12.
 * 实现的装饰类
 */

public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private String reportSort() {
        return "排名: 23\n";
    }

    @Override
    public String report() {
        return super.report() + reportSort();
    }

}
