package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Map;

public class EditAttachmentPage extends CommonComponentsAndActions {

    static WebDriver driver;

    public EditAttachmentPage(WebDriver driver){
        super(driver);
        EditAttachmentPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Document Name (appears as name on document link)']/../../../../div//input")
    WebElement documentNameInput;
    @FindBy(xpath = "//div[text()='Description']/../../../..//textarea")
    WebElement descriptionField;
    @FindBy(xpath = "//div[text()='Internal Use']/../../../../div//input")
    WebElement internalUse;
    @FindBy(xpath = "//div[text()='Subscription agreement is signed and complete?']/../../../../div//input")
    WebElement subscriptionAgreementSignedAndComplete;
    @FindBy(xpath = "//span[text()='File Upload']")
    WebElement uploadFile;
    @FindBy(xpath = "//input[@name=\"fName\"]")
    WebElement fileUploadPath;
    @FindBy(xpath = "//span[text()='Upload']")
    WebElement upload;
    @FindBy(xpath = "//span[text()='OK']")
    WebElement ok;
    @FindBy(css = "#filefield-10098-button-fileInputEl")
    WebElement browse;
    @FindBy(css = "#filefield-10098-inputEl")
    WebElement inputFile;

    public void addAttachment(Map<String,String> data) throws Throwable {
        setDocumentName(data.get("DocName"));
        setDescription(data.get("Description"));
        setInternalUse(data.get("InternalUse"));
        setSubscriptionAgreementSignedAndComplete(data.get("SubscriptionAgreementSigned"));
        clickUploadFile();
        //setFileToBeUploaded();
        clickBrowse();
        clickUpload();
        clickOK();
    }
    public void setDocumentName (String  docName) throws Throwable {
        typeText(documentNameInput,docName);
    }
    public void setDescription (String description) throws Throwable {
        typeText(descriptionField,description);
    }
    public void setInternalUse (String value){
        setAttributeValue(internalUse,"value",value);
    }
    public void setSubscriptionAgreementSignedAndComplete (String value){
        setAttributeValue(subscriptionAgreementSignedAndComplete,"value",value);
    }
    public void clickUploadFile () throws Throwable {
        clickElement(uploadFile);
    }
    public void setFileToBeUploaded(){

    }
    public void clickBrowse() throws Throwable {
        clickElement(browse);//TODO not clicking browse
        Robot rb = new Robot();
        StringSelection str = new StringSelection("C:\\Users\\astojanovic\\Desktop\\test.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
    public void clickUpload() throws Throwable {
        clickElement(upload);
    }
    public void clickOK() throws Throwable {
        clickElement(ok);
    }
}