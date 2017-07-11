package com.walden.javadesignmode.mode.buildermode.product;

/**
 * Created by walden on 2017/7/11.
 */

public class ConcreteBuilder implements Builder {

    private Product product = new Product();


    @Override
    public void buildPart1() {
        product.setPart1("编号：9527");
    }

    @Override
    public void buildPart2() {
        product.setPart2("名称：XXX");
    }

    @Override
    public Product build() {
        return product;
    }

}