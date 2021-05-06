package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CybertekAddRemoveElementsPage extends BaseCybertekPage {

    @FindBy(xpath = "//button")
    private WebElement addElementButton;

    public void clickAddButton() {
        addElementButton.click();
    }

    @FindBy(xpath = "//button[.='Delete']")
    private WebElement deleteElementButton;

    public boolean isDeleteButton() {
        return wait.until(ExpectedConditions.visibilityOf(deleteElementButton)).isDisplayed();
    }

    public void clickDeleteButton() {
        deleteElementButton.click();

    }


}
