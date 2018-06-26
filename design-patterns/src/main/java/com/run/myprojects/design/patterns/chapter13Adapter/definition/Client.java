package com.run.myprojects.design.patterns.chapter13Adapter.definition;

/**
 * 场景类
 *
 * @author hewei
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
