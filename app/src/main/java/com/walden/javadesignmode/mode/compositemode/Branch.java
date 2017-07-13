package com.walden.javadesignmode.mode.compositemode;

import java.util.ArrayList;

/**
 * Created by walden on 2017/7/13.
 * 树枝节点
 */

public class Branch implements IBranch, ICorp {

    private String name;
    private String position;
    private String salary;
    private ArrayList<ICorp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, String salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("姓名: " + name+" ");
        info.append("职位: " + position+" ");
        info.append("薪水:" + salary+"\n");
        return info.toString();
    }

    @Override
    public void addSubordinate(ICorp crop) {
        this.subordinateList.add(crop);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return subordinateList;
    }
}
