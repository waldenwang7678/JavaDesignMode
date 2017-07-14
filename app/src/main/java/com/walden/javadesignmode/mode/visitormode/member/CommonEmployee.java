package com.walden.javadesignmode.mode.visitormode.member;

import com.walden.javadesignmode.mode.visitormode.visite.IVisitor;

/**
 * Created by walden on 2017/7/14.
 * 具体元素
 */

public class CommonEmployee extends Employee {
    String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String accept(IVisitor visitor) {
        return visitor.visit(this);     //把自己传入访问工具中
    }
}
