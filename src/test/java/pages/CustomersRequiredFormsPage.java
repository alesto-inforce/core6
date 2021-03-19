package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.MemberApplicationAndAgreementsComponent;
import pages.components.ProductSpecificFormsComponent;
import pages.components.SignaturePreferenceComponent;

public class CustomersRequiredFormsPage extends CommonComponentsAndActions {
    static WebDriver driver;
//    SignaturePreferenceComponent signaturePreferenceComponent;
//    MemberApplicationAndAgreementsComponent memberApplicationAndAgreementsComponent;
//    ProductSpecificFormsComponent productSpecificFormsComponent;

    public CustomersRequiredFormsPage(WebDriver driver) {
        super(driver);
        CustomersRequiredFormsPage.driver = driver;
//        signaturePreferenceComponent = new SignaturePreferenceComponent(driver);
//        memberApplicationAndAgreementsComponent = new MemberApplicationAndAgreementsComponent(driver);
//        productSpecificFormsComponent = new ProductSpecificFormsComponent(driver);
        PageFactory.initElements(driver,this);
    }

//    public void fillOutSignatureForms(String docPath) {
//        signaturePreferenceComponent.electronicallySignDocumentsNo();
//        //emberApplicationAndAgreementsComponent.fillOutMemberApplicationAgreement(docPath);
//        productSpecificFormsComponent.setGenerateManualSign();
//    }
}