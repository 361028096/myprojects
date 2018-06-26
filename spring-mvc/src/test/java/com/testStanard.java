package com;

import org.junit.Test;

import java.util.Random;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class testStanard {

    interface Const{
        public static final int RAND_CONST = new Random().nextInt();
    }

    @Test
    public void test1() {
        Long i =1L;
        System.out.println(i+i);
    }

    @Test
    public void test2()  {
        System.out.println(Const.RAND_CONST);
    }

    @Test
    public void test3() {
        int i = 80;
        String s = String.valueOf(i < 100 ? 90:100);
        String s1 = String.valueOf(i < 100 ? 90:100.0);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.equals(s1));
    }

    @Test
    public void test4() {
        System.out.println(testFinally());
    }

    private boolean testFinally() {
        try{
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            System.out.println("finally....");
        }
    }

}
