package com.run.practice.suggest151.part1;

import com.run.practice.suggest151.dto.Person;
import com.run.practice.suggest151.utils.SerializationUtils;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class Consumer {
    public static void main(String[] args) {
        // 反序列化
        Person p = (Person) SerializationUtils.readObject();
        System.out.println("nama:" + p.getName());
        System.out.println("age:" + p.getAge() );
    }
}
