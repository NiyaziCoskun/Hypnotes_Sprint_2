package UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.LoginRegisterPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import javax.swing.*;
import java.awt.*;

public class US_057_StepDef extends BasePage {

    @When("user clicks clients")
    public void userClicksClients() {
        getLoginRegisterPage().clientsPage.click();

    }

    @Then("user search client")
    public void userSearchClient() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().searchClientsBox);
        getLoginRegisterPage().searchClientsBox.sendKeys("mahir kara");
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER);

    }


    @When("user clicks view detail")
    public void userClicksViewDetail() {
        BrowserUtilities.clickWithJS(getLoginRegisterPage().clientViewDetail);
        BrowserUtilities.waitFor(3);
        //lg.clientViewDetail.click();
    }

    @And("user clicks login Presenting Issue")
    public void userClicksLoginPresentingIssue() {
       BrowserUtilities.clickWithJS(getLoginRegisterPage().presentingIssue);
        //lg.presentingIssue.click();
    }

    @And("user clicks Additional Notes")
    public void userClicksAdditionalNotes() {
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(getLoginRegisterPage().additionalNotesButton);
        BrowserUtilities.waitFor(3);
        getLoginRegisterPage().additionalNotesButton.click();
    }


    @Then("Assert voice Notes is enable")
    public void assertVoiceNotesIsEnable() {
        BrowserUtilities.scrollToElement(getLoginRegisterPage().voiceRecord);
        Assert.assertTrue(getLoginRegisterPage().voiceRecord.isEnabled());
    }

    @When("user clicks add Voice")
    public void userClicksAddVoice() {
    }

    @Then("user verifies Recording")
    public void userVerifiesRecording() {
    }

    @When("user clicks recorded sound")
    public void userClicksRecordedSound() {
    }

    @Then("user clicks Play button and Voice play")
    public void userClicksPlayButtonAndVoicePlay() {
    }

    @And("user verifies {string}")
    public void userVerifies(String arg0) {

    }

    @And("user verifies {string} functionality")
    public void userVerifiesFunctionality(String arg0) {
    }
}
