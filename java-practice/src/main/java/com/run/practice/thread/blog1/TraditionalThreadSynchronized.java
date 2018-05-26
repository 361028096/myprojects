package com.run.practice.thread.blog1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/24
 */
public class TraditionalThreadSynchronized {
    public static void main(String[] args) {
        final Outputter output = new Outputter();
        new Thread() {
            public void run() {
                output.output("zhangsan");
            }
        }.start();
        new Thread() {
            public void run() {
                output.output("lisi");
            }
        }.start();
    }
}

class Outputter {
    public synchronized void output(String name) {
        try {
//            Object lock = new Object();
//            synchronized (this) {
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                    Thread.sleep(10);
                }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
