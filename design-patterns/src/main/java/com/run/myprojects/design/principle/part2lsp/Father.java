package com.run.myprojects.design.principle.part2lsp;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Father {
    public Collection doSomething(HashMap map) {
        System.out.println("父类被执行");
        return map.values();
    }
}
