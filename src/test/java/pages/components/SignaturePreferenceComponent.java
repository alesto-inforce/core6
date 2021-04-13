package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignaturePreferenceComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public SignaturePreferenceComponent(WebDriver driver) {
        super(driver);
        SignaturePreferenceComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Does the member want to electronically sign documents?']/../../../../div//label[text()='No']/..//input")
    WebElement electronicallySignDocumentsNo;
    @FindBy(xpath = "//div[text()='Does the member want to electronically sign documents?']/../../../../div//label[text()='Yes']/..//input")
    WebElement electronicallySignDocumentsYes;


    @FindBy(xpath = "//div[text()='Who should we send the electronic signature request email to?']/../../../../div//label[contains(text(),'Send to member')]/..//input")
    WebElement whoShouldWeSendElectSignatureToEmailToMember;
    @FindBy(xpath = "//div[text()='Who should we send the electronic signature request email to?']/../../../../div//label[contains(text(),'Send to broker only')]/..//input")
    WebElement whoShouldWeSendElectSignatureToEmailToBroker;

    @FindBy(xpath = "//div[text()='Member Email Address for electronic signature']/../../../../div//input")
    WebElement memberEmailForElectronicSignature;
    @FindBy(xpath = "//div[text()='Broker Email Address for electronic signature']/../../../../div//input")
    WebElement brokerEmailForElectronicSignature;

    @FindBy(xpath = "//div[text()='Do you want to send a reminder email for completing electronic signature?']/../../../../div//label[text()='Yes']/..//input ")
    WebElement doYouWantToSendAReminderYes;
    @FindBy(xpath = "//div[text()='Do you want to send a reminder email for completing electronic signature?']/../../../../div//label[text()='No']/..//input ")
    WebElement doYouWantToSendAReminderNo;


    public void electronicallySignDocumentsNo() throws Throwable {
        clickElement(electronicallySignDocumentsNo);
    }
    public void electronicallySignDocumentsYes() throws Throwable {
        clickElement(electronicallySignDocumentsYes);
    }
    public void sendElectSignatureToMember() throws Throwable {
        clickElement(whoShouldWeSendElectSignatureToEmailToMember);
    }
    public void sendElectSignatureToBroker() throws Throwable {
        clickElement(whoShouldWeSendElectSignatureToEmailToBroker);
}
    public void enterMemberEmailAddressField (String memberEmailAddressField) throws Throwable {
        typeText(memberEmailForElectronicSignature,memberEmailAddressField);
    }
    public void enterBrokerEmailAddressField (String brokerEmailAddressField) throws Throwable {
        typeText(brokerEmailForElectronicSignature,brokerEmailAddressField);
}
    public void sendAReminderNo() throws Throwable {
        clickElement(doYouWantToSendAReminderNo);
    }
    public void sendAReminderYes() throws Throwable {
        clickElement(doYouWantToSendAReminderYes);
}
    public void fillSignaturePreferenceNoReminder(String memberEmail, String brokerEmail) throws Throwable {
        enterMemberEmailAddressField(memberEmail);
        enterBrokerEmailAddressField(brokerEmail);
        sendAReminderNo();
    }

}