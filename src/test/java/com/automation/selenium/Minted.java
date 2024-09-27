package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Minted {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.minted.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        driver.findElement(By.id("bx-element-2619155-Gu64MsV-input")).click();
        String email="jyo@gmail.com";
        driver.findElement(By.id("bx-element-2619155-Gu64MsV-input")).sendKeys(email);
        String s=driver.findElement(By.id("bx-element-2619155-Gu64MsV-input")).getAttribute("value");
        if(s.equalsIgnoreCase(email)){
            System.out.println(s);
        }


    }
}
