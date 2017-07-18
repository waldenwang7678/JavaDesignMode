package com.walden.javadesignmode.mode.flyweightmode;

/**
 * Created by wangjt on 2017/7/18.
 */

public class XiaomingImp extends Xiaoming {
    private String str;

    public XiaomingImp(String str) {
        this.str = str;
    }

    @Override
    public String lol() {
        return "我是傻逼我怕谁，我坑" + str + "我幸福~ Don`t worry,be happy!";
    }
}
