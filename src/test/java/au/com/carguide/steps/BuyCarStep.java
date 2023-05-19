package au.com.carguide.steps;

import au.com.carguide.pages.Homepage;
import au.com.carguide.pages.NewAndUsedCarPage;
import au.com.carguide.pages.UsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyCarStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String arg0) {
        new Homepage().mouseHoverOnBuySellTab();

    }

    @And("^I click 'search Cars' link$")
    public void iClickSearchCarsLink() {
        new  Homepage().clickOnSearchcars();
    }

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new NewAndUsedCarPage().verifyNewAndUsedCarText();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
      new NewAndUsedCarPage().selectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
       new NewAndUsedCarPage().selectAnyModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
       new NewAndUsedCarPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
       new NewAndUsedCarPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car Tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().findMyNextCar();
    }

    @Then("^I should see the \"([^\"]*)\"$")
    public void iShouldSeeThe(String arg0) {


    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new Homepage().clickOnUsed();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
        new UsedCarPage().verifyTextusedCarForSale();
    }
//
//    @And("^I click on Find My Next Car tab$")
//    public void iClickOnFindMyNextCarTab() {
//    }
}
