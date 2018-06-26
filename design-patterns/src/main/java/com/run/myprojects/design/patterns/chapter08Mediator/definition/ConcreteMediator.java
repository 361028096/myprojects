package com.run.myprojects.design.patterns.chapter08Mediator.definition;

public class ConcreteMediator extends Mediator {
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
