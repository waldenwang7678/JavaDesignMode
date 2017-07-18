package com.walden.javadesignmode.mode.interpretermode;

import java.util.Stack;

/**
 * Created by wangjt on 2017/7/18.
 * 计算对象， 解析表达式字符串
 */

public class Calculator {
    private Expression expression;

    public Calculator(String str) {
        Stack<Expression> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':    //如果是运算表达式 ， 拿出上一次推入栈的变量和下一个变量，并运算
                    left = stack.pop();
                    int index = getStrIndex(str, ++i);
                    right = new VarExpression(str.substring(i, index));
                    i = index-1;
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':   // 同上
                    left = stack.pop();
                    int index1 = getStrIndex(str, ++i);
                    right = new VarExpression(str.substring(i, index1));
                    i = index1-1;
                    stack.push(new SubExpression(left, right));
                    break;
                default:  // 如果是变量表达式， 推入栈中 ， 从表达式第一个字符开始
                    if (stack.size() > 0) {
                        Expression e = stack.pop();
                        stack.push(new VarExpression(String.valueOf(charArray[i])).addExpression(e));
                    } else {
                        stack.push(new VarExpression(String.valueOf(charArray[i])));
                    }
            }
        }
        this.expression = stack.pop();
    }

    public int run() {
        return this.expression.interpreter();
    }

    private int getStrIndex(String str, int index) {
        if (index < str.length()) {
            for (int i = index; i < str.length(); i++) {
                if (i == str.length() - 1) {
                    return str.length();
                }
                if (String.valueOf(str.charAt(i)).equals("+") || String.valueOf(str.charAt(i)).equals("-")) {
                    return i;
                }
            }
        }
        return index;
    }
}
