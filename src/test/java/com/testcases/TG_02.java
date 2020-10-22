package com.testcases;

import org.testng.annotations.Test;

public class TG_02 extends Annotations{
    @Test(groups = {"somke","sanity"})
    public void doTest(){
        System.out.println("System Testing with TestNG");
    }
}
