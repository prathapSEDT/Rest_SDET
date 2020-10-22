package com.testcases;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class......");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class......");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method.......");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method......");
    }




}
