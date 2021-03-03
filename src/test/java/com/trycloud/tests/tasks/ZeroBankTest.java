package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.zeroBank.*;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroBankTest extends BaseZeroBankPage {
    ZeroBankLoginPage zeroBankLoginPage = new ZeroBankLoginPage();
    ZeroBankHomePage zeroBankHomePage=new ZeroBankHomePage();
    ZeroBankOnlineBankingPage zeroBankOnlineBankingPage=new ZeroBankOnlineBankingPage();
    ZeroBankAccountSummaryPage zeroBankAccountSummaryPage=new ZeroBankAccountSummaryPage();

    @Test(description = "TC #4: Zero Bank URL verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://zero.webappsecurity.com/login.html\n" +
            "3. Get attribute value of href from the “forgot your password” link " +
            "4. Verify attribute value contains\n" +
            "Expected: “/forgot-password.html”")

    public void zeroBankURLVerification() {
        String expectedTest = "/forgot-password.html";
        String attribute = "href";
        String attributeValue = zeroBankLoginPage.attributeValueOfForgotYourPasswordLink(attribute);
        Assert.assertTrue(attributeValue.contains(expectedTest));
    }

    @Test(description = "TC #5: Basic authentication Zero Bank\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://zero.webappsecurity.com/login.html\n" +
            "3. Enter username: username\n" +
            "4. Enter password: password\n" +
            "5. Click sign in button\n" +
            "6. Verify username is displayed on the page\n" +
            "7. Verify the title Zero – Account Summary\n" +
            "8. Verify the link Account Summary’s href value contains: “account-summary”\n" +
            "Print out results in validation formats")
    public void zeroBankBasicAuthenticationVerify() throws InterruptedException {
        String username= ConfigurationReader.getProperty("zeroUserName");
        String password= ConfigurationReader.getProperty("zeroPassword");
        zeroBankLoginPage.login(username,password);

        Assert.assertEquals(getUsername(),username);
        zeroBankHomePage.clickOnlineBankingLink();
        zeroBankOnlineBankingPage.clickAccountSummeryLink();
        String expectedTitle="Zero - Account Summary";

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

        Assert.assertTrue(zeroBankAccountSummaryPage.getAccountSummeryLinkHrefAttributeText().contains("account-summary"));







    }


}
