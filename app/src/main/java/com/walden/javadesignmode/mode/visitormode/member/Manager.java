package com.walden.javadesignmode.mode.visitormode.member;

import com.walden.javadesignmode.mode.visitormode.visite.IVisitor;

/**
 * Created by walden on 2017/7/14.
 * 具体元素
 */

public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public String accept(IVisitor visitor) {
        return visitor.visit(this);
    }

}
