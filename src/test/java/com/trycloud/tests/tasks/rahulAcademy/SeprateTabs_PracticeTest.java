package com.trycloud.tests.tasks.rahulAcademy;

import com.trycloud.tests.base.BasePractice;
import com.trycloud.tests.pages.rahulAcademy.PracticePage;
import org.testng.annotations.Test;

public class SeprateTabs_PracticeTest extends BasePractice {
    PracticePage practicePage = new PracticePage();

    @Test
    public void countLink() throws InterruptedException {
        // count of all link
        System.out.println("practicePage.countOfLink() = " + practicePage.countOfLink());
        // count all link in footer part
        System.out.println("practicePage.getAllLinkInFooter() = " + practicePage.getAllLinkInFooter());

        System.out.println("practicePage.getAllLinkDiscountCouponsPart() = " + practicePage.getAllLinkDiscountCouponsPart());
        System.out.println(practicePage.getAllTextInDiscountCouponsPart());
        practicePage.isnDiscountCouponsPartClickable();
        practicePage.clickEachCouponsPartLinks();


    }
}