package com.run.myprojects.design.patterns.chapter18Memento.definition;

/**
 * 发起人角色
 *
 * @author hewei
 */
public class Originator {
    // 内部状态
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 恢复一个备忘录
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getStatus());
    }
}
