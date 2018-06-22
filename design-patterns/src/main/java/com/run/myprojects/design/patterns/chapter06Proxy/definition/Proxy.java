package com.run.myprojects.design.patterns.chapter06Proxy.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Object ... objects) {

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {}

    private void after() {}
}
