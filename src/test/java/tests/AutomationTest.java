package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RecommendedItemsPage;
import pages.ScrollPage;
import utilities.Driver;

public class AutomationTest {

    ////1. Launch browser
    ////2. Navigate to url 'http://automationexercise.com'
    ////3. Scroll to bottom of page
    ////4. Verify 'RECOMMENDED ITEMS' are visible
    ////5. Click on 'Add To Cart' on Recommended product
    ////6. Click on 'View Cart' button
    ////7. Verify that product is displayed in cart page


@Test
    public static  void test01() throws InterruptedException {
        Driver.getDriver().get("http://automationexercise.com");

        RecommendedItemsPage items=new RecommendedItemsPage();
        ScrollPage scroll=new ScrollPage();
        Actions actions=new Actions(Driver.getDriver());

        Thread.sleep(1000);
        actions.moveToElement(scroll.supBottom);
        Thread.sleep(1000);
        actions.moveToElement(items.items);
        Assert.assertTrue(items.items.isDisplayed());



    }

}
