package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BaseCybertekPage {
    public BaseCybertekPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @BeforeClass
    public static void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCybertek"));
    }

    @FindBy(xpath = "//a[.='Home']")
    private WebElement homeLink;

    public boolean isHomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }





}
