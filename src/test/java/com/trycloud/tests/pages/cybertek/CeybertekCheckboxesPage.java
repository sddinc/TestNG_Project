package com.trycloud.tests.pages.cybertek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CeybertekCheckboxesPage extends BaseCybertekPage{
    @FindBy(xpath = "//input[1]")
    private WebElement checkbox1Input;

    public void clickCheckbox1() {
        checkbox1Input.click();
    }

    @FindBy(xpath = "//input[2]")
    private WebElement checkbox2Input;

    public void clickCheckbox2() {
        checkbox2Input.click();
    }

    public boolean isCheckBox1Selected() {
        return checkbox1Input.isSelected();
    }

    public boolean isCheckBox2Selected() {
        return checkbox2Input.isSelected();
    }


}
