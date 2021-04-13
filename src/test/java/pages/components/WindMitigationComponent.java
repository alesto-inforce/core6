package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class WindMitigationComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public WindMitigationComponent(WebDriver driver) {
        super(driver);
        WindMitigationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Roof Shape']/../../../..//input")
    WebElement roofShapeSelect;
    @FindBy(xpath = "//div[text()='Roof Covering']/../../../..//input")
    WebElement roofCovering;
    @FindBy(xpath = "//div[text()='Secondary Water Resistance']/../../../..//input")
    WebElement secondaryWaterResistanceSelect;
    @FindBy(xpath = "//div[text()='Opening Protection']/../../../..//input")
    WebElement openingProtectionSelect;
    @FindBy(xpath = "//div[text()='Roof Deck']/../../../..//input")
    WebElement roofDeckSelect;

    public void fillBasicWindMitigationDetails(Map<String,String> data) throws Throwable {
        switch (data.get("State")){
            case "AK":{
                setRoofShape(data.get("Roof_Shape"));
                setRoofCovering(data.get("Roof_Covering"));
                setOpeningProtection(data.get("Opening_Protection"));
                clickElement(CommonComponentsAndActions.saveChanges);
                Thread.sleep(10000);
            }break;
            case "AR":
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
            case "NJ":
        }
    }
    public void setRoofShape(String roofShapeValue) throws Throwable {
        typeText(roofShapeSelect,roofShapeValue);
    }
    public void setRoofCovering(String covering) throws Throwable {
        typeText(roofCovering,covering);
    }
    public void setSecondaryWaterResistance(String secondaryWaterResistanceValue) throws Throwable {
        typeText(secondaryWaterResistanceSelect,secondaryWaterResistanceValue);
    }
    public void setOpeningProtection(String openingProtectionValue) throws Throwable {
        //typeText(openingProtectionSelect,openingProtectionValue);
        openingProtectionSelect.click();
        driver.findElement(By.xpath("//li[text()='"+openingProtectionValue+"']")).click();
    }
    public void setRoofDeck(String roofDeckValue) throws Throwable {
        typeText(roofDeckSelect,roofDeckValue);
    }

}