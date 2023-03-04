package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Trendyol;
import utilities.Driver;

public class SmokeTest {

    Trendyol trendyol=new Trendyol();
    @Test(description = "Trendyol sayfasında Arama fonksiyon test")
    public void test01() {
        // Trendyol.com'a gidilir.

        Driver.getDriver().get("https://www.trendyol.com");

        // Anasayfada olduğunuzu doğrulayın

        String actuelUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.trendyol.com/";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(expectedUrl, actuelUrl);



        softAssert.assertAll();

        // Cookies Kabul edilir.
        trendyol.cookiesAccept.click();

        // Arama kutusuna Iphone yazılır ve aratılır.

        trendyol.searchBox.sendKeys("Iphone"+ Keys.ENTER);

        // Arama sonuclarının Iphone içerdiğini doğrulayın

        String actuel=trendyol.SearchResults.getText();
        String expected="Iphone";

        softAssert.assertTrue(actuel.contains(expected));

        // Arama sonuclarının 1000'den fazla olduğunu doğrulayın
        String actualNumber=actuel.replaceAll("\\D","");
        int actualNum=Integer.parseInt(actualNumber);
        int expectedNumber=1000;
        softAssert.assertTrue(actualNum>expectedNumber);

        Driver.closeDriver();

    }

}
