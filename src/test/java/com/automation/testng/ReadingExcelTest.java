package com.automation.testng;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadingExcelTest {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook("C:\\ust\\Selenium\\src\\test\\resources\\Data\\LoginDetails.xlsx");
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int noOfRow=sheet.getLastRowNum();
//        XSSFRow row=sheet.getRow(1);
//        XSSFCell cell=row.getCell(1);
//        System.out.println(cell);
        for (int i = 1; i <noOfRow; i++) {
            XSSFRow row=sheet.getRow(i);
            for(int j = 0; j < row.getLastCellNum(); j++) {
                XSSFCell cell=row.getCell(j);
                System.out.println(cell.getStringCellValue());
            }
        }


    }
}
