package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {
    OpenSourcePage openSourcePage;
    OpenSourceDashboardPage openSourceDashboardPage;
    @Test
    public void test01(){
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));
        //Page Class : OpenSourcePage
        //kullaniciAdi, kullaniciSifre, submitButton elementlerini bul
        //Test Class : OpenSourceLogin
        //Page objesi olustur
        openSourcePage = new OpenSourcePage();
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.loginButton.click();
        //Login Testini basarili oldugunu test et
        assert openSourceDashboardPage.dashboardHeader.isDisplayed();
        Driver.closeDriver();

    }
}
