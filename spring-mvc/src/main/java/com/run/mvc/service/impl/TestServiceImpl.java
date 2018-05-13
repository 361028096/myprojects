package com.run.mvc.service.impl;


import com.run.mvc.common.ErrorCodeException;
import com.run.mvc.dao.mapper.TestMapper;
import com.run.mvc.dao.model.Test;
import com.run.mvc.dao.model.TestExample;
import com.run.mvc.service.ITestService;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author : hewei
 * @date : 2018/1/24
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public void InsertTest() throws Exception {

    }

    @Override
    public Test selectTest() {
        System.out.println("get test...");
        Test test = getTest();
        return test;
    }

    private Test getTest() {
        Test test = testMapper.selectByPrimaryKey("1");
        System.out.println(test);
        return test;
    }

    @Override
    public void getErrorCodeException() throws ErrorCodeException{
//        throw new ErrorCodeException(ErrorCodeEnum.PARAM_ERROR);
        throw new RuntimeException("runtimeException");
    }

    @Override
    public void exportXml(String[] titles) throws Exception{
        try{
            // 第一步，创建一个workbook，对应一个Excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet hssfSheet = workbook.createSheet("sheet1");
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        HSSFRow hssfRow = hssfSheet.createRow(0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
        //居中样式
        hssfCellStyle.setAlignment(HorizontalAlignment.CENTER);

        HSSFCell hssfCell = null;
        for (int i = 0; i < titles.length; i++) {
            hssfCell = hssfRow.createCell(i);//列索引从0开始
            hssfCell.setCellValue(titles[i]);//列名1
            hssfCell.setCellStyle(hssfCellStyle);//列居中显示
        }

        // 第五步，写入实体数据
        List<Test> tests = testMapper.selectByExample(new TestExample());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(tests != null && !tests.isEmpty()){
            for (int i = 0; i < tests.size(); i++) {
                hssfRow = hssfSheet.createRow(i+1);
                Test test = tests.get(i);

                // 第六步，创建单元格，并设置值
                String testId = test.getId();
                hssfRow.createCell(0).setCellValue(testId);
                String testName = test.getName();
                hssfRow.createCell(1).setCellValue(testName);
                Date dueDate = test.getDueTime();
                hssfRow.createCell(2).setCellValue(dueDate);
                Integer instalment = test.getInstalment();
                hssfRow.createCell(3).setCellValue(instalment);
                Date freezeTime = test.getFreezeTime();
                hssfRow.createCell(4).setCellValue(freezeTime);
            }
        }

        // 第七步，将文件输出到客户端浏览器
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("d://poi-file//user.xls");//指定路径与名字和格式
            workbook.write(fileOutputStream);//将数据写出去
            fileOutputStream.close();//关闭输出流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }catch(Exception e){
        e.printStackTrace();
        throw new Exception("导出信息失败！");
    }
    }

    @Override
    public void exportXmlx(String[] titles) throws Exception {
        try{
            // 第一步，创建一个workbook，对应一个Excel文件
            XSSFWorkbook workbook = new XSSFWorkbook();
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            XSSFSheet xssfSheet = workbook.createSheet("sheet1");
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            XSSFRow xssfRow = xssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            XSSFCellStyle xssfCellStyle = workbook.createCellStyle();
            //居中样式
            xssfCellStyle.setAlignment(HorizontalAlignment.CENTER);

            XSSFCell xssfCell = null;
            for (int i = 0; i < titles.length; i++) {
                xssfCell = xssfRow.createCell(i);//列索引从0开始
                xssfCell.setCellValue(titles[i]);//列名1
                xssfCell.setCellStyle(xssfCellStyle);//列居中显示
            }

            // 第五步，写入实体数据
            List<Test> tests = testMapper.selectByExample(new TestExample());

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if(tests != null && !tests.isEmpty()){
                for (int i = 0; i < tests.size(); i++) {
                    xssfRow = xssfSheet.createRow(i+1);
                    Test test = tests.get(i);

                    // 第六步，创建单元格，并设置值
                    String testId = test.getId();
                    xssfRow.createCell(0).setCellValue(testId);
                    String testName = test.getName();
                    xssfRow.createCell(1).setCellValue(testName);
                    Date dueDate = test.getDueTime();
                    xssfRow.createCell(2).setCellValue(sdf.format(dueDate));
                    Integer instalment = test.getInstalment();
                    xssfRow.createCell(3).setCellValue(instalment);
                    Date freezeTime = test.getFreezeTime();
                    xssfRow.createCell(4).setCellValue(sdf.format(freezeTime));
                }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("d://poi-file//user.xlsx");//指定路径与名字和格式
                workbook.write(fileOutputStream);//将数据写出去
                fileOutputStream.close();//关闭输出流
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("导出信息失败！");
        }
    }

    @Override
    public void exportXmlxFromTemple() throws Exception {
        try{
//            String filename = this.getClass().getClassLoader().getResource("").toString()+"xmlx/tmple.xlsx";
//            String filename ="D:/0_Learning/myProject/myprojects/spring-mvc/target/test-classes/xmlx/tmple.xlsx";
            String fileName = this.getClass().getClassLoader().getResource("").getPath()+"xmlx/tmple.xlsx";
            File file = new File(fileName);
            InputStream in = new FileInputStream(file);
            // 第一步，创建一个workbook，对应一个Excel文件
            XSSFWorkbook workbook = new XSSFWorkbook(in);
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            XSSFSheet xssfSheet = workbook.getSheet("sheet1");
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            XSSFRow xssfRow;
            // 第四步，创建单元格，并设置值表头 设置表头居中
            XSSFCellStyle xssfCellStyle = workbook.createCellStyle();
            //居中样式
            xssfCellStyle.setAlignment(HorizontalAlignment.CENTER);

//            XSSFCell xssfCell = null;
//            for (int i = 0; i < titles.length; i++) {
//                xssfCell = xssfRow.createCell(i);//列索引从0开始
//                xssfCell.setCellValue(titles[i]);//列名1
//                xssfCell.setCellStyle(xssfCellStyle);//列居中显示
//            }

            // 第五步，写入实体数据
            List<Test> tests = testMapper.selectByExample(new TestExample());

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            if(tests != null && !tests.isEmpty()){
                for (int i = 0; i < tests.size(); i++) {
                    xssfRow = xssfSheet.createRow(i+1);
                    Test test = tests.get(i);

                    // 第六步，创建单元格，并设置值
                    String testId = test.getId();
                    xssfRow.createCell(0).setCellValue(testId);
                    String testName = test.getName();
                    xssfRow.createCell(1).setCellValue(testName);
                    Date dueDate = test.getDueTime();
                    if (dueDate == null) {
                        xssfRow.createCell(2).setCellValue("");
                    } else{
                        xssfRow.createCell(2).setCellValue(sdf.format(dueDate));
                    }
                    Integer instalment = test.getInstalment();
                    if (instalment == null) {
                        xssfRow.createCell(3).setCellValue("");
                    } else{
                        xssfRow.createCell(3).setCellValue(instalment);
                    }
                    Date freezeTime = test.getFreezeTime();
                    if (instalment == null) {
                        xssfRow.createCell(4).setCellValue("");
                    } else{
                        xssfRow.createCell(4).setCellValue(sdf.format(freezeTime));
                    }
                }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("d://poi-file//userFromTmple.xlsx");//指定路径与名字和格式
                workbook.write(fileOutputStream);//将数据写出去
                fileOutputStream.close();//关闭输出流
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("导出信息失败！");
        }
    }
}
