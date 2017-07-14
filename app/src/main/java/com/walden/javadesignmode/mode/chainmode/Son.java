package com.walden.javadesignmode.mode.chainmode;

/**
 * Created by walden on 2017/7/14.
 */

public class Son extends HandlerImp {


    public Son() {
        super(3);
    }

    @Override
    public String response(IWoman woman) {
        StringBuilder message = new StringBuilder();
        message.append("\n" + woman.getRequest());
        message.append("\n儿子的回复是：下个月零花钱翻倍， 就同意~");
        return message.toString();
    }
}
