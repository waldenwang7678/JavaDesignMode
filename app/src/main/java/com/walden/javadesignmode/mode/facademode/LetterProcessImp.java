package com.walden.javadesignmode.mode.facademode;

/**
 * Created by Administrator on 2017/6/20 0020.
 */

public class LetterProcessImp implements LetterProcess {

    @Override
    public String writeContent(String content) {
        return "发送类容 : " + content;
    }

    @Override
    public String fileEnvelope(String address) {
        return "目的地址: " + address;
    }

    @Override
    public void letterIntoEnvelop() {

    }

    @Override
    public void sendLetter() {

    }
}
