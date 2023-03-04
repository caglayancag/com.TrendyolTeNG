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

    @FindBy(xpath = "(//a[text()='Elektronik'])[2]")
    public WebElement elektronik;

    @FindBy(xpath = "//span[text()='Laptop&Tablet']")
    public WebElement computerAndTablet;

    @FindBy(xpath = "//div[text()='ASUS']")
    public WebElement ASUS;

    @FindBy(xpath = "//div[text()='Fiyat']")
    public WebElement price;

    @FindBy(xpath = "//input[@class='fltr-srch-prc-rng-input max']")
    public WebElement maxPriceTextBox;

    @FindBy(xpath = "//button[@class='fltr-srch-prc-rng-srch']")
    public WebElement priceButton;

    @FindBy(xpath = "//*[@class='sort-fltr-cntnr']")
    public WebElement priceOption;

    @FindBy(xpath = "//option[@value='PRICE_BY_DESC']")
    public WebElement priceMax;

    @FindBy(xpath = "(//*[@class='price-promotion-container'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement SignIn;

    @FindBy(xpath = "//*[@class='signup-button']")
    public WebElement SignUp;

    @FindBy(id = "register-email")
    public WebElement registerEmail;

    @FindBy(id = "register-password-input")
    public WebElement registerPasswordInput;

    @FindBy(xpath = "(//span[text()='Erkek'])[2]")
    public WebElement maleSelect;
    @FindBy(xpath = "(//*[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[2]")
    public WebElement checkboxAgree;


    @FindBy(xpath = "//*[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement registerButton;
}
