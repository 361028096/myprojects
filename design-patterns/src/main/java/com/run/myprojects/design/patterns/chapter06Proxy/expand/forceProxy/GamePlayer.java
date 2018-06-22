package com.run.myprojects.design.patterns.chapter06Proxy.expand.forceProxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录：user:" + user + " password:" + password + "登录成功");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name +"在打怪啊");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name +"在升级啊");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
