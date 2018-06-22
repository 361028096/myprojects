package com.run.myprojects.design.patterns.chapter07Prototype.pre1;

/**
 * @author hewei
 * @description 广告信模板代码
 * @date 2018/6/20
 */
public class AdvTemplate {
    // 广告信名称
    private String advSubject = "招商银行国庆信用卡抽奖活动 ";
    // 广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！。。。";

    public String getAdvSubject() {
        return advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}
