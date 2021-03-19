package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyInformationComponent {

    static WebDriver driver;

    public PolicyInformationComponent(WebDriver driver){
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
    WebElement nameInsuredType;
    @FindBy(xpath = "//label//div[text()='Quote Name']/../../../..//input")
    WebElement quoteName;
    @FindBy(xpath = "//label//div[text()='Licensed Producer']/../../../..//input")
    WebElement licencedProducer;
    @FindBy(xpath = "//label//div[text()='Advisor / Servicer']/../../../..//input")
    WebElement advisorServicer;
    @FindBy(xpath = "//div//label[text()='Does the Member have a PURE Private Fleet Auto Insurance policy? (a 5% premium credit, up to $500, will be applied)']/..//input")
    WebElement doesTheMemberHaveAPurePrivate;
    @FindBy(xpath = "//div//label[text()='Does the Member have a PURE Jewelry & Art policy?']/..//input")
    WebElement doesTheMemberHavePureJewelry;
    @FindBy(xpath = "//div//label[text()='Does the Member have a PURE Personal Excess Policy?']/..//input")
    WebElement doesTheMemberHavePurePersonal;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='No']/..//input")
    WebElement stateOrPoliticalFigureNo;
    @FindBy(xpath = "//span/div[contains(text(),'State political figure?')]/../../../../div//label[text()='Yes']/..//input")
    WebElement stateOrPoliticalFigureYes;
}

