package au.com.carguide.pages;

import au.com.carguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement  findADealer;


    public void mouseHoverOnBuySellTab(){
        log.info("Buy sell tab : " + buySell.toString());
        mouseHoverToElement(buySell);
    }

    public void clickOnSearchcars(){
        log.info("Click on search cars : " + searchCars.toString());
        clickOnElement(searchCars);
    }

    public void clickOnUsed() {
        log.info("Click on Used cars : " + used.toString());
        clickOnElement(used);
    }
    public void clickFindADealer(){
        log.info("Click on Find a dealer : " + findADealer.toString());
        clickOnElement(findADealer);
    }
}
