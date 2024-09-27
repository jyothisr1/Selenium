package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/?msockid=21a0ecb26c676e79344df8c36dae6f12");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"item5a25579a61\"]/div/div[2]/a/div/span")).click();


    }
}
