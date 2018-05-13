package com;

import com.run.mvc.utils.ExcelUtils;
import com.run.mvc.utils.model.TittleModel;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/13
 */
public class testExcel {
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
}
