package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.InspectionInformationComponent;

public class CustomerPreBindFormsPage extends CommonComponentsAndActions {
    static WebDriver driver;
    InspectionInformationComponent inspectionInformationComponent;

    public CustomerPreBindFormsPage(WebDriver driver) {
        super(driver);
        CustomerPreBindFormsPage.driver = driver;
        inspectionInformationComponent = new InspectionInformationComponent(driver);
        PageFactory.initElements(driver,this);
    }

}