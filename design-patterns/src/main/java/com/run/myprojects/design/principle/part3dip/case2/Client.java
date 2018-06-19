package com.run.myprojects.design.principle.part3dip.case2;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Client {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        ICar benz = new Benz();
        ICar bMW = new BMW();
        zhangSan.driver(benz);
        zhangSan.driver(bMW);
    }
}
