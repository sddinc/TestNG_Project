package com.trycloud.tests.tasks;

import com.sun.org.glassfish.gmbal.Description;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class Title_Verification {


    @Test(description = "TC #1: Google Title Verification")

    public void googleTitleVerification() {
        Driver.getDriver().get("urlGoogle");

    }
}
