package com.Test_NG.test;

//rahulonlinetutor@gmail.com

import org.testng.annotations.*;

public class CarLoan {
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass executing any methods in the class(CarLoanClass)");
    }

    @Parameters({"URL"})
    @Test
    public void WebLoginCarLoan(String urlName) {
        //selenium
        System.out.println("WebLoginCarLoan");
        System.out.println(urlName);
//        System.out.println(key);

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(" I will execute before every test method in the class(CarLoanClass)");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(" I will execute after  every test method in CarLoan class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class executing all methods in the class(CarLoanClass)");
    }
//
    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        //Appium
        System.out.println("MobileLoginCarLoan");
    }

    @BeforeSuite
    public void Bfsuite() {
        System.out.println(" I am no 1-BeforeSuite");
    }

    @Test(enabled = false)
    public void MobileSignInCarLoan() {
        //Appium
        System.out.println("Mobile SIGIN");
    }
//
    @Test//(dataProvider = "getData")
    public void MobileSignOutCarLoan() {
        //Appium
        System.out.println("Mobile SIGNOUT");


    }
//
    @Test(dependsOnMethods = {"WebloginCarLoan", "MobilesignoutcarLoan"})
    public void APICarLoan() {
        //Rest API automation
        System.out.println("APICarLoan");
    }





}
