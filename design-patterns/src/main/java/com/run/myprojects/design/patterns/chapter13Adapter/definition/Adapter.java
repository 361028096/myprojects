package com.run.myprojects.design.patterns.chapter13Adapter.definition;

/**
 * 适配器角色
 *
 * @author hewei
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
