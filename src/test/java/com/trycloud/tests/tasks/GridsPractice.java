package com.trycloud.tests.tasks;

import com.trycloud.tests.base.BasePractice;
import com.trycloud.tests.pages.rahulAcademy.PracticePage;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GridsPractice extends BasePractice {
    PracticePage practicePage=new PracticePage();


    @Test
    public void test(){

        Assert.assertEquals(practicePage.actualTotalAmountCollected(),practicePage.expectedTotalAmountCollected());


    }
}
