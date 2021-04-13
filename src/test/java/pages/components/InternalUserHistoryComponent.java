package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternalUserHistoryComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public InternalUserHistoryComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = " //div[text()='Click to show user history']/../../../../div//input")
    WebElement clickToShowUserHistory;

    public void setClickToShowUserHistory(String checked) throws Throwable {
        checkCheckbox(clickToShowUserHistory, checked);
    }
}
