package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class coin {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.co.uk/itm/232642919067?itmmeta=01J2DRMFPR71GYXNPY03X80CNF&hash=item362a993a9b:g:fEoAAOSw8vNaac0E&itmprp=enc%3AAQAJAAAA8H6V7tAFMynofwqBHXi3B%2Byvf2Dbor1rz0fwhGoNu47%2BgGPMrblsCLH1upQW7HjMuDC5f5D10yR4ZrXXaUMJ9cwfZy%2F36vYhgUjBkuwVkmCBY2jlUCOIZkbUIgzfSuzISAlasabQDemEPPC2qd%2FrLivM2u1jCA98S8X%2Fy5dtwMSn8q4uwGHmcvRDRwFiWI0TzSC1BYxi0oiRWKpI%2FWM7i9fAa%2FV%2FGX5mNDHlvKfqHXIhsekANb3V9EP8nrKbQ30VgaVUwEgUky4hohv7ckw5ttKAlAoyPUhwu8CQKKpGqD5b%2FjY4jq5WzpYs4aXtyTUYJA%3D%3D%7Ctkp%3ABFBMuvvRuJNk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//span[@class='details__label']")).click();
        System.out.println(driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span")).getText());

    }
}
