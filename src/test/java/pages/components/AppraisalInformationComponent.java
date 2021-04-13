package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

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

    public void fillOutAppraisalInformation(Map<String,String> data) throws Throwable {
        requireAppraisalComments(data.get("AppraisalComment"));
        setContactName(data.get("ContactName"));
        contactEmail(data.get("ContactEmail"));
        setContactPhoneNumber(data.get("ContactPhone"));
    }
    public void requireAppraisalComments(String comment) throws Throwable {
        typeText(requireAppraisalComments,comment);
    }
    public void setContactName(String name) throws Throwable {
        typeText(contactName,name);
    }
    public void contactEmail(String email) throws Throwable {
        typeText(contactEmail,email);
    }
    public void setContactPhoneNumber(String phone) throws Throwable {
        typeText(contactPhoneNumber,phone);
    }
}