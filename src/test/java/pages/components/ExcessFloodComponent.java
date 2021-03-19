package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ExcessFloodComponent {
    static WebDriver driver;

    public ExcessFloodComponent(WebDriver driver) {
        ExcessFloodComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}