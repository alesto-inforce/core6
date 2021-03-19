package pages.components;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PrintAndMailDeliveryPreferenceComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public PrintAndMailDeliveryPreferenceComponent(WebDriver driver){
        super(driver);
        PrintAndMailDeliveryPreferenceComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label[text()='Send the printed documents to the Member']/..//input")
    WebElement sendThePrintedDocumentsToTheMember;
    @FindBy(xpath = "//div[contains(text(),'A valid Email address is required')]/../../../..//input")
    WebElement membersEmail;
    @FindBy(xpath = "//div[contains(text(),'Primary Phone Number')]/../../../..//input")
    WebElement membersPhone;

    public void fillPrintAndDeliveryOptions() throws InterruptedException {
        clickElement(sendThePrintedDocumentsToTheMember);
        Thread.sleep(2000);
        typeText(membersEmail,"email@email.com");
        typeText(membersPhone,"1111111111");
    }
}