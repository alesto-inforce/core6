package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class HomePage extends CommonComponentsAndActions {
    static WebDriver driver;

    public HomePage(WebDriver driver){
        super(driver);
        HomePage.driver = driver;
        PageFactory.initElements(driver,this);
    }

}