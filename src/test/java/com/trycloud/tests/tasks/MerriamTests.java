package com.trycloud.tests.tasks;

import com.trycloud.tests.pages.merriam.BaseMerriamPage;
import com.trycloud.tests.pages.merriam.MerriamHomePage;
import org.testng.annotations.Test;

public class MerriamTests extends BaseMerriamPage {
    MerriamHomePage merriamHomePage = new MerriamHomePage();

    @Test(description = "TC #0: FINDELEMENTS\n" +
            "1. Open Chrome browser\n" +
            "2. Go to https://www.merriam-webster.com/ " +
            "3. Print out the texts of all links\n" )
    public void printAllLink() {
        merriamHomePage.printAllLinkTests();

    }
  @Test(description = "TC #0: FINDELEMENTS\n" +
            "4. Print out how many link is missing text\n" +
            "5. Print out how many link has text\n" +
            "6. Print out how many total link\n")
    public void printSizeOfMissingTextAndHasText() {
      System.out.println("size Of Missing Text = " + merriamHomePage.sizeOfMissingText());
      System.out.println("size Of Text         = " + merriamHomePage.sizeOfText());
      System.out.println("Total Size of page   = "+(merriamHomePage.sizeOfText()+merriamHomePage.sizeOfMissingText()));

  }

}
