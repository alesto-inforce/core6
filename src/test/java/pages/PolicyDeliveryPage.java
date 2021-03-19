package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

public class PolicyDeliveryPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public PolicyDeliveryPage(WebDriver driver){
        super(driver);
        PolicyDeliveryPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@title='Did the member opt out of electronic delivery (Applicant)?']/../div[2]/ul/li[2]//input")
    WebElement optoutElectronicYes;
    @FindBy(xpath = "//input[@title='Agency Email Address']")
    WebElement agencyEmail;
    @FindBy(xpath = "//input[@title='Member's Email']")
    WebElement membersEmail;
    @FindBy(xpath = "//input[@title='Member's Primary Phone Number']")
    WebElement membersPhone;
    @FindBy(xpath = "//input[@title='Agency Email delivery (New Business only).']")
    WebElement agendDelivery;

    public void initiateDelivery() throws Throwable {
        optoutElectronicYes.click();
        Thread.sleep(3000);
        agendDelivery.click();
        agencyEmail.sendKeys("email@email.com");
        membersEmail.sendKeys("email@email.com");
        Thread.sleep(2000);
        membersPhone.sendKeys("1231231231");
        Thread.sleep(2000);
        CommonComponentsAndActions.saveChanges.click();
        membersPhone.clear();
        membersPhone.sendKeys("1231231231");
        Thread.sleep(2000);
        CommonComponentsAndActions.saveChanges.click();

    } //TODO break down in smaller methods; remove hardcode values; fix it
}
//TODO break down to components