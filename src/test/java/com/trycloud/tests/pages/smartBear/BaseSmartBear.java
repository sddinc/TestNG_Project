package com.trycloud.tests.pages.smartBear;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.junit.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSmartBear {
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlSmartBear"));
    }
    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

}
