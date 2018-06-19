package com.run.myprojects.design.principle.part3dip.dependence.function1;

import com.run.myprojects.design.principle.part3dip.case2.ICar;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Driver implements IDriver {
    private ICar car;

    // 构造函数注入
    public Driver(ICar _car) {
        this.car = _car;
    }

    public void driver() {
        this.car.run();
    }
}
