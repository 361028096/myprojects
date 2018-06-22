package com.run.myprojects.design.patterns.chapter05Builder.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
