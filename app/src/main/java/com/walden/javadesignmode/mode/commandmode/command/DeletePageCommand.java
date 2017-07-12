package com.walden.javadesignmode.mode.commandmode.command;

/**
 * Created by walden on 2017/7/12.
 * 删除页面命令
 */

public class DeletePageCommand extends Command {
    @Override
    public String execude() {
        return super.page.find() + "\n" + super.page.change() + "\n" + super.page.plan();
    }
}
