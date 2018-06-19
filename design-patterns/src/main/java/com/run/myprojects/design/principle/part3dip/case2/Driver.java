package com.run.myprojects.design.principle.part3dip.case2;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Driver implements IDriver{
    @Override
    public void driver(ICar car) {
        car.run();
    }
}
