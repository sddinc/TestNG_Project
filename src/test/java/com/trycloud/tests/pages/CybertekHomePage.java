package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CybertekHomePage extends BaseCybertekPage{

@FindBy(xpath = "//a[.='Forgot Password']")
    private WebElement forgetPasswordLink;
    public  void clickForgetPassword(){
        forgetPasswordLink.click();
    }

    @FindBy(xpath = "//a[.='Add/Remove Elements']")
    private WebElement addRemoveLink;
    public  void clickAddRemoveLink(){
        addRemoveLink.click();
    }

}
