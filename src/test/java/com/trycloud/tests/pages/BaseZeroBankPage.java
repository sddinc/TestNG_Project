package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public abstract class BaseZeroBankPage {

    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @BeforeClass
    public  void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlZeroBank"));
    }



}
