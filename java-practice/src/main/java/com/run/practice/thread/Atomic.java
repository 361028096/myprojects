package com.run.practice.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/6
 */
public class Atomic {
    private final AtomicLong count = new AtomicLong(0);

    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
    }

}
