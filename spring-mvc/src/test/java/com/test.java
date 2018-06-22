package com;

import com.alibaba.fastjson.JSON;
import com.run.mvc.dao.mapper.TestMapper;
import com.run.mvc.dao.model.TestExample;
import com.run.mvc.service.ITestService;
import com.run.mvc.vo.ResultBean;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.net.nntp.Threadable;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;

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
    @Resource
    private TestMapper testMapper;

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

    @Test
    public void setTestService() {
        List<String> nameList = new ArrayList<>();
        nameList.add("贺炜");
        nameList.add("haha");
        TestExample testExample = new TestExample();
        TestExample.Criteria testExampleCriteria = testExample.createCriteria();
        testExampleCriteria.andNameIn(nameList);

        com.run.mvc.dao.model.Test test = new com.run.mvc.dao.model.Test();
        test.setInstalment(7);
        testMapper.updateByExampleSelective(test,testExample);
    }

    @Test
    public void testRange() {
        TestExample testExample = new TestExample();
        TestExample.Criteria testExampleCriteria = testExample.createCriteria();

        DateTime dateTime = new DateTime().withMillisOfDay(0);
        testExampleCriteria.andFreezeTimeLessThan(dateTime.toDate());
        List<com.run.mvc.dao.model.Test> testList = testMapper.selectByExample(testExample);
        System.out.println(testList);
        System.out.println(dateTime);
    }

    @Test
    public void testJoda() {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.centuryOfEra());
    }

    @Test
    public void testMap() {
        Map map = new HashMap();
        map = null;
        System.out.println(map.size());

    }

    @Test
    public void test7() {
        Map map = new HashMap();
//        map.put(1,1);
        map.put("            ",null);
        map.put("asdf","null");
        Map map2 = new HashMap();
        map2 = (Map) map.get("f");
        System.out.println(map2);

//        map.put(null,null);
        System.out.println(JSON.toJSONString(map));
//        System.out.println(null != map && map.size() == 1 );
//        System.out.println(map.size());
//        System.out.println(map.get(""));
        System.out.println(Arrays.asList(map));
    }

    @Test
    public void test8() {
        System.out.println(testMapper.countByExample(new TestExample()));
    }

    @Test
    public void testNum() {
        Long n = 0L;
        Long m = 0L;
        if (n>0L || m>0L) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Test
    public void testLocalTime1() {
        LocalDate localDate = new LocalDate();
        System.out.println();
    }

    @Test
    public void testNull() {
        TestExample testExample = new TestExample();
        TestExample.Criteria testExampleCriteria = testExample.createCriteria();
        testExampleCriteria.andNameEqualTo("abcf");
        List<com.run.mvc.dao.model.Test> testList = testMapper.selectByExample(testExample);
        System.out.println(Arrays.asList(testList));
        System.out.println(testList.isEmpty());
        System.out.println(testList.size() == 0);
        System.out.println(testList == null);
    }

    @Test
    public void test2() {
        System.out.println(DateUtils.addDays(new Date(),1));
    }

    @Test
    public void testRange2() {
        TestExample testExample = new TestExample();
        TestExample.Criteria testExampleCriteria = testExample.createCriteria();
        testExampleCriteria.andInstalmentBetween(9,9);
        List<com.run.mvc.dao.model.Test> testList = testMapper.selectByExample(testExample);
        System.out.println(Arrays.asList(testList));
        System.out.println(testList.isEmpty());
        System.out.println(testList.size() == 0);
        System.out.println(testList == null);
    }

    @Test
    public void testNull2() {
        List<com.run.mvc.dao.model.Test> testList = new ArrayList<>();
        testList = null;
        System.out.println(testList.isEmpty());
    }

    @Test
    public void testFinal() {
        final List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("world");
        List<String> unmodifiableStrList = strList;
        unmodifiableStrList.add("again");
        System.out.println(JSON.toJSONString(strList));
        System.out.println(JSON.toJSONString(unmodifiableStrList));

    }

    @Test
    public void testInsert() {
        com.run.mvc.dao.model.Test test = new com.run.mvc.dao.model.Test();
        test.setId("4");
        System.out.println(testMapper.insertSelective(test));
    }

    @Test
    public void setTestService2() {
        System.out.println(testMapper.selectById("12")== null);
    }
}
