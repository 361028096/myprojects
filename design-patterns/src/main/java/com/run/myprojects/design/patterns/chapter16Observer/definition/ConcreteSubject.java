package com.run.myprojects.design.patterns.chapter16Observer.definition;

/**
 * 具体被观察者
 *
 * @author hewei
 */
public class ConcreteSubject extends Subject {

    // 具体的业务
    public void doSomething() {
        /**
         * do something...
         */
        System.out.println("do something...");
        super.notifyObserver();
    }
}
