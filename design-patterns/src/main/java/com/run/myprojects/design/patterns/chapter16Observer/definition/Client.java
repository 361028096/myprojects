package com.run.myprojects.design.patterns.chapter16Observer.definition;

/**
 * 场景类
 *
 * @author hewei
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察者
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
