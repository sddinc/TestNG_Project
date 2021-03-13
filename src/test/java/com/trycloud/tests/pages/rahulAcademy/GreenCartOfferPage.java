package com.trycloud.tests.pages.rahulAcademy;

import com.trycloud.tests.base.BaseGreenKart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GreenCartOfferPage extends BaseGreenKart {
    @FindBy()
    private WebElement fruitNamesTab;

    public void clickFruitName(){
        fruitNamesTab.click();
    }

}
