package com.run.myprojects.design.patterns.chapter01Singleton.pre1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Emperor {
    // 初始化一个皇帝
    private static final Emperor emperor = new Emperor();
    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我就是皇帝xxxx....");
    }
}
