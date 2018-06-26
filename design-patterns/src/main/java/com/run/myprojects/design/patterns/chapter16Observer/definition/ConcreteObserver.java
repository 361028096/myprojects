package com.run.myprojects.design.patterns.chapter16Observer.definition;

/**
 * 具体观察者
 *
 * @author hewei
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接受到信息，并进行处理！");
    }
}
