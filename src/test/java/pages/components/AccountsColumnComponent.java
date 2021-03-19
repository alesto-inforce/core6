package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountsColumnComponent{
    static WebDriver driver;

    public AccountsColumnComponent(WebDriver driver) {
        AccountsColumnComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static final String HOMEOWNERS_POLICY        = "Homeowners Policy";
    public static final String OPTIONAL_COVERAGES       = "Optional Coverages";
    public static final String PREVIOUS_CLAIMS_LOSSES   = "Previous Claim/Losses";
    public static final String INSPECTION               = "Inspection";
    public static final String ADDITIONAL_INTERESTS     = "Additional Interests";
    public static final String BINDING_INFORMATION      = "Binding Information";
    public static final String MANUSCRIPT_ENDORSMENTS   = "Manuscript Endorsments";
    public static final String SUBJECTIVITIES           = "Subjectivities";

    public void navigateTo(String item){
        driver.findElement(By.xpath("//div[contains(@id,'accountsColumn')]//a[contains(text(),'"+item+"')]")).click();
    }

}