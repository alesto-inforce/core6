package pages.components;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonComponentsAndActions {

    static WebDriver driver;
    static final int WAIT_TIME = Integer.parseInt(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("WAIT_TIME"));

    public CommonComponentsAndActions(WebDriver driver){
        CommonComponentsAndActions.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Header component elements - START
    @FindBy(xpath = "//span[text()='home']")
    public static WebElement home;
    @FindBy(xpath = "//span[text()='tasks']")
    public static WebElement tasks;
    @FindBy(xpath = "//span[text()='agent resources']")
    public static WebElement agentResources;
    @FindBy(xpath = "//span[text()='customers']")
    public static WebElement customers;
    @FindBy(xpath = "//span[text()='quotes']")
    public static WebElement quotes;
    @FindBy(xpath = "//span[text()='policies']")
    public static WebElement policies;
    @FindBy(xpath = "//span[text()='locations']")
    public static WebElement locations;
    @FindBy(xpath = "//span[text()='partners']")
    public static WebElement partners;
    @FindBy(xpath = "//span[text()='user setup']")
    public static WebElement userSetup;
    @FindBy(xpath = "//span[text()='sub roles']")
    public static WebElement subRoles;
    @FindBy(xpath = "//span[text()='logout']")
    public static WebElement logout;
    @FindBy(xpath = "//div[@id='os-bread-crumb-bar']//span[text()='next']")
    public static WebElement actionButtonNext;
    @FindBy(xpath = "//span[text()='underwriting referrals']")
    public static WebElement underwritingReferrals;
    @FindBy(xpath = "//span[text()='premium']")
    public static WebElement premiumSummary;
    @FindBy(xpath = "//span[contains(text(),'Customer: ')]")
    public static WebElement customer;


    // TODO REFACTOR CORE UPGRADE
    @FindBy(xpath = "//a[contains(text(),'Tools')]")
    public static WebElement tools;
    @FindBy(xpath = "//a[contains(text(),'Moratorium')]")
    public static WebElement moratorium;
    @FindBy(xpath = "//a[contains(text(),'Referral Category')]")
    public static WebElement referralCategory;
    @FindBy(xpath = "//div[@id='headerBar']/h2")
    public static WebElement breadCrumb;
    @FindBy(xpath = "#tabs>div:first-child a>span")
    public static WebElement summary;
    // TODO REFACTOR CORE UPGRADE

    // Header component elements - END

    // Footer component elements - START
    @FindBy(xpath = "//span[contains(text(),'>>> next')]")
    public static WebElement next;
    @FindBy(xpath = "//span[contains(text(),'>>> create  new customer')]")
    public static WebElement createNewCustomer;
    @FindBy(xpath = "//span[text()='save changes']")
    public static WebElement saveChanges;
    @FindBy(xpath = "//span[text()='rate']")
    public static WebElement rate;
    @FindBy(xpath = "//span[text()='accept']")
    public static WebElement accept;
    @FindBy(xpath = "//span[text()='send email for eSignature']")
    public static WebElement sendEmailSignature;
    @FindBy(xpath = "//span[text()='create required forms']")
    public static WebElement createRequiredForms;

    // TODO REFACTOR CORE UPGRADE
    @FindBy(xpath = "//a[contains(text(),'>>> select agency ')]")
    public static WebElement selectAgency;
    @FindBy(xpath = "//a[contains(text(),'cancel')]")
    public static WebElement cancel;
    @FindBy(xpath = "//a[contains(text(),'>>next')]")
    public static WebElement next2;
    @FindBy(xpath = "//a[contains(text(),'>>confirm')]")
    public static WebElement confirm;
    @FindBy(xpath = "//a[contains(text(),'order property details')]")
    public static WebElement orderPropertyDetails;
    @FindBy(xpath = "//a[contains(text(),'>>> request issue')]")
    public static WebElement requestIssue;
    @FindBy(xpath = "//a[contains(text(),'bind')]")
    public static WebElement bind;
    @FindBy(xpath = "//a[contains(text(),'>>> request bind')]")
    public static WebElement requestBind;
    @FindBy(xpath = "#messages>li")
    public static WebElement messages;
    // TODO REFACTOR CORE UPGRADE

    // Footer component elements - END

    /**
     * Use this method to click a WebElement
     * @param element WebElement
     */
    public void clickElement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            try{
                Actions actions = new Actions(driver);
                actions.moveToElement(element);
                actions.build().perform();
                element.click();
            }
            catch(StaleElementReferenceException e) {
                element.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Types text into WebElement
     * @param element WebElement
     * @param text Text
     */
    public void typeText(WebElement element, String text) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
            element.sendKeys(text);
            element.sendKeys(Keys.ENTER);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Types keys into WebElement
     * @param element WebElement
     * @param keys Keys
     */
    public void typeKeys(WebElement element, Keys keys) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.sendKeys(keys);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAttributeValue(WebElement element, String attribute, String value){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",element,attribute,value);
    }
    public void jsSetValue(WebElement element, String value){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value(arguments[1]);",element,value);
        //TODO refactor function
    }

}