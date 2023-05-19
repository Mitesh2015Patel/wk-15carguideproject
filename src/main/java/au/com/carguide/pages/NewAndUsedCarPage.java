package au.com.carguide.pages;

import au.com.carguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#makes")
    WebElement AnyMake;

    @CacheLookup
    @FindBy(css = "#models")
    WebElement AnyModel;

    @CacheLookup
    @FindBy(css ="#locations")
    WebElement AnyLocations;

    @CacheLookup
    @FindBy(css = "#priceTo")
    WebElement selectprice;

    @CacheLookup
    @FindBy(css ="#search-submit")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement newAndUsedCarSearch;


    public void selectMake(String make) {
        log.info("Select make : " + AnyMake.toString());
        selectByVisibleTextFromDropDown(AnyMake, make);
    }

    public void selectAnyModel(String model) {
        log.info("Select model : " + AnyModel.toString());
        selectByVisibleTextFromDropDown(AnyModel, model);
    }

    public void selectLocation(String location) {
        log.info("Select location: " + AnyLocations.toString());
        selectByVisibleTextFromDropDown(AnyLocations, location);
    }

    public void selectPrice(String price) {
        log.info("Select location: " + AnyLocations.toString());
        selectByVisibleTextFromDropDown(selectprice, price);
    }

    public void findMyNextCar() {
        log.info("Find My Next Car: " + AnyLocations.toString());
        clickOnElement(findMyNextCar);
    }

    public String verifyNewAndUsedCarText() {
        log.info("Verify text: " + newAndUsedCarSearch.toString());
//        String expectedText = "New & Used Car Search - carsguide";
//        String actualText = new NewAndUsedCarPage().verifyNewAndUsedCarText();
//        Assert.assertEquals(actualText,expectedText);
        return getTextFromElement(newAndUsedCarSearch);

    }

}


