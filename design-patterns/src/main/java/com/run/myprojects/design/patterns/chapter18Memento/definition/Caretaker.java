package com.run.myprojects.design.patterns.chapter18Memento.definition;

/**
 * 备忘录管理员角色
 *
 * @author hewei
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
