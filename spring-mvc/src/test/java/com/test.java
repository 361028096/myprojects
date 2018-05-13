package com;

import com.run.mvc.service.ITestService;
import com.run.mvc.vo.ResultBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext.xml"})
public class test {

    @Resource
    private ITestService testService;

    @Test
    public void testLombok() {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(new Object());
        System.out.println("success");

    }

    @Test
    public void testExmportXml() {
        try {
            String[] titles = { "ID", "用户姓名", "逾期时间", "当前期数","冻结时间" };
            testService.exportXml(titles);
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testExmportXmlx() {
        try {
            String[] titles = { "ID", "用户姓名", "逾期时间", "当前期数","冻结时间" };
            testService.exportXmlx(titles);
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testExmportXmlxFromTemple() {
        try {
//            String[] titles = { "ID", "用户姓名", "逾期时间", "当前期数","冻结时间" };
            testService.exportXmlxFromTemple();

            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPath() {
        System.out.println("=========================================================================");
//        String filePath = this.getClass().getClassLoader().getResource("tmple.xlsx").toString()+"xmlx/tmple.xlsx";
        String filePath = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println(filePath);
        System.out.println("=========================================================================");
    }

    @Test
    public void testTest() {
        com.run.mvc.dao.model.Test test =  testService.selectTest();
        test.getClass();
        System.out.println();
    }
}
