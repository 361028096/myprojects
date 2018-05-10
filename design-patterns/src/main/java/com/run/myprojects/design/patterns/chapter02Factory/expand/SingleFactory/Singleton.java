package com.run.myprojects.design.patterns.chapter02Factory.expand.SingleFactory;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class Singleton {
    // 不允许通过new产生一个对象
    private Singleton() {
        System.out.println("私有方法被调用");
    }

    public void doSomething() {
        // 业务逻辑
    }
}
