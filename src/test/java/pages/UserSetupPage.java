package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.AssociatedUnderwritingGroupsComponent;
import pages.components.CommonComponentsAndActions;
import pages.components.InternalUserEditComponent;
import pages.components.UserSetupHistoryComponent;

public class UserSetupPage extends CommonComponentsAndActions {
    static WebDriver driver;
    InternalUserEditComponent internalUserEditComponent;
    AssociatedUnderwritingGroupsComponent associatedUnderwritingGroupsComponent;
    UserSetupHistoryComponent userSetupHistoryComponent;

    public UserSetupPage(WebDriver driver) {
        super(driver);
        UserSetupPage.driver = driver;
        PageFactory.initElements(driver, this);
        internalUserEditComponent = new InternalUserEditComponent(driver);
        associatedUnderwritingGroupsComponent = new AssociatedUnderwritingGroupsComponent(driver);
        userSetupHistoryComponent = new UserSetupHistoryComponent(driver);
    }

}