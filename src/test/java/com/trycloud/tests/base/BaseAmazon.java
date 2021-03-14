package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BaseAmazon {
    public BaseAmazon() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlAmazon"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @FindBy(id = "nav-link-accountList")
    private WebElement accountAndList;


    public void hoverOverAccountAndList() {
        actions.moveToElement(accountAndList).perform();
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;


    public void sendCapitalText(String text) {
        actions.moveToElement(searchInput).click().keyDown(Keys.SHIFT).sendKeys(text).perform();
    }

    public void doubleClickTheText(String text) {
        actions.moveToElement(searchInput).click().keyDown(Keys.SHIFT).sendKeys(text).doubleClick().perform();
    }

    public void rightClickTheText(String text) {
        actions.moveToElement(searchInput).click().keyDown(Keys.SHIFT).sendKeys(text).doubleClick().contextClick().perform();
    }


}
