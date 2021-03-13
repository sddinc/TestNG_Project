package com.trycloud.tests.pages.apple;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class BaseApplePage {
    public BaseApplePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy(xpath = "//a[contains(@class,'ac-gn-link ac-gn-link')]")
    public List<WebElement> headersLink;

    @FindBy(xpath = "//ul[@class='ac-gn-list']")
    private List<WebElement> allHeadersLinks;

    @BeforeClass
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlApple"));
        // Dimension d = new Dimension(480, 620);
        Driver.getDriver().manage().window().maximize();

    }

    public void navigator(String module) {
        String xpath = "(//span[.='" + module + "'])[1]/..";
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath(xpath)))).click();
    }

    @FindBy(xpath = "//a")
    private List<WebElement> allLinks;

    public void printAllLinks() {

        navigator("iPhone");
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getText());
        }
    }

    public void sizeOfMissingLink() {
        navigator("iPhone");
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).getText().isEmpty()) {
                count++;
            }
        }
        System.out.println("Count of missing link:  " + count);
    }

    public void sizeOfMissingLink(String module) {
        navigator(module);
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).getText().isEmpty()) {
                count++;
            }
        }
        System.out.println("Count of missing link:  " + count);
    }

    public void sizeOfTextLink() {
        navigator("iPhone");
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (!allLinks.get(i).getText().isEmpty()) {
                count++;
            }
        }
        System.out.println("Count of  link that has a text :  " + count);
    }

    public void sizeOfTextLink(String module) {
        navigator(module);
        int count = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            if (!allLinks.get(i).getText().isEmpty()) {
                count++;
            }
        }
        System.out.println("Count of  link that has a text :  " + count + " in " + module);
    }

    public void sizeOfAllLinks() {
        System.out.println("size of all link :" + allLinks.size());
    }

    public List<String> allHeaders() {
        List<String> headers = new LinkedList<>();
        for (int i = 1; i < headersLink.size() - 4; i++) {
            headers.add(headersLink.get(i + 2).getText());
        }
        return headers;
    }


    public void windowsHandle() throws InterruptedException {


        for (int i = 0; i < allHeaders().size(); i++) {
            Thread.sleep(5000);
            String module = allHeaders().get(i);
            System.out.println("Test Of " + module + " Page ");
            sizeOfTextLink(module);
            sizeOfMissingLink(module);
            sizeOfAllLinks();


        }
    }

    public void windowsHandleWithSeparateTap() {
        for (int i = 0; i < allHeadersLinks.size(); i++) {
//            String clickTap = Keys.chord(Keys.COMMAND, Keys.ENTER);
//            allHeadersLinks.get(i).sendKeys(clickTap);
            allHeadersLinks.get(i).click();
        }
        Set<String>allWindows=Driver.getDriver().getWindowHandles();
        System.out.println(allWindows.size());
    }

    public void printAllLink() {
        allHeadersLinks.stream().forEach(p -> System.out.println(p.getText()));
    }
}


//
//    @AfterClass
//    public void tearDown() {
//        Driver.closeDriver();
//    }



