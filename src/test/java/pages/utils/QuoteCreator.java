package pages.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomeownersPolicyCoverPage;
import pages.LocationCoveragePage;
import pages.components.CommonComponentsAndActions;

import java.util.Map;

public class QuoteCreator extends CommonComponentsAndActions {
    static WebDriver driver;

    public QuoteCreator(WebDriver driver) {
        super(driver);
        QuoteCreator.driver = driver;
    }

    public void createQuote(Map<String, String> data) throws Throwable {
        switch (data.get("State")){
            case "AK":

            case "AR": case "AZ": case "CO": case "DC": case "DE": case "HI": case "IA": case "IL": case "IN":
            case "KS": case "KY": case "MI": case "ME": case "MN": case "MO": case "MT": case "ND": case "NE": case "NH":
            case "NM": case "NV": case "MD": case "OH": case "OK": case "OR": case "PA": case "RI": case "SD": case "TN":
            case "UT": case "VA": case "VT": case "WA": case "WI": case "WV": case "WY": case "AL": case "CA": case "CT":
            case "LA": case "MA": case "MS": case "NC": case "NJ": case "SC": case "FL": case "TX": case "NY": case "GA":{
                HomeownersPolicyCoverPage homeownersPolicyCoverPage = new HomeownersPolicyCoverPage(driver);

                homeownersPolicyCoverPage.fillOutHomeownersPolicyCoverPage(data);
               //homeownersPolicyCoverPage.clickElement(CommonComponentsAndActions.actionButtonNext);

                //LocationCoveragePage locationCoveragePage = new LocationCoveragePage(driver);
                //locationCoveragePage.fillBasicLocationCoverageDetails(data);
                //go to next page Optional coverages

                //locationCoveragePage.fillBasicLocationCoverageDetails(data);
            }break;

        }
    }
}