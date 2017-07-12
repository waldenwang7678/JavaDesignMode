package com.walden.javadesignmode.mode.commandmode;

import com.walden.javadesignmode.mode.commandmode.command.Command;

/**
 * Created by walden on 2017/7/12.
 * 中间人 ,传达命令
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String action() {
        return this.command.execude();
    }
}
