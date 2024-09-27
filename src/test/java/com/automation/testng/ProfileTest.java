package com.automation.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{
    @Test(groups = "completed")
    public void Test10(){
        System.out.println("Test10");
    }
    @Test(groups = "wip")
    public void Test11(){
        System.out.println("Test11");
    }
    @Test(groups = "Smoke")
    public void Test12(){
        System.out.println("Test12");
    }
    @Test
    public void Test13(){
        System.out.println("Test13");
    }
}
