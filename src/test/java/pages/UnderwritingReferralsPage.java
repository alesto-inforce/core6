package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.ReferralsComponent;
import java.util.List;

public class UnderwritingReferralsPage extends CommonComponentsAndActions {
    static WebDriver driver;
    ReferralsComponent referralsComponent;

    public UnderwritingReferralsPage(WebDriver driver){
        super(driver);
        UnderwritingReferralsPage.driver = driver;
        referralsComponent = new ReferralsComponent(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='OK']")
    WebElement popUpOK;

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void acceptReferrals(String note) throws InterruptedException {
        referralsComponent.fillUnderwriterNotes(note);
        referralsComponent.setAllOverriddenYes();
    }
    public void acceptReferralsPopUp(){
        clickElement(popUpOK);
    }
    // TODO REFACTOR
    public boolean validateReferral(String referral){
        List<WebElement> referrals = referralsComponent.getReferrals();
        boolean validated = false;
        switch (referral){
            case "4PointInspection" : {
                for (WebElement webElement : referrals) {
                    if (webElement.getText().equals("This risk requires a 4-point inspection to confirm eiligibility. Please submit the 4-point inspection to your underwriter for review.")) {
                        validated = true;
                        break;
                    }
                }
            }
            break;
            case "LowRiseCondo" : {
                for (WebElement webElement : referrals) {
                    if (webElement.getText().equals("Low rise Condo")) {
                        validated = true;

                        break;
                    }
                }
            }
            break;
        }
        return validated;
    }
    public boolean verifyThatReferralsHaveBeenAccepted(){
        return CommonComponentsAndActions.messages.getText().equals("A task indicating underwriting acceptance of this quote has been sent to the Advisor/Servicer.");
    }
}