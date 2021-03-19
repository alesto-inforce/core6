package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.AdditionalLocationBindingInformationComponent;
import pages.components.AppraisalInformationComponent;
import pages.components.CommonComponentsAndActions;

public class BindingInformationPage extends CommonComponentsAndActions {
    static WebDriver driver;
    AdditionalLocationBindingInformationComponent additionalLocationBindingInformationComponent;
    AppraisalInformationComponent appraisalInformationComponent;

    public BindingInformationPage(WebDriver driver) {
        super(driver);
        BindingInformationPage.driver = driver;
        additionalLocationBindingInformationComponent = new AdditionalLocationBindingInformationComponent(driver);
        appraisalInformationComponent = new AppraisalInformationComponent(driver);
        PageFactory.initElements(driver,this);
    }
    public void fillOutBindingInformation(){
        additionalLocationBindingInformationComponent.fillOutAdditionalLocationBindingInformationAllNo();
        appraisalInformationComponent.fillOutAppraisalInformation("Test Name","1231231231","","");
        //TODO add to testdata refactor
    }
}