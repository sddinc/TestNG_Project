package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BaseCybertekPage {
    @FindBy(xpath = "//h3")
    private WebElement openingNewWindowText;

    public String getOpeningNewWindowText(){
       return openingNewWindowText.getText();
    }
}
