package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Trendyol;

import static utilities.Driver.driver;

public class LoginMethod {

    public static void login(){
        Trendyol trendyol=new Trendyol();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Trendyol anasayfasına git ve cookies kabul et
        trendyol.cookiesAccept.click();

        // Giriş yap butonuna tıkla
        trendyol.SignIn.click();

        //Geçerli kullanıcı email ve şifre gir
        trendyol.loginEmail.sendKeys(ConfigReader.getProperty("email"));
        trendyol.loginPasswordInput.sendKeys(ConfigReader.getProperty("password"));

        // Giriş Yap butonuna tıkla
        trendyol.userSignIn.click();

        // Başarılı giriş yapıldığını doğrula
        Assert.assertTrue( trendyol.MyAccountLink.isDisplayed());

    }
}
