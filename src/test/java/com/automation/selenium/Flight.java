package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Flight {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//li[2]//span")).click();
        driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon']/button")).click();
        driver.findElement(By.id("origin_select")).sendKeys("trivandrum");
        driver.findElement(By.xpath("//ul//button")).click();
        driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
        driver.findElement(By.xpath("//input[@id='destination_select']")).sendKeys("goa");
        driver.findElement(By.xpath("//button[@aria-label='Goa (GOI - Dabolim) India']")).click();
        //button[contain(aria-label,Goa (GOI - Dabolim) India)]
//        driver.findElement()





    }
}
