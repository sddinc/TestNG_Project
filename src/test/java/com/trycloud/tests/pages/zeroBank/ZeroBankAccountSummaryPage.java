package com.trycloud.tests.pages.zeroBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZeroBankAccountSummaryPage extends BaseZeroBankPage {

    @FindBy(id = "account_summary_tab/a")
    private WebElement accountSummeryLink;


    public String getAccountSummeryLinkHrefAttributeText(){
        System.out.println(wait.until(ExpectedConditions.visibilityOf(accountSummeryLink)).getAttribute("href"));
        return wait.until(ExpectedConditions.visibilityOf(accountSummeryLink)).getAttribute("href");

    }


}
