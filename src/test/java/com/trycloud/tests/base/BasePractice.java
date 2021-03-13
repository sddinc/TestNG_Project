package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

   public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPractice"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    






}
