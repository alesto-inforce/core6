package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InternalUserAuthorityForSubRole extends CommonComponentsAndActions{
    static WebDriver driver;
    public InternalUserAuthorityForSubRole(WebDriver driver) {
        super(driver);
        InternalUserOverrideComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
