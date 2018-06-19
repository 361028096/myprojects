package com.run.myprojects.design.patterns.chapter01Singleton.expand;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第" + (i+1) +"个大臣参拍的是：");
            emperor.say();
        }
    }
}
