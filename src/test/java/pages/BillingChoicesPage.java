package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class BillingChoicesPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public BillingChoicesPage(WebDriver driver){
        super(driver);
        BillingChoicesPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

}