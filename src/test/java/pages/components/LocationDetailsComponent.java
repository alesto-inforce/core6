package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LocationDetailsComponent {
    static WebDriver driver;

    public LocationDetailsComponent(WebDriver driver) {
        LocationDetailsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}