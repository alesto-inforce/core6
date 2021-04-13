package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.AllPoliciesComponent;
import pages.components.AllQuotesComponent;
import pages.components.CommonComponentsAndActions;

public class CustomerSummaryPage extends CommonComponentsAndActions {
    static WebDriver driver;
    AllQuotesComponent allQuotesComponent;
    AllPoliciesComponent allPoliciesComponent;

    public CustomerSummaryPage(WebDriver driver) {
        super(driver);
        CustomerSummaryPage.driver = driver;
        allQuotesComponent = new AllQuotesComponent(driver);
        allPoliciesComponent = new AllPoliciesComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void navigateToQuote() throws Throwable {
        allQuotesComponent.navigateToQuote();
    }

    public String getPolicyID(){
        return allPoliciesComponent.getPolicyID();
    }
}