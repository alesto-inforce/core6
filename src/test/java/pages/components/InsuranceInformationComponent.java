package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceInformationComponent {

    static WebDriver driver;

    public InsuranceInformationComponent(WebDriver driver){
        InsuranceInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//label//div[text()='Current Homeowners Insurance Carrier']/../../../..//input")
    WebElement currentHomeownersInsuranceCarrier;

    @FindBy(xpath = "//label//div[text()='Current Premium']/../../../..//input")
    WebElement currentPremium;

    @FindBy(xpath = "//label//div[text()='Insurance Score Tier']/../../../..//input")
    WebElement insuranceScoreTier;

    @FindBy(xpath = "//label//div[text()='Most Recent Insurance Score Tier']/../../../..//input")
    WebElement mostRecentScoreTier;

    @FindBy(xpath = "//label//div[text()='Insurance Score for Rating']/../../../..//input")
    WebElement insuranceScoreForRating;

    @FindBy(xpath = "//label//div[text()='Most Recent Insurance Score']/../../../..//input")
    WebElement mostRecentInsuranceScore;

    public void setCurrentHomeownersInsuranceCarrier(String CHICarrier){
        currentHomeownersInsuranceCarrier.sendKeys(CHICarrier);
    }
    public void setCurrentPremium(String CPremium){
        currentPremium.sendKeys(CPremium);
    }
    public void setInsuranceScoreTier(String ISTier){
        insuranceScoreTier.sendKeys(ISTier);
    }
    public void setMostRecentScoreTier(String MRSTier){
        mostRecentScoreTier.sendKeys(MRSTier);
    }
    public void setInsuranceScoreForRating(String ISFRating){
        insuranceScoreForRating.sendKeys(ISFRating);
    }
    public void setMostRecentInsuranceScore(String MRIScore){
        mostRecentInsuranceScore.sendKeys(MRIScore);
}
}