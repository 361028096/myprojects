package com.run.myprojects.design.patterns.chapter05Builder.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
