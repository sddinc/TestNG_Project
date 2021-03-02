package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.CybertekAddRemoveElementsPage;
import com.trycloud.tests.pages.CybertekPageForgetPassword;
import com.trycloud.tests.pages.CybertekHomePage;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeoutException;

public class CybertekTest {
    CybertekHomePage cybertek = new CybertekHomePage();
    CybertekPageForgetPassword forget = new CybertekPageForgetPassword();
    CybertekAddRemoveElementsPage addRemove=new CybertekAddRemoveElementsPage();

    @Test(description = "TC #1: PracticeCybertek.com_ForgotPassword WebElement verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/forgot_password\n" +
            "3. Locate all the WebElements on the page using XPATH locator only (total of 6)\n" +
            "a. “Home” link\n" +
            "b. “Forgot password” header\n" +
            "c. “E-mail” text\n" +
            "d. E-mail input box\n" +
            "e. “Retrieve password” button\n" +
            "f. “Powered by Cybertek School” text\n" +
            "4. Verify all WebElements are displayed.")
    public void forgetWebElementsVerification() {
        cybertek.clickForget();
        Assert.assertTrue(forget.isHomeLinkDisplayed());
        Assert.assertTrue(forget.isHomeLinkDisplayed());
        Assert.assertTrue(forget.isForgetPasswordText());
        Assert.assertTrue(forget.isEmailLabel());
        Assert.assertTrue(forget.isRetrievePasswordButton());
        Assert.assertTrue(forget.isPoweredByCybertekSchoolText());

    }


    @Test(description = "TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://practice.cybertekschool.com/add_remove_elements 3. Click to “Add Element” button\n" +
            "4. Verify “Delete” button is displayed after clicking.\n" +
            "5. Click to “Delete” button.\n" +
            "6. Verify “Delete” button is NOT displayed after clicking.\n")
    public void addElementsVerification() throws InterruptedException {

        cybertek.clickAddRemoveLink();
        addRemove.clickAddButton();
        Assert.assertTrue(addRemove.isDeleteButton());
        addRemove.clickDeleteButton();

        try {
            Assert.assertFalse(addRemove.isDeleteButton());
        }catch (Exception e){
            Assert.assertFalse(false);
        }



    }


}

