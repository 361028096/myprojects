package com.run.myprojects.design.patterns.chapter07Prototype.pre;

/**
 * @author hewei
 * @description  邮件类代码
 * @date 2018/6/20
 */
public class Mail {
    private String receiver;
    private String subject;
    private String appellation;
    private String contect;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contect = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
