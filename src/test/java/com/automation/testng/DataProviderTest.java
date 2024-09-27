package com.automation.testng;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderTest {

    @Test(dataProvider = "NegativeDataProvider")
    public void test(String amount){
        System.out.println("Negative "+amount);
    }

    @DataProvider(name = "NegativeDataProvider")
    public Object[] getNegativeData(){
        Object[] data={"0.9","-5","100.1","abc"};
        return data;
    }

    @DataProvider(name = "NegativeDataProvide")
    public Object[][] getNegativeDat() throws IOException {
//        System.out.println("Negative "+amount);
        XSSFWorkbook workbook=new XSSFWorkbook("C:\\ust\\Selenium\\src\\test\\resources\\Data\\credentials.xlsx");
        XSSFSheet sheet=workbook.getSheet("sheet1");
        sheet.getLastRowNum();


    }
}
