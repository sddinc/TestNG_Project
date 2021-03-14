package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BasePractice {
    public BasePractice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    String selectedOption;
    Select select;
    Alert alert;

   public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getCheckOptionText(int option){
        String xpath="//input[@id='checkBoxOption"+option+"']/..";
        return Driver.getDriver().findElement(By.xpath(xpath)).getText();
    }
    @FindBy(id = "dropdown-class-example")
    private WebElement selectLocator;

    public void selectDropDown(String option){
        select=new Select(selectLocator);
        select.selectByVisibleText(option);
    }

    @FindBy(id = "name")
    private WebElement alertInput;

    @FindBy(id = "alertbtn")
    private WebElement alertButton;


    public String getTextToAlert(String option){

        alertInput.sendKeys(option);
        alertButton.click();

        alert=Driver.getDriver().switchTo().alert();
        return alert.getText();

    }



    






}
