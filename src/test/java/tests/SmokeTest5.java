package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.LoginMethod;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmokeTest5 {


    Trendyol trendyol=new Trendyol();
    Actions actions=new Actions(Driver.getDriver());
    @Test (description="Sepete ürün ekleme ")
    public void test() {

        // Trendyol Sayfasına git
        LoginMethod.login();

        ReusableMethods.bekle(2);

        trendyol.elektronik.click();
        trendyol.computerAndTablet.click();
        String whFirst=  Driver.getDriver().getWindowHandle();
        trendyol.randomItemSelect.click();
        Set < String> whAll=Driver.getDriver().getWindowHandles();
        String whSecond="";
        for (String i:whAll)
        {
            if (i!=whFirst)
            {
                whSecond=i;
            }
        }
        Driver.getDriver().switchTo().window(whSecond);
        actions.sendKeys(Keys.PAGE_DOWN);
        trendyol.addToBasketButton.click();
        trendyol.MyBasket.click();



        // elektronik kategorisinden Bilgisayar ve tablet bolumunu secer

    }
}
