package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.ebay.com/");
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("laptop");
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
//
//        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
//        Select Dropdown=new Select(dropdown);
//        Select s=new Select(dropdown);
//        Dropdown.selectByVisibleText("Music");
//        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
//        WebElement a=driver.findElement(By.name("LH_TitleDesc"));
//        WebElement b=driver.findElement(By.name("LH_Complete"));
//        if(!a.isSelected()){
//            a.click();
//        }
//        if(!b.isSelected()){
//            b.click();
//        }

//        WebElement d=driver.findElement(By.id("gh-cat"));
//        Select s=new Select(d);
//        List<WebElement> ls=s.getOptions();
//        for (int i = 0; i < ls.size(); i++) {
//            String st=ls.get(i).getText();
//            System.out.println(st);
//
//        }
        //ul[@class='srp-results srp-list clearfix']/li[@id]//span[@class='s-item__price']
        //table[@id='table1']//tr/td[not(a)]

//        WebElement el= driver.findElement(By.xpath("//li/a[text()='Electronics']"));
//        WebElement al=driver.findElement(By.xpath("//li/a[text()='Apple']"));
//
//        Actions action=new Actions(driver);
////        action.moveToElement(el).pause(1000).click(al).build().perform();
//        action.moveToElement(el).pause(1000).keyDown(Keys.CONTROL).click(al).keyDown(Keys.CONTROL).build().perform();


//        System.out.println(driver.findElement(By.xpath("//

        WebElement iframe =driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);

        WebElement content =driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        System.out.println(content.getText());

        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//h3")).getText());

    }
}
