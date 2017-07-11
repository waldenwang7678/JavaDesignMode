package com.walden.javadesignmode.mode.buildermode.product;

/**
 * Created by walden on 2017/7/11.
 */

public interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product build();
}