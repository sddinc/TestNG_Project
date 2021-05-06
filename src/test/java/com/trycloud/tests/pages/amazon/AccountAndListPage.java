package com.trycloud.tests.pages.amazon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountAndListPage {

    @FindBy(xpath = "//div[.='Your Account']")
    private WebElement yourAccountTest;

    public String getYourAccountTest(){
        return yourAccountTest.getText();
    }
}
