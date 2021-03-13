package com.trycloud.tests.tasks.rahulAcademy;

import com.trycloud.tests.base.BasePractice;
import com.trycloud.tests.pages.rahulAcademy.PracticePage;
import org.testng.annotations.Test;

public class PracticeTest extends BasePractice {
    PracticePage practicePage=new PracticePage();

    @Test
    public void countLink(){
        // count of all link
        System.out.println("practicePage.countOfLink() = " + practicePage.countOfLink());
        // count all link in footer part
        System.out.println("practicePage.getAllLinkInFooter() = " + practicePage.getAllLinkInFooter());


    }


}
