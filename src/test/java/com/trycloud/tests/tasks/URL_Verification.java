package com.trycloud.tests.tasks;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class URL_Verification {


    @Test(description = "TC #2: Cybertek verifications\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://practice.cybertekschool.com 3. Verify URL contains\n" +
            "Expected: cybertekschool 4. Verify title:\n" +
            "Expected: Practice")
    public void cybertekTitleVerification() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCybertek"));
        String expectedUrl = "cybertekschool";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedUrl),  "Doesn't contains  "+expectedUrl);
    }
}
