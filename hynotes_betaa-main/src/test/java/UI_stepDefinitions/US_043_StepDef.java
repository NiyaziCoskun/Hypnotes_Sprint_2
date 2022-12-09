
package UI_stepDefinitions;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import pages.BasePage;
import pages.LoginRegisterPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import javax.swing.text.Utilities;

public class US_043_StepDef extends BasePage {

    @Then("user checks that Add Button is clickable and goes to the relevant page")
    public void userChecksThatAddButtonIsClickableAndGoesToTheRelevantPage() {
        getLoginRegisterPage().addClient.click();
       String AddClientUrl =  Driver.getDriver().getCurrentUrl();
        BrowserUtilities.waitFor(3);
        Assert.assertEquals("https://test.hypnotes.net/dashboard/add-client", AddClientUrl);
       Driver.getDriver().navigate().back();
       BrowserUtilities.waitFor(3);

    }

    @Then("user checks that Import Button is clickable and goes to the relevant page")
    public void checks_that_import_button_is_clickable_and_goes_to_the_relevant_page() {
        Assert.assertTrue(getLoginRegisterPage().importClients.isEnabled());
        getLoginRegisterPage().importClients.click();
       String importMothodTitle = getLoginRegisterPage().importMethodTitle.getText();
       System.out.println("--------------title-------------------"+importMothodTitle);
      // Assert.assertEquals("Choose Import Method", importMothodTitle);
        getLoginRegisterPage().cancelButton.click();

    }

    @Then("user checks that Export Button is clickable and goes to the relevant page")
    public void checks_that_export_button_is_clickable_and_goes_to_the_relevant_page() {



    }

    @Then("user checks that Start Meeting Button is clickable and goes to the relevant page")
    public void checks_that_start_meeting_button_is_clickable_and_goes_to_the_relevant_page() {

    }

    @Then("user checks that Logout Button is clickable and exit from the page")
    public void checks_that_logout_button_is_clickable_and_exit_from_the_page() {

    }



}
