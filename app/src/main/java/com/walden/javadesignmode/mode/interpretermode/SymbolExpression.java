package com.walden.javadesignmode.mode.interpretermode;

/**
 * Created by wangjt on 2017/7/18.
 * 抽象运算符号解析器
 * 定义了符号左右两边各有一个 变量表达式
 */

public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


}
