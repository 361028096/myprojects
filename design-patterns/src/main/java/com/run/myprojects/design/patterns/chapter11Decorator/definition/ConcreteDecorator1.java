package com.run.myprojects.design.patterns.chapter11Decorator.definition;

/**
 * 具体的装饰类
 *
 * @author hewei
 */
public class ConcreteDecorator1 extends Decorator {
    // 定义被装饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义自己的装饰方法
    private void method1() {
        System.out.println("method1 装饰...");
    }

    // 重写父类Operation方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
