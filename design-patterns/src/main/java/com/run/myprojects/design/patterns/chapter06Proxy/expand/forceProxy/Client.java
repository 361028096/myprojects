package com.run.myprojects.design.patterns.chapter06Proxy.expand.forceProxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间。。。");
        player.login("张三","password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束");
    }
}
