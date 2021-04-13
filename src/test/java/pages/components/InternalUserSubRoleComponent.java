package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalUserSubRoleComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public InternalUserSubRoleComponent(WebDriver driver) {
        super(driver);
        InternalUserSubRoleComponent.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[text()='First Name']/../../../../div//input")
    WebElement firstName;
    @FindBy(xpath = "//div[text()='Last Name']/../../../../div//input")
    WebElement lastName;
    @FindBy(xpath = "//div[text()='Phone Number']/../../../../div//input")
    WebElement phoneNumber;
    @FindBy(xpath = "//div[text()='Email Address']/../../../../div//input")
    WebElement emailAddress;
    @FindBy(xpath = " //div[text()='Role']/../../../../div//input")
    WebElement role;
    @FindBy(xpath = "//div[text()='Sub Role']/../../../../div//input")
    WebElement subRole;
    @FindBy(xpath = "//div[text()='Round Robin Account Reassignment']/../../../../div//input//div[text()='Round Robin Account Reassignment']/../../../../div//input")
    WebElement roundRobinAccountReassignment;

    public void setFirstName(String firstNameText) throws Throwable {
        typeText(firstName, firstNameText);
    }

    public void setLastName(String lastNameText) throws Throwable {
        typeText(lastName, lastNameText);
    }

    public void setPhoneNumber(String phoneNumberText) throws Throwable {
        typeText(phoneNumber, phoneNumberText);
    }

    public void setEmailAddress(String mailText) throws Throwable {
        typeText(emailAddress, mailText);
    }
    public void setRole(String roleText) throws Throwable {
        typeText(role, roleText);
    }
    public void setSubRoleRole(String subRoleText) throws Throwable {
        typeText(subRole, subRoleText);
    }
    public void setRoundRobinAccountReassignment(String checked) throws Throwable {
        checkCheckbox(roundRobinAccountReassignment,checked);
    }


}
