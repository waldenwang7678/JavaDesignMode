package com.walden.javadesignmode.mode.commandmode.command;

/**
 * Created by walden on 2017/7/12.
 * 更改功能的命令
 */

public class ChangeCodeCommand extends Command {
    @Override
    public String execude() {
        return super.code.find() + "\n" + super.code.change() + "\n" + super.code.plan();
    }
}
