package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.InspectionInformationComponent;

import java.util.Map;

public class InspectionPage extends CommonComponentsAndActions {
    static WebDriver driver;
    InspectionInformationComponent inspectionInformationComponent;

    public InspectionPage(WebDriver driver) {
        super(driver);
        InspectionPage.driver = driver;
        inspectionInformationComponent = new InspectionInformationComponent(driver);
        PageFactory.initElements(driver,this);
    }
    public void fillOutInspectionDetails(Map<String,String> data) throws Throwable {
        inspectionInformationComponent.fillOutInspectionInformation(data.get("InspectionName"),data.get("InspectionDate"));
    }

}