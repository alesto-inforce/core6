package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class RiskAddressesComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public RiskAddressesComponent(WebDriver driver){
        super(driver);
        RiskAddressesComponent.driver = driver;
        PageFactory.initElements(driver,this);
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
    @FindBy(xpath = "//label//div[text()='Windstorm Deductible']/../../../..//input")
    List<WebElement> windstormDeductible;
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

    public void riskAddressDetails(Map<String,String> data) {
        setResidenceType(data.get("ResidenceType"));
        if(data.get("ResidenceType").equalsIgnoreCase("Homeowner")){
            setReplacementCostValue(data.get("ReplacementCost"));
        } else {
            setContentsLimit(data.get("ContentLimit"));
            setLossOfUseLimit(data.get("LossOfUseLimit"));
        }
    }
    public void addAndFillInNthAddress(Map<String,String> data) {

        int addressIndexNumber = Integer.parseInt(data.get("AddressIndexNumber"));

        clickAddAddress();

        typeText(residenceType.get(addressIndexNumber),data.get("ResidenceType"));
        typeText(addressLine.get(addressIndexNumber),data.get("AddressLine"));
        typeText(city.get(addressIndexNumber),data.get("City"));
        typeText(state.get(addressIndexNumber),data.get("State"));
        typeText(zip.get(addressIndexNumber),data.get("ZIP"));

        if("Homeowner".equalsIgnoreCase(data.get("ResidenceType"))){
            typeText(replacementCost.get(addressIndexNumber),data.get("ReplacementCost"));
            typeKeys(replacementCost.get(addressIndexNumber),Keys.TAB);
        } else {
            typeText(contents.get(addressIndexNumber),data.get("ContentLimit"));
            typeText(lossOfUse.get(addressIndexNumber),data.get("LossOfUseLimit"));
        }
        typeText(windstormDeductible.get(addressIndexNumber),data.get("WindstormDeductible"));
    }
    public void clickAddAddress() {
        clickElement(addAddresses);
    }
    public void setResidenceType(String residenceTypeValue) {
        typeText(residenceType.get(0),residenceTypeValue);
    }
    public void setReplacementCostValue(String replacementCostValue){
        typeText(replacementCost.get(0),replacementCostValue);
    }
    public void setOtherStructuresLimit(String limit){
        typeText(otherStructures.get(0),limit);
    }
    public void setContentsLimit(String limit){
        typeText(contents.get(0),limit);
    }
    public void setLossOfUseLimit(String limit){
        typeText(lossOfUse.get(0),limit);
    }
    public void setWindstormDeductible(String deductible) {
        typeText(windstormDeductible.get(0),deductible);
    }
    public void setDeD(String value){
        typeText(deD,value);
    }
    public void deleteAddresses(){
        clickElement(deleteAddresses);
    }
    public void addAddresses(){
        clickElement(addAddresses);
    }
    public void addressLine2(String address2name){
        typeText(addressLine2,address2name);
    }



}
