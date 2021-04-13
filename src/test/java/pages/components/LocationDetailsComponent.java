package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationDetailsComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public LocationDetailsComponent(WebDriver driver) {
        super(driver);
        LocationDetailsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Risk Address 1']/../../../../div//input")
    WebElement riskAddress1;
    @FindBy(xpath = "//div[text()='Risk Address 2']/../../../../div//input")
    WebElement riskAddress2;
    @FindBy(xpath = "//div[text()='City']/../../../../div//input")
    WebElement city;
    @FindBy(xpath = "//div[text()='State']/../../../../div//input")
    WebElement state;
    @FindBy(xpath = "//div[text()='ZIP']/../../../../div//input")
    WebElement zip;

    public void riskAddress1(String value) throws Throwable {
        typeText(riskAddress1,value);
    }
    public void riskAddress2(String value) throws Throwable {
        typeText(riskAddress2,value);
    }
    public void city(String value) throws Throwable {
        typeText(city,value);
    }
    public void state(String value) throws Throwable {
        typeText(state,value);
    }
    public void zip(String value) throws Throwable {
        typeText(zip,value);
    }


}