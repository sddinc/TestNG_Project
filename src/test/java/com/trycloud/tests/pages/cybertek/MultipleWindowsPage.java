package com.trycloud.tests.pages.cybertek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MultipleWindowsPage extends BaseCybertekPage {

    @FindBy(linkText = "Click Here")
    private WebElement clickHereLink;

    public void clickHere(){
        clickHereLink.click();

    }






}
