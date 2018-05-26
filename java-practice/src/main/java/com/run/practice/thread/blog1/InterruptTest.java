package com.run.practice.thread.blog1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/24
 */
public class InterruptTest {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread("MyThread");
            t.start();
            Thread.sleep(1000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    int i = 0;

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        while(!isInterrupted()) {
            System.out.println(getName() + getId() + "执行了" + ++i + "次");
        }
    }

}
