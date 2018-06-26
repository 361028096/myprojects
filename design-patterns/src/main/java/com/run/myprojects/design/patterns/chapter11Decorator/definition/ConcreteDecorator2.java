package com.run.myprojects.design.patterns.chapter11Decorator.definition;

/**
 * 具体的装饰类
 *
 * @author hewei
 */
public class ConcreteDecorator2 extends Decorator {
    // 定义被装饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    // 定义自己的装饰方法
    private void method2() {
        System.out.println("method2 装饰...");
    }

    // 重写父类Operation方法
    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
