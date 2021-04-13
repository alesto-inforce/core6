package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class WorkersCompensationCoverageComponent extends CommonComponentsAndActions {

    static WebDriver driver;

    public WorkersCompensationCoverageComponent(WebDriver driver) {
        super(driver);
        WorkersCompensationCoverageComponent.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[contains(text(),'total full-time')]/../../../..//input")
    WebElement totalFullTime;
    @FindBy(xpath = "//div[contains(text(),'Workers Compensation')]/../../../..//input")
    WebElement workerCompensation;

    public void fillWorkerCoverageDetails(Map<String, String> data) {
        setTotalFullTime(data.get("Worker_Total_Full_Time"));
        setWorkerCompensation(data.get("Workers_Compensation"));
    }
    public void setTotalFullTime(String fullTime) {
        totalFullTime.click();
        driver.findElement(By.xpath("//li[text()='"+fullTime+"']")).click();
    }
    public void setWorkerCompensation(String compensation) {
        workerCompensation.click();
        driver.findElement(By.xpath("//li[text()='"+compensation+"']")).click();
    }
}