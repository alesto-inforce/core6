package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppraisalInformationComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public AppraisalInformationComponent(WebDriver driver) {
        super(driver);
        AppraisalInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Require appraisal comments:']/../../../../div//textarea")
    public WebElement requireAppraisalComments;

    @FindBy(xpath = "//div[text()='Contact Name']/../../../../div//input")
    public WebElement contactName;

    @FindBy(xpath = "//div[text()='Contact Email']/../../../../div//input")
    public WebElement contactEmail;

    @FindBy(xpath = "//div[text()='Contact Phone Number']/../../../../div//input")
    public WebElement contactPhoneNumber;

    public void fillOutAppraisalInformation(String name, String phone,String comment, String email){
        setContactName(name);
        setContactPhoneNumber(phone);
        requireAppraisalComments(comment);
        contactEmail(email);

    }
    public void requireAppraisalComments(String comment) {
        typeText(requireAppraisalComments,comment);
    }

    public void setContactName(String name) {
        typeText(contactName,name);
    }

    public void contactEmail(String email) {
        typeText(contactEmail,email);
    }

    public void setContactPhoneNumber(String phone) {
        typeText(contactPhoneNumber,phone);
    }
}