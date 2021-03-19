package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StormSurgeComponent {
    static WebDriver driver;

    public StormSurgeComponent(WebDriver driver) {
        StormSurgeComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}