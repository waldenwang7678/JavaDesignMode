package com.walden.javadesignmode.mode.buildermode.person;

/**
 * Created by walden on 2017/7/6.
 */

public interface PersonBuilder {

    String buildHead();

    String buildBody();

    String buildFoot();

    String buildVoide();

    Person buildPerson();
}
