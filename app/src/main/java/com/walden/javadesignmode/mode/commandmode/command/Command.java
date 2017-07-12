package com.walden.javadesignmode.mode.commandmode.command;

import com.walden.javadesignmode.mode.commandmode.group.CodeGroup;
import com.walden.javadesignmode.mode.commandmode.group.PageGroup;
import com.walden.javadesignmode.mode.commandmode.group.RequirementGroup;

/**
 * Created by walden on 2017/7/12
 * 抽象命令
 */

public abstract class Command {
    CodeGroup code = new CodeGroup();
    PageGroup page = new PageGroup();
    RequirementGroup requirement = new RequirementGroup();

    public abstract String execude();
}
