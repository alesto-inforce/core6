package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class QuoteBasicInformationPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public QuoteBasicInformationPage(WebDriver driver) {
        super(driver);
        QuoteBasicInformationPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label//div[text()='Effective Date']/../../../..//input")
    WebElement effectiveDate;
    @FindBy(xpath = "//label//div[text()='DOB']/../../../..//input")
    WebElement dateOfBirth;
    @FindBy(xpath = "//label//div[text()='First Name']/../../../..//input")
    List<WebElement> firstName;
    @FindBy(xpath = "//label//div[text()='Last Name']/../../../..//input")
    List<WebElement> lastName;
    @FindBy(xpath = "//div[text()='Risk State']/../../../..//input")
    WebElement riskState;
    @FindBy(xpath = "//label//div[text()='Member Occupation']/../../../..//input")
    WebElement memberOccupation;
    @FindBy(xpath = "//label//div[text()='Member Employer']/../../../..//input")
    WebElement memberEmployer;
    @FindBy(xpath = "//label//div[text()='Primary Risk Address Line 1']/../../../..//input")
    WebElement primaryAddressLine1;
    @FindBy(xpath = "//label//div[text()='City']/../../../..//input")
    List<WebElement> city;
    @FindBy(xpath = "//label//div[text()='ZIP']/../../../..//input")
    List<WebElement> zipCode;
    @FindBy(xpath = "//div[contains(text(),'more than six months?')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement sixMonthsYes;
    @FindBy(xpath = "//div[contains(text(),'more than six months?')]/../../../../div//label[text()='No']/../span/input")
    WebElement sixMonthsNo;
    @FindBy(xpath = "//div[contains(text(),'member of your household')]/../../../../div//label[text()='No']/../span/input")
    WebElement memberOfHouseholdNo;
    @FindBy(xpath = "//div[contains(text(),'member of your household')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement memberOfHouseholdYes;
    @FindBy(xpath = "//div[contains(text(),'No disclosure')]/../../../../div//label[text()='No']/../span/input")
    WebElement disclosureRequiredNo;
    @FindBy(xpath = "//div[contains(text(),'No disclosure')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement disclosureRequiredYes;
    @FindBy(xpath = "//div[contains(text(),'Have you disclosed')]/../../../../div//label[text()='No disclosure has been made.']/../span/input")
    WebElement disclosureMadeToClientNo;
    @FindBy(xpath = "//div[contains(text(),'Have you disclosed')]/../../../../div//label[text()='Yes, a disclosure has been made.']/../span/input")
    WebElement disclosureMadeToClientYes;
    @FindBy(xpath = "//div[text()='Admitted or Surplus Lines:']/../../../..//input")
    WebElement admittedOrSurplus;
    @FindBy(xpath = "//div[contains(text(),'Ex-wind')]/../../../../div//label[text()='Yes']/../span/input")
    WebElement exWindYes;
    @FindBy(xpath = "//div[contains(text(),'Ex-wind')]/../../../../div//label[text()='No']/../span/input")
    WebElement exWindNo;
    @FindBy(xpath = "//div[text()='Licensed Producer']/../../../..//input")
    WebElement licensedProducer;
    @FindBy(xpath = "//div[text()='Advisor / Servicer']/../../../..//input")
    WebElement advisorServicer;
    @FindBy(xpath = "//div[text()='State']/../../../..//input")
    List<WebElement> state;
    @FindBy(xpath = "//div[contains(text(),'Spouse/Partner')]/../../../..//input")
    WebElement spousePartner;

    // Quote Basic Information
    public void initiateQuote(Map<String,String> data) throws InterruptedException {
        switch (data.get("ENV")){
            case "QA": {
                data.put("LicensedProducer",data.get("LicensedProducerQA"));
                data.put("AdvisorServicer",data.get("AdvisorServicerQA"));
            } break;
            case "STG":{
                data.put("LicensedProducer",data.get("LicensedProducerSTG"));
                data.put("AdvisorServicer",data.get("AdvisorServicerSTG"));
            } break;
            case "PROD":{
                data.put("LicensedProducer",data.get("LicensedProducerPROD"));
                data.put("AdvisorServicer",data.get("AdvisorServicerPROD"));
            } break;
        }
        setEffectiveDate(data.get("EffectiveDate"));
        Thread.sleep(2000);
        setRiskState(data.get("RiskState"));
        Thread.sleep(2000);
        setDateOfBirth(data.get("DateOfBirth"));
        Thread.sleep(2000);
        livedAtAddressMoreThanSixMonths(data.get("MoreThanSixMonths"));
        entertainerAthletePoliticalFigure(data.get("EntertainerAthlete"));
        setIsDisclosureRequiredAndHasBeenMade(data.get("DisclosureRequired"),data.get("DisclosureMade"));
        selectAdmittedOrSurplus(data.get("Admitted"));
        selectAdmittedLine(data.get("AdmittedLine"));
        setExWind(data.get("ExWind"));
        selectLicensedProducer(data.get("LicensedProducer"));
        Thread.sleep(2000);
        selectAdvisorServicer(data.get("AdvisorServicer"));
        Thread.sleep(2000);
        setFirstName(data.get("FirstName"));
        setLastName(data.get("LastName"));
        setMemberOccupation(data.get("MemberOccupation"));
        setMemberEmployer(data.get("MemberEmployer"));
        setPrimaryRiskAddressLine1(data.get("PrimaryAddressLine"));
        setCity(data.get("City"));
        setZipCode(data.get("ZIPCode"));
        setState(data.get("State"));
        Thread.sleep(2000);
        setSpousePartner(data.get("SpousePartner"));
        if(data.get("SpousePartner").equalsIgnoreCase("Yes")){
            setPartnerFirstName(data.get("PartnerFirstName"));
            setPartnerLastName(data.get("PartnerLastName"));
        }
    }
    // Types in the Effective Date
    public void setEffectiveDate(String effectiveDateValue) {
        typeText(effectiveDate,effectiveDateValue);
    }
    // Types in the date Of Birth
    public void setDateOfBirth(String dateOfBirthValue) {
        typeText(dateOfBirth,dateOfBirthValue);
    }
    // Types in the First Name
    public void setFirstName(String firstNameValue) {
        typeText(firstName.get(0),firstNameValue);
    }
    // Types in the Last Name
    public void setLastName(String lastNameValue) {
        typeText(lastName.get(0),lastNameValue);
    }
    // Types in Member Employer
    public void setMemberEmployer(String memberEmployerValue) {
        typeText(memberEmployer,memberEmployerValue);
    }
    // Types in Member Occupation
    public void setMemberOccupation(String memberOccupationValue) {
        typeText(memberOccupation,memberOccupationValue);
    }
    // Sets Risk State
    public void setRiskState(String riskStateValue) {
        typeText(riskState,riskStateValue);
    }
    // Sets State
    public void setState(String stateValue) {
        typeText(state.get(0),stateValue);
    }
    // Selects - Admitted or Surplus Lines:
    public void selectAdmittedOrSurplus(String admittedOrSurplusValue) {
        typeText(admittedOrSurplus,admittedOrSurplusValue);
    }
    // Checks - Which admitted lines would you like to quote?
    public void selectAdmittedLine(String admittedLineValue) {
        clickElement(driver.findElement(By.xpath("//label[text()='"+admittedLineValue+"']/../span/input")));
    }
    // Checks Yes or No Ex-wind Homeowner
    public void setExWind(String exWind) {
        if (exWind.equalsIgnoreCase("Yes")) {
            clickElement(exWindYes);
        } else {
            clickElement(exWindNo);
        }
    }
    // Types in Spouse/Partner/Other First Name
    public void setPartnerFirstName(String partnerFirstNameValue) {
        typeText(firstName.get(1),partnerFirstNameValue);
    }
    // Types in Spouse/Partner/Other Last Name
    public void setPartnerLastName(String partnerLastNameValue) {
        typeText(lastName.get(1),partnerLastNameValue);
    }
    // Types in Primary Risk Address Line 1
    public void setPrimaryRiskAddressLine1(String riskAddressLine1Value) {
        typeText(primaryAddressLine1,riskAddressLine1Value);
    }
    // Types in the City
    public void setCity(String cityValue) {
        typeText(city.get(0),cityValue);
    }
    // Types in the Zip Code
    public void setZipCode(String zipCodeValue) {
        typeText(zipCode.get(0),zipCodeValue);
    }
    // Checks Yes or No - Has the client lived at this address for more than six months?
    public void livedAtAddressMoreThanSixMonths(String moreThanSixMonths) {
        if (moreThanSixMonths.equalsIgnoreCase("Yes")) {
            clickElement(sixMonthsYes);
        } else {
            clickElement(sixMonthsNo);
        }
    }
    // Checks Yes or No - Are you or is a member of your household a Media Personality Professional Entertainer or Athlete or an Appointed or Elected Federal or State political figure?
    public void entertainerAthletePoliticalFigure(String athletePolitical) {
        if (athletePolitical.equalsIgnoreCase("Yes")) {
            clickElement(memberOfHouseholdYes);
        } else {
            clickElement(memberOfHouseholdNo);
        }
    }
    // Set is disclosure required
    public void setIsDisclosureRequiredAndHasBeenMade(String isDisclosureRequired, String hasDisclosureBeenMade) {
        if (isDisclosureRequired.equalsIgnoreCase("Yes")) {
            clickElement(disclosureRequiredYes);
        } else if (hasDisclosureBeenMade.equalsIgnoreCase("Yes")) {
            clickElement(disclosureRequiredNo);
            clickElement(disclosureMadeToClientYes);
        } else {
            clickElement(disclosureRequiredNo);
            clickElement(disclosureMadeToClientNo);
        }
    }
    // Set Licensed Producer
    public void selectLicensedProducer(String licensedProducerValue) {
        typeText(licensedProducer,licensedProducerValue);
    }
    // Set Advisor / Servicer
    public void selectAdvisorServicer(String advisorServicerValue) {
        typeText(advisorServicer,advisorServicerValue);
    }
    // Set Spouse / Partner yes or no
    public void setSpousePartner(String spousePartnerValue) {
        typeText(spousePartner,spousePartnerValue);
    }
}