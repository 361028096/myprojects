package com.run.myprojects.design.patterns.chapter12Strategy.definition;

/**
 * 高层模块
 *
 * @author hewei
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy2();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
