package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class AdditionalInterestsPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public AdditionalInterestsPage(WebDriver driver) {
        super(driver);
        AdditionalInterestsPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
