package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public abstract class Person {
    private String head;
    private String body;
    private String foot;
    public String voice;

    public String getHead() {
        return head;
    }

    public String setHead(String head) {
        return this.head = head;
    }

    public String getBody() {
        return body;
    }

    public String setBody(String body) {
        return this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public String setFoot(String foot) {
        return this.foot = foot;
    }


    public abstract void setVoice(String voice);


    @Override
    public String toString() {
        return getHead() + "\n" + getBody() + "\n" + getFoot() + "\n";
    }
}
