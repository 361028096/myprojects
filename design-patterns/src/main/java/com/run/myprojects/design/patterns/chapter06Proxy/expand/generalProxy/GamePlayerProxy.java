package com.run.myprojects.design.patterns.chapter06Proxy.expand.generalProxy;

import com.run.myprojects.design.patterns.chapter06Proxy.pre.IGamePlayer;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
