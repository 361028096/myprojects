package com.run.practice.thread;

import net.jcip.annotations.NotThreadSafe;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/6
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /**
     * Returns a unique value.
     */
    public int getNext() {
        return value++;
    }
}