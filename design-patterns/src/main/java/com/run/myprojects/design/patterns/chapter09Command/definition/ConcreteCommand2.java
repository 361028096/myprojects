package com.run.myprojects.design.patterns.chapter09Command.definition;

/**
 * @auther: hewei
 * @description: 具体的Command类
 * @date: 2018/6/24
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }
    public void execute() {
        this.receiver.doSomething();
    }
}
