package com.run.myprojects.design.patterns.chapter05Builder.definition;

/**
 * @author hewei
 * @description 抽象产品类
 * @date 2018/6/20
 */
public abstract class Builder {
    public abstract void setPart();

    public abstract Product buildProduct();
}
