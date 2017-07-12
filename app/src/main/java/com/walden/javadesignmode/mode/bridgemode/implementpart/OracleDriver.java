package com.walden.javadesignmode.mode.bridgemode.implementpart;

/**
 * Created by walden on 2017/7/12.
 * 具体实现化角色
 */

public class OracleDriver implements Driver {
    @Override
    public String open() {
        return "Orical Open";
    }

    @Override
    public String getConnection() {
        return "Orical 数据库连接";
    }

    @Override
    public String close() {
        return "Orical Close";
    }
}
