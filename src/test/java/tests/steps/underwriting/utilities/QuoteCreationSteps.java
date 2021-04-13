package tests.steps.underwriting.utilities;

import excel.ExcelUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Quotes;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import pages.*;
import pages.components.CommonComponentsAndActions;
import pages.utils.QuoteCreator;
import tests.Base;
import tests.listeners.AllureTestNGListener;

import java.awt.*;
import java.io.IOException;
import java.util.Map;

/**
 *  Contains steps necessary for creating quotes
 */
@Listeners(AllureTestNGListener.class)
public class QuoteCreationSteps extends Base {

    /**
     * ENV field will capture TestNG ENV parameter value
     */
    static final String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");
    static final String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");

    /**
     * Initializes Chrome driver
     */
    @Before
    public void setup(){
        init(BROWSER);
    }

    /**
     * Closes the Chrome driver
     */
    @After
    public void tearDown(){
        quit();
    }

    /**
     * Takes use of the ENV field from TestNG.xml file to determine the environment
     * and logs in the user passed to it as a parameter
     * @param subrole User to log in to the system
     */
    @Given("I am logged in to Pure as {string}")
    public void iAmLoggedInToPureAs(String subrole) throws Throwable {
        new LoginPage(driver).login(ENV,subrole);
    }

    /**
     * Navigates to Quotes page
     * @throws Throwable /
     */
    @When("I navigate to Quotes")
    public void iNavigateToQuotes() throws Throwable {
        new HomePage(driver).clickElement(CommonComponentsAndActions.quotes);
    }

    /**
     * Initiates a quote for a new customer provided an excel sheet and row
     * @param sheetName /
     * @param sheetRow /
     * @throws Throwable /
     */
    @And("I initiate a new quote with details in file {string} in sheet {string} row {string}")
    public void iInitiateANewQuoteWithDetailsInSheetRowWithEffectiveDate(String file,String sheetName, String sheetRow) throws Throwable {
        //Pages used
        QuotesPage quotesPage = new QuotesPage(driver);
        QuoteBasicInformationPage quoteBasicInformationPage = new QuoteBasicInformationPage(driver);

        //Reading data from excel file and row
        String excelFile = "src/test/test_data/"+file+".xlsx";
        Map<String, String> data = ExcelUtilities.getRowData(excelFile,sheetName,sheetRow);

        //Rewriting values for First and Last name
        data.replace("First_Name",data.get("First_Name")+"_"+data.get("State"));
        data.replace("Last_Name",data.get("Last_Name")+"_"+data.get("Residence_Type"));

        //Create new quote and choose agency
        quotesPage.newQuote();
        quotesPage.searchAndSelectAgencyAdvanced(ENV);

        //Initiate quote and create a new customer
        quoteBasicInformationPage.initiateQuote(data,ENV);
        quoteBasicInformationPage.clickElement(CommonComponentsAndActions.createNewCustomer);
    }

    /**
     * Creates a quote with details in excel sheet and row
     * @param sheetName /
     * @param sheetRow /
     * @throws Throwable /
     */
    @And("I create a quote with details in sheet {string} row {string}")
    public void iCreateAQuoteWithDetailsInSheetRow(String sheetName, String sheetRow) throws Throwable {
        HomeownersPolicyCoverPage homeownersPolicyCoverPage = new HomeownersPolicyCoverPage(driver);

        String pathToSheet = "src/test/test_data/QuoteCreation.xlsx";

        Map<String, String> data = ExcelUtilities.getRowData(pathToSheet,sheetName,sheetRow);

        QuoteCreator quotesCreator = new QuoteCreator(driver);
        quotesCreator.createQuote(data);
        pause(10);
        reportScreenshot(data.get("State"),data.get("State"));
    }

    /**
     * Accepts underwriting referrals
     */
    @And("I accept underwriting referrals")
    public void iAcceptUnderwritingReferrals() {
        //TODO
    }

    /**
     * Rates a quote
     */
    @And("I rate the quote")
    public void iRateTheQuote() {
        //TODO
    }
}