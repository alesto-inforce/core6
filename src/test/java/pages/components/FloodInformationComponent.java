package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class FloodInformationComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public FloodInformationComponent(WebDriver driver) {
        super(driver);
        FloodInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood policy')]/../../../../div//label[text()='Yes']/..//input")
    WebElement pureNFIPYes;
    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood policy')]/../../../../div//label[text()='No']/..//input")
    WebElement pureNFIPNo;
    @FindBy(xpath = "//div[contains(text(),'purchase an NFIP policy')]/../../../../div//label[text()='Yes']/..//input")
    WebElement purchaseNFIPYes;
    @FindBy(xpath = "//div[contains(text(),'purchase an NFIP policy')]/../../../../div//label[text()='No']/..//input")
    WebElement purchaseNFIPNo;

    public void setPureNFIP(String nfip) throws Throwable {
        choose(pureNFIPYes,pureNFIPNo,nfip);
    }
    public void setPurchaseNFIP(String nfip) throws Throwable {
        choose(purchaseNFIPYes,purchaseNFIPNo,nfip);
    }

    public void fillOutFloodInformationDetails(Map<String, String> data) throws Throwable {
        switch (data.get("State")){
        case "AK":{
            setPureNFIP(data.get("Flood_Pure_NFIP"));
        }break;
        case "AR":{
            setPureNFIP(data.get("Flood_Pure_NFIP"));
            setPurchaseNFIP(data.get("Purchase_NFIP"));
        }break;
        case "IA":
        case "IN":
        case "KS":
        case "KY":
        case "MN":
        case "MO":
        case "MT":
        case "ND":
        case "NE":
        case "NH":
        case "OH":
        case "OK":
        case "SD":
        case "WI":
        case "WY":
        case "MD":
        case "ME":
        case "MS":
        case "TX":
        case "GA":
        case "AZ":
        case "DC":
        case "IL":
        case "NM":
        case "NV":
        case "OR":
        case "PA":
        case "UT":
        case "VT":
        case "WV":
        case "MI":
        case "CO":
        case "RI":
        case "TN":
        case "WA":
        case "CA":
        case "AL":
        case "LA":
        case "MA":
        case "DE":
        case "HI":
        case "VA":
        case "NC":
        case "SC":
        case "FL":
        case "CT":
        case "NY":
        case "NJ": {}
        }
    }
}