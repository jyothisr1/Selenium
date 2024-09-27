package com.automation.testng;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileReader("C:\\ust\\Selenium\\src\\test\\resources\\Data\\config.properties"));
        System.out.println(properties.getProperty("login.username"));

    }
}
