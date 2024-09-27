package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondtask {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        int c=1;        for (int i = 0; i <20; i++) {
            System.out.print(driver.findElements(By.xpath("//table[@id='table1']//tr/td[not(a)]")).get(i).getText());
            System.out.print(" ");
            if(c%5==0){
                System.out.println();
            }
            c++;
        }
    }
}
