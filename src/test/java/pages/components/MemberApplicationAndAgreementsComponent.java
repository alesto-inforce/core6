package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MemberApplicationAndAgreementsComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public MemberApplicationAndAgreementsComponent(WebDriver driver) {
        super(driver);
        MemberApplicationAndAgreementsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='upload']")
    List<WebElement> upload;


    @FindBy(xpath = "//div[@title='Subscription agreement is signed and complete']/../../../td[5]//span[@title='Yes']")
    WebElement subscriptionAgreementSignedYes;
    @FindBy(xpath = "//input[@title='Name of Document']")
    WebElement docName;
    @FindBy(xpath = "//a[@title='Document']")
    WebElement fileUpload;
    @FindBy(xpath = "//select[@title='Subscription agreement is signed and complete?']")
    WebElement agreementSignedElement;
    @FindBy(xpath = "//div[text()='Subscribers Agreement']/../../../../../../../../../../../td[7]//span[text()='upload']")
    WebElement subscribersAgreementUpload;
    @FindBy(xpath = "//div[text()='eDelivery Agreement']/../../../../../../../../../../../td[7]//span[text()='upload']")
    WebElement eDeliveryAgreementUpload;

    public void upload() {
        clickElement(upload.get(0));
    }

    public void subscribersAgreementUpload(){
        clickElement(subscribersAgreementUpload);
    }
    public void eDeliveryAgreementUpload(){
        clickElement(eDeliveryAgreementUpload);
    }
    public void setSubscriptionAgreementSignedYes() {
        clickElement(subscriptionAgreementSignedYes);
    }

//    public void fillOutMemberApplicationAgreement(String docPath){
//        setSubscriptionAgreementSignedYes();
//        upload();
//        uploadDoc(docPath);
//    }
//    public void uploadDoc(String docPath){
//        docName.sendKeys("Test");
//        fileUpload.click();
//        String parent = driver.getWindowHandle();
//        for(String winHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(winHandle);
//        }
//
//        driver.findElement(By.xpath("//input[@name='fName']")).sendKeys(docPath);
//        driver.findElement(By.xpath("//input[@value='Upload']")).click();
//        driver.close();
//        driver.switchTo().window(parent);
//
//        Select agreementSignedSelect = new Select(agreementSignedElement);
//        agreementSignedSelect.selectByValue("1");
//
//        driver.findElement(By.xpath("//a[@title='Click to attach your selected file.']")).click();
//        driver.findElement(By.xpath("//a[text()='save']"));
//        // TODO REFACTOR
//    }
}