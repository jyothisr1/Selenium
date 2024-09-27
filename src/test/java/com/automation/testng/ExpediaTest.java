package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class ExpediaTest {
    public static void selectDate(String date, WebDriver driver) throws InterruptedException {
        String xpathDay="";
        String monthYear=date.substring(date.indexOf(' ')+1);
        String day =date.substring(0,date.indexOf(' '));

        WebElement monthYearElement=driver.findElement(By.xpath(""));

        while(!monthYear.equals(monthYearElement.getText())){
            WebElement nextBtn =driver.findElement(By.xpath(""));
            nextBtn.click();
            monthYearElement=driver.findElement(By.xpath(""));
            Thread.sleep(2000);

        }
        String dayLocator =String.format(xpathDay,day);
        WebElement dayElement=driver.findElement(By.xpath(dayLocator));
        dayElement.click();
    }
}
