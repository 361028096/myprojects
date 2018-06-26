package com.run.myprojects.design.patterns.chapter08Mediator.definition;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
