package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public abstract class BasePage {
    HomePage homePage;
    RegisterPage registerPage;
    LoginRegisterPage loginRegisterPage;
    ClientInfoPage clientInfoPage;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public LoginRegisterPage getLoginRegisterPage() {
        if (loginRegisterPage==null){
            loginRegisterPage= new LoginRegisterPage();
        }
        return loginRegisterPage;
    }

    public ClientInfoPage getclientInfoPage(){
        if(clientInfoPage==null){
            clientInfoPage=new ClientInfoPage();

        }
        return clientInfoPage;
    }
}

