package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.BillDeliveryOptionsComponent;
import pages.components.CommonComponentsAndActions;

public class BillingPreferancePage extends CommonComponentsAndActions {
    static WebDriver driver;
    BillDeliveryOptionsComponent billDeliveryOptionsComponent;

    public BillingPreferancePage(WebDriver driver){
        super(driver);
        BillingPreferancePage.driver = driver;
        billDeliveryOptionsComponent = new BillDeliveryOptionsComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void sendBillToMember(){
        billDeliveryOptionsComponent.sendBillToMember();
    }

}