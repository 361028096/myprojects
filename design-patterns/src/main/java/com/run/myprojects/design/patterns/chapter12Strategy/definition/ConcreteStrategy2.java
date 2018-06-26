package com.run.myprojects.design.patterns.chapter12Strategy.definition;

/**
 * 具体策略角色
 *
 * @author hewei
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
