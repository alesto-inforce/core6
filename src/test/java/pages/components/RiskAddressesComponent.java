package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class RiskAddressesComponent extends CommonComponentsAndActions {

    static WebDriver driver;

    public RiskAddressesComponent(WebDriver driver) {
        super(driver);
        RiskAddressesComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[text()='Residence Type']/../../../..//input")
    List<WebElement> residenceType;
    @FindBy(xpath = "//label//div[text()='Replacement Cost']/../../../..//input")
    List<WebElement> replacementCost;
    @FindBy(xpath = "//label//div[text()='Other Structures']/../../../..//input")
    List<WebElement> otherStructures;
    @FindBy(xpath = "//label//div[text()='Contents']/../../../..//input")
    List<WebElement> contents;
    @FindBy(xpath = "//label//div[text()='Loss of Use']/../../../..//input")
    List<WebElement> lossOfUse;
    @FindBy(xpath = "//div[text()='Ded']/../../../..//input")
    WebElement deD;
    @FindBy(xpath = "//div[contains(text(),'Windstorm or Hail Ded')]/../../../..//input")
    WebElement windOrHailDed;
    @FindBy(xpath = "//div[text()='AOP Ded']/../../../..//input")
    WebElement aopDedElement;
    @FindBy(xpath = "//div[text()='Hurr Ded']/../../../..//input")
    WebElement hurrDedElement;
    @FindBy(xpath = "//div[text()='Tornado or Hailstorm Ded']/../../../..//input")
    WebElement tornadoOrHailDed;
    @FindBy(xpath = "//label//div[text()='Windstorm Deductible']/../../../..//input")
    List<WebElement> windstormDeductible;
    @FindBy(xpath = "//div[text()='Hailstorm Ded']/../../../..//input")
    WebElement hailstormDed;
    @FindBy(xpath = "//div[text()='Calendar Year Hurricane Ded']/../../../..//input")
    WebElement calendarYearHurrDed;
    @FindBy(xpath = "//div[text()='Number of family units']/../../../..//input")
    WebElement numberOfFamilyUnits;
    @FindBy(xpath = "//div[text()='Deductible']/../../../..//input")
    WebElement deductible;
    @FindBy(xpath = "//div[text()='Special Wind Deductible']/../../../..//input")
    WebElement specialWindDed;
    @FindBy(xpath = "//div[contains(text(),'Hurricane and Named Storm')]/../../../..//input")
    WebElement hurricaneAndNamedStorm;
    @FindBy(xpath = "//div[contains(text(),'Hurricane or Named Storm')]/../../../..//input")
    WebElement hurricaneOrNamedStorm;
    @FindBy(xpath = "//div[contains(text(),'Hurricane Ded')]/../../../..//input")
    WebElement hurricaneDed;
    @FindBy(xpath = "//div[text()='Named Storm Deductible']/../../../..//input")
    WebElement namedStormDed;
    @FindBy(xpath = "//div[text()='Policy Type']/../../../..//input")
    WebElement policyType;
    @FindBy(xpath = "//div[text()='risk addresses']/../../../../../../div[2]//span[text()='add']")
    WebElement addAddresses;
    @FindBy(xpath = "//div[text()='risk addresses']/../../../../../../div[2]//span[text()='delete']")
    WebElement deleteAddresses;
    @FindBy(xpath = "//label//div[text()='Address Line 1']/../../../..//input")
    List<WebElement> addressLine;
    @FindBy(xpath = "//label//div[text()='Address Line 2']/../../../..//input")
    WebElement addressLine2;
    @FindBy(xpath = "//label//div[text()='City']/../../../..//input")
    List<WebElement> city;
    @FindBy(xpath = "//label//div[text()='State']/../../../..//input")
    List<WebElement> state;
    @FindBy(xpath = "//label//div[text()='ZIP']/../../../..//input")
    List<WebElement> zip;

    public void riskAddressDetails(Map<String, String> data) throws Throwable {
        switch (data.get("Residence_Type")) {
            case "Homeowner": {
                switch (data.get("State")) {
                    case "AK":
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
                    case "GA":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                    }break;
                    case "AZ":
                    case "NV":{
                        setPolicyType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "CO":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setHailstormDed(data.get("Hailstorm_Ded"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        //AOP Ded Override
                        //Hail Ded Override
                    }break;
                    case "RI":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "TN":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded"));
                    }break;
                    case "WA":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units"));
                    }break;
                    case "CA":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setDeductible(data.get("Deductible"));
                    }break;
                    case "AL":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setSpecialWindDeductible(data.get("Special_Wind_Ded"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "LA":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        pause(2000);
                        setHurricaneOrNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"));
                    }break;
                    case "MA":
                    case "DE":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                    }break;
                    case "HI":
                    case "VA":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setHurricaneDed(data.get("Hurricane_Deductible"));
                    }break;
                    case "NC":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setAOPDed(data.get("AOP_Ded"));
                        //setNamedStormDed(data.get("Named_Storm_Ded")); TODO
                    }break;
                    case "SC":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"));
                        typeText(lossOfUse.get(0),data.get("Loss_Of_Use"));
                        setDed(data.get("Deductible"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                    }break;
                    case "FL":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setDed(data.get("Deductible"));
                        setWindstormDeductible(data.get("Windstorm_Deductible"));
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                        typeText(lossOfUse.get(0),data.get("Loss_Of_Use"));
                    }break;
                    case "CT":
                    case "NY":
                    case "NJ":{
                        setResidenceType(data.get("Residence_Type"));
                        setReplacementCostValue(data.get("Replacement_Cost"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        pause(2000);
                        setAOPDed(data.get("AOP_Ded"));
                        pause(2000);
                        //setHurrDed(data.get("Hurr_Ded"));
                        pause(2000);
                        setOtherStructuresLimit(data.get("Other_Structures"));
                        setContentsLimit(data.get("Contents"));
                    }break;
                }
            }
            break;

            case "Condo/Co-op":
            case "Tenants": {
                switch (data.get("State")) {
                    case "AK":
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
                    case "GA":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setWindOrHailDed(data.get("Wind_Or_Hail_Ded"));
                    }break;
                    case "AZ":{
                        setPolicyType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "CO":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setHailstormDed(data.get("Hailstorm_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "RI":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setCalendarYearHurricaneDed(data.get("Calendar_Year_Hurricane_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "TN":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setTornadoOrHailDed(data.get("Tornado_Or_Hailstorm_Ded"));
                    }break;
                    case "WA":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setNumberOfFamilyUnits(data.get("Number_Of_Family_Units"));
                    }break;
                    case "CA":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setDeductible(data.get("Deductible"));
                    }break;
                    case "AL":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setSpecialWindDeductible(data.get("Special_Wind_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "LA":
                    case "MA":
                    case "DE":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                    case "HI":
                    case "VA":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                        setHurricaneDed(data.get("Hurricane_Deductible"));
                    }break;
                    case "NC":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setAOPDed(data.get("AOP_Ded"));
                        setNamedStormDed(data.get("Named_Storm_Ded"));
                    }break;
                    case "SC":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setHurricaneAndNamedStormDed(data.get("Hurricane_And_Named_Storm_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setDed(data.get("Deductible"));
                    }break;
                    case "FL":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setDed(data.get("Deductible"));
                        setWindstormDeductible(data.get("Windstorm_Deductible"));
                    }break;
                    case "CT":
                    case "NY":
                    case "NJ":{
                        setResidenceType(data.get("Residence_Type"));
                        setContentsLimit(data.get("Contents"));
                        setHurrDed(data.get("Hurr_Ded"));
                        setLossOfUseLimit(data.get("Loss_Of_Use"));
                        setAOPDed(data.get("AOP_Ded"));
                    }break;
                }
            }
            break;
        }
    }

    public void addAndFillInNthAddress(Map<String, String> data) throws Throwable {

        int addressIndexNumber = Integer.parseInt(data.get("AddressIndexNumber"));

        clickAddAddress();

        typeText(residenceType.get(addressIndexNumber), data.get("ResidenceType"));
        typeText(addressLine.get(addressIndexNumber), data.get("AddressLine"));
        typeText(city.get(addressIndexNumber), data.get("City"));
        typeText(state.get(addressIndexNumber), data.get("State"));
        typeText(zip.get(addressIndexNumber), data.get("ZIP"));

        if ("Homeowner".equalsIgnoreCase(data.get("ResidenceType"))) {
            typeText(replacementCost.get(addressIndexNumber), data.get("ReplacementCost"));
        } else {
            typeText(contents.get(addressIndexNumber), data.get("ContentLimit"));
            typeText(lossOfUse.get(addressIndexNumber), data.get("LossOfUseLimit"));
        }
        typeText(windstormDeductible.get(addressIndexNumber), data.get("WindstormDeductible"));
    }

    public void clickAddAddress() throws Throwable {
        clickElement(addAddresses);
    }

    public void setResidenceType(String residenceTypeValue) throws Throwable {
        typeText(residenceType.get(0), residenceTypeValue);
    }

    public void setReplacementCostValue(String replacementCostValue) throws Throwable {
        typeText(replacementCost.get(0), formatNum(replacementCostValue));
    }

    public void setOtherStructuresLimit(String limit) throws Throwable {
        typeText(otherStructures.get(0), formatNum(limit));
    }

    public void setContentsLimit(String limit) throws Throwable {
        typeText(contents.get(0), formatNum(limit));
    }

    public void setLossOfUseLimit(String limit) throws Throwable {
        //typeText(lossOfUse.get(0), limit);
        lossOfUse.get(0).click();
        driver.findElement(By.xpath("//li[text()='"+limit+"']")).click();
    }

    public void setWindstormDeductible(String deductible) throws Throwable {
        typeText(windstormDeductible.get(0), deductible);
    }

    public void setDed(String value) throws Throwable {
        typeText(deD, formatNum(value));
    }

    public void deleteAddresses() throws Throwable {
        clickElement(deleteAddresses);
    }

    public void addAddresses() throws Throwable {
        clickElement(addAddresses);
    }

    public void addressLine2(String address2name) throws Throwable {
        typeText(addressLine2, address2name);
    }

    public void setAOPDed(String aopDed) throws Throwable {
        aopDedElement.click();
        clickElement(driver.findElement(By.xpath("//li[text()='"+formatNum(aopDed)+"']")));
    }

    public void setHurrDed(String hurrDed) throws Throwable {
        //typeText(hurrDedElement, hurrDed);
        clickElement(hurrDedElement);
        clickElement(driver.findElement(By.xpath("//li[text()='"+hurrDed+"']")));
    }

    public void setWindOrHailDed(String windOrHailDedValue) throws Throwable {
        //typeText(windOrHailDed, windOrHailDedValue);
        windOrHailDed.click();
        driver.findElement(By.xpath("//li[text()='"+windOrHailDedValue+"']")).click();
    }

    public void setHailstormDed(String hailstorm) throws Throwable {
        //typeText(hailstormDed, formatNum(hailstorm));
        clickElement(hailstormDed);
        clickElement(driver.findElement(By.xpath("//li[text()='"+formatNum(hailstorm)+"']")));
    }

    public void setCalendarYearHurricaneDed(String calendarYearDed) throws Throwable {
        //typeText(calendarYearHurrDed, calendarYearDed);
        clickElement(calendarYearHurrDed);
        clickElement(driver.findElement(By.xpath("//li[text()='"+calendarYearDed+"']")));
    }

    public void setTornadoOrHailDed(String tornadoDed) throws Throwable {
        typeText(tornadoOrHailDed, tornadoDed);
    }

    public void setNumberOfFamilyUnits(String num) throws Throwable {
        typeText(numberOfFamilyUnits, num);
    }

    public void setDeductible(String ded) throws Throwable {
        typeText(deductible, formatNum(ded));
    }

    public void setSpecialWindDeductible(String ded) throws Throwable {
        //typeText(specialWindDed, ded);
        clickElement(specialWindDed);
        clickElement(driver.findElement(By.xpath("//li[text()='"+ded+"']")));
    }

    public void setHurricaneAndNamedStormDed(String ded) throws Throwable {
        //typeText(hurricaneAndNamedStorm, ded);
        clickElement(hurricaneAndNamedStorm);
        clickElement(driver.findElement(By.xpath("//li[text()='"+ded+"']")));
    }
    public void setHurricaneOrNamedStormDed(String ded) throws Throwable {
        hurricaneOrNamedStorm.click();
        clickElement(driver.findElement(By.xpath("//li[text()='"+ded+"']")));
    }

    public void setHurricaneDed(String ded) throws Throwable {
        typeText(hurricaneDed, ded);
    }

    public void setNamedStormDed(String ded) throws Throwable {
        typeText(namedStormDed, ded);
    }

    public void setPolicyType(String type) throws Throwable {
        typeText(policyType, type);
    }
}