package com.run.myprojects.design.patterns.chapter06Proxy.expand.character;

import com.run.myprojects.design.patterns.chapter06Proxy.pre.IGamePlayer;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class GamePlayProxy implements IGamePlayer,IProxy {
    private IGamePlayer gamePlayer = null;
    @Override
    public void count() {
        System.out.println("总费用：150元");
    }

    @Override
    public void login(String user, String password) {

    }

    @Override
    public void killBoss() {

    }

    @Override
    public void upgrade() {

    }
}
