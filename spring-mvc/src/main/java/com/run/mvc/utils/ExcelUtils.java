package com.run.mvc.utils;


import com.run.mvc.utils.model.TittleModel;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

/**
 * @author hewei
 * @description excel相关工具类
 * @date 2018/5/13
 */
public class ExcelUtils {
    private final static Logger logger = LoggerFactory.getLogger(ExcelUtils.class);

    /**
     * 导出excel
     * @param tittleModelList
     * @param dataListA
     * @param sheetAName
     * @param outputPath
     * @param outputFileName
     * @return
     */
    public static Boolean exportExcel(List<TittleModel> tittleModelList, List<Map<String, String>> dataListA, String sheetAName, String outputPath,String outputFileName) {
        try{
//            String fileName = ExcelUtils.getClass().getClassLoader().getResource("").getPath() + templateFilePath;
//            String fileName;
//            File file = new File(fileName);
//            InputStream in = new FileInputStream(file);
            // 第一步，创建一个workbook，对应一个Excel文件
            XSSFWorkbook workbook = new XSSFWorkbook();
            // 第二步，创建一个sheet
            XSSFSheet xssfSheet = workbook.createSheet(sheetAName);
            // 第三步，创建表头
            XSSFRow xssfRow = xssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            XSSFCellStyle xssfCellStyle = workbook.createCellStyle();
            // 居中样式
            xssfCellStyle.setAlignment(HorizontalAlignment.CENTER);

            XSSFCell xssfCell = null;
            for (int i = 0; i < tittleModelList.size(); i++) {
                xssfCell = xssfRow.createCell(i);
                xssfCell.setCellValue(tittleModelList.get(i).getChineseName());
                xssfCell.setCellStyle(xssfCellStyle);
            }

            // 第五步，写入实体数据
            for (int row = 0; row < dataListA.size(); row++) {
                xssfRow = xssfSheet.createRow(row+1);
                xssfRow.setRowStyle(xssfCellStyle);
                Map<String,String> rowMap = dataListA.get(row);
                for (int column = 0; column < tittleModelList.size(); column++) {
                    String value = rowMap.get(tittleModelList.get(column).getEnglishName());
                    value = StringUtils.isBlank(value) ? "":value;
                    xssfRow.createCell(column).setCellValue(value);
                }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                //指定路径与名字和格式
                String path = outputPath + outputFileName;
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                //将数据写出去
                workbook.write(fileOutputStream);
                //关闭输出流
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            logger.error("导出文件信息错误：" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static List<Map<String,String>> parseExcel() {
        return null;
    }
}
