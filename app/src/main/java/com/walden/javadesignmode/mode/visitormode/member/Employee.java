package com.walden.javadesignmode.mode.visitormode.member;

import com.walden.javadesignmode.mode.visitormode.visite.IVisitor;

/**
 * Created by walden on 2017/7/14.
 * 雇员信息 抽象元素
 */

public abstract class Employee {
    public static final int MALE = 1;
    public static final int FEMALE = 0;
    private String name;
    private int salsry;
    private int sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalsry() {
        return salsry;
    }

    public void setSalsry(int salsry) {
        this.salsry = salsry;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public abstract String accept(IVisitor visitor);

}
