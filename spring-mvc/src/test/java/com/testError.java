package com;

import org.junit.Test;

import java.io.*;

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

}
