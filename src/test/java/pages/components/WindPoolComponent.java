package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WindPoolComponent {
    static WebDriver driver;

    public WindPoolComponent(WebDriver driver) {
        WindPoolComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

}