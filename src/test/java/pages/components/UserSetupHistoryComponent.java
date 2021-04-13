package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSetupHistoryComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public UserSetupHistoryComponent(WebDriver driver) {
        super(driver);
        UserSetupHistoryComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Click to show user history']/../../../..//input")
    WebElement clickToShowUserHistory;

    public void showUserHistory(String checked) throws Throwable {
        checkCheckbox(clickToShowUserHistory,checked);
    }
}