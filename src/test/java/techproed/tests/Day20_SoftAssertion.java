package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {
    /*
     Soft Assert de fail gelse bile kodlar çalışmaya devam eder
     Sonunda assertAll() kullanılmalıdır
     */
    @Test
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Satır 10");
        softAssert.assertEquals(2,5);
        System.out.println("Satır 12");
        softAssert.assertTrue("Java".contains("u"));

        System.out.println("Satır 14");
        softAssert.assertTrue(true);

        System.out.println("Satır 18");
        softAssert.assertAll();


    }
}
