package com.automation.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginBase {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
    }

    @AfterMethod
    public void clean(){
        driver.quit();
    }
}
