package com;

import com.run.mvc.utils.ExcelUtils;
import com.run.mvc.utils.model.TittleModel;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/13
 */
public class testExcel {

    private static final Logger logger = LoggerFactory.getLogger(testExcel.class);
    @Test
    public void test(){
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        System.out.println(stringList.get(1));
        System.out.println(stringList.size());
    }

    @Test
    public void testTryCatch() {
        System.out.println(getResult());
        System.out.println("aaaa");
    }
    private Boolean getResult () {
        try{
//            throw new Exception("错误");
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Test
    public void testExportUtils() {

        List<TittleModel> tittleModelList = new ArrayList<>();
        TittleModel tittle1 = new TittleModel();
        TittleModel tittle2 = new TittleModel();
        TittleModel tittle3 = new TittleModel();
        tittle1.setChineseName("id");
        tittle1.setEnglishName("id");
        tittle2.setChineseName("姓名");
        tittle2.setEnglishName("name");
        tittle3.setChineseName("年龄");
        tittle3.setEnglishName("age");
        tittleModelList.add(tittle1);
        tittleModelList.add(tittle2);
        tittleModelList.add(tittle3);
        List<Map<String, String>> dataListA = new ArrayList<>();
        Map<String,String> row1 = new HashMap<>();
        row1.put("id",new Date().toString());
        row1.put("name","hahah");
        row1.put("age","   ");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Map<String,String> row2 = new HashMap<>();
        row2.put("id",sdf.format(new Date()));
        row2.put("name","\b");
        row2.put("age","77777777777777777777777777777777777777");
        dataListA.add(row1);
        dataListA.add(row2);
        String sheetAName = "表头";
        String outputPath = "d://" ;
        String outputFileName = "20180514.xlsx";
        ExcelUtils.exportExcel(tittleModelList,dataListA,sheetAName,outputPath,outputFileName);
    }

    @Test
    public void testParse() {
        try {
            InputStream inputStream = new FileInputStream("d://20180514.xlsx");
            System.out.println(ExcelUtils.readExcel(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNull() {
        com.run.mvc.dao.model.Test  test = new com.run.mvc.dao.model.Test();
        test.setId("1");
        System.out.println(StringUtils.trimToEmpty(new BigDecimal(1.1).toString()));
        System.out.println(StringUtils.trimToEmpty(""));
    }

    @Test
    public void testDoWhile() {
        Integer times = 0;
        Boolean result = false;
        do{
            times++;
            if (times==2) {
                result = true;
            }
            if(result) {
                break;
            }
        }while(times<5);
        System.out.println(times);
    }

    @Test
    public void testLog() {
        try {
            throw new NullPointerException("错误");
        } catch (Exception e) {
            logger.error("错误",e);
            throw new NullPointerException("打印"+e);
        }
    }

}
