package com.trycloud.tests.tasks.amazon;

import com.trycloud.tests.base.BaseAmazon;
import org.testng.annotations.Test;

public class DoubleClick_Action extends BaseAmazon {
    @Test
    public void keyDownTest(){

        sendCapitalText("hello");


    }
}
