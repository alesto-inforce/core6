package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class ProtectionComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public ProtectionComponent(WebDriver driver) {
        super(driver);
        ProtectionComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[text()='Central Reporting Fire Alarm']/../../../..//label[text()='No']/..//input")
    WebElement centralReportingFireAlarmNo;
    @FindBy(xpath = "//div[text()='Central Reporting Fire Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement centralReportingFireAlarmYes;
    @FindBy(xpath = "//div[text()='Central Reporting Burglar Alarm']/../../../..//label[text()='No']/..//input")
    WebElement centralReportingBurglarAlarmNo;
    @FindBy(xpath = "//div[text()='Central Reporting Burglar Alarm']/../../../..//label[text()='Yes']/..//input")
    WebElement centralReportingBurglarAlarmYes;
    @FindBy(xpath = "//div[text()='Water Leak Detection System with Master Shut Off']/../../../..//input")
    WebElement waterLeakDetectionSystemWithMasterShutOffSelect;
    @FindBy(xpath = "//div[text()='Perimeter Security Protection']/../../../..//input")
    WebElement perimeterSecurityProtectionSelect;

    public void fillOutBasicProtectionDetails(Map<String,String> data) throws InterruptedException {
        setCentralReportingFireAlarm(data.get("FireAlarm"));
        setCentralReportingBurglarAlarm(data.get("BurglarAlarm"));
        selectWaterLeakDetectionSystem(data.get("WaterLeakDetection"));
        selectPerimeterSecurity(data.get("PerimeterSecurity"));
        clickElement(CommonComponentsAndActions.saveChanges);
        Thread.sleep(10000);
    }

    public void setCentralReportingFireAlarm(String fireAlarm){
        if (fireAlarm.equalsIgnoreCase("Yes")){
            clickElement(centralReportingFireAlarmYes);
        } else {
            clickElement(centralReportingFireAlarmNo);
        }
    }
    public void setCentralReportingBurglarAlarm(String burglarAlarm){
        if (burglarAlarm.equalsIgnoreCase("Yes")){
            clickElement(centralReportingBurglarAlarmYes);
        } else {
            clickElement(centralReportingBurglarAlarmNo);
        }
    }
    public void selectWaterLeakDetectionSystem(String waterLeakDetectionSystemValue){
        typeText(waterLeakDetectionSystemWithMasterShutOffSelect,waterLeakDetectionSystemValue);
    }
    public void selectPerimeterSecurity(String perimeterSecurityValue){
        typeText(perimeterSecurityProtectionSelect,perimeterSecurityValue);
    }

}