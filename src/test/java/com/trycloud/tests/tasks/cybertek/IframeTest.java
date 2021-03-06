package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.FramePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IframeTest extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    FramePage frame = new FramePage();

    @BeforeTest
    public void clickDropDown() {
        cybertek.clickFrame();


    }

    @Test
    public void iframeVerification(){
        frame.clickIFrame();

     //   frame.acceptAlert();
        frame.switchIframe("mce_0_ifr");
        Assert.assertTrue(frame.isYourContentGoesHereTextDisplayed());
        frame.switchParentFrame();
        Assert.assertTrue(frame.isAnIframeTestDisplayed());
    }
}