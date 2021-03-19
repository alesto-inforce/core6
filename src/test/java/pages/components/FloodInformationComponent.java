package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloodInformationComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public FloodInformationComponent(WebDriver driver) {
        super(driver);
        FloodInformationComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood policy')]/../../../../div//label[text()='Yes']/..//input")
    WebElement pureNFIPYes;
    @FindBy(xpath = "//div[contains(text(),'PURE NFIP Flood policy')]/../../../../div//label[text()='No']/..//input")
    WebElement pureNFIPNo;

    public void setPureNFIP(String nfip){
        if (nfip.equalsIgnoreCase("Yes")){
            clickElement(pureNFIPYes);
        } else {
            clickElement(pureNFIPNo);
        }
    }

}