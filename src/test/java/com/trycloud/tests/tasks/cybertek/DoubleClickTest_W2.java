package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.W2School.BaseW2SchoolPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DoubleClickTest_W2 extends BaseW2SchoolPage {


    @Test(description = "TC #16: Double Click Test\n" +
            "1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2 " +
            "2. Switch to iframe.\n" +
            "3. Double click on the text “Double-click me to change my text color.”\n" +
            "4. Assert: Text’s “style” attribute value contains “red”.")
    public void doubleClickVerification(){
        BrowserUtils.switchIframe("iframeResult");
        doubleClick();

        Assert.assertTrue(getAttributeValue("style").contains("red"));

       // System.out.println(getAttributeValue("style"));



    }


}
