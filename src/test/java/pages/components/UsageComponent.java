package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class UsageComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public UsageComponent(WebDriver driver) {
        super(driver);
        UsageComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Primary Residence')]/../../../../div//label[text()='No']/..//input")
    WebElement isPrimaryResidenceNo;
    @FindBy(xpath = "//div[contains(text(),'Primary Residence')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isPrimaryResidenceYes;
    @FindBy(xpath = "//div[contains(text(),'secondary home')]/../../../../div//label[text()='No']/..//input")
    WebElement isThisASeasonalOrSecondaryHomeNo;
    @FindBy(xpath = "//div[contains(text(),'secondary home')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isThisASeasonalOrSecondaryHomeYes;
    @FindBy(xpath = "//div[contains(text(),'PURE insure')]/../../../../div//label[text()='No']/..//input")
    WebElement doesPureInsureThePrimaryHomeNo;
    @FindBy(xpath = "//div[contains(text(),'PURE insure')]/../../../../div//label[text()='Yes']/..//input")
    WebElement doesPureInsureThePrimaryHomeYes;
    @FindBy(xpath = "//div[contains(text(),'home unoccupied')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsNo;
    @FindBy(xpath = "//div[contains(text(),'home unoccupied')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheHomeUnoccupiedMoreThanTwoMonthsYes;
    @FindBy(xpath = "//div[contains(text(),'part of the residence')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceOrPartRentedNo;
    @FindBy(xpath = "//div[contains(text(),'part of the residence')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceOrPartRentedYes;
    @FindBy(xpath = "//div[contains(text(),'short-term rental')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceShortTermRentalNo;
    @FindBy(xpath = "//div[contains(text(),'short-term rental')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceShortTermRentalYes;
    @FindBy(xpath = "//div[contains(text(),'residence vacant')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceVacantNo;
    @FindBy(xpath = "//div[contains(text(),'residence vacant')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceVacantYes;
    @FindBy(xpath = "//div[contains(text(),'residence under construction')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceUnderConstructionOrMajorRenovationNo;
    @FindBy(xpath = "//div[contains(text(),'residence under construction')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceUnderConstructionOrMajorRenovationYes;
    @FindBy(xpath = "//div[contains(text(),'construction or renovation')]/../../../../div//label[text()='No']/..//input")
    WebElement isResidenceUnderConstructionRenovationNo;
    @FindBy(xpath = "//div[contains(text(),'construction or renovation')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isResidenceUnderConstructionRenovationYes;
    @FindBy(xpath = "//div[contains(text(),'How long will the member be out')]/../../../../div//input")
    WebElement howLongMemberWillBeOutFromResidence;
    @FindBy(xpath = "//div[contains(text(),'cost of the planned work')]/../../../../div//input")
    WebElement whatIsTheCostOfPlannedWork;
    @FindBy(xpath = "//div[contains(text(),'currently for sale')]/../../../../div//label[text()='No']/..//input")
    WebElement isTheResidenceCurrentlyForSaleNo;
    @FindBy(xpath = "//div[contains(text(),'currently for sale')]/../../../../div//label[text()='Yes']/..//input")
    WebElement isTheResidenceCurrentlyForSaleYes;

    public void fillUsageDetails(Map<String,String> data) throws Throwable {
        setIsPrimaryResidence(data.get("Is_This_A_Primary_Residence"));
        setIsThisASeasonalOrSecondaryHome(data.get("Is_This_A_Seasonal_Or_Secondary_Home"));
        if(data.get("Is_This_A_Seasonal_Or_Secondary_Home").equalsIgnoreCase("Yes")){
            setDoesPureInsureThePrimaryHome(data.get("Does_Pure_Insure_Primary_Home"));
        }
        setIsTheResidenceOrPartRented(data.get("Part_Of_The_Residence_Rented"));
        setIsResidenceVacant(data.get("Is_The_Residence_Vacant"));
        setIsResidenceUnderConstructionOrMajorRenovation(data.get("Under_Construction_Or_Major_Renovation"));
        if(data.get("Under_Construction_Or_Major_Renovation").equalsIgnoreCase("Yes")){
            setHowLongMemberWillBeOutFromResidence(data.get("How_Long_Will_The_Member_Be_Out"));
            setWhatIsTheCostOfPlannedWork(data.get("Cost_Of_Planned_Work"));
        }
        setIsTheResidenceCurrentlyForSale(data.get("Is_Residence_Currently_For_Sale"));
    }
    public void setIsPrimaryResidence(String choose) throws Throwable {
        choose(isPrimaryResidenceYes,isPrimaryResidenceNo, choose);
    }
    public void setDoesPureInsureThePrimaryHome(String choose) throws Throwable {
        choose(doesPureInsureThePrimaryHomeYes,doesPureInsureThePrimaryHomeNo, choose);
    }
    public void setIsTheHomeUnoccupiedMoreThanTwoMonths(String choose) throws Throwable {
        choose(isTheHomeUnoccupiedMoreThanTwoMonthsYes,isTheHomeUnoccupiedMoreThanTwoMonthsNo, choose);
    }
    public void setIsTheResidenceOrPartRented(String choose) throws Throwable {
        choose(isTheResidenceOrPartRentedYes,isTheResidenceOrPartRentedNo, choose);
    }
    public void setIsTheResidenceShortTermRental(String choose) throws Throwable {
        choose(isTheResidenceShortTermRentalYes,isTheResidenceShortTermRentalNo, choose);
    }
    public void setIsResidenceVacant(String choose) throws Throwable {
        choose(isResidenceVacantYes,isResidenceVacantNo, choose);
    }
    public void setIsResidenceUnderConstructionRenovation(String choose) throws Throwable {
        choose(isResidenceUnderConstructionRenovationYes,isResidenceUnderConstructionRenovationNo, choose);
    }
    public void setHowLongMemberWillBeOutFromResidence(String text) throws Throwable {
        typeText(howLongMemberWillBeOutFromResidence,text);
    }
    public void setWhatIsTheCostOfPlannedWork(String text) throws Throwable {
        typeText(whatIsTheCostOfPlannedWork,text);
    }
    public void setIsThisASeasonalOrSecondaryHome(String choose) throws Throwable {
        choose(isThisASeasonalOrSecondaryHomeYes,isThisASeasonalOrSecondaryHomeNo, choose);
}
    public void setIsResidenceUnderConstructionOrMajorRenovation(String choose) throws Throwable {
        choose(isResidenceUnderConstructionOrMajorRenovationYes,isResidenceUnderConstructionOrMajorRenovationNo, choose);
    }
    public void setIsTheResidenceCurrentlyForSale(String choose) throws Throwable {
        choose(isTheResidenceCurrentlyForSaleYes,isTheResidenceCurrentlyForSaleNo, choose);
    }

}



