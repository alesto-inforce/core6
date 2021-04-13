package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.*;

public class SubRolePage extends CommonComponentsAndActions {
    static WebDriver driver;
    InternalUserAuthorityForSubRole internalUserAuthorityForSubRole;
    InternalUserSubRoleComponent internalUserSubRoleComponent;
    InternalUserAuthorityForUserComponent internalUserAuthorityForUserComponent;
    InternalUserOverrideComponent internalUserOverrideComponent;
    InternalUserHistoryComponent internalUserHistoryComponent;

    public SubRolePage(WebDriver driver) {
        super(driver);
        SubRolePage.driver = driver;
        PageFactory.initElements(driver, this);

       internalUserAuthorityForSubRole = new InternalUserAuthorityForSubRole(driver);
       internalUserSubRoleComponent = new InternalUserSubRoleComponent(driver);
       internalUserAuthorityForUserComponent = new InternalUserAuthorityForUserComponent(driver);
       internalUserOverrideComponent = new InternalUserOverrideComponent(driver);
       internalUserHistoryComponent = new InternalUserHistoryComponent(driver);
    }

}