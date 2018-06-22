package com.run.myprojects.design.patterns.chapter06Proxy.expand.dynamicProxy;


import com.run.myprojects.design.patterns.chapter06Proxy.pre.GamePlayer;
import com.run.myprojects.design.patterns.chapter06Proxy.pre.IGamePlayer;
import net.sf.cglib.proxy.Proxy;

import net.sf.cglib.proxy.InvocationHandler;


/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        try {
            IGamePlayer player = new GamePlayer("张三");
            InvocationHandler handler = new GamePlayIH(player);
            System.out.println("开始");
            ClassLoader cl = player.getClass().getClassLoader();
            IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{
                    IGamePlayer.class
            },handler);
            proxy.login("zhangsan","password");
            proxy.killBoss();
            proxy.upgrade();
            System.out.println("结束");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
