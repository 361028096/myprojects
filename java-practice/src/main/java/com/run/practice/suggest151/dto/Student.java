package com.run.practice.suggest151.dto;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/14
 */
public class Student {
    private final String name = "hewei";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
