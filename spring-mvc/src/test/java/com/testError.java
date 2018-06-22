package com;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/21
 */
public class testError {

    private String runtimeServerMethod(String s) {
        if (s == null) {
            throw new RuntimeException("runtimeServerMethod 方法的字符串不能为空");
        }
        return s;
    }

    private BufferedReader bufferedReader;
    private String checkedServerMethod(String s) throws IOException {
        File file = new File(s);
        Reader reader = new FileReader(file);
        bufferedReader = new BufferedReader(reader);
        String result = bufferedReader.readLine();
        return result;
    }

    @Test
    public void test1() {
        System.out.println("---------try-catch-before");
        String result = this.runtimeServerMethod(null);
        System.out.println("------------result:" + result);
        System.out.println("--------------------try-catch-after");
    }

    @Test
    public void test2() {
        System.out.println("try-catch-before");
        String result = null;

        try {
            result = this.runtimeServerMethod(null);
            System.out.println("result ：" + result);
        } catch (Exception e) {
            System.out.println("in-catch");
//            e.printStackTrace();
        }
        System.out.println("try-catch-after");
    }

    @Test
    public void test3() {
        List<com.run.mvc.dao.model.Test> testList = new ArrayList<>();
        for (com.run.mvc.dao.model.Test test : testList) {
            System.out.println("a");
        }
    }

    @Test
    public void testBigDecimal() {
        BigDecimal bigDecimal = new BigDecimal(10.99);
        System.out.println(bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void testList() {
        List<com.run.mvc.dao.model.Test> list = new ArrayList<>();
        System.out.println(Arrays.asList(list));
    }

    @Test
    public void testMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("1","2");
        map.put("1",3);
        System.out.println(JSON.toJSONString(map));
    }

    @Test
    public void testMap2() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        Map<String,Object> map1 = new HashMap<>();
        map1.put("bankCard",1);
        map1.put("idCardNumber",2);

        Map<String,Object> map2 = new HashMap<>();
        map2.put("bankCard",11);
        map2.put("idCardNumber",22);
        map2.put("butlerMobile",33);
        resultList.add(map1);
        resultList.add(map2);
        System.out.println(JSON.toJSONString(resultList));
        for (Map<String,Object> orderMap : resultList) {
            if (orderMap.get("bankCard") != null && !StringUtils.isBlank(orderMap.get("bankCard").toString())) {
                orderMap.put("bankCard","01");
            }
            if (orderMap.get("idCardNumber") != null && !StringUtils.isBlank(orderMap.get("idCardNumber").toString())) {
                orderMap.put("idCardNumber","02");
            }
            if (orderMap.get("butlerMobile") != null && !StringUtils.isBlank(orderMap.get("butlerMobile").toString())) {
                orderMap.put("butlerMobile","03");
            }
        }
        System.out.println("-修改后----------------------------------------------------");
        System.out.println(JSON.toJSONString(resultList));
    }

}
