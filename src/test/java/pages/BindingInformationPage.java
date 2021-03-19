package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.AdditionalLocationBindingInformationComponent;
import pages.components.AppraisalInformationComponent;
import pages.components.CommonComponentsAndActions;

import java.util.Map;

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
    public void fillOutBindingInformation(Map<String,String> data){
        additionalLocationBindingInformationComponent.fillOutAdditionalLocationBindingInformation(data);
        appraisalInformationComponent.fillOutAppraisalInformation(data);
    }
}