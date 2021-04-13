package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.components.*;
import java.util.Map;

public class LocationCoveragePage extends CommonComponentsAndActions {
    static WebDriver driver;

    LocationCoveragesComponent locationCoveragesComponent;
    LocationDetailsComponent locationDetailsComponent;
    GeoLocationDetailsComponents geoLocationDetailsComponents;
    UsageComponent usageComponent;
    MortgageeInformationComponent mortgageeInformationComponent;
    ConstructionDetailsComponent constructionDetailsComponent;
    WindMitigationComponent windMitigationComponent;
    ProtectionComponent protectionComponent;
    FloodInformationComponent floodInformationComponent;
    ExcessFloodComponent excessFloodComponent;
    ElevationCertificateComponent elevationCertificateComponent;
    StormSurgeComponent stormSurgeComponent;
    WindPoolComponent windPoolComponent;
    RoofCharacteristicComponent roofCharacteristicComponent;

    public LocationCoveragePage(WebDriver driver) {
        super(driver);
        LocationCoveragePage.driver = driver;
        locationCoveragesComponent = new LocationCoveragesComponent(driver);
        locationDetailsComponent = new LocationDetailsComponent(driver);
        geoLocationDetailsComponents = new GeoLocationDetailsComponents(driver);
        usageComponent = new UsageComponent(driver);
        mortgageeInformationComponent = new MortgageeInformationComponent(driver);
        constructionDetailsComponent = new ConstructionDetailsComponent(driver);
        windMitigationComponent = new WindMitigationComponent(driver);
        protectionComponent = new ProtectionComponent(driver);
        floodInformationComponent = new FloodInformationComponent(driver);
        excessFloodComponent = new ExcessFloodComponent(driver);
        elevationCertificateComponent = new ElevationCertificateComponent(driver);
        stormSurgeComponent = new StormSurgeComponent(driver);
        windPoolComponent = new WindPoolComponent(driver);
        roofCharacteristicComponent = new RoofCharacteristicComponent(driver);
        PageFactory.initElements(driver,this);
    }

    public void fillBasicLocationCoverageDetails(Map<String,String> data) throws Throwable {
        switch (data.get("Residence_Type")){
            case "Homeowner":{
                switch (data.get("State")){
                    case "AK":{
                        usageComponent.fillUsageDetails(data);
                        mortgageeInformationComponent.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        Thread.sleep(6000);
                        constructionDetailsComponent.fillBasicConstructionDetails(data);
                        windMitigationComponent.fillBasicWindMitigationDetails(data);
                        protectionComponent.fillOutBasicProtectionDetails(data);
                        Thread.sleep(6000);
                        floodInformationComponent.fillOutFloodInformationDetails(data);
                    }break;
                    case "AR":{
                        usageComponent.fillUsageDetails(data);
                        mortgageeInformationComponent.setIsThereOrWillBeMortgageOnThisLocation(data.get("Is_There_Mortgage"));
                        Thread.sleep(6000);
                        constructionDetailsComponent.fillBasicConstructionDetails(data);
                        roofCharacteristicComponent.fillInRoofCharacteristics(data);
                        protectionComponent.fillOutBasicProtectionDetails(data);
                        Thread.sleep(6000);
                        floodInformationComponent.fillOutFloodInformationDetails(data);
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






            //TODO
            case "Condo/Co-op":{
                switch (data.get("State")){
                    case "AK":{
                        usageComponent.fillUsageDetails(data);
                        constructionDetailsComponent.fillBasicConstructionDetails(data);
                        protectionComponent.fillOutBasicProtectionDetails(data);
                        Thread.sleep(6000);
                        floodInformationComponent.fillOutFloodInformationDetails(data);
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
                        usageComponent.fillUsageDetails(data);
                        constructionDetailsComponent.fillBasicConstructionDetails(data);
                        windMitigationComponent.fillBasicWindMitigationDetails(data);
                        protectionComponent.fillOutBasicProtectionDetails(data);
                        Thread.sleep(6000);
                        floodInformationComponent.fillOutFloodInformationDetails(data);
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
}
