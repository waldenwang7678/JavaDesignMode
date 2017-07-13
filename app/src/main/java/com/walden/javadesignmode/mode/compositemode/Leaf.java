package com.walden.javadesignmode.mode.compositemode;

/**
 * Created by walden on 2017/7/13.
 * 树叶节点
 */

public class Leaf implements ICorp {
    private String name;
    private String position;
    private String salary;

    public Leaf(String name, String position, String salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("姓名: " + name+" ");
        info.append("职位: " + position+" ");
        info.append("薪水: " + salary+"\n");
        return info.toString();
    }
}
