package com;

import com.run.mvc.utils.MoneyConvertUtil;
import com.run.mvc.utils.NumberToCN;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/30
 */
public class testMoney {
    @Test
    public void testMoney() {
        System.out.println("aaaa");
        try {
            System.out.println(MoneyConvertUtil.digitUppercase("0.01"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMoney2() {
        System.out.println(NumberToCN.number2CNMontrayUnit(new BigDecimal("100000000.11")));
    }

    @Test
    public void testString() {
        String string = new String();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        Integer integer = Integer.valueOf(1);

        List<String> stringList = new ArrayList<>();
        List<String> stringList1 = new LinkedList<>();
    }

}
