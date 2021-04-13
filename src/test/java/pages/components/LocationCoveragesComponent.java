package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationCoveragesComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public LocationCoveragesComponent(WebDriver driver) {
        super(driver);
        LocationCoveragesComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }
}