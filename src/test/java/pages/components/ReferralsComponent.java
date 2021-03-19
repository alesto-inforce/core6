package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReferralsComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public ReferralsComponent(WebDriver driver) {
        super(driver);
        ReferralsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="//div[text()='referrals']/../../../../../..//table//td[4]")
    List<WebElement> underwriterNotes;
    @FindBy(xpath ="//div[text()='referrals']/../../../../../..//table//td[4]//textarea")
    List<WebElement> underwriterNotesDiv;
    @FindBy(xpath ="//div[text()='referrals']/../../../../../..//table//td[5]/div")
    List<WebElement> overridden;
    @FindBy(xpath ="//div[text()='referrals']/../../../../../..//table//td[5]/div[2]//*")
    List<WebElement> overriddenDiv;
    @FindBy(xpath = "//div[text()='referrals']/../../../../../..//table//td[2]/div")
    List<WebElement> referralAlerts;
    @FindBy(xpath = "//li[text()='Yes']")
    WebElement yesSelect;

    public void fillUnderwriterNotes(String note) throws InterruptedException {
        for (WebElement underwriterNote : underwriterNotes) {
            clickElement(underwriterNote);
            Thread.sleep(100);
            typeText(underwriterNotesDiv.get(0),note);
            typeKeys(underwriterNote,Keys.TAB);
        }
    }
    public void setAllOverriddenYes() throws InterruptedException {
        for (WebElement webElement : overridden) {
            clickElement(webElement);
            Thread.sleep(1000);
            clickElement(yesSelect);
        }
    }
    public List<WebElement> getReferrals() {
        return referralAlerts;
    }
}