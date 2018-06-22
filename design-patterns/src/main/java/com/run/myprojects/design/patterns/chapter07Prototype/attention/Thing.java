package com.run.myprojects.design.patterns.chapter07Prototype.attention;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Thing implements Cloneable {
    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
