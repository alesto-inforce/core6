package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalCyberFraudProtectionComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public PersonalCyberFraudProtectionComponent(WebDriver driver){
        super(driver);
        PersonalCyberFraudProtectionComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Fraud and Cyber Defense Coverage ']/../../../../../../div//label[text()='Yes']/..//input")
    WebElement defenceCoverageYes;
    @FindBy(xpath = "//div[text()='Fraud and Cyber Defense Coverage ']/../../../../../../div//label[text()='No']/..//input")
    WebElement defenceCoverageNo;
    @FindBy(xpath = "//div[text()='Limit']/../../../..//input")
    WebElement limit;
    @FindBy(xpath = "//div[text()='Deductible']/../../../..//input")
    WebElement deductible;

    public void setDefenceCoverageYes() throws Throwable {
        clickElement(defenceCoverageYes);
    }
    public void setDefenceCoverageNo() throws Throwable {
        clickElement(defenceCoverageNo);
    }
    public void setLimit(String value) throws Throwable {
        typeText(limit,value);

    }
    public void deductible(String value) throws Throwable {
        typeText(deductible,value);
    }
}
