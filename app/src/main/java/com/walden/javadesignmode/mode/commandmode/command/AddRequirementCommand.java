package com.walden.javadesignmode.mode.commandmode.command;

import com.walden.javadesignmode.activity.CommandActivity;

/**
 * Created by walden on 2017/7/12.
 * 执行增加一项需求的命令
 */

public class AddRequirementCommand extends Command {

    @Override
    public String execude() {
        return super.requirement.find() + "\n" + super.requirement.add() + "\n" + super.requirement.plan();
    }
}
