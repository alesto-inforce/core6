package pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class ElevationCertificateComponent extends CommonComponentsAndActions {
    static WebDriver driver;

    public ElevationCertificateComponent(WebDriver driver) {
        super(driver);
        ElevationCertificateComponent.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='What is the building diagram number?']/../../../../../../../../../../../td[2]//input")
    WebElement buildingDiagramNumber;
    @FindBy(xpath = "//div[text()='a) Top of bottom floor (including basement, crawl space, or enclosure floor)?']/../../../../../../../../../../../td[2]//input")
    WebElement topOfBottomFloor;
    @FindBy(xpath = "//div[text()='b) Top of the next floor?']/../../../../../../../../../../../td[2]//input")
    WebElement topOfNextFloor;
    @FindBy(xpath = "//div[text()='d) Bottom of the attached garage (top of slab)?']/../../../../../../../../../../../td[2]//input")
    WebElement bottomOfTheAttachedGarage;
    @FindBy(xpath = "//div[text()='e) Lowest elevation of machinery or equipment servicing the building?']/../../../../../../../../../../../td[2]//input")
    WebElement lowestElevation;
    @FindBy(xpath = "//div[text()='f) What is the total square feet for the attached garage?']/../../../../../../../../../../../td[2]//input")
    WebElement totalSquareFeetOfAttachedGarage;
    @FindBy(xpath = "//table//td[contains(text(),'g) No. of permanent flood openings in the attached garage')]/../../../../../../../../../../../../../../../../td[2]//input")
    WebElement permanentFloodOpenings;
    @FindBy(xpath = "//table//td[contains(text(),'h) Total area of all permanent openings (flood vents) in square inches?')]/../../../../../../../../../../../../../../../../td[2]//input")
    WebElement totalAreaOfPermanentOpenings;

    public void fillOutElevationCertificateInformation(Map<String,String> data) throws InterruptedException {
        setBuildingDiagramNumber(data.get("DiagramNumberValue"));
        Thread.sleep(6000);
        setTopOfBottomFloor(data.get("TopOfBottomFloorValue"));
        Thread.sleep(6000);
        setTopOfNextFloor(data.get("TopOfNextFloorValue"));
        Thread.sleep(6000);
        setBottomOfTheAttachedGarage(data.get("BottomOfTheAttachedGarageValue"));
        Thread.sleep(6000);
        setLowestElevation(data.get("LowestElevationValue"));
        Thread.sleep(6000);
        setTotalSquareFeetOfAttachedGarage(data.get("TotalSquareFeetOfAttachedGarageValue"));
        Thread.sleep(6000);
        setPermanentFloodOpenings(data.get("PermanentFloodOpeningsValue"));
        Thread.sleep(6000);
        setTotalAreaOfPermanentOpenings(data.get("TotalAreaOfPermanentOpeningsValue"));
        clickElement(CommonComponentsAndActions.saveChanges);
        Thread.sleep(10000);
    }

    public void setBuildingDiagramNumber(String diagram) {
        typeText(buildingDiagramNumber,diagram);
    }
    public void setTopOfBottomFloor(String value) {
        typeText(topOfBottomFloor,value);
    }
    public void setTopOfNextFloor(String value) {
        typeText(topOfNextFloor,value);
    }
    public void setBottomOfTheAttachedGarage(String value) {
        typeText(bottomOfTheAttachedGarage,value);
    }
    public void setLowestElevation(String value) {
        typeText(lowestElevation,value);
    }
    public void setTotalSquareFeetOfAttachedGarage(String value) {
        typeText(totalSquareFeetOfAttachedGarage,value);
    }
    public void setPermanentFloodOpenings(String value) {
        typeText(permanentFloodOpenings,value);
    }
    public void setTotalAreaOfPermanentOpenings(String value) {
        typeText(totalAreaOfPermanentOpenings,value);
    }
}