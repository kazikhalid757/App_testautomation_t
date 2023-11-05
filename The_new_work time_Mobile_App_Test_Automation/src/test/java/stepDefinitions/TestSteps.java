package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;


public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup) {
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }


    @Given("Check Toady button is availablel")
    public void checkToadyButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.google_cencel().click();
        Thread.sleep(1000);
        testingApp.not_now().click();
        Thread.sleep(1000);
        testingApp.without_subscribtion().click();
        Thread.sleep(1000);
        testingApp.continue_button().click();
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.today_button().isDisplayed());
        Thread.sleep(10000);
    }

    @When("Click  home button")
    public void clickHomeButton() {
        testingApp.today_button().click();
    }


    @Given("Check Play  button is availablel")
    public void checkPlayButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.google_cencel().click();
        Thread.sleep(1000);
        testingApp.not_now().click();
        Thread.sleep(1000);
        testingApp.without_subscribtion().click();
        Thread.sleep(1000);
        testingApp.continue_button().click();
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.play_button().isDisplayed());
        Thread.sleep(10000);
    }

    @When("Click  Play  button")
    public void clickPlayButton() {
        testingApp.play_button().click();
    }

    @Given("Check  For you button is availablel")
    public void checkForYouButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.google_cencel().click();
        Thread.sleep(2000);
        testingApp.not_now().click();
        Thread.sleep(2000);
        testingApp.without_subscribtion().click();
        Thread.sleep(1000);
        testingApp.continue_button().click();
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.for_you_button().isDisplayed());
        Thread.sleep(10000);
    }

    @When("Click   For you button")
    public void clickForYouButton() {
        testingApp.for_you_button().click();
    }

    @Given("Check  sections button is availablel")
    public void checkSectionsButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.google_cencel().click();
        Thread.sleep(2000);
        testingApp.not_now().click();
        Thread.sleep(2000);
        testingApp.without_subscribtion().click();
        Thread.sleep(2000);
        testingApp.continue_button().click();
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.section_button().isDisplayed());
        Thread.sleep(10000);
    }

    @When("Click   sections button")
    public void clickSectionsButton() {
        testingApp.section_button().click();
    }

    @Given("Check Search Bar button is availablel")
    public void checkSearchBarButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.google_cencel().click();
        Thread.sleep(2000);
        testingApp.not_now().click();
        Thread.sleep(2000);
        testingApp.without_subscribtion().click();
        Thread.sleep(2000);
        testingApp.continue_button().click();
        Thread.sleep(2000);
        testingApp.popup_cont().click();
        Thread.sleep(2000);
        testingApp.section_button().click();
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.search().isDisplayed());
        Thread.sleep(10000);

    }

    @When("Click  Search Bar button")
    public void clickSearchBarButton() {
        testingApp.search().click();
    }


    @Given("Click Profile")
    public void clickProfile() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.google_cencel().click();
        Thread.sleep(2000);
        testingApp.not_now().click();
        Thread.sleep(2000);
        testingApp.without_subscribtion().click();
        Thread.sleep(2000);
        testingApp.continue_button().click();
        Thread.sleep(2000);
        testingApp.popup_cont().click();
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.profile().isDisplayed());
        Thread.sleep(10000);

    }

    @Then("Check new page is display")
    public void checkNewPageIsDisplay() throws InterruptedException {
        testingApp.profile().click();
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.accout_page().isDisplayed());
    }
}
