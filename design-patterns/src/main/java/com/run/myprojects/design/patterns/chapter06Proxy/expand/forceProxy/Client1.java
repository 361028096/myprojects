package com.run.myprojects.design.patterns.chapter06Proxy.expand.forceProxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client1 {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间。。。");
        proxy.login("张三","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束");
    }
}
