package com.run.myprojects.design.patterns.chapter01Singleton.definition;

/**
 * @author : hewei
 * @description: 饿汉式 安全
 * @date : 2018/5/8
 */
public class SafeSingleton {
    private static final SafeSingleton singleton = new SafeSingleton();
    // 限制产生多个对象
    private SafeSingleton() {
    }
    // 通过该方法获得实例对象
    public static synchronized SafeSingleton getSingleton() {
        return singleton;
    }
    public static void doSomething() {}
}
