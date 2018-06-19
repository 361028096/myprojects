package com.run.myprojects.design.patterns.chapter01Singleton.pre1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
