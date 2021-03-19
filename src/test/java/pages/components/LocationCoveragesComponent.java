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

    public void riskAddress1(String value){
        typeText(riskAddress1,value);
    }
    public void riskAddress2(String value){
        typeText(riskAddress2,value);
    }
    public void city(String value){
        typeText(city,value);
    }
    public void state(String value){
        typeText(state,value);
    }
    public void zip(String value){
        typeText(zip,value);
}

}