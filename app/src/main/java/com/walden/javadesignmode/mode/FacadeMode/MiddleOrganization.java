package com.walden.javadesignmode.mode.FacadeMode;

/**
 * Created by Administrator on 2017/6/20 0020.
 */

public class MiddleOrganization {  
    static LetterProcess process;

    public static String sendLetter(String content, String address) {
        if (process == null) {
            process = new LetterProcessImp();
        }
        String contentStr = process.writeContent(content);
        String addressStr = process.fileEnvelope(address);
        process.letterIntoEnvelop();
        process.sendLetter();
        return contentStr+"\n"+addressStr;
    }
}
