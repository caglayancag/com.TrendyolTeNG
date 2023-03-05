package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

public class SmokeTest4 {
    Trendyol trendyol = new Trendyol();
    Actions actions = new Actions(Driver.getDriver());
    @Test(description = "Başarılı Login testi")
    public void SignInTest01() {
        //Trendyol anasayfasına git ve cookies kabul et
        Driver.getDriver().get(ConfigReader.getProperty("url"));
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

        trendyol.ElectronicsLink.click();

        trendyol.ComputerAccesuary.click();
    }
}
