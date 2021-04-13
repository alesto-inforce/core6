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
    WorkersCompensationCoverageComponent workersCompensationCoverageComponent;
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
        workersCompensationCoverageComponent    = new WorkersCompensationCoverageComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillOutHomeownersPolicyCoverPage(Map<String,String> data) throws Throwable {
        if(data.get("State").equalsIgnoreCase("NJ")){
            riskAddressesComponent.riskAddressDetails(data);
            Thread.sleep(3000);
            liabilityCoveragesComponent.selectLiabilityCoveragesLimit(data);
            //TODO add cyber
            workersCompensationCoverageComponent.fillWorkerCoverageDetails(data);
        }else{
            riskAddressesComponent.riskAddressDetails(data);
            Thread.sleep(3000);
            liabilityCoveragesComponent.selectLiabilityCoveragesLimit(data);
            //TODO add cyber
        }
    }

    public void addAdditionalLocation(Map<String,String> data) throws Throwable {
        riskAddressesComponent.addAndFillInNthAddress(data);
    }

}