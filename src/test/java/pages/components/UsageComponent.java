package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsageComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public UsageComponent(WebDriver driver) {
        super(driver);
        UsageComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Is this a Primary Residence?']/../../../../div//label[text()='No']/..//input")
    WebElement isPrimaryResidenceNo;
    @FindBy(xpath = "//div[text()='Is this a Primary Residence?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isPrimaryResidenceYes;
    @FindBy(xpath = "//div[text()='Does PURE insure the primary home?']/../../../../div//label[text()='No']/..//input")
    WebElement doesPureInsureThePrimaryHomeNo;
    @FindBy(xpath = "//div[text()='Does PURE insure the primary home?']/../../../../div//label[text()='Yes']/..//input")
    WebElement doesPureInsureThePrimaryHomeYes;
    @FindBy(xpath = "//div[text()='Is the home unoccupied for 2 or more consecutive months?']/../../../../div//label[text()='No']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsNo;
    @FindBy(xpath = "//div[text()='Is the home unoccupied for 2 or more consecutive months?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsYes;
    @FindBy(xpath = "//div[text()='Is the residence or part of the residence rented to others?']/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceOrPartRentedNo;
    @FindBy(xpath = "//div[text()='Is the residence or part of the residence rented to others?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceOrPartRentedYes;
    @FindBy(xpath = "//div[text()='Is the residence a short-term rental?']/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceShortTermRentalNo;
    @FindBy(xpath = "//div[text()='Is the residence a short-term rental?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceShortTermRentalYes;
    @FindBy(xpath = "//div[text()='Is the residence vacant?']/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceVacantNo;
    @FindBy(xpath = "//div[text()='Is the residence vacant?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceVacantYes;
    @FindBy(xpath = "//div[text()='Is the residence under construction or renovation?']/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceUnderConstructionRenovationNo;
    @FindBy(xpath = "//div[text()='Is the residence under construction or renovation?']/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceUnderConstructionRenovationYes;
    @FindBy(xpath = "//div[text()='How long will the member be out of the residence due to the work?']/../../../../div//input")
    WebElement howLongMemberWillBeOutFromResidence;
    @FindBy(xpath = "//div[text()='What is the cost of the planned work?']/../../../../div//input")
    WebElement whatIsTheCostOfPlannedWork;

    public void setIsPrimaryResidenceYes() {
        clickElement(isPrimaryResidenceYes);
        clickElement(isTheHomeUnoccupiedMoreThanTwoMonthsNo);
        clickElement(isTheResidenceOrPartRentedNo);
        clickElement(isResidenceVacantNo);
        clickElement(isResidenceUnderConstructionRenovationNo);
    }

    public void setIsPrimaryResidenceNo() {
        clickElement(isPrimaryResidenceNo);
    }

    public void setDoesPureInsureThePrimaryHomeNo() {
        clickElement(doesPureInsureThePrimaryHomeNo);

    }

    public void setDoesPureInsureThePrimaryHomeYes() {
        clickElement(doesPureInsureThePrimaryHomeYes);

    }

    public void setIsTheHomeUnoccupiedMoreThanTwoMonthsNo() {
        clickElement(isTheHomeUnoccupiedMoreThanTwoMonthsNo);

    }

    public void setIsTheHomeUnoccupiedMoreThanTwoMonthsYes() {
        clickElement(isTheHomeUnoccupiedMoreThanTwoMonthsYes);

    }

    public void isTheResidenceOrPartRentedYes() {
        clickElement(isTheResidenceOrPartRentedYes);

    }

    public void isTheResidenceOrPartRentedNo() {
        clickElement(isTheResidenceOrPartRentedNo);
    }

    public void isTheResidenceShortTermRentalNo() {
        clickElement(isTheResidenceShortTermRentalNo);
    }

    public void isTheResidenceShortTermRentalYes() {
        clickElement(isTheResidenceShortTermRentalYes);
    }

    public void isResidenceVacantYes() {
        clickElement(isResidenceVacantYes);
    }

    public void isResidenceUnderConstructionRenovationYes() {
        clickElement(isResidenceUnderConstructionRenovationYes);

    }

    public void setHowLongMemberWillBeOutFromResidence(String outFromResidence) {
        typeText(howLongMemberWillBeOutFromResidence, outFromResidence);
        typeKeys(howLongMemberWillBeOutFromResidence, Keys.TAB);
    }

    public void setWhatIsTheCostOfPlannedWork(String costOfPlannedWork) {
        typeText(whatIsTheCostOfPlannedWork, costOfPlannedWork);
    }

}