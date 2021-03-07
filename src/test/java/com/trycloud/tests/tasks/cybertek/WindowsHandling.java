package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.apple.BaseApplePage;
import com.trycloud.tests.pages.cybertek.*;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
    NewWindowPage newWindowPage=new NewWindowPage();
    WindowsPage windowsPage=new WindowsPage();
    BrowserUtils utils=new BrowserUtils();
    @BeforeTest
    public void clickDropDown() {
        cybertek.clickMultipleWindows();
    }

    @Test
    public void handlingWeb() {

        multipleWindowsPage.clickHere();

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

//        System.out.println("before: " + Driver.getDriver().getTitle());
//        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Iterator<String> it = allWindows.iterator();
        String parent = it.next();
        String child = it.next();
        Driver.getDriver().switchTo().window(child);
        System.out.println("child windows text = " + newWindowPage.getNewWindowText());

        Driver.getDriver().switchTo().window(parent);

        System.out.println("Parent windows text: "+ windowsPage.getOpeningNewWindowText());

    }
    @Test(description = "TC # : Window Handle practice\n" +
            "1. Create a new class called: WindowHandlePractice\n" +
            "2. Create new test and make set ups\n" +
            "3. Go to : http://practice.cybertekschool.com/windows\n" +
            "4. Assert: Title is “Practice”\n" +
            "5. Click to: “Click Here” text\n" +
            "6. Switch to new Window.\n" +
            "7. Assert: Title is “New Window”")
    public void verifyWindows(){
        multipleWindowsPage.clickHere();
        Assert.assertEquals(utils.getWebTitle(),"Practice");

        Set<String>allWindows=Driver.getDriver().getWindowHandles();

        Iterator<String>it=allWindows.iterator();
        String parent=it.next();
        String child=it.next();


        Driver.getDriver().switchTo().window(child);

        Assert.assertEquals(windowsPage.getOpeningNewWindowText(),"New Window");








    }


}
