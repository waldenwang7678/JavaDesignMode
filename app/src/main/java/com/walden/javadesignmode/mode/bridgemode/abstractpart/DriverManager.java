package com.walden.javadesignmode.mode.bridgemode.abstractpart;

import com.walden.javadesignmode.mode.bridgemode.implementpart.Driver;

/**
 * Created by walden on 2017/7/12.
 * 修正抽象化角色
 */

public class DriverManager extends Manager {

    public DriverManager(Driver driver) {
        setDriver(driver);
    }

    public String getConnection() {
        return super.getConnection();
    }
}
