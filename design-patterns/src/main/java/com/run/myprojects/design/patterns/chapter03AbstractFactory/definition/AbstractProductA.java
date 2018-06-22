package com.run.myprojects.design.patterns.chapter03AbstractFactory.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public abstract class AbstractProductA {
    // 每个类共有的方法
    public void shareMethod() {}
    // 每个产品相同的发方法，不同的实现
    public abstract void doSomething();
}
