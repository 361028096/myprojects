package com.run.myprojects.design.patterns.chapter11Decorator.definition;

/**
 * 抽象装饰者
 *
 * @author hewei
 */
public abstract class Decorator extends Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
