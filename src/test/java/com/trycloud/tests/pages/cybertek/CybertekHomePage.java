package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
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

    @FindBy(xpath = "//a[.='Dropdown']")
    private WebElement dropDownLink;

    public void clickDropDown() {
        dropDownLink.click();
    }

    @FindBy(xpath = "//a[.='Registration Form']")
    private WebElement registrationLink;

    public void clickRegistrationLink() {
        registrationLink.click();
    }
    @FindBy(xpath = "//a[.='Frames']")
    private WebElement frameLink;

    public void clickFrame(){
        frameLink.click();
    }

     @FindBy(xpath = "//a[.='Hovers']")
    private WebElement hoverLink;

    public void clickHovers(){
        hoverLink.click();
    }

    @FindBy(xpath = "//a[.='Dynamic Loading']")
    private WebElement dynamicLoadingLink;

    public void clickHDynamicLoading() {
        dynamicLoadingLink.click();
    }




}
