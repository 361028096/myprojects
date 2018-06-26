package com.run.myprojects.design.patterns.chapter13Adapter.definition;

/**
 * 目标角色的实现类
 *
 * @author hewei
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me...");
    }
}
