package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Home {
    public Google_Home() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Gmail']")
    private WebElement gmailLink;

    public void clickGmailLink(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGoogle"));
        gmailLink.click();


    }


}
