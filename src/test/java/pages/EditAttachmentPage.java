package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

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

    public void addAttachment(Map<String,String> data){
        setDocumentName(data.get("DocName"));
        setDescription(data.get("Description"));
        setInternalUse(data.get("InternalUse"));
        setSubscriptionAgreementSignedAndComplete(data.get("SubscriptionAgreementSigned"));
        clickUploadFile();
        setFileToBeUploaded(data.get("File"));
        clickUpload();
        clickOK();
    }
    public void setDocumentName (String  docName){
        typeText(documentNameInput,docName);
    }
    public void setDescription (String description){
        typeText(descriptionField,description);
    }
    public void setInternalUse (String value){
        setAttributeValue(internalUse,"value",value);
    }
    public void setSubscriptionAgreementSignedAndComplete (String value){
        setAttributeValue(subscriptionAgreementSignedAndComplete,"value",value);
    }
    public void clickUploadFile () {
        clickElement(uploadFile);
    }
    public void setFileToBeUploaded(String file){
        //typeText(fileUploadPath,file);
        //setAttributeValue(fileUploadPath,"value",file);
        //jsSetValue(fileUploadPath,file);
        //TODO upload file ???
    }
    public void clickUpload(){
        clickElement(upload);
    }
    public void clickOK(){
        clickElement(ok);
    }
}