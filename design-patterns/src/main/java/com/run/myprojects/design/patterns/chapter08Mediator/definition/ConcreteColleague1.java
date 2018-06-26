package com.run.myprojects.design.patterns.chapter08Mediator.definition;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMethod1() {}

    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
