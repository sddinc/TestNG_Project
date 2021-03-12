package com.trycloud.tests.tasks.cybertek;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
    @Test(description = "TC #16: Hover Test\n" +
            "1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index 2. Drag and drop the small circle to bigger circle.\n" +
            "3. Assert:\n" +
            "-Text in big circle changed to: “You did great!”")
    public void dragAndDrop(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions actions=new Actions(Driver.getDriver());
        WebElement source=Driver.getDriver().findElement(By.id("draggable"));
        WebElement target=Driver.getDriver().findElement(By.id("droptarget"));
        actions.dragAndDrop(source,target).perform();
        Assert.assertEquals(target.getText(), "You did great!");

    }
}
