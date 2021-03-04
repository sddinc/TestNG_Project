package com.trycloud.tests.pages.cybertek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CybertekHomePage extends BaseCybertekPage {

    @FindBy(xpath = "//a[.='Forgot Password']")
    private WebElement forgetPasswordLink;

    public void clickForgetPassword() {
        forgetPasswordLink.click();
    }

    @FindBy(xpath = "//a[.='Add/Remove Elements']")
    private WebElement addRemoveLink;

    public void clickAddRemoveLink() {
        addRemoveLink.click();
    }

    @FindBy(xpath = "//a[.='Multiple Windows']")
    private WebElement multipleWindowsLink;

    public void clickMultipleWindows() {
        multipleWindowsLink.click();

    }

    @FindBy(xpath = "//a[.='Checkboxes']")
    private WebElement checkBoxesLink;


    public void clickCheckboxes() {
        checkBoxesLink.click();

    }


}
