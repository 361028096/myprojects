package com.run.myprojects.design.principle.part3dip.dependence.function2;

import com.run.myprojects.design.principle.part3dip.case2.ICar;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class Driver implements IDriver {
    private ICar car;
    @Override
    public void setCar(ICar car) {
        this.car = car;
    }

    @Override
    public void driver() {
        this.car.run();
    }
}
