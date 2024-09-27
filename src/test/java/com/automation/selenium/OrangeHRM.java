package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


        driver.findElement(By.name("username")).sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
        driver.findElement(By.xpath("//span[text()='ESS']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//span[text()='Enabled']")).click();
        driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("Timothy Lewis Amiano");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='oxd-autocomplete-option']")).click();
        driver.findElement(By.xpath("//div[4]/div/div[2]/input")).sendKeys("timutty");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//label[text()='Password']/../following-sibling::div/input")).sendKeys("timutty123");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/../following-sibling::div/input")).click();
        driver.findElement(By.xpath("//label[text()='Confirm Password']/../following-sibling::div/input")).sendKeys("timutty123");

    }
}
