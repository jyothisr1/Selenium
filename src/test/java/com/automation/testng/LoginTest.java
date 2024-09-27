package com.automation.testng;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Parameters("browser")
    @Test
    public void Test1(String browser){
        System.out.println("Test1"+browser);
    }
    @Test(groups = "Smoke")
    public void Test2(){
        System.out.println("Test2");
    }
    @Test(groups = {"Smoke","completed"})
    public void Test3(){
        System.out.println("Test3");
    }
    @Test(groups = "wip")
    public void Test4(){
        System.out.println("Test4");
    }
    @Test
    public void Test5(){
        System.out.println("Test5");
    }
}
