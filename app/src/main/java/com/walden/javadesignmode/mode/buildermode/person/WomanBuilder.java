package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public class WomanBuilder implements PersonBuilder {
    private Woman woman = new Woman();

    @Override
    public String buildHead() {
        woman.setHead("start build woman head");
        return "start build woman head";
    }

    @Override
    public String buildBody() {
        woman.setBody("start build woman body");
        return "start build woman body";
    }

    @Override
    public String buildFoot() {
        woman.setFoot("start build woman foot");
        return "start build woman foot";
    }

    @Override
    public String buildVoide() {
        woman.setVoice("细腻的声音");
        return "细腻的声音";
    }

    @Override
    public Woman buildPerson() {     //相当于 derector 功能
        return woman;
    }
}
