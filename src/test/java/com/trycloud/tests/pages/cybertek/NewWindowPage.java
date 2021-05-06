package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowPage extends BaseCybertekPage {
    @FindBy(xpath = "//h3")
    private WebElement newWindowText;

    public String getNewWindowText(){
        return newWindowText.getText();
    }
}
