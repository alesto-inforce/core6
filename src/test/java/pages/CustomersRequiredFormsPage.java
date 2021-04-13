package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.MemberApplicationAndAgreementsComponent;
import pages.components.ProductSpecificFormsComponent;
import pages.components.SignaturePreferenceComponent;

public class CustomersRequiredFormsPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public CustomersRequiredFormsPage(WebDriver driver) {
        super(driver);
        CustomersRequiredFormsPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToCustomer() throws Throwable {
        clickElement(CommonComponentsAndActions.customer);
    }
}