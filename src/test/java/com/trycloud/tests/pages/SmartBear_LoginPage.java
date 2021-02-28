package com.trycloud.tests.pages;

import com.trycloud.tests.tasks.SmartBear;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear_LoginPage {

    public SmartBear_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userNameInput;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement userPassInput;

    public void login(String userName, String password){

        Driver.getDriver().get(ConfigurationReader.getProperty("urlSmartBear"));
        userNameInput.sendKeys(userName);
        userPassInput.sendKeys(password + Keys.ENTER);
    }
}
