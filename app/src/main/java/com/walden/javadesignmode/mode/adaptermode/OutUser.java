package com.walden.javadesignmode.mode.adaptermode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by walden on 2017/7/4.
 */

public class OutUser implements IOutUser {
    @Override
    public Map<String, String> getUserBaseInfo() {
        HashMap<String, String> baseInfo = new HashMap<>();
        baseInfo.put("name", "lina");
        baseInfo.put("mobilenumber", "000");
        return baseInfo;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        HashMap<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "大法师");
        officeInfo.put("officeMobileNumber", "111");
        return officeInfo;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeAddress", "近卫军团");
        homeInfo.put("homeMobileNumber", "222");
        return homeInfo;
    }
}
