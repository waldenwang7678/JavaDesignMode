package com.walden.javadesignmode.mode.observerMode;

/**
 * Created by walden on 2017/7/5.
 */

public class YuDi implements Observer {
    @Override
    public String update(String str) {
        if ("大闹天宫".equals(str)) {
            return "玉帝 ： 狗日的，再不住手老子就喊如来了！";
        } else if ("保唐僧".equals(str)) {
            return "玉帝 ： 赶紧滚，有多远滚多远！";
        }
        return "";
    }
}
