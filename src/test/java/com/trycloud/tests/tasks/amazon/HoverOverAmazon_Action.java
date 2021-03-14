package com.trycloud.tests.tasks.amazon;

import com.trycloud.tests.base.BaseAmazon;
import com.trycloud.tests.pages.amazon.AccountAndListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverAmazon_Action extends BaseAmazon {
    AccountAndListPage accountAndListPage=new AccountAndListPage();

    @Test
    public void hoverSignIn(){
        hoverOverAccountAndList();
        Assert.assertEquals(accountAndListPage.getYourAccountTest(),"Your Account");

    }
}
