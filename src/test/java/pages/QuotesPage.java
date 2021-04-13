package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

import java.util.List;
import java.util.Map;

public class QuotesPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public QuotesPage(WebDriver driver){
        super(driver);
        QuotesPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='new quote']")
    WebElement newQuote;
    @FindBy(xpath = "//span[text()='>>> select agency ']")
    WebElement selectAgency;
    @FindBy(xpath = "//span[text()='Broker #']")
    WebElement brokerColumnHeader;
    @FindBy(xpath = "//span[text()='Broker #']/../../../../div[2]")
    WebElement brokerColumnFilterDropdown;
    @FindBy(xpath = "//a[@aria-label='Filters submenu']")
    WebElement filters;
    @FindBy(xpath = "//input[@placeholder='Enter Number...']")
    List<WebElement> filterFields;

    public void newQuote() throws Throwable {
        clickElement(newQuote);
    }

    public void searchAndSelectAgencyAdvanced(String env) throws Throwable {
        String brokerID = "";
        String agency = "";

        switch (env){
            case "QA": {
                brokerID = "751690500";
                agency = "Ford Insurance";
            }
            break;
            case "STG": {
                brokerID = "747290200";
                agency = "Underc0de";
            }
            break;
            case "PROD": {
                brokerID = "";
                agency = "";
            }
            break;
        }

        Actions action = new Actions(driver);
        action.moveToElement(brokerColumnHeader).click(brokerColumnFilterDropdown).perform();
        clickElement(filters);

        action.moveToElement(filterFields.get(0)).sendKeys(filterFields.get(0),brokerID).perform();
        clickElement(driver.findElement(By.xpath("//div[text()='"+agency+"']/../../td[1]//span")));

        clickElement(selectAgency);
    }
}