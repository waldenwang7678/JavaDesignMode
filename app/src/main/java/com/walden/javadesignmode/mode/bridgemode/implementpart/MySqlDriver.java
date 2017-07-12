package com.walden.javadesignmode.mode.bridgemode.implementpart;

/**
 * Created by walden on 2017/7/12.
 * 具体实现化角色
 */

public class MySqlDriver implements Driver {
    @Override
    public String open() {
        return "MySql Open";
    }

    @Override
    public String getConnection() {
        return "MySql 数据库连接";
    }

    @Override
    public String close() {
        return "MySql Close";
    }
}
