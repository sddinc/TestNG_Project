package com.trycloud.tests.tasks;


import com.trycloud.tests.pages.Google_Home;
import com.trycloud.tests.pages.Home_Etsy;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title_Verification {
    Home_Etsy etsy = new Home_Etsy();
    Google_Home google=new Google_Home();


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
        Assert.assertTrue(Driver.getDriver().getTitle().contains(item), "Wrong title");
    }

    @Test(description = "TC #3: Back and forth navigation\n" +
            "1-\tOpen a chrome browser\n" +
            "2-\tGo to: https://google.com\n" +
            "3-\tClick to Gmail from top right.\n" +
            "4-\tVerify title contains:\n" +
            "\tExpected: Gmail\n")

    public void googleTitleContainsGmail(){
        google.clickGmailLink();
        String expectedText="Gmail";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedText));

        Driver.getDriver().navigate().back();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Google","Wrong Title");


    }

    @Test(description = "TC #4: Google search\n" +
            "1- Open a chrome browser\n" +
            "2- Go to: https://google.com 3- Write “apple” in search box 4- Click google search button 5- Verify title:\n" +
            "Expected: Title should start with “apple” word")
    public void googleTittleVerificationAfterSearch(){
        String item="apple";
        google.sendItemsToGoogleSearch(item);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(item));


    }

    @Test(description = "TC #5: Basic login authentication\n" +
            "1- Open a chrome browser\n" +
            "2- Go to:\n" +
            "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\n" +
            "3- Verify title equals:\n" +
            "Expected: Web Orders Login")

    public void smartBearTitleVerify(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlSmartBear"));
        String expectedTitle = "Web Orders Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Wrong title");

    }

}
