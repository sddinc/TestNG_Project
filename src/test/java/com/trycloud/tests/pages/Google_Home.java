package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Home {
    public Google_Home() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Gmail']")
    private WebElement gmailLink;

    @FindBy(name = "q")
    private WebElement googleSearchInput;

    public void clickGmailLink(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGoogle"));
        gmailLink.click();
    }

    public void sendItemsToGoogleSearch(String items){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGoogle"));
        googleSearchInput.sendKeys(items + Keys.ENTER);
    }


}
