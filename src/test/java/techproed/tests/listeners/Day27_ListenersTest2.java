package techproed.tests.listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day27_ListenersTest2 {
    @Test
    public void test1() {
        System.out.println("Pass");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Fail");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
    }

    @Test
    public void test3() {
        System.out.println("Skip");
        throw new SkipException("Methodu Atla");
    }

    @Test
    public void test4(){
        System.out.println("EXCEPTION");
//        throw new NoSuchElementException("No Such Element Exception");
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.getDriver().findElement(By.xpath("asdgadfhadfgnh"));
    }
}
