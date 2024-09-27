package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;


public class NextWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
//        driver.findElement(By.xpath("//*[@id=\"s0-0-13-2-39-textbox\"]")).sendKeys("iphone");

        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("(//div[@class='s-item__title'])[3]")).click();
        driver.findElement(By.xpath("(//div[@class='s-item__title'])[4]")).click();
        driver.findElement(By.xpath("(//div[@class='s-item__title'])[5]")).click();
        driver.findElement(By.xpath("(//div[@class='s-item__title'])[6]")).click();
        driver.findElement(By.xpath("(//div[@class='s-item__title'])[7]")).click();


        Thread.sleep(3000);
//        driver.switchTo().window(originalWindow);
        Set<String> listOfWindow = driver.getWindowHandles();

        for (String window : listOfWindow) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                Thread.sleep(3000);
                driver.close();
                Thread.sleep(3000);
            }
        }
        driver.switchTo().window(originalWindow);
    }
}
