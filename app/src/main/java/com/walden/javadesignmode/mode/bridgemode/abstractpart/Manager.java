package com.walden.javadesignmode.mode.bridgemode.abstractpart;

import com.walden.javadesignmode.mode.bridgemode.implementpart.Driver;

/**
 * Created by walden on 2017/7/12.
 * 抽象化角色类
 */

public class Manager {
    private Driver driver;

    public String getConnection() {
        return driver.open() + "->" + driver.getConnection() + "->" + driver.close();
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
