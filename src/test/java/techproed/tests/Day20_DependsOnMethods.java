package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_DependsOnMethods {
    /*
 TestNG'de tum test method'lari birbirlerinden bagimsiz olarak calisirlar
 Eger method'lari bagimli hale getirmek istersek dependsOnMethods parametresi kullanilir
 Buradaki ornekte, searchTest method'u homeTest method'una bagimlidir
 searchTest'den once homeTest calisir
 Eger homeTest basarili ise searchTest method'u o zaman calisir
 Eger homeTest basarisiz ise searchTest method'u ignore edilir
  */
    @Test
    public void homeTest() {
        System.out.println("HomeTest");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest() {
        System.out.println("SearchTest");
        Assert.assertFalse(true,"Hüseyin");
    }

    @Test(dependsOnMethods = "homeTest")
    public void paymentTest() {
        System.out.println("PaymentTest");
    }
}
