//package com.automation.testng;
//
//import org.checkerframework.checker.units.qual.C;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class SLoginTest{
//        @Test(dataProvider = "validUser")
//        public void Login(String a){
//            WebDriver driver=new ChromeDriver();
//            driver.get("https://www.saucedemo.com");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//            driver.findElement(By.xpath("//input")).sendKeys(a);
//            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//            String b="Swag Labs";
//            driver.findElement(By.xpath("//input[@type='submit']")).click();
//            Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText().contains(b));
//        }
//
//        @DataProvider(name = "validUser")
////        public String[][] user(){
////            String[][] s={"standard_user","problem_user","performance_glitch_user","error_user","visual_user"};
////            return s;
////        }
//}
