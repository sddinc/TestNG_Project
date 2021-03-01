package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.CybertekForgetPassword;
import com.trycloud.tests.pages.CybertekHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CybertekTest {
    CybertekHomePage cybertek=new CybertekHomePage();
    CybertekForgetPassword forget=new CybertekForgetPassword();

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
    public void forgetWebElementsVerification(){
          cybertek.clickForget();
        Assert.assertTrue(forget.isHomeLinkDisplayed());

    }



}

