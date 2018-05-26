package com.run.practice.thread.blog1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/24
 */
public class SleepTest {
    public static void main(String[] args) {
        Service service = new Service();
        SleepThread t1 = new SleepThread("t1",service);
        SleepThread t2 = new SleepThread("t2",service);
        t1.start();
        t2.start();
    }
}

class SleepThread extends Thread {
    private Service service;
    public SleepThread(String name,Service service) {
        super(name);
        this.service = service;
    }

    public void run() {
        service.clac();
    }

}

class Service {
    public synchronized void clac() {
        System.out.println(Thread.currentThread().getName() + "准备计算");
        System.out.println(Thread.currentThread().getName() + "感觉累了，开始睡觉");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "睡醒了，开始计算");
        System.out.println(Thread.currentThread().getName() + "计算完成");
    }
}
