package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageeInformationComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public MortgageeInformationComponent(WebDriver driver) {
        super(driver);
        MortgageeInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Is there, or will there be a mortgage on this location? (Excluding lines of credit)']/../../../../div//label[text()='No']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationNo;
    @FindBy(xpath = "//div[text()='Is there, or will there be a mortgage on this location? (Excluding lines of credit)']/../../../../div//label[text()='Yes']/..//input")
    WebElement isThereOrWillBeMortgageOnThisLocationYes;

    public void setIsThereOrWillBeMortgageOnThisLocation(String choose) throws Throwable {
        choose(isThereOrWillBeMortgageOnThisLocationYes,isThereOrWillBeMortgageOnThisLocationNo, choose);
    }
}