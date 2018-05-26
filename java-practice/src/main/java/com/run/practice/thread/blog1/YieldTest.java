package com.run.practice.thread.blog1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/24
 */
public class YieldTest {
    public static void main(String[] args) {
        try {
            YieldThread t1 = new YieldThread("t1");
            YieldThread t2 = new YieldThread("t2");

            t1.start();
            t2.start();

            Thread.sleep(100);

            t1.interrupt();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class YieldThread extends Thread {
    int i = 0;

    public YieldThread(String name) {
        super(name);
    }

    public void run() {
        while (!isInterrupted()) {
            System.out.println(getName() + "执行了" + ++i + "次");
            if ( i% 10 == 0) {
                Thread.yield();
            }
        }
    }
}
