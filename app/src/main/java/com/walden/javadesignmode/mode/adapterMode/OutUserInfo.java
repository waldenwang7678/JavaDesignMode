package com.walden.javadesignmode.mode.adapterMode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by walden on 2017/7/4.
 */

public class OutUserInfo extends OutUser implements IUserInfo {

    private Map<String, String> baseInfo = super.getUserBaseInfo();
    private Map<String, String> homeInfo = super.getUserHomeInfo();
    private Map<String, String> officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return baseInfo.get("name");
    }

    @Override
    public String getHomeAddress() {
        return homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return baseInfo.get("mobilenumber");
    }

    @Override
    public String getOfficeNumber() {
        return officeInfo.get("officeMobileNumber");
    }

    @Override
    public String getJobPosition() {
        return officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return homeInfo.get("homeMobileNumber");
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
