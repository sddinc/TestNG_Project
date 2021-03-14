package com.trycloud.tests.tasks.amazon;

import com.trycloud.tests.base.BaseAmazon;
import org.testng.annotations.Test;

public class RightClick_Action extends BaseAmazon {
    @Test
    public void keyDownTest(){

        rightClickTheText("hello");


    }
}
