package techproed.tests.smoketests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_PositiveLoginTest {
BlueRentalHomePage blueRentalHomePage;
BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US100201_Admin_Login(){
        Reporter.log("SAYFAYA GİT");
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage=new BlueRentalHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Reporter.log("LOGİN BUTONUNA TIKLA");
        blueRentalHomePage.loginLink.click();
        Reporter.log("GİRİŞ BİLGİLERİNİ GİR");
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        blueRentalLoginPage.loginButton.click();
        Reporter.log("GİRİŞ YAPILDIĞINI DOĞRULA");
        assert blueRentalHomePage.userID.isDisplayed();
        Reporter.log("DRİVERI KAPAT");
        Driver.closeDriver();
    }
}
