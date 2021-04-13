package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class RoofCharacteristicComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public RoofCharacteristicComponent(WebDriver driver) {
        super(driver);
        RoofCharacteristicComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//font[text()='Roof Shape']/../../../../../..//input")
    WebElement roofShape;
    @FindBy(xpath = "//font[text()='Roof Covering']/../../../../../..//input")
    WebElement roofCovering;
    @FindBy(xpath = "//div[text()='Year roof replaced']/../../../..//input")
    WebElement yearRoofReplaced;
    @FindBy(xpath = "//div[text()='Roof Covering Credit']/../../../..//input")
    WebElement roofCoveringCredit;

    public void setRoofShape(String roofShapeText) throws Throwable {
        //typeText(roofShape, roofShapeText);
        clickElement(roofShape);
        driver.findElement(By.xpath("//li[text()='"+roofShapeText+"']")).click();
    }
    public void setCoveringCredit(String coveringCredit) throws Throwable {
        //typeText(roofCovering, roofShapeText);
        clickElement(roofCoveringCredit);
        driver.findElement(By.xpath("//li[text()='"+coveringCredit+"']")).click();
    }
    public void setRoofCovering(String roofCoveringText) throws Throwable {
        //typeText(roofCovering, roofCoveringText);
        clickElement(roofCovering);
        driver.findElement(By.xpath("//li[text()='"+roofCoveringText+"']")).click();
    }
    public void setYearRoofReplaced(String yearRoofReplacedText) throws Throwable {
        typeText(yearRoofReplaced, yearRoofReplacedText);
    }

    public void fillInRoofCharacteristics(Map<String, String> data) throws Throwable {
        setRoofShape(data.get("Roof_Shape"));
        setRoofCovering(data.get("Roof_Covering"));
        setCoveringCredit(data.get("Roof_Covering_Credit"));
    }
}



