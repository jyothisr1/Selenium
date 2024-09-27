package com.automation.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        for (int i = 0; i < 3; i++) {


        JavascriptExecutor javaScriptExecutor=(JavascriptExecutor) driver;
//        javaScriptExecutor.executeScript("arguments[0].style.com.automation.selenium.border='2px solid red;",element);
        javaScriptExecutor.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
        }
    }
}
