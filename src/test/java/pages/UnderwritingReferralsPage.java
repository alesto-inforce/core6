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

    public void acceptReferrals(String note) throws InterruptedException {
        referralsComponent.fillUnderwriterNotes(note);
        referralsComponent.setAllOverriddenYes();
    }
    public void acceptUnacceptedReferrals(String note) throws InterruptedException {
        referralsComponent.acceptUnacceptedReferral(note);
    }
    public void acceptReferralsPopUp(){
        clickElement(popUpOK);
    }
}