package com.trycloud.tests.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;

public class Google_Home {
    public Google_Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Gmail']")
    private WebElement gmailLink;



    public void clickGmailLink(){
        Driver.getDriver().get("https://www.google.com/");
        gmailLink.click();
    }



}
