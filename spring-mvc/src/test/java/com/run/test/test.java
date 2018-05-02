package com.run.test;

import com.run.mvc.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class test {
    @Test
    public void testString() {
        System.out.println("print");
    }

    @Resource
    private ITestService testService;

    @Test
    public void testService(){
        System.out.println(testService.selectTest());
    }

    @Test
    public void testPath() {
        String path = this.getClass().getResource("").toString();
        System.out.println("path = " + path);
    }
}
