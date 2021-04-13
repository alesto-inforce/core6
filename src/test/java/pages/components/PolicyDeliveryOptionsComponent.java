package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyDeliveryOptionsComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public PolicyDeliveryOptionsComponent(WebDriver driver){
        super(driver);
        PolicyDeliveryOptionsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'opt out')]/../../../../div[1]//label[text()='No']/..//input")
    public static WebElement optOutNo;
    @FindBy(xpath = "//div[contains(text(),'opt out')]/../../../../div[1]//label[text()='Yes']/..//input")
    public static WebElement optOutYes;
    @FindBy(xpath = "//label[contains(text(),'Print and Mail by PURE')]/..//input")
    public static WebElement printByPure;
    @FindBy(xpath = "//label[contains(text(),'Agency Email delivery (New Business only).')]/..//input")
    public static WebElement agencyDelivery;

    public void optOutElectronicDelivery(String optOut) throws Throwable {
        if (optOut.equalsIgnoreCase("Yes")){
            clickElement(optOutYes);
        } else {
            clickElement(optOutNo);
        }
    }

    public void howToDeliverDocs(String deliveryOption) throws Throwable {
        if(deliveryOption.equalsIgnoreCase("PrintByPure")){
            clickElement(printByPure);
        } else {
            clickElement(agencyDelivery);
        }
    }
}