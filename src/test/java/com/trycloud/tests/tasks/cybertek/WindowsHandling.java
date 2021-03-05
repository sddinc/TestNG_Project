package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.apple.BaseApplePage;
import com.trycloud.tests.pages.cybertek.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.MultipleWindowsPage;
import com.trycloud.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();

    @Test
    public void handlingWeb() {
        cybertek.clickMultipleWindows();
        multipleWindowsPage.clickHere();

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        System.out.println("before: " + Driver.getDriver().getTitle());
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Iterator<String> it = allWindows.iterator();
        String parent = it.next();
        String child = it.next();
        Driver.getDriver().switchTo().window(child);
        System.out.println("before: " + Driver.getDriver().getTitle());
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

    }


}
