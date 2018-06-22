package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy;

import net.sf.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hewei
 * @description 动态代理类
 * @date 2018/6/20
 */
public class GamePlayIH implements InvocationHandler {
    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;

    // 我要代理谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人使用我的账号登录");
        }
        return result;
    }
}
