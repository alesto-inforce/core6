package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LossClaimHistoryComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public LossClaimHistoryComponent(WebDriver driver) {
        super(driver);
        LossClaimHistoryComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Any prior losses on this location over the past five years?']/../../../..//label[text()='Yes']/..//input")
    WebElement priorLossesYes;
    @FindBy(xpath = "//div[text()='Any prior losses on this location over the past five years?']/../../../..//label[text()='No']/..//input")
    WebElement priorLossesNo;

    public void setPriorLossesNo(){
        clickElement(priorLossesNo);
    }

}