package com.walden.javadesignmode.mode.buildermode.product;

/**
 * Created by walden on 2017/7/11.
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}