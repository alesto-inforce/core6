package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalUserAuthorityForUserComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public InternalUserAuthorityForUserComponent(WebDriver driver) {
        super(driver);
        InternalUserAuthorityForUserComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Total Insured Value: A+B+C+20%D']/../../../../div//input")
    WebElement totalInsuredValue;
    @FindBy(xpath = "//div[text()='Wildfire Score or Severity all other  Western States']/../../../../div//input")
    WebElement wildfireScoreOrSeverityAllOtherWesternStates;
    @FindBy(xpath = "//div[text()='Wildfire Score or Severity - California & Colorado']/../../../../div//input")
    WebElement wildfireScoreOrSeverityCaliforniaColorado;

    public void setTotalInsuredValue(String totalValue) throws Throwable {
        typeText(totalInsuredValue, totalValue);
    }

    public void setWildfireScoreOrSeverityAllOtherWesternStates(String wildScoreValue) throws Throwable {
        typeText(wildfireScoreOrSeverityAllOtherWesternStates, wildScoreValue);
    }

    public void setWildfireScoreOrSeverityCaliforniaColorado(String scoreOrSeverityValue) throws Throwable {
        typeText(wildfireScoreOrSeverityCaliforniaColorado, scoreOrSeverityValue);
    }
}
