package com.run.mvc.utils;


import com.run.mvc.utils.model.TittleModel;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
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

    /**
     * 读取 office excel
     *
     * @return
     * @throws IOException
     */
    public static List<List<Object>> readExcel(InputStream inputStream) throws IOException {
        List<List<Object>> list = new LinkedList<>();
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(inputStream);
            int sheetsNumber = workbook.getNumberOfSheets();
            for (int n = 0; n < sheetsNumber; n++) {
                Sheet sheet = workbook.getSheetAt(n);
                Object value = null;
                Row row = null;
                Cell cell = null;
                for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getPhysicalNumberOfRows(); i++) { // 从第二行开始读取
                    row = sheet.getRow(i);
                    if (row == null) {
                        continue;
                    }
                    List<Object> linked = new LinkedList<>();
                    for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                        cell = row.getCell(j);
                        if (cell == null) {
                            continue;
                        }
                        value = getCellValue(cell);
                        linked.add(value);
                    }
                    list.add(linked);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(inputStream);
        }
        return list;
    }

    /**
     * 获取excel 单元格数据
     *
     * @param cell
     * @return
     */
    private static Object getCellValue(Cell cell) {
        Object value = null;
        switch (cell.getCellTypeEnum()) {
            case _NONE:
                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            case NUMERIC:
                value = cell.toString();
//                if(DateUtil.isCellDateFormatted(cell)){ //日期
//                    value = FAST_DATE_FORMAT.format(DateUtil.getJavaDate(cell.getNumericCellValue()));//统一转成 yyyy/MM/dd
//                } else if("@".equals(cell.getCellStyle().getDataFormatString())
//                        || "General".equals(cell.getCellStyle().getDataFormatString())
//                        || "0_ ".equals(cell.getCellStyle().getDataFormatString())){
//                    //文本  or 常规 or 整型数值
//                    value = DECIMAL_FORMAT.format(cell.getNumericCellValue());
//                } else if(POINTS_PATTERN.matcher(cell.getCellStyle().getDataFormatString()).matches()){ //正则匹配小数类型
//                    value = cell.getNumericCellValue();  //直接显示
//                } else if("0.00E+00".equals(cell.getCellStyle().getDataFormatString())){//科学计数
//                    value = cell.getNumericCellValue(); //待完善
//                    value = DECIMAL_FORMAT_NUMBER.format(value);
//                } else if("0.00%".equals(cell.getCellStyle().getDataFormatString())){//百分比
//                    value = cell.getNumericCellValue(); //待完善
//                    value = DECIMAL_FORMAT_PERCENT.format(value);
//                } else if("# ?/?".equals(cell.getCellStyle().getDataFormatString())){//分数
//                    value = cell.getNumericCellValue(); ////待完善
//                } else { //货币
//                    value = cell.getNumericCellValue();
//                    value = DecimalFormat.getCurrencyInstance().format(value);
//                }
                break;
            case BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
            case BLANK:
                //value = ",";
                break;
            default:
                value = cell.toString();
        }
        return value;
    }

}
