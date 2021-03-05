package com.trycloud.tests.pages.seleniumEasy;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CheckBoxPage {
    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);


    @FindBy(id = "txtAge")
    private WebElement successMessage;

    @FindBy(id = "isAgeSelected")
    private WebElement checkBoxUnderDemo;

    public Boolean checkSuccessMessage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlSeleniumEasy"));

        return successMessage.isDisplayed();
    }

    public void clickCheckBoxUnderSingleDemo(){

     wait.until(ExpectedConditions.visibilityOf(checkBoxUnderDemo)).click();
    }



}
