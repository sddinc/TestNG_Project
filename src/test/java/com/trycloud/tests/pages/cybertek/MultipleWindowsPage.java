package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BaseCybertekPage {

    @FindBy(linkText = "Click Here")
    private WebElement clickHereLink;

    public void clickHere(){
        clickHereLink.click();

    }






}
