package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
