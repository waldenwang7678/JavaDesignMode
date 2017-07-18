package com.walden.javadesignmode.mode.interpretermode;

/**
 * Created by wangjt on 2017/7/18.
 * 数值表达式  变量解析器
 */

public class VarExpression extends Expression {
    private String value = ""; // 表达式指代的值

    public VarExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return Integer.parseInt(value);
    }

    public String getValue() {
        return value;
    }

    public VarExpression addExpression(Expression exp) {
        if (exp instanceof VarExpression) {
            VarExpression exp1 = (VarExpression) exp;
            try {
                Integer.parseInt(exp1.getValue());
                value = exp1.getValue() + value;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else if (exp instanceof SymbolExpression) {
            SymbolExpression exp2 = (SymbolExpression) exp;
            int result = exp2.interpreter();
            value = result + value;
        }
        return this;
    }
}
