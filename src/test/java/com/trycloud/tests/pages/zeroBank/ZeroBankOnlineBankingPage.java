package com.trycloud.tests.pages.zeroBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZeroBankOnlineBankingPage extends BaseZeroBankPage{

    @FindBy(id = "account_summary_link")
    private WebElement accountSummeryModule;

    public void clickAccountSummeryLink(){
        accountSummeryModule.click();
    }


}
