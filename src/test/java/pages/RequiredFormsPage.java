package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.MemberApplicationAndAgreementsComponent;
import pages.components.SignaturePreferenceComponent;

import java.util.Map;

public class RequiredFormsPage extends CommonComponentsAndActions {
    static WebDriver driver;
    SignaturePreferenceComponent signaturePreferenceComponent;
    MemberApplicationAndAgreementsComponent memberApplicationAndAgreementsComponent;

    public RequiredFormsPage(WebDriver driver){
        super(driver);
        RequiredFormsPage.driver = driver;
        PageFactory.initElements(driver,this);
        signaturePreferenceComponent = new SignaturePreferenceComponent(driver);
        memberApplicationAndAgreementsComponent = new MemberApplicationAndAgreementsComponent(driver);
    }

    @FindBy(xpath = "//span[text()='generate forms and continue to esign email']")
    WebElement generateDocuments;

    public void generateDocuments() throws Throwable {
        clickElement(generateDocuments);
    }
    public void fillSignaturePreferenceAndUpload(Map<String,String> data) throws Throwable {
        signaturePreferenceComponent.fillSignaturePreferenceNoReminder(data.get("MemberEmail"),data.get("BrokerEmail"));
        memberApplicationAndAgreementsComponent.upload();
    }
}