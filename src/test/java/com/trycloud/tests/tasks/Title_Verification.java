package com.trycloud.tests.tasks;

import com.sun.org.glassfish.gmbal.Description;
import com.trycloud.tests.pages.Home_Etsy;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title_Verification {
    Home_Etsy etsy=new Home_Etsy();


    @Test(description = "TC #1: Google Title Verification")
    public void googleTitleVerification() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGoogle"));
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Wrong title");
    }
      @Test(description = "TC #1: Etsy Title Verification\n" +
              "1. Open Chrome browser\n" +
              "2. Go to https://www.etsy.com 3. Search for “wooden spoon” 4. Verify title:\n" +
              "Expected: “Wooden spoon | Etsy”")
    public void etsyTitleVerification() {

        String item = "Wooden spoon";
        etsy.sendItems(item);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(item),"Wrong title");
    }




}
