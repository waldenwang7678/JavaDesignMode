package com.walden.javadesignmode.mode.flyweightmode;

import java.util.Hashtable;

/**
 * Created by wangjt on 2017/7/18.
 *
 */

public class XiaomingFactory {
    Hashtable table = new Hashtable();   //享元池

    public Xiaoming getXiaoming(String str) {
        Xiaoming xiaoming = (Xiaoming) table.get(str);
        if (xiaoming == null) {
            xiaoming = new XiaomingImp(str);
            table.put(str, xiaoming);
        }
        return xiaoming;
    }

    public int getXiaomingSize() {
        return table.size();
    }
}
