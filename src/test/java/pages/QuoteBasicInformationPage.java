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
    @FindBy(xpath = "//div[text()='Is the client a member of a PURE Marketing Group?']/../../../../div//input")
    List<WebElement> memberOfPUREMarketingGroup;

    // Quote Basic Information
    public void initiateQuote(Map<String,String> data,String ENV) throws Throwable {
        //Set Licensed Producer and Advisor Servicer based on the ENV
        switch (ENV){
            case "QA": {
                data.replace("Licensed_Producer","Jerry Ford");
                data.replace("Advisor_Servicer","Jerry Ford");
            } break;
            case "STG":{
                if(data.get("State").equals("NY")){
                    data.replace("Licensed_Producer", "Edison Judson");
                    data.replace("Advisor_Servicer", "Edison Judson");
                }else {
                    data.replace("Licensed_Producer", "Rodrigo Lucero");
                    data.replace("Advisor_Servicer", "Rodrigo Lucero");
                }
            } break;
            case "PROD":{
                data.replace("Licensed_Producer","");
                data.replace("Advisor_Servicer","");
            } break;
        }

        //Fill in initiate quote details
        setEffectiveDate(data.get("Effective_Date"));pause(3000);
        setDateOfBirth(data.get("Date_Of_Birth"));pause(3000);
        setRiskState(data.get("State"));pause(3000);

        switch (data.get("State")){
            //Only Admitted No Ex Wind States
            case "AK": case "AR": case "AZ": case "CO": case "DC": case "DE": case "HI": case "IA": case "IL": case "IN":
            case "KS": case "KY": case "MI": case "ME": case "MN": case "MO": case "MT": case "ND": case "NE": case "NH":
            case "NM": case "NV": case "MD": case "OH": case "OK": case "OR": case "PA": case "RI": case "SD": case "TN":
            case "UT": case "VA": case "VT": case "WA": case "WI": case "WV": case "WY":{
                selectAdmittedLine(data.get("Admitted_Line"));
            }break;

            //Admitted and Surplus No Ex Wind States
            case "AL": case "CA": case "CT": case "LA": case "MA": case "MS": case "NC": case "NJ": case "SC":{
                selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));pause(3000);
                selectAdmittedLine(data.get("Admitted_Line"));
            }break;

            //Admitted and Surplus and Ex Wind States
            case "FL": case "TX":{
                selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));pause(3000);
                selectAdmittedLine(data.get("Admitted_Line"));pause(3000);
                setExWind(data.get("Ex_Wind"));
            }break;

            //Admitted and Surplus No Ex Wind With Marketing Group States
            case "NY":{
                selectAdmittedOrSurplus(data.get("Admitted_Or_Surplus"));pause(3000);
                selectAdmittedLine(data.get("Admitted_Line"));
                setMemberOfPureMarketingGroup(data.get("Member_Of_Pure_Marketing_Group"));
            }break;

            //Admitted and Surplus-cant be selected No Ex Wind With Marketing Group States
            case "GA":{
                selectAdmittedLine(data.get("Admitted_Line"));
                //setMemberOfPureMarketingGroup(data.get("Member_Of_Pure_Marketing_Group")); TODO
            }break;
        }

        pause(3000);
        livedAtAddressMoreThanSixMonths(data.get("More_Than_Six_Months"));
        entertainerAthletePoliticalFigure(data.get("Entertainer_Athlete"));
        setIsDisclosureRequiredAndHasBeenMade(data.get("Disclosure_Required"),data.get("Disclosure_Made"));
        selectLicensedProducer(data.get("Licensed_Producer"));
        pause(3000);
        selectAdvisorServicer(data.get("Advisor_Servicer"));
        pause(3000);
        setFirstName(data.get("First_Name"));
        setLastName(data.get("Last_Name"));
        setMemberOccupation(data.get("Member_Occupation"));
        setMemberEmployer(data.get("Member_Employer"));
        setPrimaryRiskAddressLine1(data.get("Address_Line_1_Txt"));
        setCity(data.get("City_Name_Txt"));
        setZipCode(data.get("Zip_Code"));
        setState(data.get("State"));
        pause(3000);
        setSpousePartner(data.get("Spouse_Partner"));
        if(data.get("Spouse_Partner").equalsIgnoreCase("Yes")){
            setPartnerFirstName(data.get("Partner_First_Name"));
            setPartnerLastName(data.get("Partner_Last_Name"));
        }
        clickElement(CommonComponentsAndActions.next);
    }
    // Types in the Effective Date
    public void setEffectiveDate(String effectiveDateValue) throws Throwable {
        typeText(effectiveDate,effectiveDateValue);
    }
    // Types in the date Of Birth
    public void setDateOfBirth(String dateOfBirthValue) throws Throwable {
        typeText(dateOfBirth,dateOfBirthValue);
    }
    // Types in the First Name
    public void setFirstName(String firstNameValue) throws Throwable {
        typeText(firstName.get(0),firstNameValue);
    }
    // Types in the Last Name
    public void setLastName(String lastNameValue) throws Throwable {
        typeText(lastName.get(0),lastNameValue);
    }
    // Types in Member Employer
    public void setMemberEmployer(String memberEmployerValue) throws Throwable {
        typeText(memberEmployer,memberEmployerValue);
    }
    // Types in Member Occupation
    public void setMemberOccupation(String memberOccupationValue) throws Throwable {
        typeText(memberOccupation,memberOccupationValue);
    }
    // Sets Risk State
    public void setRiskState(String riskStateValue) throws Throwable {
        typeText(riskState,riskStateValue);
    }
    // Sets State
    public void setState(String stateValue) throws Throwable {
        typeText(state.get(0),stateValue);
    }
    // Selects - Admitted or Surplus Lines:
    public void selectAdmittedOrSurplus(String admittedOrSurplusValue) throws Throwable {
        typeText(admittedOrSurplus,admittedOrSurplusValue);
    }
    // Checks - Which admitted lines would you like to quote?
    public void selectAdmittedLine(String admittedLineValue) throws Throwable {
        clickElement(driver.findElement(By.xpath("//label[text()='"+admittedLineValue+"']/../span/input")));
    }
    // Checks Yes or No Ex-wind Homeowner
    public void setExWind(String exWind) throws Throwable {
        choose(exWindYes,exWindNo,exWind);
    }
    // Types in Spouse/Partner/Other First Name
    public void setPartnerFirstName(String partnerFirstNameValue) throws Throwable {
        typeText(firstName.get(1),partnerFirstNameValue);
    }
    // Types in Spouse/Partner/Other Last Name
    public void setPartnerLastName(String partnerLastNameValue) throws Throwable {
        typeText(lastName.get(1),partnerLastNameValue);
    }
    // Types in Primary Risk Address Line 1
    public void setPrimaryRiskAddressLine1(String riskAddressLine1Value) throws Throwable {
        typeText(primaryAddressLine1,riskAddressLine1Value);
    }
    // Types in the City
    public void setCity(String cityValue) throws Throwable {
        typeText(city.get(0),cityValue);
    }
    // Types in the Zip Code
    public void setZipCode(String zipCodeValue) throws Throwable {
        typeText(zipCode.get(0),zipCodeValue);
    }
    // Checks Yes or No - Has the client lived at this address for more than six months?
    public void livedAtAddressMoreThanSixMonths(String moreThanSixMonths) throws Throwable {
        choose(sixMonthsYes,sixMonthsNo,moreThanSixMonths);
    }
    // Checks Yes or No - Are you or is a member of your household a Media Personality Professional Entertainer or Athlete or an Appointed or Elected Federal or State political figure?
    public void entertainerAthletePoliticalFigure(String athletePolitical) throws Throwable {
        choose(memberOfHouseholdYes,memberOfHouseholdNo,athletePolitical);
    }
    // Set is disclosure required
    public void setIsDisclosureRequiredAndHasBeenMade(String isDisclosureRequired, String hasDisclosureBeenMade) throws Throwable {
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
    public void selectLicensedProducer(String licensedProducerValue) throws Throwable {
        typeText(licensedProducer,licensedProducerValue);
    }
    // Set Advisor / Servicer
    public void selectAdvisorServicer(String advisorServicerValue) throws Throwable {
        typeText(advisorServicer,advisorServicerValue);
    }
    // Set Spouse / Partner yes or no
    public void setSpousePartner(String spousePartnerValue) throws Throwable {
        typeText(spousePartner,spousePartnerValue);
    }
    // Set member of pure marketing group
    public void setMemberOfPureMarketingGroup(String member) throws Throwable {
        typeText(memberOfPUREMarketingGroup.get(1),member);
    }
}