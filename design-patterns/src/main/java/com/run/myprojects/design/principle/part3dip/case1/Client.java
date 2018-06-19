package com.run.myprojects.design.principle.part3dip.case1;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Client {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        Benz benz = new Benz();
        zhangSan.dirver(benz);
    }
}
