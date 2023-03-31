package techproed.tests.dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    @Test(dataProvider = "musteriVerileri",dataProviderClass = DataProviderUtils.class) //dataProvider methodunun nerede oldugunu gösterdik
    public void musteriVerileriTest(String username, String password) {
        System.out.println("Username: "+ username+". Password: "+password);
    }
    //    musteriHizmetleriVerileri
    @Test(dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username,String password){
        System.out.println(username+"  |  "+password);

    }
    //    personelVerileri
    @Test(dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username,String password){
        System.out.println(username+"  |  "+password);
    }
    //CustomerData

    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String username,String password) {
        System.out.println("Excel Datalarım");
        System.out.println(username+"  |||  "+password);
    }
}
