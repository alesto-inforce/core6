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
        PageFactory.initElements(driver,this);
    }

    public void fillBasicLocationCoverageDetails(Map<String,String> data) throws InterruptedException {
        usageComponent.setIsPrimaryResidenceYes();
        if(data.get("ResidenceType").equalsIgnoreCase("Homeowner")){
            mortgageeInformationComponent.setIsThereMortgageeOnLocationNo();
            Thread.sleep(6000);
        }
        constructionDetailsComponent.fillBasicConstructionDetails(data);
        windMitigationComponent.fillBasicWindMitigationDetails(data);
        protectionComponent.fillOutBasicProtectionDetails(data);
        Thread.sleep(10000);
        floodInformationComponent.setPureNFIP(data.get("PureNFIP"));
        elevationCertificateComponent.fillOutElevationCertificateInformation(data);
    }
    // TODO refactor
    public void fillAdditionalLocationCoverageDetails(Map<String,String> data) throws InterruptedException {
        usageComponent.setIsPrimaryResidenceYes();
        mortgageeInformationComponent.setIsThereMortgageeOnLocationNo();
        constructionDetailsComponent.fillAdditionalConstructionDetails(data);

       //windMitigationComponent.fillBasicWindMitigationDetails(data[5],data[6],data[7],data[8],data[9]);
       //protectionComponent.fillOutBasicProtectionDetails(data[10],data[11],data[12],data[13],data[14]);
       //floodInformationComponent.setPureNFIP("Yes");

    }
}
