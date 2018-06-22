package com.run.myprojects.design.patterns.chapter06Proxy.expand.forceProxy;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public interface IGamePlayer {
    public void login(String user, String password);
    public void killBoss();
    public void upgrade();
    public IGamePlayer getProxy();
}
