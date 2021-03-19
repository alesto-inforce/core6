package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSpecificFormsComponent {
    static WebDriver driver;

    public ProductSpecificFormsComponent(WebDriver driver) {
        ProductSpecificFormsComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='generate forms for manual sign']")
    WebElement generateManualSign;

    public void setGenerateManualSign(){
        generateManualSign.click();
    }
}