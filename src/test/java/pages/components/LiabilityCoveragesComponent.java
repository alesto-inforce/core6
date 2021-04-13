package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class LiabilityCoveragesComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public LiabilityCoveragesComponent(WebDriver driver){
        super(driver);
        LiabilityCoveragesComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Personal Liability Limit']/../../../..//input")
    WebElement liabilityCoverageLimit;
    @FindBy(xpath = "//div[text()='Medical Payments Limit']/../../../..//input")
    WebElement liabilityCoverageLimit2;

    public void selectLiabilityCoveragesLimit(Map<String,String> data) throws Throwable {
        typeText(liabilityCoverageLimit,formatNum(data.get("Personal_Liability_Limit")));
    }
    public void medicalPaymentLimit(String value) throws Throwable {
        typeText(liabilityCoverageLimit2,value);
    }

}