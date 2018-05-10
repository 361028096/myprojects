package com.run.myprojects.design.patterns.chapter02Factory.expand.SingleFactory;

import java.lang.reflect.Constructor;

/**
 * @author hewei
 * @description 通过反射的方式，创建一个单例
 * @date 2018/5/9
 */
public class SingletonFactory {
    private static Singleton singleton;
    static{
        try {
            Class cl = Class.forName(Singleton.class.getName());
            // 获得无参的构造函数
            Constructor constructor = cl.getDeclaredConstructor();
            // 设置无参构造函数可以访问
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
