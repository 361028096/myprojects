package com.run.myprojects.design.patterns.chapter12Strategy.definition;

/**
 * 具体策略角色
 *
 * @author hewei
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
