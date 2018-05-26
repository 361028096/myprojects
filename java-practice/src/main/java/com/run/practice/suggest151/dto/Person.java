package com.run.practice.suggest151.dto;

import java.io.Serializable;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -5116265902186884595L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
