package com.walden.javadesignmode.mode.chainmode;

/**
 * Created by walden on 2017/7/14.
 */

public class Husband extends HandlerImp {


    public Husband() {
        super(2);
    }

    @Override
    public String response(IWoman woman) {
        StringBuilder message = new StringBuilder();
        message.append("\n" + woman.getRequest());
        message.append("\n老公的回复是：这个。。啵一个再考虑");
        return message.toString();
    }
}
