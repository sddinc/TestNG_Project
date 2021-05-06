package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class CVSBasePage {
    public CVSBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCvs"));
    }



}
