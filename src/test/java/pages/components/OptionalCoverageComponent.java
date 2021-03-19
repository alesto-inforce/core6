package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OptionalCoverageComponent {
    static WebDriver driver;

    public OptionalCoverageComponent(WebDriver driver) {
        OptionalCoverageComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}