package com.run.myprojects.design.patterns.chapter07Prototype.attention;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        Thing cloneThing = thing.clone();
    }
}
