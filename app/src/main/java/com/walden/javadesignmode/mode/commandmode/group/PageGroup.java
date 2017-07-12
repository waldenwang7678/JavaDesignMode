package com.walden.javadesignmode.mode.commandmode.group;

/**
 * Created by walden on 2017/7/12.
 */

public class PageGroup implements Group {
    @Override
    public String find() {
        return "找到美工组";
    }

    @Override
    public String add() {
        return "增加页面";
    }

    @Override
    public String delete() {
        return "删除页面";
    }

    @Override
    public String change() {
        return "改变页面";
    }

    @Override
    public String plan() {
        return "客户要求页面变更计划...";
    }
}
