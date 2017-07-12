package com.walden.javadesignmode.mode.decoratormode;

/**
 * Created by walden on 2017/7/12.
 */

public class FiveGradeReport implements SchoolReport {
    @Override
    public String report() {
        StringBuilder builder = new StringBuilder("尊敬的家长! 你儿子成绩如下:");
        builder.append("\n  语文 : 19");
        builder.append("\n  数学 : 21");
        builder.append("\n  英语 : 16 ");
        builder.append("\n  体育 : 100");
        builder.append("\n");
        return builder.toString();
    }

    @Override
    public String sign(String name) {
        return "           家长签名: " + name;
    }
}
