package com.run.myprojects.design.patterns.chapter06Proxy.expand.generalProxy;

import com.run.myprojects.design.patterns.chapter06Proxy.pre.IGamePlayer;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        System.out.println("开始时间:15:40");
        proxy.login("zhangSan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束");

    }
}
