package com.trycloud.tests.pages.cybertek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BaseCybertekPage {
    Select select;
    @FindBy(id = "dropdown")
    private WebElement simpleDropDown;

    public String defaultSimpleDropDownValue() {
        select = new Select(simpleDropDown);
        return select.getFirstSelectedOption().getText();
    }

    @FindBy(id = "state")
    private WebElement stateSelectionDropDown;

    public String defaultStateSelectionDropDownValue() {
        select = new Select(stateSelectionDropDown);
        return select.getFirstSelectedOption().getText();
    }

    public void selectState(String value) {
        select = new Select(stateSelectionDropDown);
        select.selectByVisibleText(value);

    }

    @FindBy(id = "year")
    private WebElement yearDropDown;

    public void selectYear(String year) {
        select = new Select(yearDropDown);
        select.selectByVisibleText(year);
    }

    public String selectedValueOfYear(){
        select = new Select(yearDropDown);
        return select.getFirstSelectedOption().getText();
    }

    @FindBy(id = "day")
    private WebElement dayDropDown;

    public void selectDay(int day) {
        select = new Select(dayDropDown);
        select.selectByIndex(day);
    }
    public int selectedValueOfDay(){
        select = new Select(dayDropDown);
        return Integer.parseInt(select.getFirstSelectedOption().getText());
    }

    @FindBy(id = "month")
    private WebElement monthDropDown;

    public void selectMonth(String month) {
        select = new Select(monthDropDown);
        select.selectByValue(month);
    }
    public String selectedValueOfMonth(){
        select = new Select(monthDropDown);
        return select.getFirstSelectedOption().getText();
    }



}
