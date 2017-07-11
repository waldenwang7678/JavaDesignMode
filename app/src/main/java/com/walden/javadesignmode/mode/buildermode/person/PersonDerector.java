package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/11.
 */

public class PersonDerector {
    private PersonBuilder builder;

    public PersonDerector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        builder.buildVoide();
    }
}
