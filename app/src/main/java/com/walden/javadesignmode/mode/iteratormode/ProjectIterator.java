package com.walden.javadesignmode.mode.iteratormode;

import java.util.ArrayList;

/**
 * Created by walden on 2017/7/13.
 */

public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> iProjects = new ArrayList<>();
    private int currentNum = 0;

    ProjectIterator(ArrayList<IProject> iProjects) {
        this.iProjects = iProjects;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentNum >= iProjects.size() || iProjects.get(currentNum) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return iProjects.get(currentNum++);
    }
}
