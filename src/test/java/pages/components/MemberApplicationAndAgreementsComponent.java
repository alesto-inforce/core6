package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MemberApplicationAndAgreementsComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public MemberApplicationAndAgreementsComponent(WebDriver driver) {
        super(driver);
        MemberApplicationAndAgreementsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='upload']")
    List<WebElement> upload;

    public void upload() throws Throwable {
        clickElement(upload.get(0));
    }

}