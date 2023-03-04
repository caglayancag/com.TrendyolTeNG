package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class SmokeTest3 {

    Trendyol trendyol=new Trendyol();

    @Test(description = "Yeni kayıt ve Giriş testi")
    public void test01(){

        // Trendyol.com anasayfasına git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        trendyol.cookiesAccept.click();

        // Kayıt ol Butonuna tıkla

        Actions actions=new Actions(Driver.getDriver());

        actions.moveToElement(trendyol.SignIn).perform();

        trendyol.SignUp.click();

        // Geçerli Kullanıcı E-mail ve Şifre gir

        trendyol.registerEmail.sendKeys(ConfigReader.getProperty("email"));

        trendyol.registerPasswordInput.sendKeys(ConfigReader.getProperty("password"));

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(2);

      // trendyol.maleSelect.click();

        trendyol.checkboxAgree.click();

        trendyol.registerButton.click();




    }

}
