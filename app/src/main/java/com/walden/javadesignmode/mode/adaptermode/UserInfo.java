package com.walden.javadesignmode.mode.adaptermode;

/**
 * Created by walden on 2017/7/4.
 */

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        return "巫妖王之怒";
    }

    @Override
    public String getHomeAddress() {
        return "冰封王座";
    }

    @Override
    public String getMobileNumber() {
        return "999";
    }

    @Override
    public String getOfficeNumber() {
        return "333";
    }

    @Override
    public String getJobPosition() {
        return "天灾之王";
    }

    @Override
    public String getHomeTelNumber() {
        return "000";
    }

    @Override
    public String toString() {
        return "name : " + getUserName() + "\n" +
                "  HomeAddress : " + getHomeAddress() + "\n" +
                "  MobileNumber : " + getMobileNumber() + "\n" +
                "  officeMobileNumber : " + getOfficeNumber() + "\n" +
                "  jobPosition : " + getJobPosition() + "\n" +
                "  homeMobileNumber : " + getHomeTelNumber() + "\n";
    }
}
