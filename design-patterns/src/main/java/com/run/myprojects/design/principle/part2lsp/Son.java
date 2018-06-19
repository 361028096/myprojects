package com.run.myprojects.design.principle.part2lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Son extends Father {
    public Collection doSomething(Map map) {
        System.out.println("子类被执行");
        return map.values();
    }
}
