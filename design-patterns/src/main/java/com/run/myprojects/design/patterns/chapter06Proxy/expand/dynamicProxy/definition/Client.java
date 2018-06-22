package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition;

import java.lang.reflect.InvocationHandler;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocatinHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.doSomething("Finish");
    }
}
