package com.walden.javadesignmode.mode.interpretermode;

/**
 * Created by wangjt on 2017/7/18.
 * 具体运算符号解析器
 */

public class SubExpression extends SymbolExpression {


    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return super.left.interpreter() - super.right.interpreter();
    }

}
