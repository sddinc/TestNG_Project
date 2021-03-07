package com.trycloud.tests.tasks.cybertek;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertTest {
    @Test(description = "TC #17: Context Click – HOMEWORK\n" +
            "1. Go to https://the-internet.herokuapp.com/context_menu " +
            "2. Right click to the box.\n" +
            "3. Alert will open.\n" +
            "4. Accept alert\n" +
            "No assertion needed for this practice.")
    public void alertVerification(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(Driver.getDriver().findElement(By.id("hot-spot"))).perform();
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();



    }
}
