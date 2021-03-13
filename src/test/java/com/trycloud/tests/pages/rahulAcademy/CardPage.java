package com.trycloud.tests.pages.rahulAcademy;

import com.trycloud.tests.base.BaseGreenKart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CardPage extends BaseGreenKart {
    @FindBy(css = "input.promoCode")
    private WebElement enterPromoCodeInput;

    public void enterPromoCode(String code) {
        wait.until(ExpectedConditions.visibilityOf(enterPromoCodeInput));
        enterPromoCodeInput.sendKeys(code);
    }

    @FindBy(xpath = "(//button)[1]")
    private WebElement applyButton;

    public void clickApply() {
        applyButton.click();
    }

    @FindBy(xpath = "//span[.='Code applied ..!']")
    private WebElement codeAppliedText;

    public String getCodeAppliedText(){
        return   wait.until(ExpectedConditions.visibilityOf(codeAppliedText)).getText();
    }

    @FindBy()
    private WebElement topDealsLink;




}
