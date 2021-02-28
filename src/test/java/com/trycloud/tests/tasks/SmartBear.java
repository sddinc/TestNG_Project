package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.SmartBear_LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBear {
    SmartBear_LoginPage smart = new SmartBear_LoginPage();

    @Test(description = "4- Enter username: Tester\n" +
            "5- Enter password: test\n" +
            "6- Click “Sign In” button\n" +
            "7- Verify title equals:\n" +
            "Expected: Web Orders")

    public void smartBearWebOrderVerification() {
        smart.login(ConfigurationReader.getProperty("smartBearUserName"),ConfigurationReader.getProperty("smartBearUserPass"));

        Assert.assertEquals(Driver.getDriver().getTitle(),"Web Orders","Wrong Title !");
    }


}
