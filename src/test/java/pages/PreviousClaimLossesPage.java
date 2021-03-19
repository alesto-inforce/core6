package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.CommonComponentsAndActions;
import pages.components.LossClaimHistoryComponent;

public class PreviousClaimLossesPage extends CommonComponentsAndActions {
    static WebDriver driver;
    LossClaimHistoryComponent lossClaimHistoryComponent;

    public PreviousClaimLossesPage(WebDriver driver) {
        super(driver);
        PreviousClaimLossesPage.driver = driver;
        lossClaimHistoryComponent = new LossClaimHistoryComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void noPriorLossesInPastFiveYears(){
        lossClaimHistoryComponent.setPriorLossesNo();
    }
}