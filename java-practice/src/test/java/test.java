import com.alibaba.fastjson.JSON;
import com.run.practice.suggest151.dto.Student;
import org.junit.Test;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/23
 */
public class test {

    @Test
    public void test() {
        System.out.println(NumberFormat.getCurrencyInstance().format(100/100));
    }

    @Test
    public void testFor() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;
        }
        System.out.println(count);
    }

    @Test
    public void testInsert() {
        // 断言
        assertEquals("foo","foo");
        assertFalse(Boolean.FALSE);
    }

    @Test
    public void testInteger() {
        Integer i = new Integer(100);
        Integer j = new Integer(100);
        System.out.println(i.equals(j));
    }

    @Test
    public void testTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        date.setHours(23);
        System.out.println(simpleDateFormat.format(date));
    }

    @Test
    public void testMap() {
        Map<String,Object> map = new HashMap<>();
        System.out.println(map);
        System.out.println(JSON.toJSONString(map));
        System.out.println(map.isEmpty());
    }

    @Test
    public void testNull() {
        System.out.println("aa".equals("aa"));
    }

    @Test
    public void testStudent() {
        Student student = new Student();
        student.getName();
        System.out.println(student.getName());
    }


}
