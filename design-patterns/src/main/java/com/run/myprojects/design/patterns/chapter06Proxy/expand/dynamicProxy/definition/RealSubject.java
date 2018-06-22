package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!------>" + str);
    }
}
