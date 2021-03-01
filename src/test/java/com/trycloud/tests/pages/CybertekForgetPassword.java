package com.trycloud.tests.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CybertekForgetPassword {
    public CybertekForgetPassword() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Home']")
    private WebElement homeLink;

    public boolean isHomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }

    @FindBy(xpath = "//h2")
    private WebElement forgetPasswordText;

    @FindBy(xpath = "//label")
    private WebElement emailLabel;

    @FindBy(xpath = "//i[.='Retrieve password']")
    private WebElement retrievePasswordButton;


    @FindBy(xpath = "//a[.='Cybertek School']/..")
    private WebElement PoweredByCybertekSchoolText;

}
