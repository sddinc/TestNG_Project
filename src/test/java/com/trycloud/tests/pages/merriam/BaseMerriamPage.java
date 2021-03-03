package com.trycloud.tests.pages.merriam;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseMerriamPage {
    public BaseMerriamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlMerriam"));
    }

    @AfterClass
    public void tearDown(){
        Driver.getDriver().close();
    }
}
