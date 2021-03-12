package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.DynamicLoadingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseCybertekPage {
    CybertekHomePage homePage = new CybertekHomePage();
    DynamicLoadingPage loadingPage = new DynamicLoadingPage();

    @BeforeTest
    public void init() {

    }

    @Test(description = "TC#40 : Dynamically Loaded Page Elements 7\n" +
            "1. Go to http://practice.cybertekschool.com/dynamic_loading/7\n" +
            "2. Wait until title is “Dynamic Title”\n" +
            "3. Assert : Message “Done” is displayed.\n" +
            "4. Assert : Image is displayed.\n" +
            "Note: Follow POM")
    public void waitTest() {
        homePage.clickHDynamicLoading();
        loadingPage.clickExample(7);
        Assert.assertTrue(loadingPage.isDoneDisplayed());
        Assert.assertTrue(loadingPage.isIMGDisplayed());

    }
}
