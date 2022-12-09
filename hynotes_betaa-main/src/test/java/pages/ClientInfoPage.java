package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClientInfoPage extends BasePage{
   @FindBy(xpath ="//p[@class='title'][1]")
    public WebElement clientInfo;

   @FindBy(xpath = "//p[@class='title']")
    public List<WebElement>topTitles;

   @FindBy(xpath = "//*[@type='button']")
   public List<WebElement>subTitles;
}
