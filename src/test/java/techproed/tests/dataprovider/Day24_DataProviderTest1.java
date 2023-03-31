package techproed.tests.dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.security.Key;
public class Day24_DataProviderTest1 {

    /*
DataProvider Nedir?
    ***Veri deposudur. Bir cok veriyi Test Case'lere loop kullanmadan aktarmak icin kullanilir.***
    ***Data provider 2D(2 boyutlu) Object return eder.***
    ***Data provider TestNG'den gelen bir ozelliktir.***
Data Provider ne icin kullanilir?
    ***Data provider DDT(Data Driven Testing) icin kullanilir.Birden fazla data'yi test case'lerde kullanmak icin kullanilir.***
Data Provider'i nasil kullaniriz?
    ***@DataProvider annotation'i ile veri havuzu olusturulur.***
    ***@Test method'larina bu data havuzu dataProvider parametresiyle baglanir.***
    Data provider'da 2 tane parametre vardir:
    ***name : Method ismini override etmek icin, yani farkli bir isim ile data provider'i cagirmak icin kullanilir.
    ***parallel : parallel test case'ler olusturmak icin kullanilir.
 */
    //    DATA PROVIDER
    @DataProvider(name = "Kozak")
    public Object[][] urunler(){
        Object urunListesi[][] = {
                {"tesla"},
                {"bmw", "15000"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }
    //    TEST METOTU
    @Test(dataProvider = "Kozak")
    public void aramaTesti(String data){
        System.out.println(data);
    }
    //    GOOELE ARAMASI
    @Test(dataProvider = "Kozak")
    public void googleAramasi(String araclar, String fiyat){
//        google a git
        Driver.getDriver().get("https://www.google.com");
//        araclari arama kutusuna gir ve Enter a bas
        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar+ Keys.ENTER);
//        sayfa title inin aradigim kelimeyi icerdigini assert et
        ReusableMethods.waitFor(3);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
        ReusableMethods.waitFor(3);
//        driver i kapat
        Driver.closeDriver();
    }
}