package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OptionalCoveragesExclusionsComponent {
    static WebDriver driver;

    public OptionalCoveragesExclusionsComponent(WebDriver driver) {
        OptionalCoveragesExclusionsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}