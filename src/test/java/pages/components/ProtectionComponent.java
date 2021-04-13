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
    @FindBy(xpath = "//div[text()='Low Temperature monitoring system']/../../../..//label[text()='No']/..//input")
    WebElement lowTemperatureMonitoringSystemNo;
    @FindBy(xpath = "//div[text()='Low Temperature monitoring system']/../../../..//label[text()='Yes']/..//input")
    WebElement lowTemperatureMonitoringSystemYes;
    @FindBy(xpath = "//div[text()='Permanently Installed Generator']/../../../..//label[text()='No']/..//input")
    WebElement permanentlyInstalledGeneratorNo;
    @FindBy(xpath = "//div[text()='Permanently Installed Generator']/../../../..//label[text()='Yes']/..//input")
    WebElement permanentlyInstalledGeneratorYes;









    @FindBy(xpath = "//div[text()='Water Leak Detection System with Master Shut Off']/../../../..//input")
    WebElement waterLeakDetectionSystemWithMasterShutOffSelect;
    @FindBy(xpath = "//div[text()='Perimeter Security Protection']/../../../..//input")
    WebElement perimeterSecurityProtectionSelect;

    public void fillOutBasicProtectionDetails(Map<String,String> data) throws Throwable {
        switch (data.get("Residence_Type")){
            case "Homeowner":{
                switch (data.get("State")){
                    case "AK":
                    case "AR":{
                        setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                        setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                        selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                }
            }break;
            case "Condo/Co-op":{
                switch (data.get("State")){
                    case "AK":{
                        setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                        setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                        selectWaterLeakDetectionSystem(data.get("Water_Leak_Detection"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                }
            }break;
            case "Tenants":{
                switch (data.get("State")){
                    case "AK":{
                        setCentralReportingFireAlarm(data.get("Fire_Alarm"));
                        setCentralReportingBurglarAlarm(data.get("Burglar_Alarm"));
                        clickElement(CommonComponentsAndActions.saveChanges);
                        Thread.sleep(10000);
                    }break;
                    case "AR":
                    case "IA":
                    case "IN":
                    case "KS":
                    case "KY":
                    case "MN":
                    case "MO":
                    case "MT":
                    case "ND":
                    case "NE":
                    case "NH":
                    case "OH":
                    case "OK":
                    case "SD":
                    case "WI":
                    case "WY":
                    case "MD":
                    case "ME":
                    case "MS":
                    case "TX":
                    case "GA":
                    case "AZ":
                    case "DC":
                    case "IL":
                    case "NM":
                    case "NV":
                    case "OR":
                    case "PA":
                    case "UT":
                    case "VT":
                    case "WV":
                    case "MI":
                    case "CO":
                    case "RI":
                    case "TN":
                    case "WA":
                    case "CA":
                    case "AL":
                    case "LA":
                    case "MA":
                    case "DE":
                    case "HI":
                    case "VA":
                    case "NC":
                    case "SC":
                    case "FL":
                    case "CT":
                    case "NY":
                    case "NJ":
                }
            }break;
        }
    }

    public void setCentralReportingFireAlarm(String fireAlarm) throws Throwable {
        if (fireAlarm.equalsIgnoreCase("Yes")){
            clickElement(centralReportingFireAlarmYes);
        } else {
            clickElement(centralReportingFireAlarmNo);
        }
    }
    public void setCentralReportingBurglarAlarm(String burglarAlarm) throws Throwable {
        if (burglarAlarm.equalsIgnoreCase("Yes")){
            clickElement(centralReportingBurglarAlarmYes);
        } else {
            clickElement(centralReportingBurglarAlarmNo);
        }
    }
    public void selectWaterLeakDetectionSystem(String waterLeakDetectionSystemValue) throws Throwable {
        typeText(waterLeakDetectionSystemWithMasterShutOffSelect,waterLeakDetectionSystemValue);
    }
    public void selectPerimeterSecurity(String perimeterSecurityValue) throws Throwable {
        typeText(perimeterSecurityProtectionSelect,perimeterSecurityValue);
    }

}