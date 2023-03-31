package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    //1 Constructor
    public OpenSourcePage(){
        //Sayfa objeleri çağrıldığında null Pointer exception alınmaz
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name= "username")
    public WebElement username;                                                    //Driver.findElement.(Byxpath....)

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;
}
