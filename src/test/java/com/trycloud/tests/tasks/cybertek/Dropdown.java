package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Dropdown extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    DropDownPage dropdown = new DropDownPage();

    @BeforeTest
    public void clickDropDown(){
        cybertek.clickDropDown();

    }



    @Test(priority = 1, description = "TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values " +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/dropdown\n" +
            "3. Verify “Simple dropdown” default selected value is correct\n" +
            "Expected: “Please select an option”\n" +
            "4. Verify “State selection” default selected value is correct\n" +
            "Expected: “Select a State”")

    public void verifySimpleAndStateDropDownDefaultValue() {
        String expectedValueOfSimpleDropDown = "Please select an option";
        Assert.assertEquals(dropdown.defaultSimpleDropDownValue(), expectedValueOfSimpleDropDown);
        String expectedValueOfStateSelection = "Select a State";
        Assert.assertEquals(dropdown.defaultStateSelectionDropDownValue(), expectedValueOfStateSelection);

    }
    @Test(priority = 2,description = "TC #2: Selecting state from State dropdown and verifying result " +
            "3. Select Illinois\n" +
            "4. Select Virginia\n" +
            "5. Select California\n" +
            "6. Verify final selected option is California.\n" +
            "Use all Select options. (visible text, value, index)\n")
    public void selectValueFromStateDropDownVerification(){

        dropdown.selectState("Illinois");
        dropdown.selectState("Virginia");
        dropdown.selectState("California");

        Assert.assertEquals(dropdown.defaultStateSelectionDropDownValue(),"California");

    }
    @Test(description = "TC #3: Selecting date on dropdown and verifying\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/dropdown " +
            "3. Select “December 1st, 1921” and verify it is selected.\n" +
            "  Select year using Select month using Select day using\n" +
            ": visible text\n" + ": value attribute : index number")
    public void dateDropDownVerification(){
        dropdown.selectYear("1922");
        dropdown.selectMonth("11");
        dropdown.selectDay(0);

        Assert.assertEquals(dropdown.selectedValueOfYear(),"1922");
        Assert.assertEquals(dropdown.selectedValueOfMonth(),"December");
        Assert.assertEquals(dropdown.selectedValueOfDay(),1);



    }



}
