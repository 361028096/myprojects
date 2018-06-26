package com.run.myprojects.design.patterns.chapter12Strategy.definition;

/**
 * 封装角色
 *
 * @author hewei
 */
public class Context {
    // 抽象策略
    private Strategy strategy = null;

    // 构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 封装后的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}
