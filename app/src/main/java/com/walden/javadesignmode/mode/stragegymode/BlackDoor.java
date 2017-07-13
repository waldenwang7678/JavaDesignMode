package com.walden.javadesignmode.mode.stragegymode;


/**
 * Created by Administrator on 2017/6/13 0013.
 */

public class BlackDoor implements IStrategy {
    @Override
    public String operate() {
        return "开后门, 找乔老";
    }
}
