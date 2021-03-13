package com.trycloud.tests.pages.rahulAcademy;

import com.trycloud.tests.base.BasePractice;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticePage extends BasePractice {

    @FindBy(xpath = "//a")
    private List<WebElement> allLink;


    public int countOfLink() {
        return allLink.size();
    }

    @FindBy(id = "gf-BIG")
    private WebElement footerPart;


    public int getAllLinkInFooter() {
        return footerPart.findElements(By.tagName("a")).size();
    }

    @FindBy(xpath = "(//tr/td/ul)[1]")
    private WebElement discountCouponsPart;


    public int getAllLinkDiscountCouponsPart() {
        return discountCouponsPart.findElements(By.tagName("a")).size();
    }

    public List<String> getAllTextInDiscountCouponsPart() {
        return discountCouponsPart.findElements(By.tagName("a")).stream().map(p -> p.getText()).collect(Collectors.toList());
    }

    public void isnDiscountCouponsPartClickable() {

        discountCouponsPart.findElements(By.tagName("a")).stream().map(p -> p.isDisplayed()).forEach(p -> System.out.println(p));
    }

    public void clickEachCouponsPartLinks() throws InterruptedException {
        List<WebElement> links = discountCouponsPart.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {
            String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
            links.get(i).sendKeys(clickOnLinkTab);
        }
        Thread.sleep(5000);
        Set<String> windows = Driver.getDriver().getWindowHandles();
        System.out.println(windows.size());
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            Driver.getDriver().switchTo().window(it.next());
            System.out.println(Driver.getDriver().getTitle());
        }


    }

    @FindBy(xpath = "//div[@class='tableFixHead']/table/tbody/tr/td[4]")
    private List<WebElement> amountList;

    public int actualTotalAmountCollected() {
        int sum = 0;
        List<Integer> allAmount = new LinkedList<>();

        allAmount = amountList.stream().map(p -> Integer.parseInt(p.getText())).collect(Collectors.toList());

        for (int i = 0; i < allAmount.size(); i++) {
            sum += allAmount.get(i);
        }
        return sum;
    }

    @FindBy(xpath = "//div[.=' Total Amount Collected: 296 ']")
    private WebElement totalCollected;

    public int expectedTotalAmountCollected() {
        String text = totalCollected.getText().split(":")[1].trim();

        return Integer.parseInt(text);
    }


}



