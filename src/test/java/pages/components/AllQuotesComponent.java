package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllQuotesComponent extends CommonComponentsAndActions{
    static WebDriver driver;

    public AllQuotesComponent(WebDriver driver) {
        super(driver);
        AllQuotesComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='all quotes']/../../../../../../div[2]/div[3]//tr//td[1]//span")
    public WebElement quote;

    public void navigateToQuote() throws Throwable {
        clickElement(quote);
    }

}