package com.walden.javadesignmode.mode.stragegy;


/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class GreenLight implements IStrategy {
    @Override
    public String operate() {
        return "开绿灯 , 找吴国太~";
    }
}
