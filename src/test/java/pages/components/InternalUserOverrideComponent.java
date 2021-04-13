package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalUserOverrideComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public InternalUserOverrideComponent(WebDriver driver) {
        super(driver);
        InternalUserOverrideComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Ability to apply $0 Earthquake Deductible (CA Only)']/../../../../div//label[text()='Yes']/..//input")
    WebElement abilityToApplyEarthquakeDeductibleYes;
    @FindBy(xpath = "//div[text()='Ability to apply $0 Earthquake Deductible (CA Only)']/../../../../div//label[text()='No']/..//input")
    WebElement abilityToApplyEarthquakeDeductibleNo;
    @FindBy(xpath = "//div[text()='BCEG']/../../../../div//label[text()='Yes']/..//input")
    WebElement BCEGYes;
    @FindBy(xpath = "//div[text()='BCEG']/../../../../div//label[text()='No']/..//input")
    WebElement BCEGNo;
    @FindBy(xpath = "//div[text()='Census Tract']/../../../../div//label[text()='Yes']/..//input")
    WebElement censusTractYes;
    @FindBy(xpath = "//div[text()='Census Tract']/../../../../div//label[text()='Yes']/..//input")
    WebElement censusTractNo;
    @FindBy(xpath = "//div[text()='DTC']/../../../../div//label[text()='Yes']/..//input")
    WebElement DTCYes;
    @FindBy(xpath = "//div[text()='DTC']/../../../../div//label[text()='No']/..//input")
    WebElement DTCNo;
    @FindBy(xpath = "//div[text()='Earthquake - MMI and Soil Grade fields']/../../../../div//label[text()='Yes']/..//input")
    WebElement earthquakeMMIAndSoilGradeFieldsYes;
    @FindBy(xpath = "//div[text()='Earthquake - MMI and Soil Grade fields']/../../../../div//label[text()='No']/..//input")
    WebElement earthquakeMMIAndSoilGradeFieldsNo;
    @FindBy(xpath = "//div[text()='Flood Zone']/../../../../div//label[text()='Yes']/..//input")
    WebElement FloodZoneYes;
    @FindBy(xpath = "//div[text()='Flood Zone']/../../../../div//label[text()='No']/..//input")
    WebElement FloodZoneNo;
    @FindBy(xpath = "//div[text()='Hold Endorsement']/../../../../div//label[text()='Yes']/..//input")
    WebElement holdEndorsementYes;
    @FindBy(xpath = "//div[text()='Hold Endorsement']/../../../../div//label[text()='No']/..//input")
    WebElement holdEndorsementNo;
    @FindBy(xpath = "//div[text()='Large Account Indicator']/../../../../div//label[text()='Yes']/..//input")
    WebElement largeAccountIndicatorYes;
    @FindBy(xpath = "//div[text()='Large Account Indicator']/../../../../div//label[text()='No']/..//input")
    WebElement largeAccountIndicatorNo;
    @FindBy(xpath = "//div[text()='NCF (view)']/../../../../div//label[text()='Yes']/..//input")
    WebElement NFCYes;
    @FindBy(xpath = "//div[text()='NCF (view)']/../../../../div//label[text()='No']/..//input")
    WebElement NFCNo;
    @FindBy(xpath = "//div[text()='Override membership date']/../../../../div//label[text()='Yes']/..//input")
    WebElement OverrideMembershipDateYes;
    @FindBy(xpath = "//div[text()='Override membership date']/../../../../div//label[text()='No']/..//input")
    WebElement OverrideMembershipDateNo;
    @FindBy(xpath = "//div[text()='PC Code']/../../../../div//label[text()='Yes']/..//input")
    WebElement PCCodeYes;
    @FindBy(xpath = "//div[text()='PC Code']/../../../../div//label[text()='No']/..//input")
    WebElement PCCodeNo;
    @FindBy(xpath = "//div[text()='Repull Insurance Score']/../../../../div//label[text()='Yes']/..//input")
    WebElement repullInsuranceScoreYes;
    @FindBy(xpath = "//div[text()='Repull Insurance Score']/../../../../div//label[text()='No']/..//input")
    WebElement repullInsuranceScoreNo;
    @FindBy(xpath = "//div[text()='USAA Member ID']/../../../../div//label[text()='Yes']/..//input")
    WebElement USAAMemberIdYes;
    @FindBy(xpath = "//div[text()='USAA Member ID']/../../../../div//label[text()='No']/..//input")
    WebElement USAAMemberIdNo;
    @FindBy(xpath = "//div[text()='Waive Appraisal']/../../../../div//label[text()='Yes']/..//input")
    WebElement waiveAppraisalYes;
    @FindBy(xpath = "//div[text()='Waive Appraisal']/../../../../div//label[text()='No']/..//input")
    WebElement waiveAppraisalNo;
    @FindBy(xpath = "//div[text()='Wildfire - Wildfire Hazard Severity and Wildfire Threat fields']/../../../../div//label[text()='Yes']/..//input")
    WebElement wildfireHazardSeverityAndThreatYes;
    @FindBy(xpath = "//div[text()='Wildfire - Wildfire Hazard Severity and Wildfire Threat fields']/../../../../div//label[text()='No']/..//input")
    WebElement wildfireHazardSeverityAndThreatNo;
    @FindBy(xpath = "//div[text()='Moratorium Referral']/../../../../div//label[text()='Yes']/..//input")
    WebElement moratoriumReferralYes;
    @FindBy(xpath = "//div[text()='Moratorium Referral']/../../../../div//label[text()='No']/..//input")
    WebElement moratoriumReferralNo;
    @FindBy(xpath = "//div[text()='High Profile Referral']/../../../../div//label[text()='Yes']/..//input")
    WebElement highProfileReferralYes;
    @FindBy(xpath = "//div[text()='High Profile Referral']/../../../../div//label[text()='No']/..//input")
    WebElement highProfileReferralNo;
    @FindBy(xpath = "//div[text()='Access to bind/process a transaction']/../../../../div//label[text()='Yes']/..//input")
    WebElement accessToBindProcessATransactionYes;
    @FindBy(xpath = "//div[text()='Access to bind/process a transaction']/../../../../div//label[text()='No']/..//input")
    WebElement accessToBindProcessATransactionNo;

    public void setAbilityToApplyEarthquakeDeductible(String choose) throws Throwable {
        choose(abilityToApplyEarthquakeDeductibleYes, abilityToApplyEarthquakeDeductibleNo, choose);
    }

    public void setBCEG(String choose) throws Throwable {
        choose(BCEGYes, BCEGNo, choose);
    }

    public void setCensusTract(String choose) throws Throwable {
        choose(censusTractYes, censusTractNo, choose);
    }

    public void setDTC(String choose) throws Throwable {
        choose(DTCYes, DTCNo, choose);
    }

    public void setEarthquakeMMIAndSoilGradeFields(String choose) throws Throwable {
        choose(earthquakeMMIAndSoilGradeFieldsYes, earthquakeMMIAndSoilGradeFieldsNo, choose);
    }

    public void setFloodZone(String choose) throws Throwable {
        choose(FloodZoneYes, FloodZoneNo, choose);
    }

    public void setHoldEndorsement(String choose) throws Throwable {
        choose(holdEndorsementYes, holdEndorsementNo, choose);
    }

    public void setLargeAccountIndicator(String choose) throws Throwable {
        choose(largeAccountIndicatorYes, largeAccountIndicatorNo, choose);
    }

    public void setNFC(String choose) throws Throwable {
        choose(NFCYes, NFCNo, choose);
    }

    public void setOverrideMembershipDate(String choose) throws Throwable {
        choose(OverrideMembershipDateYes, OverrideMembershipDateNo, choose);
    }

    public void setPCCode(String choose) throws Throwable {
        choose(PCCodeYes, PCCodeNo, choose);
    }

    public void setRepullInsuranceScore(String choose) throws Throwable {
        choose(repullInsuranceScoreYes, repullInsuranceScoreNo, choose);
    }

    public void setUSAAMemberId(String choose) throws Throwable {
        choose(USAAMemberIdYes, USAAMemberIdNo, choose);
    }

    public void setWaiveAppraisal(String choose) throws Throwable {
        choose(waiveAppraisalYes, waiveAppraisalNo, choose);
    }

    public void setWildfireHazardSeverityAndThreat(String choose) throws Throwable {
        choose(wildfireHazardSeverityAndThreatYes, wildfireHazardSeverityAndThreatNo, choose);
    }

    public void setMoratoriumReferral(String choose) throws Throwable {
        choose(moratoriumReferralYes, moratoriumReferralNo, choose);
    }

    public void setHighProfileReferral(String choose) throws Throwable {
        choose(highProfileReferralYes, highProfileReferralNo, choose);
    }

    public void setAccessToBindProcessATransaction(String choose) throws Throwable {
        choose(accessToBindProcessATransactionYes, accessToBindProcessATransactionNo, choose);
    }
}
