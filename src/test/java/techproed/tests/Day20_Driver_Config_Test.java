package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day20_Driver_Config_Test {
    @Test
    public void firstTest(){
        //Amazon a git
        //Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        //title ın amazon içerdiğini test et
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
    }

}
