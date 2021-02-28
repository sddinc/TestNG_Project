package com.trycloud.tests.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Etsy {
    public Home_Etsy(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "global-enhancements-search-query")
    private WebElement searchInput;


    public void sendItems(String items){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlEtsy"));
        searchInput.sendKeys(items+ Keys.ENTER);

    }

}
