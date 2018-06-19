package com.run.myprojects.design.principle.part3dip.case2;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/19
 */
public class DriverTest extends TestCase {
    Mockery context = new Mockery();
    @Test
    public void testDriver() {
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        context.checking(new Expectations(){{
            oneOf(car).run();
        }
        });
        driver.driver(car);
    }

}
