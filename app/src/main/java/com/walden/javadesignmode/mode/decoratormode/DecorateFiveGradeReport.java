package com.walden.javadesignmode.mode.decoratormode;

/**
 * Created by walden on 2017/7/12.
 * 费装饰模式设计 , 如果装饰的数量过多 ,且较为复杂, 这种方法就不可取
 */

public class DecorateFiveGradeReport extends FiveGradeReport {

    private String reportHightScore() {
        return "  语文最高分: 20 ,数学最高分; 30 , 英语最高分: 20 , 体育最高分: 100\n";
    }

    private String reportSort() {
        return "排名: 23\n";
    }

    @Override
    public String report() {
        return super.report() + reportHightScore() + reportSort();
    }
}
