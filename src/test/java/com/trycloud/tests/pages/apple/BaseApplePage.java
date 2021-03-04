package com.trycloud.tests.pages.apple;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public abstract class BaseApplePage {
    public BaseApplePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);


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

    public void printAllLinks(){

        navigator("iPhone");
        for (int i = 0; i <allLinks.size() ; i++) {
            System.out.println(allLinks.get(i).getText());
        }

    }
    public void sizeOfMissingLink(){
        navigator("iPhone");
        int count=0;
        for (int i = 0; i <allLinks.size() ; i++) {
           if(allLinks.get(i).getText().isEmpty());
           count++;
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





//
//    @AfterClass
//    public void tearDown() {
//        Driver.closeDriver();
//    }


}
