package com.automation.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

    @Test
    public  void softTest(){
        SoftAssert softAssertTest=new SoftAssert();
        softAssertTest.assertEquals(10,10);
        softAssertTest.assertEquals(10,10);
        softAssertTest.assertEquals(10,1);
        softAssertTest.assertEquals(10,1);
        softAssertTest.assertTrue(10>1);
        softAssertTest.assertAll();
    }
}
