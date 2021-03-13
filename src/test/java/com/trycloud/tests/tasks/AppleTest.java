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
        sizeOfAllLinks();
    }

    @Test(description = "TC #03: FINDELEMENTS_APPLE\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://www.apple.com\n" +
            "3. Click to all of the headers one by one\n" +
            "a. Mac, iPad, iPhone, Watch, TV, Music, Support\n" +
            "4. Print out how many links on each page with the titles of the pages 5. Loop through all\n" +
            "6. Print out how many link is missing text TOTAL\n" +
            "7. Print out how many link has text TOTAL\n" +
            "8. Print out how many total link TOTAL")
    public void browserTest(){
        System.out.println("allHeaders() = " + allHeaders());
        System.out.println("allHeaders() = " + allHeaders().size());


    }

    @Test(description = "TC #03: FINDELEMENTS_APPLE\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://www.apple.com\n" +
            "3. Click to all of the headers one by one\n" +
            "a. Mac, iPad, iPhone, Watch, TV, Music, Support\n" +
            "4. Print out how many links on each page with the titles of the pages " +
            "5. Loop through all\n" +
            "6. Print out how many link is missing text TOTAL\n" +
            "7. Print out how many link has text TOTAL\n" +
            "8. Print out how many total link TOTAL")
    public void appleWindowsHandle() throws InterruptedException {
      //  windowsHandle();

     //   windowsHandleWithSeparateTap();

        printAllLink();

    }


}
