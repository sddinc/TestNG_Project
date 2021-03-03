package com.trycloud.tests.pages.zeroBank;

import com.trycloud.tests.pages.zeroBank.BaseZeroBankPage;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZeroBankLoginPage extends BaseZeroBankPage {
    public ZeroBankLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.='Forgot your password ?']")
    private WebElement forgotYourPasswordLink;

    public String attributeValueOfForgotYourPasswordLink(String attribute) {
        return wait.until(ExpectedConditions.visibilityOf(forgotYourPasswordLink)).getAttribute(attribute);

    }

    @FindBy(id = "user_login")
    private WebElement usernameInput;
    @FindBy(id = "user_password")
    private WebElement passwordInput;
    @FindBy(id = "user_remember_me")
    private WebElement rememberMeInput;

    @FindBy(name = "submit")
    private WebElement signInButton;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        rememberMeInput.click();
        signInButton.click();
        Driver.getDriver().findElement(By.id("primary-button")).click();


    }


}
