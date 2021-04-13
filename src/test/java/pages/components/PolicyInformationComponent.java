package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyInformationComponent extends CommonComponentsAndActions {

    static WebDriver driver;

    public PolicyInformationComponent(WebDriver driver){
        super(driver);
        PolicyInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label//div[text()='Term']/../../../..//input")
    WebElement term;
    @FindBy(xpath = "//label//div[text()='Effective Date']/../../../..//input")
    WebElement effectiveDate;
    @FindBy(xpath = "//label//div[text()='Expiration Date']/../../../..//input")
    WebElement expirationDate;
    @FindBy(xpath = "//label//div[text()='Named Insured Type']/../../../..//input")
    WebElement namedInsuredType;
    @FindBy(xpath = "//label//div[text()='Quote Name']/../../../..//input")
    WebElement quoteName;
    @FindBy(xpath = "//label//div[text()='Licensed Producer']/../../../..//input")
    WebElement licencedProducer;
    @FindBy(xpath = "//label//div[text()='Advisor / Servicer']/../../../..//input")
    WebElement advisorServicer;
    @FindBy(xpath = "//label//div[text()='Current Homeowners Insurance Carrier']/../../../..//input")
    WebElement currentHomeownersInsuranceCarrier;
    @FindBy(xpath = "//label//div[text()='Current Premium']/../../../..//input")
    WebElement currentPremium;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Private Fleet Auto')]/..//input")
    WebElement doesTheMemberHaveAPurePrivateAuto;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Jewelry')]/..//input")
    WebElement doesTheMemberHavePureJewelry;
    @FindBy(xpath = "//div//label[contains(text(),'PURE Personal Excess')]/..//input")
    WebElement doesTheMemberHavePurePersonalExcess;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='No']/..//input")
    WebElement stateOrPoliticalFigureNo;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement stateOrPoliticalFigureYes;

    public void setTerm(String termText) throws Throwable{
        typeText(term,termText);
    }
    public void setEffectiveDate(String dateText) throws Throwable{
        typeText(effectiveDate,dateText);
    }
    public void setExpirationDate(String expirationDateText) throws Throwable{
        typeText(expirationDate,expirationDateText);
    }
    public void setNamedInsuredType(String namedInsuredTypeText) throws Throwable{
        typeText(namedInsuredType,namedInsuredTypeText);
    }
    public void setQuoteName(String quoteNameText) throws Throwable{
        typeText(quoteName,quoteNameText);
    }
    public void setLicencedProducer(String licencedProducerText) throws Throwable{
        typeText(licencedProducer,licencedProducerText);
    }
    public void setAdvisorServicer(String advisorServicerText) throws Throwable{
        typeText(advisorServicer,advisorServicerText);
    }
    public void setCurrentHomeownersInsuranceCarrier(String currentHomeownersInsuranceCarrierText) throws Throwable{
        typeText(currentHomeownersInsuranceCarrier,currentHomeownersInsuranceCarrierText);
    }
    public void setCurrentPremium(String currentPremiumText) throws Throwable{
        typeText(currentPremium,currentPremiumText);
    }
    public void setDoesTheMemberHaveAPurePrivateAuto(String checked) throws Throwable {
        checkCheckbox(doesTheMemberHaveAPurePrivateAuto, checked);
    }
    public void setDoesTheMemberHavePureJewelry(String checked) throws Throwable {
        checkCheckbox(doesTheMemberHavePureJewelry, checked);
    }
    public void setDoesTheMemberHavePurePersonalExcess(String checked) throws Throwable {
        checkCheckbox(doesTheMemberHavePurePersonalExcess, checked);
    }
    public void setStateOrPoliticalFigure(String choose) throws Throwable {
        choose(stateOrPoliticalFigureYes, stateOrPoliticalFigureNo, choose);
    }

}

