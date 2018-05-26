package com.run.practice.thread.blog1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/24
 */
public class Test {
    static int i = 0, j = 0;
    static void one() {
        i++;
        j++;
    }
    static void two() {
        System.out.println("i:" + i + ",j:" +j);
    }

    public static void main(String[] args) {
        one();
        two();
    }
}
