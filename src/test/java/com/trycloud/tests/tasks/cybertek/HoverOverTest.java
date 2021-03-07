package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.HoverPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoverOverTest extends BaseCybertekPage {
    CybertekHomePage home=new CybertekHomePage();
    HoverPage hover=new HoverPage();
//    @BeforeTest
//    public void setUp() {
//        //home.clickHovers();
//
//
//    }
    @Test(description = "TC #15: Hover Test\n" +
            "1. Go to http://practice.cybertekschool.com/hovers 2. Hover over to first image\n" +
            "3. Assert:\n" +
            "a. “name: user1” is displayed 4. Hover over to second image\n" +
            "5. Assert:\n" +
            "a. “name: user2” is displayed 6. Hover over to third image\n" +
            "7. Confirm:\n" +
            "a. “name: user3” is displayed")
    public void hoverTest(){
        home.clickHovers();
        for (int i = 1; i <hover.sizeOfIMG() ; i++) {
            hover.hoverFirstIMG(i);
            Assert.assertTrue(hover.isUserDisplayed(i));
        }
    }

}
