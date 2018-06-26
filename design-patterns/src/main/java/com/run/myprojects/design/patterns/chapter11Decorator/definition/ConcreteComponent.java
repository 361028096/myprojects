package com.run.myprojects.design.patterns.chapter11Decorator.definition;

/**
 * 具体构件
 *
 * @author hewei
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something...");
    }
}
