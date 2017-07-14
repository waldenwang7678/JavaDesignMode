package com.walden.javadesignmode.mode.chainmode;

/**
 * Created by walden on 2017/7/14.
 */

public class Father extends HandlerImp {

    public Father() {
        super(1);
    }

    @Override
    public String response(IWoman woman) {
        StringBuilder message = new StringBuilder();

        message.append("\n" + woman.getRequest());
        message.append("\n老子的回复是： 同意");
        return message.toString();
    }
}
