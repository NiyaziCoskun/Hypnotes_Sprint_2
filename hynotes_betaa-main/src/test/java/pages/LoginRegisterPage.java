package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import javax.swing.text.html.CSS;
import java.util.List;

public class LoginRegisterPage extends BasePage {


    @FindBy(xpath = "//*[text()='Login']")
    public WebElement login;

    @FindBy(css = "[name='username']")
    public WebElement emailBox;

    @FindBy(css = "[name='password']")
    public WebElement passwordBox;

    @FindBy(css = "[type='submit']")
    public WebElement submitButton;

    //START US_013
    //@FindBy(xpath = "//nav/a[10]")
    @FindBy(css = ".ant-dropdown-trigger.BaseNavbar_dropBtn__zkmnE.btn")
    public WebElement signUpButton;

    @FindBy(xpath = "//a[@href=\"/register/client\"]")
    public WebElement clientButton;

    @FindBy(css = "#social-media-login-logo-g")
    public WebElement googleIcon;

    @FindBy(xpath = "//input[@type=\"email\"]")
    public WebElement inputEmail;

    @FindBy(css = "VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b")
    public WebElement googleNextButton;

    @FindBy(css = "#social-media-login-logo-fb")
    public WebElement FacebookIcon;
    @FindBy(xpath = "//button[@title=\"Erforderliche und optionale Cookies erlauben\"]")
    public WebElement facebookCookies;
    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement facebookEmail;
    @FindBy(xpath = "//input[@name=\"pass\"]")
    public WebElement facebookPassword;

    @FindBy(xpath = "//button[@id=\"loginbutton\"]")
    public WebElement facebookLoginButton;

    @FindBy(css = "._9axz")
    public WebElement facebookTitle;

    @FindBy(css = "#social-media-login-logo-l")
    public WebElement linkedInIcon;


    //END US_013


    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement logRegPageSıgnUpButton;

    @FindBy(xpath = "//li/span/a[contains(text(),'Client')]")
    public List<WebElement> clientAndTherapist;

    @FindBy(xpath = "//li/span/a[contains(text(),'Therapist')]")
    public List<WebElement> clientAndTherapist2;

    @FindBy(xpath = "//*[text()='Client Register']")
    public WebElement clientRegisterTitle;

    @FindBy(xpath = "//*[contains(text(),'Already')]")
    public WebElement alreadyAccount;

    @FindBy(xpath = "(//*[contains(text(),'Login')])[2]")
    public WebElement accountLogin;

    @FindBy(xpath = "//button[@aria-checked='true']")
    public WebElement iAmTherapistButton;

    @FindBy(xpath = "//label[text()='I am therapist?']")
    public WebElement therapistTitle;

    @FindBy(xpath = "//label[text()='I am Client']")
    public WebElement clientTitle;

    @FindBy(xpath = "//button[@aria-checked='false'")
    public WebElement iAmClientButton;

    @FindBy(linkText = "Clients")
    public WebElement clientsPage;

    @FindBy(xpath = "//input[@placeholder='Search Client by Name or Surname']")
    public WebElement searchClientsBox;

    @FindBy(xpath = "//*[contains(text(),'View Detail')]")
    public WebElement clientViewDetail;


    @FindBy(xpath = "(//p[@class='title'])[2]")
    public WebElement presentingIssue;

    @FindBy(xpath = "//div/p[text()='Additional Notes']")
    public WebElement additionalNotesButton;

//    @FindBy(xpath = "//div/label[text()='Attachments:']")
//    public WebElement attachmentsTitle;
//
//    @FindBy(xpath = "(//span[@role='img'])[37]")
//    public WebElement attachmentsAddButton;

//    @FindBy(css = "#addImageModalInput1848")
//    public WebElement chooseFile;

    @FindBy(xpath = "(//button[@class='close'])[2]")
    public WebElement closeButton;

    @FindBy(id = "record-icon1848")
    public WebElement voiceRecord;

    @FindBy(xpath = "//span[@aria-label='sound']")
    public WebElement soundıcon;

    @FindBy(xpath = "(//*[contains(text(),'Copy')])[2]")
    public WebElement copyButton;

    @FindBy(xpath = "(//*[contains(text(),'Send to client')])[2]")
    public WebElement sendClientButton;

    @FindBy(xpath = "//*[contains(text(),'Extract text to")
    public WebElement extractTextToButton;

    @FindBy(xpath = "//*[contains(text(),'Delete Voice")
    public WebElement deleteVoiceButton;

    @FindBy (xpath = "//span[contains(text(),'Add Client')]")
    public WebElement addClient ;

    @FindBy (xpath = "//span[normalize-space()='Import Clients']")
    public WebElement importClients;

    @FindBy (xpath = "//div[@class='ant-modal-title']")
    public WebElement importMethodTitle;

    @FindBy (css = ".ant-btn.ant-btn-default")
    public WebElement cancelButton;
}


