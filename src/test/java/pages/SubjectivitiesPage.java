package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class SubjectivitiesPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public SubjectivitiesPage(WebDriver driver) {
        super(driver);
        SubjectivitiesPage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}