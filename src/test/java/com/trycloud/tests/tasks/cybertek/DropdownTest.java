package com.trycloud.tests.tasks.cybertek;

import com.github.javafaker.DateAndTime;
import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.DropDownPage;
import javafx.scene.input.DataFormat;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class DropdownTest extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    DropDownPage dropdown = new DropDownPage();

    @BeforeTest
    public void clickDropDown() {
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

    @Test(priority = 2, description = "TC #2: Selecting state from State dropdown and verifying result " +
            "3. Select Illinois\n" +
            "4. Select Virginia\n" +
            "5. Select California\n" +
            "6. Verify final selected option is California.\n" +
            "Use all Select options. (visible text, value, index)\n")
    public void selectValueFromStateDropDownVerification() {

        dropdown.selectState("Illinois");
        dropdown.selectState("Virginia");
        dropdown.selectState("California");

        Assert.assertEquals(dropdown.defaultStateSelectionDropDownValue(), "California");

    }

    @Test(description = "TC #3: Selecting date on dropdown and verifying\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/dropdown " +
            "3. Select “December 1st, 1921” and verify it is selected.\n" +
            "  Select year using Select month using Select day using\n" +
            ": visible text\n" + ": value attribute : index number")
    public void dateDropDownVerification() {
        dropdown.selectYear("1922");
        dropdown.selectMonth("11");
        dropdown.selectDay(0);

        Assert.assertEquals(dropdown.selectedValueOfYear(), "1922");
        Assert.assertEquals(dropdown.selectedValueOfMonth(), "December");
        Assert.assertEquals(dropdown.selectedValueOfDay(), 1);
    }

    @Test(description = "TC #5: Selecting value from non-select dropdown\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/dropdown 3. Click to non-select dropdown\n" +
            "4. Select Facebook from dropdown\n" +
            "5. Verify title is “Facebook - Log In or Sign Up”")
    public void websiteDropDownVerification() {

        String website = "Facebook";
        dropdown.selectWeb(website);

        Assert.assertEquals(dropdown.getWebSiteTitle(), "Facebook – log in or sign up");

    }

    @Test(description = "TC#7: Cybertek “month” dropdown default value\n" +
            "1. Open browser\n" +
            "2. Go to website: http://practice.cybertekschool.com/dropdowns\n" +
            "3. Verify default value is always showing the current month\n" +
            "o Expected: If currently in June, should show June selected.\n")
    public void defaultMonthDropDownVerification() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM");
        String month = localDate.format(dtf);
        Assert.assertEquals(dropdown.defaultValueOfMonth(), month);
        List<String> expectedAllMonthOfYear = new LinkedList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"));
        System.out.println(dropdown.allMonthOfYear());
        Assert.assertEquals(dropdown.allMonthOfYear(), expectedAllMonthOfYear);
    }
}
