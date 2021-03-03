package com.trycloud.tests.pages.merriam;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MerriamHomePage extends BaseMerriamPage {

    @FindBy(xpath = "//a")
    private List<WebElement> allLinks;


    public void printAllLinkTests() {
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getText());
        }
    }

    public int sizeOfMissingText() {
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (!allLinks.get(i).isDisplayed()) {
                count++;
            }
        }
        return count;
    }

    public int sizeOfText() {
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).isDisplayed()) {
                count++;
            }
        }
        return count;
    }


}
