package com.trycloud.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CybertekPageForgetPassword extends BaseCybertekPage {

    @FindBy(xpath = "//h2")
    private WebElement forgetPasswordText;

    public boolean isForgetPasswordText() {
        return forgetPasswordText.isDisplayed();
    }

    @FindBy(xpath = "//label")
    private WebElement emailLabel;

    public boolean isEmailLabel() {
        return emailLabel.isDisplayed();
    }

    @FindBy(xpath = "//i[.='Retrieve password']")
    private WebElement retrievePasswordButton;

    public boolean isRetrievePasswordButton() {
        return retrievePasswordButton.isDisplayed();
    }

    @FindBy(xpath = "//a[.='Cybertek School']/..")
    private WebElement poweredByCybertekSchoolText;

    public boolean isPoweredByCybertekSchoolText() {
        return poweredByCybertekSchoolText.isDisplayed();
    }
}
