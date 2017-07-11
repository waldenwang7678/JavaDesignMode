package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public class Woman extends Person {

    @Override
    public void setVoice(String voice) {
        super.voice = voice;
    }

    @Override
    public String toString() {
        return super.toString() + super.voice;
    }
}
