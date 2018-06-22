package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.sample;


import com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.DynamicProxy;
import com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.MyInvocatinHandler;
import com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
@SuppressWarnings("unchecked")
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocatinHandler(subject);
        return (T) Proxy.newProxyInstance(loader,classes,handler);
    }
}
