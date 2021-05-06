package com.trycloud.tests.pages.cybertek;

import com.trycloud.tests.base.BaseCybertekPage;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BaseCybertekPage {
    @FindBy(xpath = "//a[.='iFrame']")
    private WebElement iframeLink;

    public void clickIFrame(){
        iframeLink.click();
    }

    public void switchIframe(String id){
        Driver.getDriver().switchTo().frame(id);

    }
    @FindBy(xpath = "//p")
    private WebElement yourContentGoesHereText;

    public boolean isYourContentGoesHereTextDisplayed(){
        return yourContentGoesHereText.isDisplayed();
    }

    public void acceptAlert(){
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @FindBy(xpath = "//h3")
    private WebElement anIframeTest;

    public boolean isAnIframeTestDisplayed(){
        return anIframeTest.isDisplayed();
    }

    public void switchParentFrame(){
        Driver.getDriver().switchTo().parentFrame();
    }



}
