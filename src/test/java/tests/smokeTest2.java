package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.bekle;

public class smokeTest2 {
    Actions actions = new Actions(Driver.getDriver());
    Trendyol trendyol = new Trendyol();
    @Test
    public void urunAlmaTesti() throws InterruptedException {
        // trendol anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        trendyol.cookiesAccept.click();


        // elektronik kategorisinden Bilgisayar ve tablet bolumunu secer
        actions.click(trendyol.elektronik).perform();

        trendyol.computerAndTablet.click();
        // filtrelemede asus secer
        //actions.sendKeys(Keys.F5).perform();
        bekle(3);
        trendyol.ASUS.click();

        //fiyat yazisina tiklar
        actions = new Actions(Driver.getDriver());
        actions.scrollToElement(trendyol.price).perform();
        bekle(3);
        trendyol.price.click();
        bekle(3);
        //Max fiyat 20000 olarak girer
        trendyol.maxPriceTextBox.sendKeys("20000");
        trendyol.priceButton.click();

        String actual =trendyol.SearchResults.getText();

        // Bulunan sonucların Asus icerdigini dogrulayin
        String expResult=  "ASUS";
        Assert.assertTrue(actual.contains(expResult));

        // Bulunan sonucların 20000 tl altinda old. dogrulayın
        bekle(3);
        trendyol.priceOption.click();
        bekle(2);

        trendyol.priceMax.click();
        double actualPrice=Double.parseDouble(trendyol.firstItem.getText().replaceAll("TL",""));

        Assert.assertTrue(actualPrice<20000);





    }
}

