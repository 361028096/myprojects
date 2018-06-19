package com.run.myprojects.design.principle.part2lsp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Client {
    public static void invoke() {
        Father f = new Father();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void invoke2() {
        Son s = new Son();
//        HashMap map = new HashMap();
        Map map = new HashMap();
        s.doSomething(map);
    }

    public static void main(String[] args) {
        invoke();
        invoke2();
    }
}
