package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CeybertekCheckboxesPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.seleniumEasy.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTest extends BaseCybertekPage {
    CybertekHomePage homePage = new CybertekHomePage();
    CeybertekCheckboxesPage checkBox = new CeybertekCheckboxesPage();
    CheckBoxPage checkBoxPage =new CheckBoxPage();

    @Test(description = "1. Go to http://practice.cybertekschool.com/checkboxes 2. Confirm checkbox #1 is NOT selected by default\n" +
            "3. Confirm checkbox #2 is SELECTED by default.\n" +
            "4. Click checkbox #1 to select it.\n" +
            "5. Click checkbox #2 to deselect it.\n" +
            "6. Confirm checkbox #1 is SELECTED.\n" +
            "7. Confirm checkbox #2 is NOT selected.")

    public void cybertekCheckBoxValitation() {
        homePage.clickCheckboxes();
        checkBox.clickCheckbox1();
        checkBox.clickCheckbox2();

        Assert.assertTrue(checkBox.isCheckBox1Selected());
        Assert.assertFalse(checkBox.isCheckBox2Selected(), "is selected");


    }
 @Test(description = "TC #2: SeleniumEasy Checkbox Verification – Section 1\n" +
         "1. Open Chrome browser\n" +
         "2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html " +
         "3. Verify “Success – Check box is checked” message is NOT displayed.\n" +
         "4. Click to checkbox under “Single Checkbox Demo” section\n" +
         "5. Verify “Success – Check box is checked” message is displayed.")

    public void seleniumEasyCheckBoxValitation() {
     Assert.assertFalse(checkBoxPage.checkSuccessMessage());
     checkBoxPage.clickCheckBoxUnderSingleDemo();

     Assert.assertTrue(checkBoxPage.checkSuccessMessage());


    }

}
