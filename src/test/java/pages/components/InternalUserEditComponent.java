package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalUserEditComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public InternalUserEditComponent(WebDriver driver) {
        super(driver);
        InternalUserEditComponent.driver = driver;
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
    @FindBy(xpath = "//label[text()=\"Check if this is not the person's direct email\"]/../../div//input")
    WebElement checkIfThisIsNotPersonsDirectEmail;
    @FindBy(xpath = "//div[text()=\"User's Direct Email\"]/../../../../div//input")
    WebElement usersDirectEmail;
    @FindBy(xpath = "//div[text()='Department']/../../../../div//input")
    WebElement department;
    @FindBy(xpath = "//div[text()='Task As Email?']/../../../../div//input")
    WebElement taskAsEmail;
    @FindBy(xpath = "//div[text()='Access to Rating Log?']/../../../../div//input")
    WebElement accessToRatingLog;
    @FindBy(xpath = "//div[text()='Access to User Setup?']/../../../../div//input")
    WebElement accessToUserSetup;
    @FindBy(xpath = "//div[text()='Access to Sub Roles?']/../../../../div//input")
    WebElement accessToSubRoles;
    @FindBy(xpath = "//div[text()='PURE Programs user only?']/../../../../div//input")
    WebElement pureProgramsUserOnly;
    @FindBy(xpath = "//div[text()='Access to bind/process a transaction']/../../../../div//label[text()='Yes']/..//input")
    WebElement accessToBindProcessATransactionYes;
    @FindBy(xpath = "//div[text()='Access to bind/process a transaction']/../../../../div//label[text()='No']/..//input")
    WebElement accessToBindProcessATransactionNo;
    @FindBy(xpath = "//div[text()='User must change password on Login']/../../../..//input")
    WebElement userMustChangePasswordOrLogin;
    @FindBy(xpath = "//div[text()='Lock User Login ?']/../../../..//input")
    WebElement lockUserLogin;
    @FindBy(xpath = "//div[text()='Language']/../../../..//input")
    WebElement language;
    @FindBy(xpath = "//div[text()='OKTA Enabled ?']/../../../..//input")
    WebElement OKTAEnabled;

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
    public void setCheckIfThisIsNotPersonsDirectEmail(String checked) throws Throwable {
        checkCheckbox(checkIfThisIsNotPersonsDirectEmail, checked);
    }
    public void setUsersDirectEmail(String directMailText) throws Throwable {
        typeText(usersDirectEmail, directMailText);
    }
    public void setDepartment() throws Throwable {
        clickElement(department);
    }
    public void setTaskAsEmail() throws Throwable {
        clickElement(taskAsEmail);
    }
    public void setAccessToRatingLog(String checked) throws Throwable {
        checkCheckbox(accessToRatingLog, checked);
    }
    public void setAccessToUserSetup(String checked) throws Throwable {
        checkCheckbox(accessToUserSetup, checked);
    }
    public void setAccessToSubRoles(String checked) throws Throwable {
        checkCheckbox(accessToSubRoles, checked);
    }
    public void setPureProgramsUserOnly(String checked) throws Throwable {
        checkCheckbox(pureProgramsUserOnly, checked);
    }
    public void setAccessToBindProcessATransaction(String choose) throws Throwable {
        choose(accessToBindProcessATransactionYes, accessToBindProcessATransactionNo, choose);
    }
    public void setLockUserLogin(String lockUser) throws Throwable {
        typeText(lockUserLogin, lockUser);
    }
    public void setLanguage(String languageText) throws Throwable {
        typeText(language, languageText);
    }
    public void setOKTAEnabled(String enableOCTA) throws Throwable {
        typeText(OKTAEnabled, enableOCTA);
    }
}