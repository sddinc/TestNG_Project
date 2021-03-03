package com.trycloud.tests.pages.zeroBank;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public abstract class BaseZeroBankPage {
    public BaseZeroBankPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlZeroBank"));
    }

    @FindBy(xpath = "(//li[@class='dropdown'])[2]")
    private WebElement userNameWeb;

    public String getUsername() throws InterruptedException {
        return wait.until(ExpectedConditions.visibilityOf(userNameWeb)).getText();

    }

}
