package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.sample;

import com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.RealSubject;
import com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.Subject;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Finish!!!!");
    }
}
