package com;

import com.alibaba.fastjson.JSON;
import com.run.mvc.dao.model.Test2;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/28
 */
public class testJava8 {
    @Test
    public void test() {
        System.out.println("a");
    }

    @Test
    public void testThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before java8, too much code for too little to do.");
            }
        }).start();
    }

    @Test
    public void testThreadJava8() {
        new Thread(()-> System.out.println("In Java*,Lambda expression rocks !!")).start();
    }

    @Test
    public void testEvent() {
        JButton show = new JButton("show");
        show.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handling without lambda expression is boring");
            }
        });

        show.addActionListener((e)->{
            System.out.println("Light,Camera,Action!! Lambda expressions Rocks");
        });
    }

    @Test
    public void testFor() {
        List<String> features = Arrays.asList("Lambdas","Default Method","Stream API","Date and Time Api");
        for(String feature : features) {
            System.out.println(feature);
        }

        features.forEach(n -> System.out.println(n));

        features.forEach(System.out::println);
    }

    @Test
    public void testPredicate() {
        Predicate<String> startWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;

    }

    @Test
    public void testMapReduct() {
        List<Integer> costBeforeTax = Arrays.asList(100,200,300,400,500);
        for (Integer cost : costBeforeTax) {
            double price = cost + 0.12 * cost;
            System.out.println(price);
        }
        System.out.println("---------------------------------------------------------------");
        costBeforeTax.stream().map((cost)->cost + 0.12 * cost).forEach(System.out::println);
    }

    @Test
    public void testPoint() {
        System.out.println(1* .12);
    }

    @Test
    public void testFor2() {
        for (int i = 0; i <= 0; i++) {
            System.out.println(i);

        }
    }

    @Test
    public void testString() {
        Test2 test2 = new Test2();
        test2.setAge(23);
        System.out.println(JSON.toJSONString(test2));
    }
}
