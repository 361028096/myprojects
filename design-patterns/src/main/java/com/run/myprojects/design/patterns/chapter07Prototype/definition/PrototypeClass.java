package com.run.myprojects.design.patterns.chapter07Prototype.definition;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class PrototypeClass implements Cloneable {

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
