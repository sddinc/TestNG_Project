package com.trycloud.tests.pages;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZeroBankLoginPage extends BaseZeroBankPage {
    public ZeroBankLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='Forgot your password ?']")
    private WebElement forgotYourPasswordLink;

    public String attributeValueOfForgotYourPasswordLink(String attribute){
   return wait.until(ExpectedConditions.visibilityOf(forgotYourPasswordLink)).getAttribute(attribute);

    }


}
