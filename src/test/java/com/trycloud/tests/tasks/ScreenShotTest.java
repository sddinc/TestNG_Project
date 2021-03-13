package com.trycloud.tests.tasks;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShotTest {

    @Test
    public void screenShootTest(){
        byte[]screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

    }
}
