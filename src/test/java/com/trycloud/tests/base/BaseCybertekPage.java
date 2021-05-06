package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public abstract class BaseCybertekPage {
    public BaseCybertekPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Select select;
    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCybertek"));
    }

    @FindBy(xpath = "//a[.='Home']")
    private WebElement homeLink;

    public boolean isHomeLinkDisplayed() {
        return homeLink.isDisplayed();
    }

    @AfterTest
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }


}
