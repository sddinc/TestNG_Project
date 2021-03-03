package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.apple.BaseApplePage;
import org.testng.annotations.Test;

public class AppleTest extends BaseApplePage {
    @Test(description = "1. Open Chrome browser\n" +
            "2. Go to https://www.apple.com\n" +
            "3. Click to iPhone\n" +
            "4. Print out the texts of all links\n" +
            "5. Print out how many link is missing text" +
            " 6. Print out how many link has text\n" +
            "7. Print out how many total link")

    public void printIphoneInfo(){
        //printAllLinks();
        sizeOfMissingLink();
        sizeOfTextLink();

    }
}
