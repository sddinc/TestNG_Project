package com.trycloud.tests;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Google_Title_Verification {
    WebDriver driver;


    @Test
    public void Title_Verification(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGoogle"));
      //  WebElement element = driver.findElement(By.id())
        String expectedTitleVerify = "Google";
        String actualTitleVerify = driver.getTitle();
        driver.close();
        Assert.assertEquals(actualTitleVerify,expectedTitleVerify,"title is not verify!!");

    }
}
