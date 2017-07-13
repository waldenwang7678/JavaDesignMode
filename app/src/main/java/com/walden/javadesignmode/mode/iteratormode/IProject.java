package com.walden.javadesignmode.mode.iteratormode;

/**
 * Created by walden on 2017/7/13.
 */

public interface IProject {
    public void add(String name, int num, int cost);

    public String getProjectInfo();

    public IProjectIterator iterator();

}
