package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.PolicyDeliveryOptionsComponent;
import pages.components.PrintAndMailDeliveryPreferenceComponent;

import java.util.Map;

public class PolicyDeliveryPage extends CommonComponentsAndActions {
    static WebDriver driver;
    PolicyDeliveryOptionsComponent policyDeliveryOptionsComponent;
    PrintAndMailDeliveryPreferenceComponent printAndMailDeliveryPreferenceComponent;

    public PolicyDeliveryPage(WebDriver driver){
        super(driver);
        PolicyDeliveryPage.driver = driver;
        policyDeliveryOptionsComponent = new PolicyDeliveryOptionsComponent(driver);
        printAndMailDeliveryPreferenceComponent = new PrintAndMailDeliveryPreferenceComponent(driver);
        PageFactory.initElements(driver,this);
    }
    public void  fillPolicyDeliveryOptions(Map<String,String> data) throws Throwable {
        policyDeliveryOptionsComponent.optOutElectronicDelivery(data.get("OptOutOfDelivery"));
        policyDeliveryOptionsComponent.howToDeliverDocs(data.get("DeliveryOptions"));
    }
    public void fillPrintAndDeliveryOptions() throws Throwable {
        printAndMailDeliveryPreferenceComponent.fillPrintAndDeliveryOptions();
    }

}