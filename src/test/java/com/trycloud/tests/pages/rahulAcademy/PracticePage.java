package com.trycloud.tests.pages.rahulAcademy;

import com.trycloud.tests.base.BasePractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticePage extends BasePractice {

    @FindBy(xpath = "//a")
    private List<WebElement> allLink;


    public int countOfLink(){
        return allLink.size();
    }

    @FindBy(id = "gf-BIG")
    private WebElement footerPart;


    public int getAllLinkInFooter(){
        return footerPart.findElements(By.tagName("a")).size();
    }

    @FindBy(xpath = "(//tr/td/ul)[1]")
    private WebElement discountCouponsPart;


    public int getAllLinkDiscountCouponsPart(){
        return discountCouponsPart.findElements(By.xpath("//a")).size();
    }




}
