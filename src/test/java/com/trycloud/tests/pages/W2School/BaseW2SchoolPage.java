package com.trycloud.tests.pages.W2School;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseW2SchoolPage {
    public BaseW2SchoolPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Actions actions;

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlW2"));
    }

    @FindBy(id = "demo")
    private WebElement doubleClickTest;

    public void doubleClick(){
        actions=new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickTest).perform();
    }

    public String getAttributeValue(String attribute){
        return doubleClickTest.getAttribute(attribute);

    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
