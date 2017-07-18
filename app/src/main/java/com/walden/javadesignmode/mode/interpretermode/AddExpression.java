package com.walden.javadesignmode.mode.interpretermode;

/**
 * Created by wangjt on 2017/7/18.
 * //如果是运算表达式 ， 拿出上一次推入栈的变量和下一个变量，并运算
 */

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return super.left.interpreter() + super.right.interpreter();
    }


}
