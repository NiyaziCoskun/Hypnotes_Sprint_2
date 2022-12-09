package UI_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LoginRegisterPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class loginStepDef {
    LoginRegisterPage loginPage = new LoginRegisterPage();
    @Given("user goes to therapist login page")
    public void userGoesToTherapistLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitFor(3);
        loginPage.login.click();
        BrowserUtilities.waitFor(3);
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("therapistEmail"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("therapistPassword"));
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(loginPage.submitButton);
        BrowserUtilities.waitFor(3);

    }

    @Given("user goes to client login page")
    public void userGoesToClientLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitFor(3);
        loginPage.login.click();
        BrowserUtilities.waitFor(3);
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("clientEmail"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("clientPassword"));
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(loginPage.submitButton);
        BrowserUtilities.waitFor(3);

    }
}
