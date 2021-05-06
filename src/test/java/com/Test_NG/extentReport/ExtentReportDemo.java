package com.Test_NG.extentReport;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportDemo  {
    @BeforeTest
    public void config(){

    }


    @Test
    public void initialDemo(){
        Driver.getDriver().get("ttps://rahulshettyacademy.com");





    }
}
