package com.run.myprojects.design.patterns.chapter09Command.definition;

/**
 * @author hewei
 * @date : 2018/6/24
 */
public class Client {

    /**
     * TODO description
     *
     * @author hewei
     * @param [args]
     */
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
