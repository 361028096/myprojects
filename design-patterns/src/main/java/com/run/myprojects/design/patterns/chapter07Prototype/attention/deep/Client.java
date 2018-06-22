package com.run.myprojects.design.patterns.chapter07Prototype.attention.deep;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getArrayList());
    }
}
