package test;

import org.junit.Test;

import java.util.Random;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/9
 */
public class test {
    @Test
    public void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(2));
        }
    }

    @Test
    public void name() throws Exception {
    }
}
