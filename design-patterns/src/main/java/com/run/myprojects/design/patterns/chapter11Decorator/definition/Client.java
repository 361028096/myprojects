package com.run.myprojects.design.patterns.chapter11Decorator.definition;

/**
 * 场景类
 *
 * @author hewei
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
