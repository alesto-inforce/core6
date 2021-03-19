package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreditScoreTiersComponent{

    static WebDriver driver;

    public CreditScoreTiersComponent(WebDriver driver){
        CreditScoreTiersComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}