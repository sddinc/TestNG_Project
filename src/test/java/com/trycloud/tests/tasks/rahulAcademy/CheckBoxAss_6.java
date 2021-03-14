package com.trycloud.tests.tasks.rahulAcademy;

import com.trycloud.tests.base.BasePractice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxAss_6 extends BasePractice {



    @Test
    public void dinamicCheckBoxTest(){
        String option=getCheckOptionText(1);
        System.out.println(option);
        selectDropDown(option);

        String alertText=getTextToAlert(option);

        Assert.assertTrue(alertText.contains(option));


    }
}
