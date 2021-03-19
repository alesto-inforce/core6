package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.OptionalCoverageComponent;
import pages.components.OptionalCoveragesExclusionsComponent;

public class OptionalCoveragesPage extends CommonComponentsAndActions {
    static WebDriver driver;
    OptionalCoverageComponent optionalCoverageComponent;
    OptionalCoveragesExclusionsComponent optionalCoveragesExclusionsComponent;

    public OptionalCoveragesPage(WebDriver driver) {
        super(driver);
        OptionalCoveragesPage.driver = driver;
        optionalCoverageComponent = new OptionalCoverageComponent(driver);
        optionalCoveragesExclusionsComponent = new OptionalCoveragesExclusionsComponent(driver);
        PageFactory.initElements(driver,this);
    }
}