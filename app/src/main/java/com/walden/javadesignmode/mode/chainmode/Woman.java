package com.walden.javadesignmode.mode.chainmode;

/**
 * Created by walden on 2017/7/14.
 */

public class Woman implements IWoman {

    private int type = 0;
    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是 :" + request;
                break;
            case 2:
                this.request = "妻子的请求是 :" + request;
                break;
            case 3:
                this.request = "母亲的请求是 :" + request;
                break;
            default:
                this.request = "\n妹子啥也不请求~\n";
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
