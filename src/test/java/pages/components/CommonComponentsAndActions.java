package pages.components;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.text.DecimalFormat;

public class CommonComponentsAndActions {

    static WebDriver driver;
    static final int WAIT_TIME = Integer.parseInt(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("WAIT_TIME"));

    public CommonComponentsAndActions(WebDriver driver) {
        CommonComponentsAndActions.driver = driver;
        PageFactory.initElements(driver, this);
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
    @FindBy(xpath = "//span[contains(text(),'Customer: ')]/../../..")
    public static WebElement customer;
    // Header component elements - END

    // Footer component elements - START
    @FindBy(xpath = "//span[contains(text(),'>>> next')]")
    public static WebElement next;
    @FindBy(xpath = "//span[contains(text(),'>>next')]")
    public static WebElement next2;
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
    @FindBy(xpath = "//span[contains(text(),'>>> request issue')]")
    public static WebElement requestIssue;
    @FindBy(xpath = "//span[contains(text(),'bind')]")
    public static WebElement bind;
    @FindBy(xpath = "//span[contains(text(),'>>confirm')]")
    public static WebElement confirm2;
    @FindBy(xpath = "//span[contains(text(),'>>> request bind')]")
    public static WebElement requestBind;
    @FindBy(xpath = "//span[contains(text(),'new quote')]")
    public static WebElement newQuote;
    // Footer component elements - END

    /**
     * Scrolls to a WebElement with JS Executor
     *
     * @param element WebElement
     */
    public void scrollToWebElement(WebElement element) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
        } catch (Exception e) {
            System.out.println("LOG - Unable to scroll to " + element.getTagName() + " element");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    /**
     * Wait for mask
     */
    public void waitForMask() {
        ExpectedCondition<Boolean> xMasked = driver -> !((Boolean) driver.findElement(By.tagName("body")).getAttribute("class").contains("x-masked"));
        new WebDriverWait(driver, WAIT_TIME).until(xMasked);
    }

    /**
     * Wait for the Pre Loading Mask to disappear
     */
    public void waitForPreLoadingMask() throws InterruptedException {
        pause(200);
        if (driver.findElement(By.xpath("div[text='processing']")).isDisplayed()) {
            ExpectedCondition<Boolean> processing = driver -> !(driver.findElement(By.xpath("//div[text()='processing']")).isDisplayed());
            new WebDriverWait(driver, WAIT_TIME).until(processing);
        }
        ExpectedCondition<Boolean> xMasked = driver -> !((Boolean) driver.findElement(By.tagName("body")).getAttribute("class").contains("x-masked"));
        new WebDriverWait(driver, WAIT_TIME).until(xMasked);
        pause(200);
    }

    /**
     * Thread.sleeps
     *
     * @param ms milliseconds
     * @throws InterruptedException exception
     */
    public void pause(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    /**
     * Use this method to click a WebElement
     *
     * @param element WebElement
     */
    public void clickElement(WebElement element) throws Throwable {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            scrollToWebElement(element);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            //waitForMask();
            //waitForPreLoadingMask();
            try {
                element.click();
                clickElementWithOffset(element, 30, 30);
            } catch (StaleElementReferenceException e) {
                System.out.println("LOG - Got a stale " + element.getTagName() + " element, retrying click !");
                element.click();
                clickElementWithOffset(element, 30, 30);
            }
            waitForMask();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
        }
    }

    /**
     * Types text into WebElement
     *
     * @param element WebElement
     * @param text    Text
     */
    public void typeText(WebElement element, String text) throws Throwable {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            scrollToWebElement(element);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            //waitForMask();
            //waitForPreLoadingMask();
            clickElement(element);
            element.clear();
            element.sendKeys(text);
            element.sendKeys(Keys.ENTER);
            element.sendKeys(Keys.TAB);
            //waitForPreLoadingMask();
            clickElementWithOffset(element, 30, 30);
        } catch (Exception e) {
            System.out.println("LOG - Tried to type " + text + " to " + element.getTagName() + " element");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    /**
     * Returns text from an element
     *
     * @param element
     * @return
     */
    public String getText(WebElement element) {
        String text = "";
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            text = element.getText().trim();
        } catch (Exception e) {
            System.out.println("LOG - Tried to get text from " + element.getTagName() + " element");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return text;
    }

    /**
     * Given a Web element and a desired attribute it will set the attribute value
     *
     * @param element
     * @param attribute
     * @param value
     */
    public void setAttributeValue(WebElement element, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attribute, value);
        } catch (Exception e) {
            System.out.println("LOG - Tried to set " + value + " value to " + attribute + " attribute to " + element.getTagName() + " element");
        }
    }

    /**
     * Chooses an element to click based on yes or no parameter
     *
     * @param elementYes element to click if yes
     * @param elementNo  element to click if no
     * @param yesOrNo    yes or no
     */
    public void choose(WebElement elementYes, WebElement elementNo, String yesOrNo) throws Throwable {
        if (yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("1")) {
            clickElement(elementYes);
        } else {
            clickElement(elementNo);
        }
    }

    /**
     * Given true or false it will select a checkbox or deselect it
     *
     * @param element
     * @param checked
     */
    public void checkCheckbox(WebElement element, String checked) throws Throwable {
        if (checked.equalsIgnoreCase("Yes") || checked.equalsIgnoreCase("1")) {
            if (!element.isSelected()) {
                clickElement(element);
            }
        } else {
            if (element.isSelected()) {
                clickElement(element);
            }
        }
    }

    /**
     * Clicks a web element with a given offset
     *
     * @param element WebElement
     * @param xOffset X offset
     * @param yOffset Y offset
     */
    public void clickElementWithOffset(WebElement element, int xOffset, int yOffset) {
        Actions actions = new Actions(driver);
        try {
            actions.moveToElement(element, xOffset, yOffset).build().perform();
        } catch (Exception e) {
            //System.out.println("LOG - Tried to click " + element.getTagName() + " element with offset " + xOffset + " " + yOffset);
            //e.printStackTrace();
        }
    }

    /**
     * Clicks an element with JS
     * @param element
     */
    public void clickElementJS(WebElement element){
        try {
            try {
                WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
                scrollToWebElement(element);
                wait.until(ExpectedConditions.visibilityOf(element));
                wait.until(ExpectedConditions.elementToBeClickable(element));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                //waitForMask();
            } catch (StaleElementReferenceException ex){
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            }
        }catch (Exception e){
            System.out.println("LOG - Tried to click "+element.getTagName()+" element with JS");
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    /**
     * Accepts an alert
     */
    public void acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("LOG - Tried to accept an alert");
            System.out.println(e.getMessage());
            e.getStackTrace().toString();
        }
    }

    /**
     * Formats num to match #,###.00 pattern
     * @param num
     * @return
     */
    public String formatNum(String num){
        double doubleNum = Double.parseDouble(num);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(doubleNum).replace(".00","");
    }
}