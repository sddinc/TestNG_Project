package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.BaseZeroBankPage;
import com.trycloud.tests.pages.ZeroBankLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroBankTest extends BaseZeroBankPage {
    ZeroBankLoginPage zeroBankLoginPage=new ZeroBankLoginPage();

    @Test(description = "TC #4: Zero Bank URL verification\n" +
            "1. Open Chrome browser\n" +
            "2. Go to http://zero.webappsecurity.com/login.html\n" +
            "3. Get attribute value of href from the “forgot your password” link " +
            "4. Verify attribute value contains\n" +
            "Expected: “/forgot-password.html”")

    public void zeroBankURLVerification(){
        String expectedTest="/forgot-password.html";
        String attribute="href";
        String attributeValue=zeroBankLoginPage.attributeValueOfForgotYourPasswordLink(attribute);
        Assert.assertTrue(attributeValue.contains(expectedTest));

    }
}
