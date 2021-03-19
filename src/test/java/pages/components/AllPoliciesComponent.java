package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllPoliciesComponent {
    static WebDriver driver;
    WebDriverWait wdwait;

    public AllPoliciesComponent(WebDriver driver) {
        AllPoliciesComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Policy ID']")
    public WebElement policy;

    public String getPolicyID() {
        wdwait = new WebDriverWait(driver,20);
        wdwait.until(ExpectedConditions.elementToBeClickable(policy));
        return policy.getText();
    }

}