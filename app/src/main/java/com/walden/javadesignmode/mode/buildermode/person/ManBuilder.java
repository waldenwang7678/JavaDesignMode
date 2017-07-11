package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public class ManBuilder implements PersonBuilder {
    private Man man = new Man();

    @Override
    public String buildHead() {
        man.setHead("start build man head");
        return "start build man head";
    }

    @Override
    public String buildBody() {
        man.setBody("start build man body");
        return "start build man body";
    }

    @Override
    public String buildFoot() {
        man.setFoot("start build man foot");
        return "start build man foot";
    }

    @Override
    public String buildVoide() {
        man.setVoice("粗犷的声音");
        return "粗犷的声音";
    }

    @Override
    public Man buildPerson() {     //相当于 derector 功能
        return man;
    }
}
