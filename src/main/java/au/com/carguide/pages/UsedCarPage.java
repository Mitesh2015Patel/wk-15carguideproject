package au.com.carguide.pages;

import au.com.carguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarPage.class.getName());

    public UsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedCarsForSale;

    public String verifyTextusedCarForSale() {
        log.info("Verify text: " + usedCarsForSale.toString());
//        String expectedText = "Used Cars For Sale ";
//        String actualText = new UsedCarPage().verifyTextusedCarForSale();
//        Assert.assertEquals(actualText, expectedText);
        return getTextFromElement(usedCarsForSale);
    }
}
