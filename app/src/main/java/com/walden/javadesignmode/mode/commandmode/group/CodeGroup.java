package com.walden.javadesignmode.mode.commandmode.group;

/**
 * Created by walden on 2017/7/12.
 */

public class CodeGroup implements Group {
    @Override
    public String find() {
        return "找到代码组";
    }

    @Override
    public String add() {
        return "新增功能";
    }

    @Override
    public String delete() {
        return "删除功能";
    }

    @Override
    public String change() {
        return "改变功能";
    }

    @Override
    public String plan() {
        return "客户要求代码变更计划...";
    }
}
