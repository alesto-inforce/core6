package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NamedInsuredComponent extends CommonComponentsAndActions{

    static WebDriver driver;

    public NamedInsuredComponent(WebDriver driver){
        super(driver);
        NamedInsuredComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='named insured']/../../../../../../div[2]//span[text()='add']")
    WebElement addAddresses;
    @FindBy(xpath = "//div[text()='named insured']/../../../../../../div[2]//span[text()='delete']")
    List<WebElement> deleteAddresses;

    public void deleteAddresses(int index) throws Throwable {
        clickElement(deleteAddresses.get(index));
    }
    public void addAddresses() throws Throwable {
        clickElement(addAddresses);
    }

}