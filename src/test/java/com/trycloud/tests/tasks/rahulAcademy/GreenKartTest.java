package com.trycloud.tests.tasks.rahulAcademy;

import com.trycloud.tests.base.BaseGreenKart;
import com.trycloud.tests.pages.rahulAcademy.CardPage;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class GreenKartTest extends BaseGreenKart {
    CardPage cart=new CardPage();

    @Test
    public void testCardItems(){
     List<String> list= makeList("cucumber","cucumber", "brocolli", "beetroot");
        for (String s : list) {
            clickItem(s);
        }
        clickCardIcon();
        clickProceedToCheckout();
        cart.enterPromoCode("rahulshettyacademy");
        cart.clickApply();
        Assert.assertEquals(cart.getCodeAppliedText(),"Code applied ..!");

        System.out.println("end");

    }
}
