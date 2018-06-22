package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
@SuppressWarnings("unchecked")
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if (true) {
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
