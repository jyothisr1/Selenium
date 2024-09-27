package com.automation.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerttest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement alr=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        alr.click();
        Alert alert= driver.switchTo().alert();
//        Thread.sleep(2000);
        alert.sendKeys("hi");
//        Thread.sleep(2000);
        alert.accept();

        WebElement al=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        alr.click();
        alert.sendKeys("hlo");
        alert.accept();
    }
}
