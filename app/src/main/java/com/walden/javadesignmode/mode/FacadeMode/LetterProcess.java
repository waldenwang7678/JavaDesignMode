package com.walden.javadesignmode.mode.FacadeMode;

/**
 * Created by Administrator on 2017/6/20 0020.
 */

public interface LetterProcess {
    public String writeContent(String content);

    public String fileEnvelope(String address);

    public void letterIntoEnvelop();

    public void sendLetter();
}
