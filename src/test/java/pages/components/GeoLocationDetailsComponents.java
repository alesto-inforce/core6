package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeoLocationDetailsComponents extends CommonComponentsAndActions {
    static WebDriver driver;

    public GeoLocationDetailsComponents(WebDriver driver) {
        super(driver);
        GeoLocationDetailsComponents.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Standardized Address']/../../../../div//input")
    WebElement standardizedAddress;

    @FindBy(xpath = "//div[text()='Geocoded location']/../../../../div//input")
    WebElement geocodedLocation;

    @FindBy(xpath = "//div[text()='Use User Entered Address for Geocoding']/../../../../div//input")
    WebElement useUserEnteredAddressForGeocoding;

    public void standardizedAddress(String value){
        typeText(standardizedAddress,value);
    }
    public void geocodedLocation(String value){
        typeText(geocodedLocation,value);
    }
    public void useUserEnteredAddressForGeocoding(){
        clickElement(useUserEnteredAddressForGeocoding);
    }
}