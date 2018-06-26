package com.run.myprojects.design.patterns.chapter09Command.definition;

/**
 * @auther: hewei
 * @description: 调用Invoker类
 * @date: 2018/6/24
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
