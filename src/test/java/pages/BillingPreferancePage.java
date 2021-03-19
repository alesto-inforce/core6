package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class BillingPreferancePage extends CommonComponentsAndActions {
    static WebDriver driver;

    public BillingPreferancePage(WebDriver driver){
        super(driver);
        BillingPreferancePage.driver = driver;
        PageFactory.initElements(driver,this);
    }

}