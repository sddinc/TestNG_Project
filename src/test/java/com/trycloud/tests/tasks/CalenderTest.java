package com.trycloud.tests.tasks;

import com.trycloud.utilities.Driver;
import org.testng.annotations.Test;

public class CalenderTest {

    @Test
    public void test(){
        Driver.getDriver().get("https://www.turkishairlines.com/");
    }



}
