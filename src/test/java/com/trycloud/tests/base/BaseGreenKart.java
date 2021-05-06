package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class BaseGreenKart {
    public BaseGreenKart(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlGreenKart"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @FindBy(xpath = "//a[@class='cart-icon']")
    private WebElement cartIconLink;


    public void clickCardIcon(){
        cartIconLink.click();
    }


    public void clickItem(String item){
        item=item.substring(0,1).toUpperCase()+item.substring(1).toLowerCase();
        String xpath="//h4[text()='"+item+" - 1 Kg']/../div[3]/button";
            Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

    public List<String> makeList(String ...items){
        return new LinkedList<>(Arrays.asList(items));
    }

    @FindBy(xpath = "//button[.='PROCEED TO CHECKOUT']")
    private WebElement checkoutButton;

    public void clickProceedToCheckout(){
        checkoutButton.click();
    }

    @FindBy(xpath = "//a[.='Top Deals']")
    private WebElement topDealsLink;

    public void clickTopDeal(){
        topDealsLink.click();
    }


    






}
