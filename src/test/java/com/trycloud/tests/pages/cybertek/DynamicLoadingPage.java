package com.trycloud.tests.pages.cybertek;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends BaseCybertekPage {


    public void clickExample(int exampleNumber) {
        String xpath = "//a[@href='/dynamic_loading/" + exampleNumber + "']";

        Driver.getDriver().findElement(By.xpath(xpath)).click();


    }

    public boolean isDoneDisplayed() {

        return Driver.getDriver().findElement(By.xpath("//strong")).isDisplayed();

    }

    public boolean isIMGDisplayed() {

        return (wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("//div[@id='alert']/following-sibling::img")))).isDisplayed());

    }

}
