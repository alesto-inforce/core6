package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.*;

import java.util.Map;

public class HomeownersPolicyCoverPage extends CommonComponentsAndActions {

    static WebDriver driver;

    AccountsColumnComponent accountsColumnComponent;
    PolicyInformationComponent policyInformationComponent;
    InsuranceInformationComponent insuranceInformationComponent;
    CreditScoreTiersComponent creditScoreTiersComponent;
    NamedInsuredComponent namedInsuredComponent;
    RiskAddressesComponent riskAddressesComponent;
    LiabilityCoveragesComponent liabilityCoveragesComponent;
    PersonalCyberFraudProtectionComponent personalCyberFraudProtectionComponent;

    public HomeownersPolicyCoverPage(WebDriver driver) {
        super(driver);
        HomeownersPolicyCoverPage.driver = driver;
        accountsColumnComponent                 = new AccountsColumnComponent(driver);
        policyInformationComponent              = new PolicyInformationComponent(driver);
        insuranceInformationComponent           = new InsuranceInformationComponent(driver);
        creditScoreTiersComponent               = new CreditScoreTiersComponent(driver);
        namedInsuredComponent                   = new NamedInsuredComponent(driver);
        riskAddressesComponent                  = new RiskAddressesComponent(driver);
        liabilityCoveragesComponent             = new LiabilityCoveragesComponent(driver);
        personalCyberFraudProtectionComponent   = new PersonalCyberFraudProtectionComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillOutHomeownersPolicyCoverPage(Map<String,String> data) throws InterruptedException {
        riskAddressesComponent.riskAddressDetails(data);
        Thread.sleep(3000);
        liabilityCoveragesComponent.selectLiabilityCoveragesLimit(data);
    }
    // Use QuoteCreation.xlsx/AdditionalLocations
    public void addAdditionalLocation(Map<String,String> data) {
        riskAddressesComponent.addAndFillInNthAddress(data);
    }

}