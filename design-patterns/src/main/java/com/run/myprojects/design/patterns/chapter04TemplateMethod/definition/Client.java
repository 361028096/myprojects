package com.run.myprojects.design.patterns.chapter04TemplateMethod.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
