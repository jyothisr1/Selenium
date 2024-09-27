package com.automation.testng;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Before");
    }
    @AfterClass
    public void clean(){
        System.out.println("After");
    }

//    @BeforeTest
//    public void setU(){
//        System.out.println("BeforeTest");
//    }
//    @AfterTest
//    public void clea(){
//        System.out.println("AfterTest");
//    }
//
//    @BeforeMethod
//    public void set(){
//        System.out.println("BeforeMethod");
//    }
//    @AfterMethod
//    public void cle(){
//        System.out.println("AfterMethod");
//    }
}
