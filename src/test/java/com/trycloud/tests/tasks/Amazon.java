package com.trycloud.tests.tasks;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {

    @Test
    public void amazonTest() {

        Driver.getDriver().get("https://www.amazon.com/");
        WebElement next = Driver.getDriver().findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        List<WebElement> listItem = Driver.getDriver().findElements(By.xpath("//a[@class='a-link-normal aok-inline-block']/img"));
        //   List<WebElement> listForClick = Driver.getDriver().findElements(By.xpath("//a[@class='a-link-normal aok-inline-block']/img/.."));
        //List<WebElement> listItem= Driver.getDriver().findElements(By.xpath("//li[@class='a-carousel-card']"));


        for (WebElement webElement : listItem) {
            wait.until(ExpectedConditions.visibilityOf(next)).click();
            Driver.getDriver().findElement(By.id("gw-desktop-herotator")).click();
//            System.out.println(webElement.getAttribute("alt"));


//            if (webElement.getAttribute("alt").equals("Wi-Fi 6 is here. All-new eero 6")) {
//                Driver.getDriver().findElement(By.id("gw-desktop-herotator")).click();
//                break;
//            }


        }
    }
}
