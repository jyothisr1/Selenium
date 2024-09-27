package com.automation.testng;

import org.testng.annotations.Test;

public class DemoTest {

    @Test(priority = 1,dependsOnMethods = "testMethod3")
    public void testMethod1(){
        System.out.println("test1");
    }
    @Test(priority = 2)
    public void testMethod2(){
        System.out.println("test2");
    }
    @Test(priority = 3)
    public void testMethod3(){
        System.out.println("test3");
    }
}
