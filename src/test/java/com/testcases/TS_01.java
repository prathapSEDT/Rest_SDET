package com.testcases;


import org.testng.annotations.Test;

public class TS_01 extends Annotations{


    @Test(testName = "Login",priority = 1)
    public void login(){
        System.out.println("Logging into system");
    }

    @Test(testName = "Navigate to home page",priority = 2)
    public void NavigateToHomePage(){
        System.out.println("Navigating to Home Page");
    }

    @Test(testName = "Create Customer",priority = 3,groups = {"somke"})
    public void RegisterUser(){
        System.out.println("Register New User");
    }

    @Test(priority = 4,groups = {"somke"})
    public void validateFormFields(){
        System.out.println("Validating Form Fields");
    }

    @Test(testName = "Logout",priority = 5)
    public void logout(){
        System.out.println("Logging out from system");
    }





}
