package com.walden.javadesignmode.mode.observermode;

/**
 * Created by walden on 2017/7/5.
 */

public class GuanYin implements Observer {
    @Override
    public String update(String str) {
        if ("大闹天宫".equals(str)) {
            return "GuanYin : 如来玉皇都不给报销车费，我在南海我不管~可劲闹吧！";
        } else if ("保唐僧".equals(str)) {
            return "GuanYin : 送你紧箍咒，可好看了~";
        }
        return "";
    }
}
