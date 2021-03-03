package com.trycloud.tests.pages.zeroBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZeroBankHomePage extends BaseZeroBankPage {

    @FindBy(id = "onlineBankingMenu")
    private WebElement onlineBankingLink;

    public void clickOnlineBankingLink() {
        wait.until(ExpectedConditions.visibilityOf(onlineBankingLink)).click();

    }
}
