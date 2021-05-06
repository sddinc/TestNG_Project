package com.trycloud.tests.tasks;

import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

    @Test(description = "Verify page title", dataProvider = "testData")
    public void titleVerification(String webSite, String title) {
        Driver.getDriver().get(webSite);
        Assert.assertEquals(Driver.getDriver().getTitle(), title);


    }
//    @DataProvider(name = "testData")
//    public Object[][] testData(){
//        return new Object[][]{{"https://www.amazon.com","Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"},
//                {"https://www.google.com/","Google"}};
//
//    }


    @Test(dataProvider = "fullNameData")
    public void printNameLastName(String firstName, String lastname) {
        System.out.println(firstName + " " + lastname);
    }

    @DataProvider
    public Object[][] fullNameData() {

        return new Object[][]{{"Selcuk", " Demirci"}, {"Elif ", "Aydin"}};
    }

    @Test(dataProvider = "testDate")
    public void titleVerification2(String url, String title) {
        Driver.getDriver().get(url);
        org.junit.Assert.assertEquals(Driver.getDriver().getTitle(), title);
    }

    @DataProvider
    public Object[][] testDate() {


        return new Object[][]{{"https://www.amazon.com/", "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"},
                {"https://www.google.com/", "Google"}};
    }


}
