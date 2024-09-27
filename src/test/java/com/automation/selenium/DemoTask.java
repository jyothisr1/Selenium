package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemoTask {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//input")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText()
        );

        System.out.println(driver.findElement(By.xpath("//div[@class='inventory_item_desc']")).getText()
        );

        System.out.println(driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText()
        );

        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("jy");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("r");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

        List<WebElement> ls = driver.findElements(By.xpath("//div[@class='summary_info_label']"));

        for(WebElement l:ls){
            System.out.println(l.findElement(By.xpath("./div")).getText());
        }

    }
}
