package com.walden.javadesignmode.mode.observermode;

/**
 * Created by walden on 2017/7/5.
 */

public class RuLai implements Observer {
    @Override
    public String update(String str) {
        if ("大闹天宫".equals(str)) {
            return "如来 ： 怼你丫的死猴子，镇压五百年！";
        } else if ("保唐僧".equals(str)) {
            return "如来 ： 这才是乖猴宝宝嘛~送你成佛！";
        }
        return "";
    }
}
