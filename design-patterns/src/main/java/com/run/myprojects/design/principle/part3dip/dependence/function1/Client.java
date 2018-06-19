package com.run.myprojects.design.principle.part3dip.dependence.function1;


import com.run.myprojects.design.principle.part3dip.case2.BMW;
import com.run.myprojects.design.principle.part3dip.case2.Benz;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Client {
    public static void main(String[] args) {
        Benz benz = new Benz();
        BMW bMW = new BMW();
        Driver zhangSan = new Driver(benz);
        Driver liSi = new Driver(bMW);
        zhangSan.driver();
        liSi.driver();
    }
}
