package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class ManuscriptEndorsementsPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public ManuscriptEndorsementsPage(WebDriver driver) {
        super(driver);
        ManuscriptEndorsementsPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
