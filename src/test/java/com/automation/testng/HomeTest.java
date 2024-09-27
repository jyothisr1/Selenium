package com.automation.testng;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
    @Test(groups = "Smoke")
    public void Test6(){
        System.out.println("Test6");
    }
    @Test(groups = "completed")
    public void Test7(){
        System.out.println("Test7");
    }
    @Test(groups = "wip")
    public void Test8(){
        System.out.println("Test8");
    }
    @Test
    public void Test9(){
        System.out.println("Test9");
    }
}
