package com.run.myprojects.design.patterns.chapter09Command.definition;

import com.run.myprojects.design.patterns.chapter08Mediator.definition.ConcreteColleague1;

/**
 * @auther: hewei
 * @description: 具体的Command类
 * @date: 2018/6/24
 */
public class ConcreteCommand1 extends Command {
    private Receiver receiver;

    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }
    public void execute() {
        this.receiver.doSomething();
    }
}
