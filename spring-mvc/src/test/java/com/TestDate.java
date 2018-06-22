package com;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/4
 */
public class TestDate {
    @Test
    public void testSDF() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        if (DateTimeUtils)
        System.out.println(simpleDateFormat.format(null));
    }

    @Test
    public void testMap() {
        Map<String,String> map = new HashMap<>();
        System.out.println(map.get("a")==null);
    }
}
