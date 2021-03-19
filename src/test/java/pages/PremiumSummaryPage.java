package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class PremiumSummaryPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public PremiumSummaryPage(WebDriver driver){
        super(driver);
        PremiumSummaryPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}