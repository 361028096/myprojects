package com.run.myprojects.design.patterns.chapter01Singleton.definition;

/**
 * @author hewei
 * @description 懒汉式 不安全
 * @date 2018/5/9
 */
public class UnsafeSingleton {
    private static UnsafeSingleton unsafeSingleton = null;
    private UnsafeSingleton(){
    }
    public static UnsafeSingleton getUnsafeSingleton() {
        if (unsafeSingleton == null) {
            unsafeSingleton = new UnsafeSingleton();
        }
        return unsafeSingleton;
    }
}
