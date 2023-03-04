package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        trendyol.ASUS.click();

        //fiyat yazisina tiklar
        actions = new Actions(Driver.getDriver());
        actions.scrollToElement(trendyol.price).perform();
        ReusableMethods.bekle(3000);
        trendyol.price.click();
        ReusableMethods.bekle(3000);
        trendyol.maxPriceTextBox.sendKeys("20000");
        trendyol.priceButton.click();

        String actual =trendyol.SearchResults.getText();
        System.out.println(actual);
    }
}

