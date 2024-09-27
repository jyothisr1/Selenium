package com.automation.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginCheckTest extends LoginBase{

    @Test(dataProvider = "validUser")
    public void Login(String a){
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//input")).sendKeys(a);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        String b="Swag Labs";
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText().contains(b));
    }


      @Test(dataProvider = "invalidUser")
      public void Login1(String a){
        driver.get("https://www.saucedemo.com");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//input")).sendKeys(a);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        String b="Epic sadface: Sorry, this user has been locked out.";
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).getText().contains(b));
    }


    @DataProvider(name = "validUser")
    public String[] user(){
        String[] s={"standard_user","problem_user","performance_glitch_user","error_user","visual_user"};
        return s;
    }


    @DataProvider(name = "invalidUser")
    public String[] user1(){
        String[] s={"locked_out_user"};
        return s;
    }
}
