package com.trycloud.tests.tasks;

import com.trycloud.tests.base.CVSBasePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class CvsTask {


    @Test
    public void dropDropVerification() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCvs"));
        Thread.sleep(5000);
        WebElement minuteClinicLink = Driver.getDriver().findElement(By.linkText("MinuteClinic"));
        Thread.sleep(5000);
        minuteClinicLink.click();
        WebElement eClinicVisit = Driver.getDriver().findElement(By.id("eclinicVisit"));
        eClinicVisit.click();
        Thread.sleep(5000);
        WebElement selectWeb = Driver.getDriver().findElement(By.name("state"));
        Thread.sleep(5000);
        Select select = new Select(selectWeb);
        Thread.sleep(5000);

        List <WebElement> allState = select.getOptions();
        allState.stream().forEach(p -> System.out.println(p.getText()));

        System.out.println("outPut: " + select.getFirstSelectedOption().getText());
    }

    @Test
    public void cybertej() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");



        WebElement selectWeb = Driver.getDriver().findElement(By.id("state"));
        Thread.sleep(5000);
        Select select = new Select(selectWeb);
        Thread.sleep(5000);
        select.selectByVisibleText("California");

        List <WebElement> allState = select.getOptions();
//        allState.stream().forEach(p -> System.out.println(p.getText()));
//
//        System.out.println("outPut: " + select.getFirstSelectedOption().getText());
    }
}
