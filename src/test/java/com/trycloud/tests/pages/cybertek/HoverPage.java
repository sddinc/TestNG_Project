package com.trycloud.tests.pages.cybertek;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HoverPage extends BaseCybertekPage {
    Actions action;
//    @FindBy(xpath = "(//div[@class='figure']/img)[1]")
//    private WebElement firstImg;

    public void hoverFirstIMG(int imgIndex) {
        String xpath = "(//div[@class='figure']/img)[" + imgIndex + "]";
        action = new Actions(Driver.getDriver());
        action.moveToElement(Driver.getDriver().findElement(By.xpath(xpath))).perform();

    }


    public boolean isUserDisplayed(int nameIndex) {
        String xpath = "//h5[.='name: user" + nameIndex + "']";
        return Driver.getDriver().findElement(By.xpath(xpath)).isDisplayed();
    }
    @FindBy(xpath = "//h5")
    private List<WebElement> allIMG;

    public int sizeOfIMG(){
        return allIMG.size();
    }


}
