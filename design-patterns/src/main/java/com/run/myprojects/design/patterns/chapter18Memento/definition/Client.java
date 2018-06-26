package com.run.myprojects.design.patterns.chapter18Memento.definition;

/**
 * 场景类
 *
 * @author hewei
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
