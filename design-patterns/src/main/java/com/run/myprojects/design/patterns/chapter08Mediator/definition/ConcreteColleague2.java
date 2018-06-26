package com.run.myprojects.design.patterns.chapter08Mediator.definition;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }

    public void selfMethod2() {}

    public void depMethod2() {
        super.mediator.doSomething2();
    }
}
