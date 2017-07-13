package com.walden.javadesignmode.mode.iteratormode;

import java.util.ArrayList;

/**
 * Created by walden on 2017/7/13.
 */

public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();
    private String name;
    private int num;

    private int cost;

    public Project() {

    }

    Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }


    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder info = new StringBuilder();
        info.append("\n项目名称为:" + this.name);
        info.append("\n  项目人数为:" + this.num);
        info.append("\n  项目花费为:" + this.cost+"\n");
        return info.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
