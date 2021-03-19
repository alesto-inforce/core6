package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class QuoteMatchingCustomerPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public QuoteMatchingCustomerPage(WebDriver driver){
        super(driver);
        QuoteMatchingCustomerPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}