package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RecommendedItemsPage {


    public RecommendedItemsPage(){
            PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="recommended-item-carousel")

    public WebElement items;



}
