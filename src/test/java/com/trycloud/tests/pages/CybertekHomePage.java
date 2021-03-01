package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CybertekHomePage{
    public CybertekHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //PageFactory support POM

    }
@FindBy(xpath = "//a[.='Forgot Password']")
    private WebElement forgetPasswordLink;

    public  void clickForget(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCybertek"));
        forgetPasswordLink.click();
    }

}
