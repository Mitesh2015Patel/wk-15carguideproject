package au.com.carguide.pages;

import au.com.carguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CarDealerPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());

    public CarDealerPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyPageFindDeal;

    public void verifyPageFindDeal() {
        String expectedMessage = "Find a Car Dealership Near You";
        String actualMessage = getTextFromElement(verifyPageFindDeal);
        Assert.assertEquals(expectedMessage,actualMessage);
    }


//    @CacheLookup
//    @FindBy(css = ".dealer-title")
//    WebElement verifyCarDealer;
//
//    public String verifyCarDealerText(){
//        log.info("VerifyText : " + verifyCarDealer.toString());
//        return getTextFromElement(verifyCarDealer);
    }
