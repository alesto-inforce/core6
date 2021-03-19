package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class BillDeliveryOptionsComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public BillDeliveryOptionsComponent(WebDriver driver) {
        super(driver);
        BillDeliveryOptionsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label[contains(text(),'Send Bill to Member')]/..//input")
    WebElement sendBillToMember;

    public void sendBillToMember(){
        clickElement(sendBillToMember);
    }

}