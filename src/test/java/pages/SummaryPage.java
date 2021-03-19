package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class SummaryPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public SummaryPage(WebDriver driver) {
        super(driver);
        SummaryPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}