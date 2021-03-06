package com.trycloud.tests.tasks.cybertek;

import com.trycloud.tests.pages.apple.BaseApplePage;
import com.trycloud.tests.pages.cybertek.*;
import com.trycloud.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling extends BaseCybertekPage {
    CybertekHomePage cybertek = new CybertekHomePage();
    MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage();
    NewWindowPage newWindowPage=new NewWindowPage();
    WindowsPage windowsPage=new WindowsPage();

    @Test
    public void handlingWeb() {
        cybertek.clickMultipleWindows();
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





//        System.out.println("before: " + Driver.getDriver().getTitle());
//        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

    }


}
