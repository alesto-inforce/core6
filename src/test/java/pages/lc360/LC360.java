package pages.lc360;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.components.CommonComponentsAndActions;

import java.util.ArrayList;
import java.util.Map;

public class LC360 extends CommonComponentsAndActions{

    static WebDriver driver;

    public LC360(WebDriver driver){
        super(driver);
        LC360.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@href,'losscontrol360')]")
    WebElement lc360Tile;
    @FindBy(xpath = "//a[@href='/Inspections']")
    WebElement inspections;
    @FindBy(css = "#search")
    WebElement searchPolicy;
    @FindBy(xpath = "//div[@id='mainFrameContents']/div/div[1]//h3/a")
    WebElement inspectionInfoEdit;
    @FindBy(xpath = "//span[text()='-- Unassigned --']")
    WebElement riskManagerSelect;
    @FindBy(xpath = "//div[@id=\"formScroll\"]//li[3]//a")
    WebElement underwriterForm;
    @FindBy(xpath = "//span[text()='Was the Member present']/../../div[2]//label[text()='Yes']/input")
    WebElement wasTheMemberPresentYes;
    @FindBy(xpath = "//span[text()='Was the Member present']/../../div[2]//label[text()='No']/input")
    WebElement wasTheMemberPresentNo;
    @FindBy(xpath = "//span[text()='Was the Broker present']/../../div[2]//label[text()='Yes']/input")
    WebElement wasTheBrokerPresentYes;
    @FindBy(xpath = "//span[text()='Was the Broker present']/../../div[2]//label[text()='No']/input")
    WebElement wasTheBrokerPresentNo;
    @FindBy(xpath = "//span[text()='Post-PURE360 follow up with Member']/../..//select")
    WebElement postPure360FollowUp;
    @FindBy(xpath = "//span[text()='Follow up call and Fullfillment Notes ']/../..//textarea")
    WebElement followUpCallAndFullfillmentNotes;
    @FindBy(xpath = "//span[text()='Occupancy']/../..//select")
    WebElement occupancy;
    @FindBy(xpath = "//span[text()='Is the home currently for sale']/../../div[2]//label[text()='Yes']/input")
    WebElement isTheHomeCurrentlyForSaleYes;
    @FindBy(xpath = "//span[text()='Is the home currently for sale']/../../div[2]//label[text()='No']/input")
    WebElement isTheHomeCurrentlyForSaleNo;
    @FindBy(xpath = "//span[text()='Has the home been Renovated']/../../div[2]//label[text()='Yes']/input")
    WebElement hasHomeBeenRenovatedYes;
    @FindBy(xpath = "//span[text()='Has the home been Renovated']/../../div[2]//label[text()='No']/input")
    WebElement hasHomeBeenRenovatedNo;
    @FindBy(xpath = "//span[text()='Immediate Underwriting Action Required ']/../../div[2]//label[text()='Yes']/input")
    WebElement immediateUnderwritingActionRequiredYes;
    @FindBy(xpath = "//span[text()='Immediate Underwriting Action Required ']/../../div[2]//label[text()='No']/input")
    WebElement immediateUnderwritingActionRequiredNo;
    @FindBy(xpath = "//span[text()='Construction Type']/../..//select")
    WebElement constructionType;
    @FindBy(xpath = "//span[text()='Year Built']/../..//input")
    WebElement yearBuilt;
    @FindBy(xpath = "//span[text()='Square Footage']/../..//input")
    WebElement squareFootage;
    @FindBy(xpath = "//span[text()='Roof Configuration']/../..//select")
    WebElement roofConfiguration;
    @FindBy(xpath = "//span[text()='Roof Cover']/../..//select")
    WebElement roofCover;
    @FindBy(xpath = "//span[text()='Roof Cover Condition']/../..//select")
    WebElement roofCoverCondition;
    @FindBy(xpath = "//span[text()='Year Roof Installed/Replaced']/../..//input")
    WebElement yearRoofInstalledReplaced;
    @FindBy(xpath = "//span[text()='Previous Hail Damage Noted']/../../div[2]//label[text()='Yes']/input")
    WebElement previousHailDamageNotedYes;
    @FindBy(xpath = "//span[text()='Previous Hail Damage Noted']/../../div[2]//label[text()='No']/input")
    WebElement previousHailDamageNotedNo;
    @FindBy(xpath = "//span[text()='Exterior Wall Cover Condition']/../..//select")
    WebElement exteriorWallCoverCondition;
    @FindBy(xpath = "//span[text()='Exterior Building Condition']/../..//select")
    WebElement exteriorBuildingCondition;
    @FindBy(xpath = "//span[text()='Condition of Interior Walls']/../..//select")
    WebElement conditionOfInteriorWalls;
    @FindBy(xpath = "//span[text()='Condition of Interior Ceilings']/../..//select")
    WebElement conditionOfInteriorCeilings;
    @FindBy(xpath = "//span[text()='Condition of Interior Floors']/../..//select")
    WebElement conditionOfInteriorFloors;
    @FindBy(xpath = "//span[text()='Condition of Finished Basement']/../..//select")
    WebElement conditionOfFinishedBasement;
    @FindBy(xpath = "//span[text()='Condition of Unfinished Basement']/../..//select")
    WebElement conditionOfUnfinishedBasement;
    @FindBy(xpath = "//span[text()='Does the home have an Attic']/../../div[2]//label[text()='Yes']/input")
    WebElement doesTheHomeHaveAnAtticYes;
    @FindBy(xpath = "//span[text()='Does the home have an Attic']/../../div[2]//label[text()='No']/input")
    WebElement doesTheHomeHaveAnAtticNo;
    @FindBy(xpath = "//span[text()='Overall Interior Condition']/../..//select")
    WebElement overallInteriorCondition;
    @FindBy(xpath = "//label[text()='Unfinished Basement']/input")
    WebElement laundryRoomLocation_UnfinishedBasement;
    @FindBy(xpath = "//span[text()='Washing Machine Hose Type']/../..//label[text()='Braided']/input")
    WebElement washingMachineHoseType_Braided;
    @FindBy(xpath = "//span[text()='Toilet Supply Lines']/../..//label[text()='Braided']/input")
    WebElement toiletSupplyLines_Braided;
    @FindBy(xpath = "//span[text()='Condition of Toilet Supply Lines']/../..//select")
    WebElement conditionOfToiletSupplyLines;
    @FindBy(xpath = "//span[text()='Floor Drain Present']/../../div[2]//label[text()='Yes']/input")
    WebElement floorDrainPresentYes;
    @FindBy(xpath = "//span[text()='Floor Drain Present']/../../div[2]//label[text()='No']/input")
    WebElement floorDrainPresentNo;
    @FindBy(xpath = "//span[text()='Overflow Pan']/../../div[2]//label[text()='Yes']/input")
    WebElement overflowPanYes;
    @FindBy(xpath = "//span[text()='Overflow Pan']/../../div[2]//label[text()='No']/input")
    WebElement overflowPanNo;
    @FindBy(xpath = "//span[text()='Condition of Machines']/../..//select")
    WebElement conditionOfMachines;
    @FindBy(xpath = "//span[text()='Evidence of Washing Machine Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfWashingMachineLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Washing Machine Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfWashingMachineLeaksNo;
    @FindBy(xpath = "//span[text()='Evidence of Toilet Leaks / Water Damage in Bathrooms']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfToiletLeaksWaterDamageInBathroomsYes;
    @FindBy(xpath = "//span[text()='Evidence of Toilet Leaks / Water Damage in Bathrooms']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfToiletLeaksWaterDamageInBathroomsNo;
    @FindBy(xpath = "//span[text()='Condition of Grout and Caulking']/../..//select")
    WebElement conditionOfGroutAndCaulking;
    @FindBy(xpath = "//span[text()='Evidence of Dishwasher Supply Lines Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfDishwasherSupplyLinesLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Dishwasher Supply Lines Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfDishwasherSupplyLinesLeaksNo;
    @FindBy(xpath = "//span[text()='Evidence of Refrigerator/Ice Machine Supply Lines Leaks']/../../div[2]//label[text()='Yes']/input")
    WebElement evidenceOfRefrigeratorIceMachineSupplyLinesLeaksYes;
    @FindBy(xpath = "//span[text()='Evidence of Refrigerator/Ice Machine Supply Lines Leaks']/../../div[2]//label[text()='No']/input")
    WebElement evidenceOfRefrigeratorIceMachineSupplyLinesLeaksNo;
    @FindBy(xpath = "//span[text()='Tankless Water Heater']/../../div[2]//label[text()='Yes']/input")
    WebElement tanklessWaterHeaterYes;
    @FindBy(xpath = "//span[text()='Tankless Water Heater']/../../div[2]//label[text()='No']/input")
    WebElement tanklessWaterHeaterNo;
    @FindBy(xpath = "//span[text()='Location of Water Heater']/../..//select")
    WebElement locationOfWaterHeater;
    @FindBy(xpath = "//span[text()='Year Water Heater Manufactured']/../..//input")
    WebElement yearWaterHeaterManufactured;
    @FindBy(xpath = "//span[text()='Condition of Water Heater']/../..//select")
    WebElement conditionOfWaterHeater;
    @FindBy(xpath = "//span[text()='Sump Pump Present']/../../div[2]//label[text()='Yes']/input")
    WebElement sumpPumpPresentYes;
    @FindBy(xpath = "//span[text()='Sump Pump Present']/../../div[2]//label[text()='No']/input")
    WebElement sumpPumpPresentNo;
    @FindBy(xpath = "//span[text()='Water Main Pipe Size (inches)']/../..//select")
    WebElement waterMainPipeSize;
    @FindBy(xpath = "//span[text()='Water Shut off device present']/../../div[2]//label[text()='Yes']/input")
    WebElement waterShutOffDevicePresentYes;
    @FindBy(xpath = "//span[text()='Water Shut off device present']/../../div[2]//label[text()='No']/input")
    WebElement waterShutOffDevicePresentNo;
    @FindBy(xpath = "//span[text()='Describe any areas of water damage / leaks present']/../..//textarea")
    WebElement describeAnyAreasOfWaterDamage;
    @FindBy(xpath = "//span[text()='Permanently Installed Generator']/../../div[2]//label[text()='Yes']/input")
    WebElement permanentlyInstalledGeneratorYes;
    @FindBy(xpath = "//span[text()='Permanently Installed Generator']/../../div[2]//label[text()='No']/input")
    WebElement permanentlyInstalledGeneratorNo;
    @FindBy(xpath = "//span[text()='Is there active knob and tube wiring or active fuses in the home']/../../div[2]//label[text()='Yes']/input")
    WebElement isThereActiveKnobAndTubeWiringYes;
    @FindBy(xpath = "//span[text()='Is there active knob and tube wiring or active fuses in the home']/../../div[2]//label[text()='No']/input")
    WebElement isThereActiveKnobAndTubeWiringNo;
    @FindBy(xpath = "//span[text()='Condition of electrical panel/system']/../..//select")
    WebElement conditionOfElectricalPanelSystem;
    @FindBy(xpath = "//span[text()='Condition of Condensation Line, Drip Pan and Drainage']/../..//select")
    WebElement conditionOfCondensationLineDripPanAndDrainage;
    @FindBy(xpath = "//span[text()='Condition of HVAC vents, radiators, and baseboard heating']/../..//select")
    WebElement conditionOfHVACVents;
    @FindBy(xpath = "//span[text()='Piping Material']/../..//select")
    WebElement pipingMaterial;
    @FindBy(xpath = "//span[text()='Comment on overall condition of Electrical/HVAC/Plumbing - use this to identify any issues']/../..//textarea")
    WebElement commentOnOverallConditionOfElectricalHVACPlumbing;
    @FindBy(xpath = "//span[text()='Wood Burning Fireplace/Woodstove Present']/../../div[2]//label[text()='Yes']/input")
    WebElement woodBurningFireplaceWoodstovePresentYes;
    @FindBy(xpath = "//span[text()='Wood Burning Fireplace/Woodstove Present']/../../div[2]//label[text()='No']/input")
    WebElement woodBurningFireplaceWoodstovePresentNo;
    @FindBy(xpath = "//span[text()='Gas Burning Fireplace']/../../div[2]//label[text()='Yes']/input")
    WebElement gasBurningFireplaceYes;
    @FindBy(xpath = "//span[text()='Gas Burning Fireplace']/../../div[2]//label[text()='No']/input")
    WebElement gasBurningFireplaceNo;
    @FindBy(xpath = "//span[text()='Gutters/Drains free of debris']/../../div[2]//label[text()='Yes']/input")
    WebElement guttersDrainsFreeOfDebrisYes;
    @FindBy(xpath = "//span[text()='Gutters/Drains free of debris']/../../div[2]//label[text()='No']/input")
    WebElement guttersDrainsFreeOfDebrisNo;
    @FindBy(xpath = "//span[text()='Caulking at Doors, Windows, and other exterior penetrations acceptable']/../../div[2]//label[text()='Yes']/input")
    WebElement caulkingAtDoorsWindowsYes;
    @FindBy(xpath = "//span[text()='Caulking at Doors, Windows, and other exterior penetrations acceptable']/../../div[2]//label[text()='No']/input")
    WebElement caulkingAtDoorsWindowsNo;
    @FindBy(xpath = "//span[text()='Do any trees in the strike zone of the home show signs of poor health']/../../div[2]//label[text()='Yes']/input")
    WebElement doAnyTreesInTheStrikeZoneYes;
    @FindBy(xpath = "//span[text()='Do any trees in the strike zone of the home show signs of poor health']/../../div[2]//label[text()='No']/input")
    WebElement doAnyTreesInTheStrikeZoneNo;
    @FindBy(xpath = "//span[text()='Any trees touching or overhanging the home']/../../div[2]//label[text()='Yes']/input")
    WebElement anyTreesTouchingYes;
    @FindBy(xpath = "//span[text()='Any trees touching or overhanging the home']/../../div[2]//label[text()='No']/input")
    WebElement anyTreesTouchingNo;
    @FindBy(xpath = "//span[text()='Fire Alarm Type']/../..//label[text()='Central Station']/input")
    WebElement fireAlarmType_CentralStation;
    @FindBy(xpath = "//span[text()='Protection Class (PC)']/../..//select")
    WebElement protectionClass;
    @FindBy(xpath = "//span[text()='Burglar Alarm Type']/../..//select")
    WebElement burglarAlarmType;
    @FindBy(xpath = "//span[text()='Explosive Gas Detector']/../../div[2]//label[text()='Yes']/input")
    WebElement explosiveGasDetectorYes;
    @FindBy(xpath = "//span[text()='Explosive Gas Detector']/../../div[2]//label[text()='No']/input")
    WebElement explosiveGasDetectorNo;
    @FindBy(xpath = "//span[text()='Flood Sensors']/../../div[2]//label[text()='Yes']/input")
    WebElement floodSensorsYes;
    @FindBy(xpath = "//span[text()='Flood Sensors']/../../div[2]//label[text()='No']/input")
    WebElement floodSensorsNo;
    @FindBy(xpath = "//span[text()='Cellular Backup']/../../div[2]//label[text()='Yes']/input")
    WebElement cellularBackupYes;
    @FindBy(xpath = "//span[text()='Cellular Backup']/../../div[2]//label[text()='No']/input")
    WebElement cellularBackupNo;
    @FindBy(xpath = "//span[text()='Residential Sprinkler System']/../../div[2]//label[text()='Yes']/input")
    WebElement residentialSprinklerSystemYes;
    @FindBy(xpath = "//span[text()='Residential Sprinkler System']/../../div[2]//label[text()='No']/input")
    WebElement residentialSprinklerSystemNo;
    @FindBy(xpath = "//span[text()='Guard gated community']/../../div[2]//label[text()='Yes']/input")
    WebElement guardGatedCommunityYes;
    @FindBy(xpath = "//span[text()='Guard gated community']/../../div[2]//label[text()='No']/input")
    WebElement guardGatedCommunityNo;
    @FindBy(xpath = "//span[text()='Security Cameras Monitored 24 hrs']/../../div[2]//label[text()='Yes']/input")
    WebElement securityCamerasYes;
    @FindBy(xpath = "//span[text()='Security Cameras Monitored 24 hrs']/../../div[2]//label[text()='No']/input")
    WebElement securityCamerasNo;
    @FindBy(xpath = "//span[text()='Low Temperature Sensors']/../..//select")
    WebElement lowTemperatureSensors;
    @FindBy(xpath = "//span[text()='Domestic Staff']/../../div[2]//label[text()='Yes']/input")
    WebElement domesticStaffYes;
    @FindBy(xpath = "//span[text()='Domestic Staff']/../../div[2]//label[text()='No']/input")
    WebElement domesticStaffNo;
    @FindBy(xpath = "//span[text()='Any dogs on the premises']/../../div[2]//label[text()='Yes']/input")
    WebElement anyDogsOnThePremisesYes;
    @FindBy(xpath = "//span[text()='Any dogs on the premises']/../../div[2]//label[text()='No']/input")
    WebElement anyDogsOnThePremisesNo;
    @FindBy(xpath = "//span[text()='Business on Property']/../../div[2]//label[text()='Yes']/input")
    WebElement businessOnPropertyYes;
    @FindBy(xpath = "//span[text()='Business on Property']/../../div[2]//label[text()='No']/input")
    WebElement businessOnPropertyNo;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement save;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement ok;

    public void openOKTA() throws InterruptedException {
        driver.get("https://pure.okta.com/");
        //Wait out double auth
        Thread.sleep(30000);
    }

    public void selectLC360() {
        lc360Tile.click();
        ArrayList<String> tabs= new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void navigateToInspections() {
        inspections.click();
    }

    public void searchPolicy(String policyNum) {
        searchPolicy.clear();
        searchPolicy.sendKeys(policyNum);
        searchPolicy.sendKeys(Keys.ENTER);
    }

    public void selectPolicy(String policyNum) {
        driver.findElement(By.xpath("//div[@class='mainGrid_rows']/div[1]//a[text()='"+policyNum+"']")).click();
    }

    public void assignAsRiskManager(String riskManager) throws InterruptedException {
        inspectionInfoEdit.click();
        riskManagerSelect.click();
        Thread.sleep(500);
        try {
            driver.findElement(By.xpath("//div[text()='" + riskManager + "']/..")).click();
        } catch (Exception e){
            System.out.println("Could not select RM, please select Manually");
            //Thread.sleep(10000);
        }
    }

    public void navigateToUnderwriterForm() {
        underwriterForm.click();
    }

    public void fillForm(Map<String, String> data) throws Throwable {
        choose(wasTheMemberPresentYes,wasTheMemberPresentNo,data.get("Was_The_Member_Present"));
        choose(wasTheBrokerPresentYes,wasTheBrokerPresentNo,data.get("Was_The_Broker_Present"));

        Select postPure360Select = new Select(postPure360FollowUp);
        postPure360Select.selectByValue(data.get("Post-PURE360_Follow_Up_With_Member"));

        followUpCallAndFullfillmentNotes.clear();
        followUpCallAndFullfillmentNotes.sendKeys(data.get("Follow_Up_Call_And_Fulfillment_Notes"));

        Select occupancySelect = new Select(occupancy);
        occupancySelect.selectByValue(data.get("Occupancy"));

        choose(isTheHomeCurrentlyForSaleYes,isTheHomeCurrentlyForSaleNo,data.get("Is_The_Home_Currently_For_Sale"));
        choose(hasHomeBeenRenovatedYes,hasHomeBeenRenovatedNo,data.get("Has_The_Home_Been_Renovated"));
        choose(immediateUnderwritingActionRequiredYes,immediateUnderwritingActionRequiredNo,data.get("Immediate_Underwriting_Action_Required"));

        Select constructionTypeSelect = new Select(constructionType);
        constructionTypeSelect.selectByValue(data.get("Construction_Type"));

        yearBuilt.clear();
        yearBuilt.sendKeys(data.get("Year_Built"));
        squareFootage.clear();
        squareFootage.sendKeys(data.get("Square_Footage"));

        Select roofConfigurationSelect = new Select(roofConfiguration);
        roofConfigurationSelect.selectByValue(data.get("Roof_Configuration"));

        Select roofCoverSelect = new Select(roofCover);
        roofCoverSelect.selectByValue(data.get("Roof_Cover"));

        yearRoofInstalledReplaced.clear();
        yearRoofInstalledReplaced.sendKeys(data.get("Year_Roof_Installed_Replaced"));

        Select roofCoverConditionSelect = new Select(roofCoverCondition);
        roofCoverConditionSelect.selectByValue(data.get("Roof_Cover_Condition"));

        choose(previousHailDamageNotedYes,previousHailDamageNotedNo,data.get("Previous_Hail_Damage_Noted"));

        Select exteriorWallCoverConditionSelect = new Select(exteriorWallCoverCondition);
        exteriorWallCoverConditionSelect.selectByValue(data.get("Exterior_Wall_Cover_Condition"));

        Select exteriorBuildingConditionSelect = new Select(exteriorBuildingCondition);
        exteriorBuildingConditionSelect.selectByValue(data.get("Exterior_Building_Condition"));

        Select conditionOfInteriorWallsSelect = new Select(conditionOfInteriorWalls);
        conditionOfInteriorWallsSelect.selectByValue(data.get("Condition_Of_Interior_Walls"));

        Select conditionOfInteriorCeilingsSelect = new Select(conditionOfInteriorCeilings);
        conditionOfInteriorCeilingsSelect.selectByValue(data.get("Condition_Of_Interior_Ceilings"));

        Select conditionOfInteriorFloorsSelect = new Select(conditionOfInteriorFloors);
        conditionOfInteriorFloorsSelect.selectByValue(data.get("Condition_Of_Interior_Floors"));

        Select conditionOfFinishedBasementSelect = new Select(conditionOfFinishedBasement);
        conditionOfFinishedBasementSelect.selectByValue(data.get("Condition_Of_Finished_Basement"));

        Select conditionOfUnfinishedBasementSelect = new Select(conditionOfUnfinishedBasement);
        conditionOfUnfinishedBasementSelect.selectByValue(data.get("Condition_Of_Unfinished_Basement"));

        choose(doesTheHomeHaveAnAtticYes,doesTheHomeHaveAnAtticNo,data.get("Does_The_Home_Have_An_Attic"));

        Select overallInteriorConditionSelect = new Select(overallInteriorCondition);
        overallInteriorConditionSelect.selectByValue(data.get("Overall_Interior_Condition"));

        laundryRoomLocation_UnfinishedBasement.click();
        washingMachineHoseType_Braided.click();

        choose(floorDrainPresentYes,floorDrainPresentNo,data.get("Floor_Drain_Present"));
        choose(overflowPanYes,overflowPanNo,data.get("Overflow_Pan"));

        Select conditionOfMachinesSelect = new Select(conditionOfMachines);
        conditionOfMachinesSelect.selectByValue(data.get("Condition_Of_Machines"));

        choose(evidenceOfWashingMachineLeaksYes,evidenceOfWashingMachineLeaksNo,data.get("Evidence_Of_Machine_Leaks"));
        toiletSupplyLines_Braided.click();

        Select conditionOfToiletSupplySelect = new Select(conditionOfToiletSupplyLines);
        conditionOfToiletSupplySelect.selectByValue(data.get("Condition_Of_Toilet_Supply_Lines"));

        choose(evidenceOfToiletLeaksWaterDamageInBathroomsYes,evidenceOfToiletLeaksWaterDamageInBathroomsNo,data.get("Evidence_Of_Toilet_Leaks_Water_Damage_In_Bathrooms"));

        Select conditionOfGroutAndCaulkingSelect = new Select(conditionOfGroutAndCaulking);
        conditionOfGroutAndCaulkingSelect.selectByValue(data.get("Condition_Of_Grout_And_Caulking"));

        choose(evidenceOfDishwasherSupplyLinesLeaksYes,evidenceOfDishwasherSupplyLinesLeaksNo,data.get("Evidence_Of_Dishwasher_Supply_Lines_Leaks"));
        choose(evidenceOfRefrigeratorIceMachineSupplyLinesLeaksYes,evidenceOfRefrigeratorIceMachineSupplyLinesLeaksNo,data.get("Evidence_Of_Refrigerator_Ice_Machine_Supply_Lines_Leaks"));
        choose(tanklessWaterHeaterYes,tanklessWaterHeaterNo,data.get("Tankless_Water_Heater"));

        Select locationOfWaterHeaterSelect = new Select(locationOfWaterHeater);
        locationOfWaterHeaterSelect.selectByValue(data.get("Location_Of_Water_Heater"));

        yearWaterHeaterManufactured.clear();
        yearWaterHeaterManufactured.sendKeys(data.get("Year_Water_Heater_Manufactured"));

        Select conditionOfWaterHeaterSelect = new Select(conditionOfWaterHeater);
        conditionOfWaterHeaterSelect.selectByValue(data.get("Condition_Of_Water_Heater"));

        choose(sumpPumpPresentYes,sumpPumpPresentNo,data.get("Sump_Pump_Present"));

        Select waterMainPipeSizeSelect = new Select(waterMainPipeSize);
        waterMainPipeSizeSelect.selectByValue(data.get("Water_Main_Pipe_Size"));

        choose(waterShutOffDevicePresentYes,waterShutOffDevicePresentNo,data.get("Water_Shut_Off_Device_Present"));

        describeAnyAreasOfWaterDamage.clear();
        describeAnyAreasOfWaterDamage.sendKeys(data.get("Describe_Any_Areas_Of_Water_Damage"));

        choose(permanentlyInstalledGeneratorYes,permanentlyInstalledGeneratorNo,data.get("Permanently_Installed_Generator"));
        choose(isThereActiveKnobAndTubeWiringYes,isThereActiveKnobAndTubeWiringNo,data.get("Is_There_Active_Knob_And_Tube_Wiring"));

        Select conditionOfElectricalPanelSystemSelect = new Select(conditionOfElectricalPanelSystem);
        conditionOfElectricalPanelSystemSelect.selectByValue(data.get("Condition_Of_Electrical_Panel_System"));

        Select conditionOfCondensationLineDripPanAndDrainageSelect = new Select(conditionOfCondensationLineDripPanAndDrainage);
        conditionOfCondensationLineDripPanAndDrainageSelect.selectByValue(data.get("Condition_Of_Condensation_Line_Drip_Pan_And_Drainage"));

        Select conditionOfHVACVentsSelect = new Select(conditionOfHVACVents);
        conditionOfHVACVentsSelect.selectByValue(data.get("Condition_Of_HVAC_Vents"));

        Select pipingMaterialSelect = new Select(pipingMaterial);
        pipingMaterialSelect.selectByValue(data.get("Piping_Material"));

        commentOnOverallConditionOfElectricalHVACPlumbing.clear();
        commentOnOverallConditionOfElectricalHVACPlumbing.sendKeys(data.get("Comment_On_Overall_Condition_Of_Electrical_HVAC_Plumbing"));

        choose(woodBurningFireplaceWoodstovePresentYes,woodBurningFireplaceWoodstovePresentNo,data.get("Wood_Burning_Fireplace"));
        choose(gasBurningFireplaceYes,gasBurningFireplaceNo,data.get("Gas_Burning_Fireplace"));
        choose(guttersDrainsFreeOfDebrisYes,guttersDrainsFreeOfDebrisNo,data.get("Gutters_Drains"));
        choose(caulkingAtDoorsWindowsYes,caulkingAtDoorsWindowsNo,data.get("Caulking_At_Doors_Windows"));
        choose(doAnyTreesInTheStrikeZoneYes,doAnyTreesInTheStrikeZoneNo,data.get("Do_Any_Trees_In_The_Strike_Zone"));
        choose(anyTreesTouchingYes,anyTreesTouchingNo,data.get("Any_Trees_Touching"));

        Select protectionClassSelect = new Select(protectionClass);
        protectionClassSelect.selectByValue(data.get("Protection_Class"));

        fireAlarmType_CentralStation.click();

        Select burglarAlarmTypeSelect = new Select(burglarAlarmType);
        burglarAlarmTypeSelect.selectByValue(data.get("Burglar_Alarm_Type"));

        choose(explosiveGasDetectorYes,explosiveGasDetectorNo,data.get("Explosive_Gas_Detector"));
        choose(floodSensorsYes,floodSensorsNo,data.get("Flood_Sensors"));
        choose(cellularBackupYes,cellularBackupNo,data.get("Cellular_Backup"));

        Select lowTemperatureSensorsSelect = new Select(lowTemperatureSensors);
        lowTemperatureSensorsSelect.selectByValue(data.get("Low_Temperature_Sensors"));

        choose(residentialSprinklerSystemYes,residentialSprinklerSystemNo,data.get("Residential_Sprinkler_System"));
        choose(guardGatedCommunityYes,guardGatedCommunityNo,data.get("Guard_Gated_Community"));
        choose(securityCamerasYes,securityCamerasNo,data.get("Security_Cameras"));

        choose(domesticStaffYes,domesticStaffNo,data.get("Domestic_Staff"));
        choose(anyDogsOnThePremisesYes,anyDogsOnThePremisesNo,data.get("Any_Dogs_On_The_Premises"));
        choose(businessOnPropertyYes,businessOnPropertyNo,data.get("Business_On_Property"));
    }

    public void save() {
        save.click();
        ok.click();
    }
}