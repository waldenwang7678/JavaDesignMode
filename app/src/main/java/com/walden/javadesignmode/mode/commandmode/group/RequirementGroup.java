package com.walden.javadesignmode.mode.commandmode.group;

/**
 * Created by walden on 2017/7/12.
 *
 */

public class RequirementGroup implements Group {
    @Override
    public String find() {
        return "找到需求组";
    }

    @Override
    public String add() {
        return "增加一条需求";
    }

    @Override
    public String delete() {
        return "删除一项需求";
    }

    @Override
    public String change() {
        return "改变一项需求";
    }

    @Override
    public String plan() {
        return "客户要求需求变更计划...";
    }
}
