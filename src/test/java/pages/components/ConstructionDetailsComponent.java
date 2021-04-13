package pages.components;

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
    @FindBy(xpath = "//div[text()='Year Renovated']/../../../../../..//input")
    WebElement yearRenovated;
    @FindBy(xpath = "//div[text()='Square Footage (Heated)']/../../../..//input")
    WebElement squareFootageHeated ;
    @FindBy(xpath = "//div[text()='Protection Class']/../../../..//input[contains(@aria-hidden,'false')]")
    WebElement protectionClass;
    @FindBy(xpath = "//div[text()='BCEG']/../../../..//input")
    List<WebElement> bcegSelect;
    @FindBy(xpath = "//div[contains(text(),'Square Footage')]/../../../../div//input")
    WebElement squareFootage;
    @FindBy(xpath = "//font[contains(text(),'Square Footage')]/../../../../../..//input")
    WebElement squareFootageFont;
    @FindBy(xpath = "//font[text()='Number of Floors at the Risk Location']/../../../../../..//input")
    WebElement numberOfFloorsAtRiskLocation;
    @FindBy(xpath = "//div[contains(text(),'The floor on which')]/../../../../div//input")
    WebElement riskLocatedFloor;
    @FindBy(xpath = "//*[text()='Construction Type']/../../../..//input")
    WebElement constructionTypeSelect;
    @FindBy(xpath = "//font[contains(text(),'Construction Type')]/../../../../../..//input")
    WebElement constructionTypeFont;
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
    @FindBy(xpath = "//div[text()='Certified Inspection']/../../../..//div//label[text()='Yes']/..//input")
    WebElement certifiedInspectionYes;
    @FindBy(xpath = "//div[text()='Certified Inspection']/../../../..//div//label[text()='No']/..//input")
    WebElement certifiedInspectionNo;
    @FindBy(xpath = "//div[text()='Date']/../../../..//input")
    WebElement certifiedInspectionDate;
    @FindBy(xpath = "//*[text()='Exterior Wall Coverings']/../../../..//input")
    WebElement exteriorWallCoverings;


    public void fillBasicConstructionDetails(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")){
            case "Homeowner":{
                switch(data.get("State")){
                    case "AK":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        setCertifiedInspection(data.get("Certified_Inspection"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AR":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AZ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootageFont(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "CO":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
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
                    case "NJ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setBceg(data.get("BCEG"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                        //todo not an actual case for NJ
                    }break;
                }
            }break;
            case "Condo/Co-op":{
                switch(data.get("State")){
                    case "AK":
                    case "AR": {
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor"));
                        setConstructionType(data.get("Construction_Type"));
                        setCertifiedInspection(data.get("Certified_Inspection"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AZ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootageFont(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "CO":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
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
                    case "NJ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setBceg(data.get("BCEG"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                        //todo not an actual case for NJ
                    }break;
                }
            }break;
            case "Tenants":{
                switch(data.get("State")){
                    case "AK":
                    case "AR": {
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setTheFloorOnWhichRiskIsLocated(data.get("Risk_Located_Floor"));
                        setConstructionType(data.get("Construction_Type"));
                        setCertifiedInspection(data.get("Certified_Inspection"));
                        setCertifiedInspectionDate(data.get("Certified_Inspection_Date"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AZ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootageFont(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        setExteriorWallCoverings(data.get("Exterior_Wall_Covering"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "CO":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionTypeFont(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
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
                    case "NJ":{
                        setYearBuilt(data.get("Year_Built"));
                        Thread.sleep(3000);
                        setProtectionClass(data.get("Protection_Class"));
                        Thread.sleep(3000);
                        setBceg(data.get("BCEG"));
                        Thread.sleep(3000);
                        setSquareFootage(data.get("Square_Footage"));
                        setNumberOfFloorsAtRiskLocation(data.get("Number_Of_Floors"));
                        setConstructionType(data.get("Construction_Type"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                        //todo not an actual case for NJ
                    }break;
                }
            }break;
        }
    }
    public void setYearBuilt(String yearBuilt) throws Throwable {
        typeText(yearBuiltInput, yearBuilt);
    }
    public void setProtectionClass(String protectionClassValue) throws Throwable {
        typeText(protectionClass, protectionClassValue);
    }
    public void setBceg(String bcegValue) throws Throwable {
        typeText(bcegSelect.get(2), bcegValue);
    }
    public void setSquareFootage(String squareFootage) throws Throwable {
        typeText(this.squareFootage, squareFootage);
    }
    public void setSquareFootageFont(String squareFootage) throws Throwable {
        typeText(this.squareFootageFont, squareFootage);
    }
    public void setNumberOfFloorsAtRiskLocation(String numberOfFloorsAtRiskLocationValue) throws Throwable {
        typeText(numberOfFloorsAtRiskLocation, numberOfFloorsAtRiskLocationValue);
    }
    public void setTheFloorOnWhichRiskIsLocated(String num) throws Throwable {
        typeText(riskLocatedFloor, num);
    }
    public void setConstructionType(String constructionTypeValue) throws Throwable {
        typeText(constructionTypeSelect, constructionTypeValue);
    }
    public void setConstructionTypeFont(String constructionTypeValue) throws Throwable {
        typeText(constructionTypeFont, constructionTypeValue);
    }
    public void managerBCEGOverrideYes() throws Throwable {
        clickElement(managerBCEGOverrideYes);
    }
    public void barrierIslandIndicator() throws Throwable {
        clickElement(barrierIslandIndicator);
    }
    public void barrierIslandIndicatorOverride() throws Throwable {
        clickElement(barrierIslandIndicatorOverride);
    }
    public void managerDTCOverride() throws Throwable {
        clickElement(managerDTCOverride);
    }
    public void bcegOverride(String value) throws Throwable {
        typeText(bcegOverride, value);
    }
    public void managerPPCOverride() throws Throwable {
        clickElement(managerPPCOverride);
    }
    public void protectionClassOverride(String value) throws Throwable {
        typeText(protectionClassOverride, value);
    }
    public void setYearRenovated(String yearRenovatedText) throws Throwable {
        typeText(yearRenovated, yearRenovatedText);
}
    public void setSquareFootageHeated(String squareFootageHeatedText) throws Throwable {
        typeText(squareFootageHeated, squareFootageHeatedText);
    }
    public void setCertifiedInspection(String choose) throws Throwable {
        choose(certifiedInspectionYes,certifiedInspectionNo, choose);
}
    public void setCertifiedInspectionDate(String value) throws Throwable {
        typeText(certifiedInspectionDate, value);
}
    public void setExteriorWallCoverings(String wallCoverings) throws Throwable {
        typeText(exteriorWallCoverings, wallCoverings);
    }
}


