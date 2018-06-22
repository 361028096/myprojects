package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class MyInvocatinHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocatinHandler(Object _objw) {
        this.target = _objw;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
