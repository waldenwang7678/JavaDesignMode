package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public class Man extends Person {

    @Override
    public void setVoice(String str) {
        this.voice = str;
    }

    @Override
    public String toString() {
        return super.toString() + super.voice;
    }
}
