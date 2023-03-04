package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendyol {

    public Trendyol(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (id = "onetrust-accept-btn-handler")
    public WebElement cookiesAccept;

    @FindBy (xpath =" //*[@class='V8wbcUhU']")
    public WebElement searchBox;

    @FindBy (className = "dscrptn")
    public WebElement SearchResults;
}
