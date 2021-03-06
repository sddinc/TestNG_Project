package com.trycloud.tests.pages.cybertek;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormPage extends BaseCybertekPage {



    public void sendText(String name, String text) {
        Driver.getDriver().findElement(By.name(name)).sendKeys(text);
    }

    public void chooseGender(String gender) {
        String xpath = "//input[@value='" + gender + "']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

    public void selectDropDown(String selectOffice, String name) {
        select = new Select(Driver.getDriver().findElement(By.name(name)));
        select.selectByVisibleText(selectOffice);
    }

    @FindBy(xpath = "//button")
    private WebElement button;
    public void signUp() {
        button.click();
    }

    @FindBy(xpath = "//p")
    private WebElement successMsj;

    public boolean isTestDisplay(){
       return successMsj.isDisplayed();
    }


}
