package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class AdditionalLocationBindingInformationComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public AdditionalLocationBindingInformationComponent(WebDriver driver) {
        super(driver);
        AdditionalLocationBindingInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='No']/..//input")
    WebElement existingAgencyClientNo;
    @FindBy(xpath = "//div[text()='Existing Agency Client?']/../../../../div//label[text()='Yes']/..//input")
    WebElement existingAgencyClientYes;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='No']/..//input")
    WebElement cancelledOrRefusedNo;
    @FindBy(xpath = "//div[text()='Has any company cancelled or refused to insure in the past 3 years?']/../../../../div//label[text()='Yes']/..//input")
    WebElement cancelledOrRefusedYes;
    @FindBy(xpath = "//div[text()='Has coverage been non-renewed or Declined?']/../../../../div//label[text()='No']/..//input")
    WebElement coverageNonRenewedOrDeclinedNo;
    @FindBy(xpath = "//div[text()='Has coverage been non-renewed or Declined?']/../../../../div//label[text()='Yes']/..//input")
    WebElement coverageNonRenewedOrDeclinedYes;

    public void fillOutAdditionalLocationBindingInformation(Map<String,String> data){
        if(data.get("ExistingAgencyClient").equalsIgnoreCase("Yes")){
            setExistingAgencyClientYes();
        } else {
            setExistingAgencyClientNo();
        }
        if(data.get("CompanyCancelledOrRefused").equalsIgnoreCase("Yes")){
            setCancelledOrRefusedYes();
        } else {
            setCancelledOrRefusedNo();
        }
        if(data.get("CoverageNonRenewedOrDeclined").equalsIgnoreCase("Yes")){
            setCoverageNonRenewedOrDeclinedYes();
        } else {
            setCoverageNonRenewedOrDeclinedNo();
        }
    }

    public void setExistingAgencyClientNo() {
        clickElement(existingAgencyClientNo);
    }
    public void setExistingAgencyClientYes() {
        clickElement(existingAgencyClientYes);
    }
    public void setCancelledOrRefusedNo() {
        clickElement(cancelledOrRefusedNo);
    }
    public void setCancelledOrRefusedYes() {
        clickElement(cancelledOrRefusedYes);
    }
    public void setCoverageNonRenewedOrDeclinedNo() {
        clickElement(coverageNonRenewedOrDeclinedNo);
    }
    public void setCoverageNonRenewedOrDeclinedYes() {
        clickElement(coverageNonRenewedOrDeclinedYes);
    }
}