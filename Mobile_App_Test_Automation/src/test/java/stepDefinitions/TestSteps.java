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


    public TestSteps(ContextSetup setup){
       this.setup = setup;
       this.testingApp = setup.pageObjectManager.getAdditionPage();
    }



    @Given("Check home button is availablel")
    public void checkHomeButtonIsAvailablel() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.get_start().click();
        Thread.sleep(10000);
        Assert.assertTrue(testingApp.home_button_f().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click  home button")
    public void clickHomeButton() {
        testingApp.home_button_f().click();
    }

    @Given("Check Play  button is availablel")
    public void checkPlayButtonIsAvailablel() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(3000);
        Assert.assertTrue(testingApp.play_button().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click  Play  button")
    public void clickPlayButton() {
        testingApp.play_button().click();
    }

    @Given("Check  Menu Bar button is availablel")
    public void checkMenuBarButtonIsAvailablel() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(3000);
        Assert.assertTrue(testingApp.manu_button().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click   Menu Bar button")
    public void clickMenuBarButton() {
        testingApp.manu_button().click();
    }

    @Given("Check Search Bar button is availablel")
    public void checkSearchBarButtonIsAvailablel() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(3000);
        testingApp.manu_button().click();
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Search_Bar().isDisplayed());


    }

    @When("Click  Search Bar button")
    public void clickSearchBarButton() {
        testingApp.Search_Bar().click();
    }

    @Given("Click any post")
    public void clickAnyPost() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.post().click();

    }

    @Then("Check share button is available")
    public void checkShareButtonIsAvailable() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.post().click();
        Assert.assertTrue(testingApp.share().isDisplayed());
    }

    @When("Click Share button")
    public void clickShareButton() {
        testingApp.share().click();
    }

    @Then("Check popup window is show")
    public void checkPopupWindowIsShow() {
    }

    @Then("Check new page is display")
    public void checkNewPageIsDisplay() {
    }

    @Given("Check Play button is available")
    public void checkPlayButtonIsAvailable() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.play_button().click();
        testingApp.VIDEO_tap().click();

    }


    @Given("Click menu bar")
    public void clickMenuBar() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.manu_button().click();
        Thread.sleep(2000);
        testingApp.settingsBtn().click();
    }

    @Then("Check enavailable notification button")
    public void checkEnavailableNotificationButton() {
        Assert.assertTrue(testingApp.notifi_button().isDisplayed());
    }

    @When("Click enavailable notification button")
    public void clickEnavailableNotificationButton() {
        testingApp.notifi_button().click();
    }

    @Then("Check any notification show")
    public void checkAnyNotificationShow() {
    }

    @Given("check header font size gather than post text")
    public void checkHeaderFontSizeGatherThanPostText() {
    }

    @Given("Click manu bar")
    public void clickManuBar() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.manu_button().click();


    }

    @Then("Check Setteing button is available")
    public void checkSetteingButtonIsAvailable() {
        Assert.assertTrue(testingApp.settingsBtn().isDisplayed());
    }

    @When("Click Setteing button is available")
    public void clickSetteingButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.settingsBtn().click();
    }

    @Then("Check Setteing page is available")
    public void checkSetteingPageIsAvailable() {

    }

    @Then("Check Feedbackbutton is available")
    public void checkFeedbackbuttonIsAvailable() {

    }

    @When("Click Feedbackbutton is available")
    public void clickFeedbackbuttonIsAvailable() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.manu_button().click();
        Thread.sleep(2000);
        testingApp.feedbackBtn().click();

    }

    @Then("Check Feedbackpage is available")
    public void checkFeedbackpageIsAvailable() {
    }

    @Given("Check text box")
    public void checkTextBox() throws InterruptedException {
        testingApp.get_start().click();
        Thread.sleep(5000);
        testingApp.manu_button().click();
        Thread.sleep(2000);
        testingApp.feedbackBtn().click();
    }

    @When("Click text box")
    public void clickTextBox() {
        testingApp.text_box().click();
    }

    @Then("Check done button is available")
    public void checkDoneButtonIsAvailable() {
        Assert.assertTrue(testingApp.done_button().isDisplayed());

    }

    @And("Check done button.")
    public void checkDoneButton() {

    }

    @When("Click done button")
    public void clickDoneButton() {
        testingApp.done_button().click();
    }


    @And("Click video push play button")
    public void clickVideoPushPlayButton() {
    }

    @Then("Check video play push")
    public void checkVideoPlayPush() {
    }

    @When("Click Play button for video")
    public void clickPlayButtonForVideo() {
    }
}
