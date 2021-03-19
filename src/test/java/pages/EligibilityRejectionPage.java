package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;

import java.util.List;

public class EligibilityRejectionPage extends CommonComponentsAndActions {
    static WebDriver driver;

    public EligibilityRejectionPage(WebDriver driver){
        super(driver);
        EligibilityRejectionPage.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Reason']/../../../../../div//td[3]/div")
    List<WebElement> rejections;

    public List<WebElement> getRejections() {
        return rejections;
    }

    public boolean validateRejection(String rejectionReason){
        List<WebElement> rejects = getRejections();
        boolean validated = false;
        switch (rejectionReason){
            case "LowRiseCondo" : {
                for (WebElement webElement : rejects) {
                    if (webElement.getText().equals("Low Rise Condos/Coops on barrier islands are not eligible.")) {
                        validated = true;
                        break;
                    } else {
                        System.out.println(webElement.getText());
                    }
                }
            }
            break;
            case "4PointInspection" : {
                for (WebElement webElement : rejects) {
                    if (webElement.getText().equals("This risk requires a 4-point inspection to confirm eligibility. Please submit the 4-point inspection to your underwriter for review.")) {
                        validated = true;
                        break;
                    }else {
                        System.out.println(webElement.getText());
                    }
                }
            }
            break;
        }
        return validated;
    }//TODO refactor add rejection reasons excel file
}