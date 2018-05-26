package com.run.practice.suggest151.part1;

import com.run.practice.suggest151.dto.Person;
import com.run.practice.suggest151.utils.SerializationUtils;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class Producer {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("混世魔王");
        person.setAge(23);
        SerializationUtils.writeObject(person);
    }
}
