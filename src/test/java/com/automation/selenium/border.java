package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class border {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement a= driver.findElement(By.id("APjFqb"));
        a.sendKeys("jii");
        //driver.findElement(By.id("input")).click();
        JavascriptExecutor javaScriptExecutor=(JavascriptExecutor) driver;
        javaScriptExecutor.executeScript("arguments[0].style.com.automation.selenium.border='2px solid red';",a);
        Thread.sleep(3000);
    }
}
