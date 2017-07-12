package com.walden.javadesignmode.mode.decoratormode;

/**
 * Created by walden on 2017/7/12.
 * 实现的装饰类
 */

public class HightScoreDecorator extends Decorator {

    public HightScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private String reportHightScore() {
        return "  语文最高分: 20 ,数学最高分; 30 , 英语最高分: 20 , 体育最高分: 100\n";
    }

    @Override
    public String report() {
        return super.report() + reportHightScore();
    }

}
