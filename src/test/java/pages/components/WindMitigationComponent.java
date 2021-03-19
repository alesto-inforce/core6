package pages.components;

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
    @FindBy(xpath = "//div[text()='Secondary Water Resistance']/../../../..//input")
    WebElement secondaryWaterResistanceSelect;
    @FindBy(xpath = "//div[text()='Opening Protection']/../../../..//input")
    WebElement openingProtectionSelect;
    @FindBy(xpath = "//div[text()='Roof Deck']/../../../..//input")
    WebElement roofDeckSelect;

    public void fillBasicWindMitigationDetails(Map<String,String> data) throws InterruptedException {
        setRoofShape(data.get("RoofShape"));
        setSecondaryWaterResistance(data.get("SecondaryWaterResistance"));
        setOpeningProtection(data.get("OpeningProtection"));
        setRoofDeck(data.get("RoofDeck"));
        clickElement(CommonComponentsAndActions.saveChanges);
        Thread.sleep(10000);
    }
    public void setRoofShape(String roofShapeValue) {
        typeText(roofShapeSelect,roofShapeValue);
    }
    public void setSecondaryWaterResistance(String secondaryWaterResistanceValue) {
        typeText(secondaryWaterResistanceSelect,secondaryWaterResistanceValue);
    }
    public void setOpeningProtection(String openingProtectionValue) {
        typeText(openingProtectionSelect,openingProtectionValue);
    }
    public void setRoofDeck(String roofDeckValue) {
        typeText(roofDeckSelect,roofDeckValue);
    }

}