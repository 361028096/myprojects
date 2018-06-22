package com.run.myprojects.design.patterns.chapter06Proxy.pre;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String _name) throws Exception {
            this.name = _name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录信息：user:" + user + ";password:" + password + "  登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级");
    }
}
