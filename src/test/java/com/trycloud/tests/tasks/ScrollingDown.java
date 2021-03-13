package com.trycloud.tests.tasks;

import com.trycloud.tests.base.BasePractice;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollingDown extends BasePractice {

    @Test
    public void test(){
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeAsyncScript("window.scrollBy(0,500)");




    }
}
