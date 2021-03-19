package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ConstructionDetailsComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public ConstructionDetailsComponent(WebDriver driver) {
        super(driver);
        ConstructionDetailsComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//font[text()='Year Built']/../../../../../..//input")
    WebElement yearBuiltInput;
    @FindBy(xpath = "//div[text()='Protection Class']/../../../..//input")
    List<WebElement> protectionClass;
    @FindBy(xpath = "//div[text()='BCEG']/../../../..//input")
    List<WebElement> bcegSelect;
    @FindBy(xpath = "//font[text()='Square Footage (Under Air)']/../../../../../..//input")
    WebElement squareFootageUnderAir;
    @FindBy(xpath = "//font[text()='Number of Floors at the Risk Location']/../../../../../..//input")
    WebElement numberOfFloorsAtRiskLocation;
    @FindBy(xpath = "//font[text()='Construction Type']/../../../../../..//input")
    WebElement constructionTypeSelect;
    @FindBy(xpath = "//div[text()='Manager BCEG override']/../../../../div/..//input")
    WebElement managerBCEGOverrideYes;
    @FindBy(xpath = "//div[text()='Barrier Island Indicator']/../../../../div/..//input")
    WebElement barrierIslandIndicator;
    @FindBy(xpath = "//div[text()='Barrier Island Indicator override']/../../../../div/..//input")
    WebElement barrierIslandIndicatorOverride;
    @FindBy(xpath = "//div[text()='Manager BCEG override']/../../../../div/..//input")
    WebElement managerDTCOverride;
    @FindBy(xpath = "//div[text()='BCEG Override']/../../../..//input")
    WebElement bcegOverride;
    @FindBy(xpath = "//div[text()='Manager PPC override']/../../../..//input")
    WebElement managerPPCOverride;
    @FindBy(xpath = "//div[text()='Protection Class Override']/../../../..//input")
    WebElement protectionClassOverride;


    // TODO CORE UPGRADE REFACTOR
    @FindBy(xpath = "//input[contains(@title,'The floor on which the risk is located')]")
    WebElement floorLocatedRisk;
    // TODO CORE UPGRADE REFACTOR

    public void fillBasicConstructionDetails(Map<String, String> data) throws InterruptedException {
        setYearBuilt(data.get("YearBuilt"));
        Thread.sleep(3000);
        setProtectionClass(data.get("ProtectionClass"));
        Thread.sleep(3000);
        setBceg(data.get("BCEG"));
        Thread.sleep(3000);
        setSquareFootageUnderAir(data.get("SquareFootage"));
        setNumberOfFloorsAtRiskLocation(data.get("NumberOfFloors"));
        setConstructionType(data.get("ConstructionType"));
        clickElement(CommonComponentsAndActions.saveChanges);
        Thread.sleep(10000);
    }

    public void fillAdditionalConstructionDetails(Map<String, String> data) {
        setYearBuilt(data.get("YearBuilt"));
        setBceg(data.get("BCEG"));
        setSquareFootageUnderAir(data.get("SquareFootage"));
        setNumberOfFloorsAtRiskLocation(data.get("NumberOfFloors"));
        setConstructionType(data.get("ConstructionType"));
    }

    private void setFloorLocatedRisk(String floor) {
        typeText(floorLocatedRisk, floor);
    }

    public void setYearBuilt(String yearBuilt) {
        typeText(yearBuiltInput, yearBuilt);
        typeKeys(yearBuiltInput, Keys.TAB);
    }

    public void setProtectionClass(String protectionClassValue) {
        typeText(protectionClass.get(0), protectionClassValue);
    }

    public void setBceg(String bcegValue) {
        typeText(bcegSelect.get(2), bcegValue);
    }

    public void setSquareFootageUnderAir(String squareFootageUnderAirValue) {
        typeText(squareFootageUnderAir, squareFootageUnderAirValue);
    }

    public void setNumberOfFloorsAtRiskLocation(String numberOfFloorsAtRiskLocationValue) {
        typeText(numberOfFloorsAtRiskLocation, numberOfFloorsAtRiskLocationValue);
    }

    public void setConstructionType(String constructionTypeValue) {
        typeText(constructionTypeSelect, constructionTypeValue);
    }

    public void managerBCEGOverrideYes() {
        clickElement(managerBCEGOverrideYes);
    }

    public void barrierIslandIndicator() {
        clickElement(barrierIslandIndicator);
    }

    public void barrierIslandIndicatorOverride() {
        clickElement(barrierIslandIndicatorOverride);
    }

    public void managerDTCOverride() {
        clickElement(managerDTCOverride);
    }

    public void bcegOverride(String value) {
        typeText(bcegOverride, value);
    }

    public void managerPPCOverride() {
        clickElement(managerPPCOverride);
    }

    public void protectionClassOverride(String value) {
        typeText(protectionClassOverride, value);
    }
}
