package com.trycloud.tests.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseCybertek {
    public BaseCybertek() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.='Home']")
    private WebElement homeLink;

    public boolean isHomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }

}
